package de.aichele.childlauncher;

import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;

/** Subprocess entry. Arguments: main classes, test classes, server root. */
public final class CleanHookChild {
    private CleanHookChild() {}

    public static void main(String[] args) throws Exception {
        Path classes = Path.of(args[0]);
        Path testClasses = Path.of(args[1]);
        Path root = Path.of(args[2]);
        URLClassLoader loader = new URLClassLoader(new URL[]{classes.toUri().toURL(), testClasses.toUri().toURL()},
                ClassLoader.getPlatformClassLoader());
        Class<?> owner = Class.forName("de.aichele.childlauncher.CleanHookOwner", true, loader);
        owner.getMethod("arm", Path.class, Path.class).invoke(null, root,
                root.resolve("plugins").resolve("ServerhosterPlugin-clean-reprovision.txt"));
        loader.close();
        System.out.println("LOADER_CLOSED");
        System.exit(0);
    }
}
