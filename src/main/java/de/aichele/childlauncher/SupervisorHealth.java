package de.aichele.childlauncher;

/** Decides whether a detached child watcher, console pipe, or missed restart needs recovery. */
final class SupervisorHealth {
    enum Phase { IDLE, PREPARING, RUNNING, STOPPING }

    enum Action { NONE, REATTACH_WATCH, REATTACH_PIPE, REATTACH_BOTH, SCHEDULE_RESTART }

    enum DashboardState { STOPPED, STARTING, RUNNING, STOPPING, RESTART_WAIT }

    record State(Phase phase, boolean shuttingDown, boolean wantRunning, boolean stopRequested,
                 boolean processAlive, boolean watchArmed, boolean pipeArmed,
                 boolean restartQueued, boolean launchInProgress) {}

    private SupervisorHealth() {}

    static DashboardState dashboardState(Phase phase, boolean alive, boolean ready, boolean wantRunning,
                                         boolean stopRequested, boolean launchInProgress, boolean restartQueued,
                                         boolean autoRestartEnabled) {
        if (phase == Phase.STOPPING || (alive && (stopRequested || !wantRunning)))
            return DashboardState.STOPPING;
        if (alive) return ready ? DashboardState.RUNNING : DashboardState.STARTING;
        if (phase == Phase.PREPARING || launchInProgress)
            return stopRequested || !wantRunning ? DashboardState.STOPPING : DashboardState.STARTING;
        if (restartQueued && wantRunning && autoRestartEnabled) return DashboardState.RESTART_WAIT;
        return DashboardState.STOPPED;
    }

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
