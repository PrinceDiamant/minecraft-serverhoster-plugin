package dev.aichele.serverhoster;

import com.sun.management.GcInfo;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

/** Reads collector counts and the last reported cycle. It does not request a collection. */
final class GcDiagnostics {
    record Collector(String name, long collectionCount, long collectionTimeMs, long lastDurationMs) {}

    private GcDiagnostics() {}

    static List<Collector> snapshot() {
        return snapshot(ManagementFactory.getGarbageCollectorMXBeans());
    }

    static List<Collector> snapshot(List<GarbageCollectorMXBean> beans) {
        List<Collector> out = new ArrayList<>();
        if (beans == null) return List.of();
        for (GarbageCollectorMXBean bean : beans) {
            if (bean == null) continue;
            long last = -1;
            if (bean instanceof com.sun.management.GarbageCollectorMXBean hotspot) {
                GcInfo info = hotspot.getLastGcInfo();
                if (info != null) last = info.getDuration();
            }
            out.add(new Collector(bean.getName(), bean.getCollectionCount(), bean.getCollectionTime(), last));
        }
        return List.copyOf(out);
    }
}
