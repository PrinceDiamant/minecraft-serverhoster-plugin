package de.aichele.serverhoster;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Persists the child PID together with its start instant and launch identity.
 * A later start may stop that process only when the live process still has the same start instant
 * and the same JVM/jar or working directory. PID reuse is not sufficient.
 */
final class ChildProcessRecord {
    static final String HEADER = "serverhoster-child-process 1";

    record Identity(long pid, Instant startedAt, String workDir, String jarArgument, String jarAbsolute, String javaBin) {}

    record Observed(long pid, Instant startedAt, List<String> command, String cwd, boolean alive) {}

    record Loaded(Identity identity, String error) {}

    enum Kind { NO_RECORD, INVALID_RECORD, CLEARED, REFUSED, REAPED, STILL_ALIVE }

    record ReapResult(Kind kind, String detail) {}

    interface Inspector {
        Observed find(long pid);
        void destroy(long pid);
        void destroyForcibly(long pid);
        boolean alive(long pid);
    }

    private ChildProcessRecord() {}

    static Inspector liveInspector() {
        return new Inspector() {
            @Override public Observed find(long pid) {
                return ProcessHandle.of(pid).map(ChildProcessRecord::observe).orElse(null);
            }
            @Override public void destroy(long pid) {
                ProcessHandle.of(pid).ifPresent(ProcessHandle::destroy);
            }
            @Override public void destroyForcibly(long pid) {
                ProcessHandle.of(pid).ifPresent(ProcessHandle::destroyForcibly);
            }
            @Override public boolean alive(long pid) {
                return ProcessHandle.of(pid).map(ProcessHandle::isAlive).orElse(false);
            }
        };
    }

    static Observed observe(ProcessHandle handle) {
        ProcessHandle.Info info = handle.info();
        List<String> command = new ArrayList<>();
        info.command().ifPresent(command::add);
        info.arguments().ifPresent(args -> java.util.Collections.addAll(command, args));
        String cwd = null;
        Path link = Path.of("/proc", Long.toString(handle.pid()), "cwd");
        try {
            if (Files.exists(link)) cwd = link.toRealPath().toString();
        } catch (IOException ignored) {
            cwd = null;
        }
        return new Observed(handle.pid(), info.startInstant().orElse(null), List.copyOf(command), cwd, handle.isAlive());
    }

    static boolean ours(Identity recorded, Observed live, long selfPid) {
        if (recorded == null || live == null || !live.alive()) return false;
        if (recorded.pid() <= 0 || recorded.pid() != live.pid() || recorded.pid() == selfPid) return false;
        if (recorded.startedAt() == null || live.startedAt() == null || !recorded.startedAt().equals(live.startedAt()))
            return false;
        List<String> command = live.command() == null ? List.of() : live.command();
        if (command.stream().anyMatch(token -> token.equals(recorded.jarArgument()) || token.equals(recorded.jarAbsolute())))
            return true;
        return samePath(live.cwd(), recorded.workDir())
                && looksLikeJava(command, recorded.javaBin())
                && command.stream().anyMatch("-jar"::equals)
                && command.stream().anyMatch(token -> fileName(token).equals(fileName(recorded.jarAbsolute())));
    }

    static void write(Path file, Identity identity) throws IOException {
        if (identity == null || identity.pid() <= 0) throw new IOException("child process identity is incomplete");
        Path parent = file.toAbsolutePath().getParent();
        if (parent == null) throw new IOException("child process record has no directory");
        if (Files.isSymbolicLink(parent)) throw new IOException("child process record directory must not be a symlink");
        Files.createDirectories(parent);
        Path temporary = file.resolveSibling(file.getFileName().toString() + ".tmp");
        if (Files.isSymbolicLink(file) || Files.isSymbolicLink(temporary))
            throw new IOException("child process record must not be a symlink");
        long epochSecond = identity.startedAt() == null ? -1 : identity.startedAt().getEpochSecond();
        int nano = identity.startedAt() == null ? 0 : identity.startedAt().getNano();
        String text = HEADER + "\n"
                + "pid=" + identity.pid() + "\n"
                + "startEpochSecond=" + epochSecond + "\n"
                + "startNano=" + nano + "\n"
                + "workDir=" + safe(identity.workDir()) + "\n"
                + "jarArgument=" + safe(identity.jarArgument()) + "\n"
                + "jarAbsolute=" + safe(identity.jarAbsolute()) + "\n"
                + "javaBin=" + safe(identity.javaBin()) + "\n";
        Files.writeString(temporary, text, StandardCharsets.UTF_8);
        try {
            Files.move(temporary, file, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (AtomicMoveNotSupportedException e) {
            Files.move(temporary, file, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    static Loaded read(Path file) {
        try {
            if (file == null || !Files.exists(file)) return new Loaded(null, "");
            if (Files.isSymbolicLink(file)) return new Loaded(null, "process record is a symlink");
            if (!Files.isRegularFile(file)) return new Loaded(null, "process record is not a regular file");
            List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
            if (lines.isEmpty() || !HEADER.equals(lines.getFirst().trim()))
                return new Loaded(null, "process record header is not " + HEADER);
            Map<String, String> values = new LinkedHashMap<>();
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                int eq = line.indexOf('=');
                if (eq <= 0) return new Loaded(null, "process record line is malformed");
                values.put(line.substring(0, eq), line.substring(eq + 1));
            }
            long pid = Long.parseLong(required(values, "pid"));
            long epochSecond = Long.parseLong(required(values, "startEpochSecond"));
            int nano = Integer.parseInt(required(values, "startNano"));
            Instant startedAt = epochSecond < 0 ? null : Instant.ofEpochSecond(epochSecond, nano);
            return new Loaded(new Identity(pid, startedAt, required(values, "workDir"), required(values, "jarArgument"),
                    required(values, "jarAbsolute"), required(values, "javaBin")), "");
        } catch (IOException | NumberFormatException | java.time.DateTimeException e) {
            return new Loaded(null, e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage());
        }
    }

    static boolean deleteIfMatch(Path file, long pid, Instant startedAt) throws IOException {
        if (Files.isSymbolicLink(file)) throw new IOException("child process record must not be a symlink");
        Loaded loaded = read(file);
        if (loaded.identity() == null) return false;
        if (loaded.identity().pid() != pid || startedAt == null || !startedAt.equals(loaded.identity().startedAt()))
            return false;
        Files.deleteIfExists(file);
        return true;
    }

    static ReapResult reap(Path file, Duration graceful, Duration forced, Inspector inspector, long selfPid)
            throws InterruptedException {
        if (file == null || !Files.exists(file)) return new ReapResult(Kind.NO_RECORD, "no record");
        Loaded loaded = read(file);
        if (loaded.identity() == null) return new ReapResult(Kind.INVALID_RECORD, loaded.error());
        Identity identity = loaded.identity();
        Observed live = inspector.find(identity.pid());
        if (live == null || !live.alive()) {
            try {
                if (!Files.isSymbolicLink(file)) Files.deleteIfExists(file);
            } catch (IOException e) {
                return new ReapResult(Kind.INVALID_RECORD, "stale record could not be removed: " + e.getMessage());
            }
            return new ReapResult(Kind.CLEARED, "pid " + identity.pid() + " is not running");
        }
        if (!ours(identity, live, selfPid))
            return new ReapResult(Kind.REFUSED, "pid " + identity.pid() + " does not match the recorded start instant and command");
        inspector.destroy(identity.pid());
        if (!waitUntilDead(inspector, identity.pid(), graceful)) {
            inspector.destroyForcibly(identity.pid());
            if (!waitUntilDead(inspector, identity.pid(), forced))
                return new ReapResult(Kind.STILL_ALIVE, "pid " + identity.pid() + " survived graceful and forced termination");
        }
        try {
            Files.deleteIfExists(file);
        } catch (IOException e) {
            return new ReapResult(Kind.REAPED, "pid " + identity.pid() + " stopped, but the record remains: " + e.getMessage());
        }
        return new ReapResult(Kind.REAPED, "pid " + identity.pid() + " stopped");
    }

    private static boolean waitUntilDead(Inspector inspector, long pid, Duration timeout) throws InterruptedException {
        long budget = timeout == null || timeout.isNegative() ? 0 : timeout.toNanos();
        long deadline = System.nanoTime() + budget;
        while (inspector.alive(pid)) {
            if (System.nanoTime() >= deadline) return false;
            Thread.sleep(Math.min(50, Math.max(1, java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(deadline - System.nanoTime()))));
        }
        return true;
    }

    private static boolean looksLikeJava(List<String> command, String javaBin) {
        if (command.isEmpty()) return false;
        String executable = command.getFirst();
        if (executable.equals(javaBin)) return true;
        String name = fileName(executable).toLowerCase(Locale.ROOT);
        return name.equals("java") || name.equals("java.exe");
    }

    private static boolean samePath(String left, String right) {
        if (left == null || right == null || left.isBlank() || right.isBlank()) return false;
        try {
            return Path.of(left).toAbsolutePath().normalize().equals(Path.of(right).toAbsolutePath().normalize());
        } catch (RuntimeException e) {
            return left.equals(right);
        }
    }

    private static String fileName(String path) {
        if (path == null || path.isBlank()) return "";
        String normalized = path.replace('\\', '/');
        int slash = normalized.lastIndexOf('/');
        return slash >= 0 ? normalized.substring(slash + 1) : normalized;
    }

    private static String required(Map<String, String> values, String key) {
        String value = values.get(key);
        if (value == null) throw new NumberFormatException("missing " + key);
        return value;
    }

    private static String safe(String value) {
        return value == null ? "" : value.replace("\r", "").replace("\n", "");
    }
}
