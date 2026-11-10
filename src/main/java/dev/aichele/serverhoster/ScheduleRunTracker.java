package dev.aichele.serverhoster;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class ScheduleRunTracker {
    record Status(String state, String message) {}

    static final class Run {
        private volatile Status status = new Status("running", "");

        void update(String state, String message) {
            status = new Status(state, message);
        }
    }

    private final ConcurrentMap<String, Run> runs = new ConcurrentHashMap<>();

    Run start(String id) {
        Run run = new Run();
        runs.put(id, run);
        return run;
    }

    Status status(String id) {
        Run run = runs.get(id);
        return run == null ? new Status("unknown", "") : run.status;
    }

    void remove(String id) {
        runs.remove(id);
    }
}
