package de.aichele.childlauncher;

import java.nio.file.Path;

/** Loaded by a closable loader. The hook must run after that loader is closed. */
public final class CleanHookOwner {
    private CleanHookOwner() {}

    public static void arm(Path root, Path sidecar) throws ClassNotFoundException {
        Class.forName("de.aichele.childlauncher.CleanSetup", true, CleanHookOwner.class.getClassLoader());
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("HOOK_ENTER");
            try {
                CleanSetup.finishPending(root, sidecar);
                System.out.println("HOOK_DONE");
            } catch (Throwable error) {
                System.out.println("HOOK_THROW " + error.getClass().getName() + " " + error.getMessage());
            }
        }, "clean-hook-test"));
    }
}
