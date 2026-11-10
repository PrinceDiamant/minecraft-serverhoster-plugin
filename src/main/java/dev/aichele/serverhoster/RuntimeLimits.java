package dev.aichele.serverhoster;

import java.util.ArrayList;
import java.util.List;

/**
 * In-memory guards for waits and memory thresholds. Stored configuration is never rewritten here,
 * and these guards do not change a configured heap size.
 */
final class RuntimeLimits {
    static final long MAX_WAIT_SECONDS = 7L * 24 * 60 * 60;

    record Bounded(long value, List<String> notes) {}

    record MemoryPolicy(double warning, double critical, double recovery, boolean autoStop, List<String> notes) {}

    private RuntimeLimits() {}

    static Bounded boundedSeconds(long configured, long fallback) {
        if (configured < 0)
            return new Bounded(0, List.of("A negative wait of " + configured
                    + "s is treated as 0 seconds, as previous releases did with Math.max(0, ...). The stored value was not changed."));
        if (configured > MAX_WAIT_SECONDS)
            return new Bounded(MAX_WAIT_SECONDS, List.of("A wait of " + configured
                    + "s exceeds 7 days and is capped in memory at " + MAX_WAIT_SECONDS
                    + "s so the shutdown cannot overflow. The stored value was not changed."));
        if (fallback < 0) throw new IllegalArgumentException("fallback");
        return new Bounded(configured, List.of());
    }

    static MemoryPolicy memory(double warning, double critical, double recovery, boolean requestedAutoStop) {
        boolean valid = percent(warning) && percent(critical) && Double.isFinite(recovery) && recovery >= 0 && recovery <= 100;
        if (!valid) {
            return new MemoryPolicy(100, 100, 100, false, List.of(
                    "memoryProtection thresholds are not finite percentages in range. Automatic child stop stays off for these samples, and recovery sampling uses an in-memory 100/100/100 fallback so a bad value cannot pin the child off. The stored configuration was not changed."));
        }
        List<String> notes = new ArrayList<>();
        if (recovery > critical)
            notes.add("memoryProtection.recoveryPercent is above criticalPercent, so recovery can count while usage is still above the critical threshold. The stored values were not changed.");
        if (warning > critical)
            notes.add("memoryProtection.warningPercent is above criticalPercent, so the warning can be skipped. The stored values were not changed.");
        return new MemoryPolicy(warning, critical, recovery, requestedAutoStop, List.copyOf(notes));
    }

    private static boolean percent(double value) {
        return Double.isFinite(value) && value > 0 && value <= 100;
    }
}
