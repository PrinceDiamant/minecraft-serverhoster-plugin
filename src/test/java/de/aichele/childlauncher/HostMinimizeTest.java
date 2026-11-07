package de.aichele.childlauncher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HostMinimizeTest {
    @TempDir Path tmp;

    @Test void applyKeepsChildBackupsWorldsAndSecurityKeys() throws Exception {
        Path root = tmp.resolve("server");
        Path data = root.resolve("plugins/ServerhosterPlugin");
        Path child = root.resolve("child-server");
        Path backups = data.resolve("backups");
        Files.createDirectories(child.resolve("world"));
        Files.createDirectories(backups);
        Files.writeString(child.resolve("world/level.dat"), "child-world");
        Files.writeString(child.resolve("server.properties"), "server-port=2063\nview-distance=12\n");
        Files.writeString(backups.resolve("world.zip"), "backup");
        Files.writeString(root.resolve("server.properties"), """
                server-port=2060
                server-ip=0.0.0.0
                online-mode=true
                enable-rcon=false
                view-distance=5
                level-name=world
                """);
        Files.writeString(root.resolve("bukkit.yml"), "settings:\n  allow-nether: true\n");
        Files.writeString(root.resolve("eula.txt"), "eula=true\n");
        Files.createDirectories(root.resolve("libraries"));
        Files.writeString(root.resolve("libraries/keep.jar"), "runtime");

        String lobby = HostMinimize.newLobbyName();
        List<Path> protectedPaths = List.of(data, child, backups);
        Path backup = data.resolve("host-minimize-backup/test");
        HostMinimize.apply(root, backup, lobby, protectedPaths);

        String properties = Files.readString(root.resolve("server.properties"));
        assertTrue(properties.contains("level-name=" + lobby));
        assertTrue(properties.contains("view-distance=2"));
        assertTrue(properties.contains("simulation-distance=2"));
        assertTrue(properties.contains("allow-nether=false"));
        assertTrue(properties.contains("server-port=2060"));
        assertTrue(properties.contains("online-mode=true"));
        assertTrue(properties.contains("enable-rcon=false"));
        assertFalse(properties.contains("enable-rcon=true"));
        assertEquals("child-world", Files.readString(child.resolve("world/level.dat")));
        assertTrue(Files.readString(child.resolve("server.properties")).contains("view-distance=12"));
        assertEquals("backup", Files.readString(backups.resolve("world.zip")));
        assertEquals("eula=true\n", Files.readString(root.resolve("eula.txt")));
        assertEquals("runtime", Files.readString(root.resolve("libraries/keep.jar")));
        assertTrue(Files.isDirectory(root.resolve("world")) == false);
        assertTrue(Files.readString(root.resolve("bukkit.yml")).contains("allow-nether: false")
                || Files.readString(root.resolve("bukkit.yml")).contains("allow-nether: false\n")
                || Files.readString(root.resolve("bukkit.yml")).contains("false"));

        HostMinimize.restore(root, backup, protectedPaths);
        String restored = Files.readString(root.resolve("server.properties"));
        assertTrue(restored.contains("level-name=world"));
        assertTrue(restored.contains("view-distance=5"));
        assertEquals("child-world", Files.readString(child.resolve("world/level.dat")));
    }

    @Test void symlinkAndChildRootAreRefused() throws Exception {
        Path root = tmp.resolve("server");
        Path data = root.resolve("plugins/ServerhosterPlugin");
        Path child = root.resolve("child-server");
        Files.createDirectories(data);
        Files.createDirectories(child);
        Files.writeString(child.resolve("server.properties"), "server-port=2063\n");
        Files.createSymbolicLink(root.resolve("server.properties"), child.resolve("server.properties"));
        assertThrows(SecurityException.class, () -> HostMinimize.apply(root, data.resolve("backup"),
                HostMinimize.newLobbyName(), List.of(data, child)));
        assertEquals("server-port=2063\n", Files.readString(child.resolve("server.properties")));

        Path same = tmp.resolve("same");
        Files.createDirectories(same.resolve("plugins/ServerhosterPlugin"));
        Files.writeString(same.resolve("server.properties"), "server-port=2060\n");
        assertThrows(SecurityException.class, () -> HostMinimize.apply(same,
                same.resolve("plugins/ServerhosterPlugin/backup"), HostMinimize.newLobbyName(),
                List.of(same.resolve("plugins/ServerhosterPlugin"), same)));
        assertEquals("server-port=2060\n", Files.readString(same.resolve("server.properties")));
    }

    @Test void heapTuneNeverRequestsXmxAndLobbyRulesIgnoreOtherWorlds() {
        assertTrue(HostHeapTune.FLAGS.stream().noneMatch(flag -> flag.name().contains("Xmx") || flag.name().contains("Xms")));
        List<String> touched = new ArrayList<>();
        String safe = "serverhoster-lobby-abcd1234";
        assertTrue(HostMinimize.lobbyNameSafe(safe));
        assertFalse(HostMinimize.lobbyNameSafe("world"));
        assertEquals(0, HostLobbyRuntime.apply(List.of(new RecordingWorld("world", touched)), safe));
        assertTrue(touched.isEmpty());
        assertEquals(1, HostLobbyRuntime.apply(List.of(new RecordingWorld("world", touched), new RecordingWorld(safe, touched)), safe));
        assertEquals(List.of(safe), touched);
        List<HostHeapTune.Result> results = HostHeapTune.apply(new HostHeapTune.Options() {
            @Override public boolean manageable(String name) { return "MinHeapFreeRatio".equals(name); }
            @Override public void set(String name, String value) {}
        });
        assertTrue(results.stream().anyMatch(result -> result.name().equals("MinHeapFreeRatio") && result.applied()));
        assertTrue(results.stream().anyMatch(result -> result.name().equals("G1PeriodicGCInterval") && !result.applied()));
    }

    private record RecordingWorld(String name, List<String> touched) implements HostLobbyRuntime.World {
        @Override public void spawnFlags(boolean monsters, boolean animals) { touched.add(name); }
        @Override public void keepSpawnInMemory(boolean keep) {}
        @Override public void ruleOff(String rule) {}
    }
}
