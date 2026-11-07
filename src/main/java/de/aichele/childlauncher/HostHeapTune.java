package de.aichele.childlauncher;

import com.sun.management.HotSpotDiagnosticMXBean;
import com.sun.management.VMOption;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * Sets only manageable outer-JVM options that can return unused heap. This does not change -Xmx,
 * does not call System.gc, and does not touch the child process.
 */
final class HostHeapTune {
    record Flag(String name, String value) {}

    static final List<Flag> FLAGS = List.of(
            new Flag("MinHeapFreeRatio", "10"),
            new Flag("MaxHeapFreeRatio", "20"),
            new Flag("G1PeriodicGCInterval", "30000"));

    record Result(String name, String value, boolean applied, String detail) {}

    interface Options {
        boolean manageable(String name);
        void set(String name, String value) throws Exception;
    }

    private HostHeapTune() {}

    static List<Result> apply(Options options) {
        List<Result> results = new ArrayList<>();
        for (Flag flag : FLAGS) {
            if ("Xmx".equals(flag.name()) || flag.name().startsWith("-X")) {
                results.add(new Result(flag.name(), flag.value(), false, "refusing to change the heap ceiling"));
                continue;
            }
            try {
                if (!options.manageable(flag.name())) {
                    results.add(new Result(flag.name(), flag.value(), false, "not a manageable option in this JVM"));
                    continue;
                }
                options.set(flag.name(), flag.value());
                results.add(new Result(flag.name(), flag.value(), true, "set on the outer JVM; -Xmx is unchanged"));
            } catch (Exception e) {
                results.add(new Result(flag.name(), flag.value(), false,
                        e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage()));
            }
        }
        return List.copyOf(results);
    }

    static Options hotspot() {
        return new Options() {
            private final HotSpotDiagnosticMXBean bean = ManagementFactory.getPlatformMXBean(HotSpotDiagnosticMXBean.class);

            @Override public boolean manageable(String name) {
                try {
                    VMOption option = bean.getVMOption(name);
                    return option != null && option.isWriteable();
                } catch (RuntimeException e) {
                    return false;
                }
            }

            @Override public void set(String name, String value) {
                bean.setVMOption(name, value);
            }
        };
    }
}
