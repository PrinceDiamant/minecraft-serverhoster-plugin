package de.aichele.childlauncher;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

/** Sends stop, waits through startup, then terminates. Callers choose the thread; this method blocks only that thread. */
final class ChildStopSequence {
    enum Outcome { CLEAN, UNCLEAN, KILLED, INTERRUPTED }

    @FunctionalInterface
    interface StopSender { void send() throws IOException; }

    private ChildStopSequence() {}

    static Outcome stop(Process process, BooleanSupplier ready, long startupSeconds, long stopSeconds,
                        long pollMillis, long resendMillis, long termGraceSeconds,
                        StopSender sender, Consumer<String> log, String name) {
        log.accept("Stopping " + name + " (pid " + process.pid() + ", waiting up to " + stopSeconds + "s for clean save)...");
        try {
            long startupDeadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(Math.max(0, startupSeconds));
            while (process.isAlive() && !ready.getAsBoolean() && System.nanoTime() < startupDeadline)
                process.waitFor(Math.max(1, pollMillis), TimeUnit.MILLISECONDS);
            if (!ready.getAsBoolean() && process.isAlive())
                log.accept("Child did not report startup complete within " + startupSeconds
                        + "s; sending stop and retrying while it shuts down.");
            long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(Math.max(0, stopSeconds));
            long nextSendAt = 0;
            boolean firstSend = true;
            while (process.isAlive() && (firstSend || System.nanoTime() < deadline)) {
                long now = System.nanoTime();
                if (firstSend || now >= nextSendAt) {
                    firstSend = false;
                    try {
                        sender.send();
                    } catch (IOException e) {
                        log.accept("Could not send 'stop': " + e.getMessage());
                    }
                    nextSendAt = now + TimeUnit.MILLISECONDS.toNanos(Math.max(1, resendMillis));
                }
                long remaining = deadline - System.nanoTime();
                if (remaining <= 0) break;
                process.waitFor(Math.max(1, Math.min(TimeUnit.NANOSECONDS.toMillis(remaining), Math.max(1, pollMillis))),
                        TimeUnit.MILLISECONDS);
            }
            if (!process.isAlive()) {
                int exitCode = process.exitValue();
                if (exitCode == 0) {
                    log.accept("Child stopped cleanly (exit code 0).");
                    return Outcome.CLEAN;
                }
                log.accept("Child exited with code " + exitCode + " during stop; shutdown was not clean.");
                return Outcome.UNCLEAN;
            }
            log.accept("Child did not stop within " + stopSeconds
                    + "s - KILLING (unsaved changes since last save-all may be lost).");
            signal(process, false, log);
            process.destroy();
            if (!process.waitFor(Math.max(0, termGraceSeconds), TimeUnit.SECONDS)) {
                signal(process, true, log);
                process.destroyForcibly();
                process.waitFor(Math.max(0, termGraceSeconds), TimeUnit.SECONDS);
            }
            log.accept("Child killed.");
            return Outcome.KILLED;
        } catch (InterruptedException e) {
            process.destroyForcibly();
            log.accept("Child killed (interrupted).");
            Thread.currentThread().interrupt();
            return Outcome.INTERRUPTED;
        }
    }

    private static void signal(Process process, boolean force, Consumer<String> log) {
        try {
            process.descendants().forEach(force ? ProcessHandle::destroyForcibly : ProcessHandle::destroy);
        } catch (RuntimeException e) {
            log.accept("Could not signal child descendants: " + e.getMessage());
        }
    }
}
