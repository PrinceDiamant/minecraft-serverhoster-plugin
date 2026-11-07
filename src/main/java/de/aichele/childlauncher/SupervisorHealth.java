package de.aichele.childlauncher;

/** Decides whether a detached child watcher, console pipe, or missed restart needs recovery. */
final class SupervisorHealth {
    enum Phase { IDLE, PREPARING, RUNNING, STOPPING }

    enum Action { NONE, REATTACH_WATCH, REATTACH_PIPE, REATTACH_BOTH, SCHEDULE_RESTART }

    record State(Phase phase, boolean shuttingDown, boolean wantRunning, boolean stopRequested,
                 boolean processAlive, boolean watchArmed, boolean pipeArmed,
                 boolean restartQueued, boolean launchInProgress) {}

    private SupervisorHealth() {}

    static Action assess(State state) {
        if (state.shuttingDown()) return Action.NONE;
        if (state.phase() == Phase.PREPARING || (state.launchInProgress() && !state.processAlive()))
            return Action.NONE;
        if (state.processAlive()) {
            boolean watch = !state.watchArmed();
            boolean pipe = !state.pipeArmed();
            if (state.stopRequested() && state.phase() == Phase.STOPPING)
                return pipe ? Action.REATTACH_PIPE : Action.NONE;
            if (watch && pipe) return Action.REATTACH_BOTH;
            if (watch) return Action.REATTACH_WATCH;
            if (pipe) return Action.REATTACH_PIPE;
            return Action.NONE;
        }
        if (state.phase() == Phase.STOPPING || state.stopRequested() || !state.wantRunning() || state.restartQueued())
            return Action.NONE;
        return Action.SCHEDULE_RESTART;
    }
}
