package de.aichele.serverhoster;

import java.io.BufferedWriter;
import java.time.Instant;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/** Runtime of one child process. Downloads and the JVM start only when this slot is launched. */
final class ChildSlot {
    final String id;
    final ConsoleBuffer console;
    final Set<String> onlinePlayers = ConcurrentHashMap.newKeySet();
    final TickQueryFilter ticks = new TickQueryFilter();
    final Object lock = new Object();
    final Object stopLock = new Object();
    final Object backupLock = new Object();
    volatile Process process;
    volatile BufferedWriter stdin;
    volatile boolean wantRunning;
    volatile boolean stopRequested;
    volatile boolean serverReady;
    volatile long startedAt;
    volatile int attempts;
    volatile SupervisorHealth.Phase phase = SupervisorHealth.Phase.IDLE;
    final AtomicBoolean watchArmed = new AtomicBoolean();
    final AtomicBoolean pipeArmed = new AtomicBoolean();
    final AtomicInteger watchGeneration = new AtomicInteger();
    final AtomicInteger pipeGeneration = new AtomicInteger();
    final AtomicBoolean restartQueued = new AtomicBoolean();
    final AtomicBoolean launchInProgress = new AtomicBoolean();
    final AtomicInteger scheduleToken = new AtomicInteger();
    volatile int pipeFailures;
    volatile Instant trackedStart;
    volatile String lastStatus = "idle";
    volatile double mspt = -1;
    volatile double tps = -1;
    volatile long tickAt;
    volatile long queryAt;
    final double[] msptRing = new double[60];
    int msptN;
    volatile ServerProfile profile;

    ChildSlot(String id, int consoleCap) { this.id = id; this.console = new ConsoleBuffer(consoleCap); }

    boolean running() { Process p = process; return p != null && p.isAlive(); }
    long pid() { Process p = process; return p != null && p.isAlive() ? p.pid() : -1; }
    long uptimeMillis() { return running() ? System.currentTimeMillis() - startedAt : 0; }

    static boolean isReadyLine(String line) { return line.contains("Done ("); }

    void pushMspt(double v) { msptRing[msptN++ % msptRing.length] = v; }

    java.util.List<Double> msptHistory() {
        int n = Math.min(msptN, msptRing.length);
        int start = msptN - n;
        java.util.List<Double> out = new java.util.ArrayList<>(n);
        for (int i = 0; i < n; i++) out.add(msptRing[(start + i) % msptRing.length]);
        return out;
    }
}
