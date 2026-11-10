package de.aichele.serverhoster;

final class ScheduleExecution {
    @FunctionalInterface
    interface ActionHandler {
        void execute(ScheduleDef.Action action) throws Exception;
    }

    private ScheduleExecution() {}

    static void run(ScheduleDef schedule, ActionHandler handler) throws Exception {
        for (ScheduleDef.Action action : schedule.actions()) handler.execute(action);
    }
}
