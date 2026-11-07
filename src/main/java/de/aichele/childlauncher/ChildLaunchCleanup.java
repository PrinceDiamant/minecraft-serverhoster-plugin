package de.aichele.childlauncher;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/** Destroys a process that failed after {@code start()} and drains its output so the pipe cannot fill. */
final class ChildLaunchCleanup {
    record Result(boolean exited, int exitCode, String detail) {}

    private ChildLaunchCleanup() {}

    static Result abandon(Process process, long waitMillis) {
        if (process == null) return new Result(true, 0, "no process");
        AtomicReference<String> drainError = new AtomicReference<>("");
        Thread drain = new Thread(() -> {
            try {
                process.getInputStream().transferTo(OutputStream.nullOutputStream());
            } catch (IOException e) {
                drainError.set("stdout drain: " + (e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage()));
            }
        }, "ServerhosterPlugin-Drain");
        drain.setDaemon(true);
        drain.start();
        StringBuilder detail = new StringBuilder();
        try {
            process.getOutputStream().close();
        } catch (IOException e) {
            detail.append("stdin close: ").append(e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage()).append("; ");
        }
        process.destroy();
        long wait = Math.max(1, waitMillis);
        try {
            if (!process.waitFor(wait, TimeUnit.MILLISECONDS)) {
                process.destroyForcibly();
                if (!process.waitFor(wait, TimeUnit.MILLISECONDS)) {
                    drain.interrupt();
                    detail.append(drainError.get());
                    return new Result(false, -1, detail + "process still alive after destroyForcibly");
                }
            }
            drain.join(wait);
            if (drain.isAlive()) detail.append("drain thread still running; ");
            if (!drainError.get().isBlank()) detail.append(drainError.get());
            int code;
            try {
                code = process.exitValue();
            } catch (IllegalThreadStateException e) {
                code = -1;
            }
            return new Result(!process.isAlive(), code, detail.toString().trim());
        } catch (InterruptedException e) {
            process.destroyForcibly();
            Thread.currentThread().interrupt();
            return new Result(false, -1, "interrupted during failed-start cleanup");
        }
    }
}
