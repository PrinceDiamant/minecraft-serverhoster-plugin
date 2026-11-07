package de.aichele.childlauncher;

/** Status text for a child start that threw before a process was running. */
final class StartFailureStatus {
    private StartFailureStatus() {}

    static String text(Throwable error) {
        String message = error == null ? null : error.getMessage();
        if (message == null || message.isBlank())
            message = error == null ? "unknown error" : error.getClass().getSimpleName();
        return "start failed: " + message;
    }
}
