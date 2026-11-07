package de.aichele.childlauncher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.HexFormat;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

class CleanSetupTest {
    @TempDir Path temp;

    @Test
    void previewMatchesApplyAndKeepsOnlyTheBootFiles() throws Exception {
        Path outside = Files.createDirectory(temp.resolve("outside"));
        Files.writeString(outside.resolve("keep-me.txt"), "outside-secret");
        Path root = server(temp.resolve("srv"));
        Files.createSymbolicLink(root.resolve("linked-out"), outside.resolve("keep-me.txt"));
        Files.createSymbolicLink(root.resolve("linked-dir"), outside);
        Path plugin = root.resolve("plugins/ServerHoster-2.0.4.jar");
        long now = 1_000L;
        CleanSetup.Plan plan = CleanSetup.scan(root, plugin, 2063, 2064, now);
        CleanSetup.Plan again = CleanSetup.scan(root, plugin, 2063, 2064, now);
        assertEquals(plan.planHash(), again.planHash());
        assertTrue(plan.delete().contains("world/level.dat"));
        assertTrue(plan.delete().contains("plugins/Foreign.jar"));
        assertTrue(plan.delete().contains("plugins/ServerhosterPlugin/dashboard-password.txt"));
        assertTrue(plan.delete().contains("plugins/ServerhosterPlugin/config.yml"));
        assertTrue(plan.delete().contains("plugins/ServerhosterPlugin/backups/local.zip"));
        assertTrue(plan.delete().contains("child-server/server.jar"));
        assertTrue(plan.delete().contains("linked-out"));
        assertTrue(plan.delete().contains("linked-dir"));
        assertFalse(plan.delete().contains("linked-dir/keep-me.txt"));
        assertTrue(plan.keep().contains("eula.txt"));
        assertTrue(plan.keep().contains("spigot.jar"));
        assertTrue(plan.keep().contains("libraries/runtime.txt"));
        assertTrue(plan.keep().contains("plugins/ServerHoster-2.0.4.jar"));
        assertEquals(2060, plan.serverPort());
        assertFalse(plan.enableRcon());
        String sidecar = CleanSetup.sidecar("pending", plan);
        assertTrue(sidecar.contains("dashboard-password.txt"));
        assertFalse(sidecar.contains("secret-password"));
        assertFalse(sidecar.contains("secret-token"));
        CleanSetup.checkTicket(plan, again, CleanSetup.confirmPhrase(plan), now);
        Files.createDirectories(root.resolve("logs"));
        Files.writeString(root.resolve("logs/latest.log"), "stop");
        CleanSetup.checkTicket(plan, CleanSetup.scan(root, plugin, 2063, 2064, now), CleanSetup.confirmPhrase(plan), now);
        assertThrows(IllegalStateException.class, () -> {
            Files.writeString(root.resolve("extra.txt"), "changed");
            CleanSetup.checkTicket(plan, CleanSetup.scan(root, plugin, 2063, 2064, now), CleanSetup.confirmPhrase(plan), now);
        });
        Files.delete(root.resolve("extra.txt"));
        assertThrows(IllegalArgumentException.class,
                () -> CleanSetup.checkTicket(plan, plan, "CLEAN falsch", now));
        assertThrows(IllegalArgumentException.class,
                () -> CleanSetup.checkTicket(plan, plan, CleanSetup.confirmPhrase(plan), plan.expiresAt() + 1));

        CleanSetup.execute(root, plan.delete(), "plugins/ServerHoster-2.0.4.jar", Files::deleteIfExists);
        assertEquals("outside-secret", Files.readString(outside.resolve("keep-me.txt")));
        assertFalse(Files.exists(root.resolve("linked-out")));
        assertFalse(Files.exists(root.resolve("world")));
        assertFalse(Files.exists(root.resolve("plugins/Foreign.jar")));
        assertFalse(Files.exists(root.resolve("plugins/ServerhosterPlugin")));
        assertFalse(Files.exists(root.resolve("child-server")));
        assertTrue(Files.exists(plugin));
        assertTrue(Files.exists(root.resolve("spigot.jar")));
        assertTrue(Files.exists(root.resolve("eula.txt")));
        assertTrue(Files.exists(root.resolve("libraries/runtime.txt")));

        CleanSetup.provision(root, plan, "serverhoster-lobby-bbbbbbbb");
        String properties = Files.readString(root.resolve("server.properties"));
        assertTrue(properties.contains("server-port=2060"));
        assertTrue(properties.contains("online-mode=true"));
        assertTrue(properties.contains("enable-rcon=false"));
        assertTrue(properties.contains("\"structure_overrides\":[]"));
        assertTrue(properties.contains("pause-when-empty-seconds=0"));
        assertFalse(properties.contains("secret"));
        assertTrue(Files.isDirectory(root.resolve("child-server")));
    }

    @Test
    void illegalPathAndPartialDeleteFailClosed() throws Exception {
        Path root = server(temp.resolve("partial"));
        Path plugin = root.resolve("plugins/ServerHoster-2.0.4.jar");
        Files.writeString(root.resolve("first.txt"), "1");
        Files.writeString(root.resolve("second.txt"), "2");
        Files.writeString(root.resolve("third.txt"), "3");
        assertThrows(SecurityException.class, () -> CleanSetup.execute(root, java.util.List.of(".."),
                "plugins/ServerHoster-2.0.4.jar", Files::deleteIfExists));
        assertTrue(Files.exists(root.resolve("world/level.dat")));
        AtomicInteger calls = new AtomicInteger();
        assertThrows(java.io.IOException.class, () -> CleanSetup.execute(root,
                java.util.List.of("first.txt", "second.txt", "third.txt"),
                "plugins/ServerHoster-2.0.4.jar", path -> {
                    if (calls.incrementAndGet() == 2) throw new java.io.IOException("disk");
                    Files.deleteIfExists(path);
                }));
        assertEquals(2, calls.get());
        long remaining = java.util.stream.Stream.of("first.txt", "second.txt", "third.txt")
                .filter(name -> Files.exists(root.resolve(name))).count();
        assertTrue(remaining >= 1);
        assertThrows(SecurityException.class, () -> CleanSetup.scan(root.resolve("plugins"), plugin, 2063, 2064, 0));
        Path hosted = Files.createDirectories(temp.resolve("LiteStorage").resolve("srv"));
        Files.writeString(hosted.resolve("server.properties"), "server-port=25565\n");
        Files.createDirectories(hosted.resolve("plugins"));
        assertThrows(SecurityException.class, () -> CleanSetup.requireServerRoot(hosted));
        Path link = temp.resolve("root-link");
        Files.createSymbolicLink(link, root);
        assertThrows(SecurityException.class, () -> CleanSetup.scan(link, plugin, 2063, 2064, 0));
    }

    @Test
    void savedTicketMatchesAFreshScanUntilTheInventoryReallyChanges() throws Exception {
        Path root = server(temp.resolve("ticket"));
        Path plugin = root.resolve("plugins/ServerHoster-2.0.4.jar");
        Files.createDirectories(root.resolve(".serverstart"));
        Files.writeString(root.resolve(".serverstart/run.sh"), "#!/bin/sh\n");
        Files.createDirectories(root.resolve("bundler"));
        Files.writeString(root.resolve("bundler/bootstrap.jar"), "bundler");
        Files.createDirectories(root.resolve("versions"));
        Files.writeString(root.resolve("versions/spigot.jar"), "versions");
        Files.writeString(root.resolve("child-server/server.properties"), "server-port=29999\n");
        long now = 5_000L;
        CleanSetup.Plan preview = CleanSetup.scan(root, plugin, 2063, 2064, now);
        assertEquals(identityOf(root), preview.identity());
        assertEquals(2060, preview.serverPort());
        assertTrue(preview.delete().contains(".serverstart/run.sh"));
        assertTrue(preview.delete().contains("child-server/server.properties"));
        assertFalse(preview.keep().contains(".serverstart/run.sh"));
        assertTrue(preview.keep().contains("bundler/bootstrap.jar"));
        assertTrue(preview.keep().contains("versions/spigot.jar"));
        assertTrue(preview.keep().contains("eula.txt"));
        assertTrue(preview.keep().contains("plugins/ServerhosterPlugin/clean-setup-ticket.txt"));

        String saved = CleanSetup.sidecar("ticket", preview);
        CleanSetup.Plan parsed = CleanSetup.parseSidecar(saved);
        assertEquals(preview.keep(), parsed.keep());
        assertEquals(preview.delete(), parsed.delete());
        assertEquals(preview.planHash(), parsed.planHash());
        Files.writeString(root.resolve("plugins/ServerhosterPlugin/clean-setup-ticket.txt"), saved);
        CleanSetup.Plan afterTicket = CleanSetup.scan(root, plugin, 2063, 2064, now);
        assertEquals(preview.planHash(), afterTicket.planHash());
        CleanSetup.checkTicket(parsed, afterTicket, CleanSetup.confirmPhrase(preview), now);

        Files.createDirectories(root.resolve("logs"));
        Files.writeString(root.resolve("logs/latest.log"), "volatile");
        Files.writeString(root.resolve("world/session.lock"), "lock");
        CleanSetup.Plan volatilePlan = CleanSetup.scan(root, plugin, 2063, 2064, now);
        CleanSetup.checkTicket(parsed, volatilePlan, CleanSetup.confirmPhrase(preview), now);
        assertTrue(CleanSetup.ticketMatches(parsed, volatilePlan, now));

        Files.writeString(root.resolve("world/extra-region.dat"), "real change");
        CleanSetup.Plan changed = CleanSetup.scan(root, plugin, 2063, 2064, now);
        IllegalStateException rejected = assertThrows(IllegalStateException.class,
                () -> CleanSetup.checkTicket(parsed, changed, CleanSetup.confirmPhrase(preview), now));
        assertEquals("Der Serverinhalt hat sich seit der Vorschau geändert", rejected.getMessage());
        assertFalse(CleanSetup.ticketMatches(parsed, changed, now));

        String incomplete = saved.replaceAll("(?m)^keep=.*\\n", "");
        IllegalStateException broken = assertThrows(IllegalStateException.class, () -> CleanSetup.checkTicket(
                CleanSetup.parseSidecar(incomplete), preview, CleanSetup.confirmPhrase(preview), now));
        assertEquals("Das Clean-Setup-Ticket ist unvollständig oder verändert", broken.getMessage());

        CleanSetup.Plan otherPort = CleanSetup.scan(root, plugin, 29999, 2064, now);
        assertThrows(IllegalStateException.class,
                () -> CleanSetup.checkTicket(parsed, otherPort, CleanSetup.confirmPhrase(preview), now));
    }

    @Test
    void abortedMarkerIsReplacedOnlyByANewConfirmedPlan() throws Exception {
        Path root = server(temp.resolve("rearm"));
        Path plugin = root.resolve("plugins/ServerHoster-2.0.4.jar");
        Path sidecar = root.resolve("plugins/ServerhosterPlugin-clean-reprovision.txt");
        Files.writeString(sidecar, """
                status=aborted
                identity=49bb8cf1
                planHash=3d4fc3034dd2cd26e086a6e74f68f547a7f9505d5b85f5ee1c5623cb765c88df
                delete=eula.txt
                delete=world/level.dat
                """);
        assertNull(CleanSetup.applyBlockReason("aborted"));
        assertEquals("Ein Clean-Setup ist noch nicht abgeschlossen und wird nicht fortgesetzt.",
                CleanSetup.applyBlockReason("pending"));
        assertEquals("Ein abgeschlossenes Clean-Setup wartet auf den nächsten Start und wird nicht erneut ausgeführt.",
                CleanSetup.applyBlockReason("done"));
        assertEquals("Der Clean-Setup-Marker ist unvollständig und wird nicht fortgesetzt.",
                CleanSetup.applyBlockReason(""));
        assertNotNull(CleanSetup.applyBlockReason("ticket"));

        long now = 11_000L;
        CleanSetup.Plan preview = CleanSetup.scan(root, plugin, 2063, 2064, now);
        CleanSetup.Plan parsed = CleanSetup.parseSidecar(CleanSetup.sidecar("ticket", preview));
        CleanSetup.checkTicket(parsed, CleanSetup.scan(root, plugin, 2063, 2064, now), CleanSetup.confirmPhrase(preview), now);
        String armed = CleanSetup.sidecar("pending", preview);
        assertFalse(armed.contains("3d4fc3034dd2cd26e086a6e74f68f547a7f9505d5b85f5ee1c5623cb765c88df"));
        assertFalse(armed.contains("delete=eula.txt"));
        assertTrue(armed.contains(preview.planHash()));
        Files.writeString(sidecar, armed);
        assertTrue(CleanSetup.keepShutdownHook(CleanSetup.sidecarStatus(armed)));
        CleanSetup.execute(root, preview.delete(), "plugins/ServerHoster-2.0.4.jar", Files::deleteIfExists);
        assertTrue(Files.exists(root.resolve("eula.txt")));
        assertTrue(Files.exists(plugin));
        assertFalse(Files.exists(root.resolve("world/level.dat")));
        Files.writeString(sidecar, CleanSetup.sidecar("done", preview));
        assertEquals(CleanSetup.Startup.PROVISION, CleanSetup.startup("done"));
        assertNotNull(CleanSetup.applyBlockReason("done"));
    }

    @Test
    void acceptedApplyDeletesOnProcessExitAndDoesNotResumeAfterALaterStart() throws Exception {
        Path root = server(temp.resolve("shutdown"));
        Path plugin = root.resolve("plugins/ServerHoster-2.0.4.jar");
        Path world = root.resolve("world/level.dat");
        long now = 9_000L;
        CleanSetup.Plan plan = CleanSetup.scan(root, plugin, 2063, 2064, now);
        Path sidecar = root.resolve("plugins/ServerhosterPlugin-clean-reprovision.txt");
        Files.writeString(sidecar, CleanSetup.sidecar("pending", plan));
        assertTrue(CleanSetup.keepShutdownHook("pending"));
        assertFalse(CleanSetup.keepShutdownHook("done"));
        assertFalse(CleanSetup.keepShutdownHook("aborted"));
        assertEquals(CleanSetup.Startup.ABORT, CleanSetup.startup("pending"));

        CleanSetup.execute(root, plan.delete(), "plugins/ServerHoster-2.0.4.jar", Files::deleteIfExists);
        Files.writeString(sidecar, CleanSetup.sidecar("done", plan));
        assertFalse(Files.exists(world));
        assertFalse(Files.exists(root.resolve("child-server")));
        assertTrue(Files.exists(plugin));
        assertTrue(Files.exists(root.resolve("spigot.jar")));
        assertTrue(Files.exists(root.resolve("eula.txt")));
        assertTrue(Files.exists(root.resolve("libraries/runtime.txt")));
        assertEquals(CleanSetup.Startup.PROVISION, CleanSetup.startup(CleanSetup.sidecarStatus(Files.readString(sidecar))));
        CleanSetup.provision(root, plan, "serverhoster-lobby-cccccccc");
        assertTrue(Files.readString(root.resolve("server.properties")).contains("server-port=2060"));

        Path restarted = server(temp.resolve("restarted"));
        Path restartedWorld = restarted.resolve("world/level.dat");
        Path restartedSidecar = restarted.resolve("plugins/ServerhosterPlugin-clean-reprovision.txt");
        CleanSetup.Plan restartedPlan = CleanSetup.scan(restarted, restarted.resolve("plugins/ServerHoster-2.0.4.jar"), 2063, 2064, now);
        Files.writeString(restartedSidecar, CleanSetup.sidecar("pending", restartedPlan));
        assertEquals(CleanSetup.Startup.ABORT, CleanSetup.startup("pending"));
        String pending = Files.readString(restartedSidecar);
        Files.writeString(restartedSidecar, pending.replaceFirst("status=pending", "status=aborted"));
        assertTrue(Files.exists(restartedWorld));
        assertTrue(Files.exists(restarted.resolve("child-server/server.jar")));
        assertEquals("aborted", CleanSetup.sidecarStatus(Files.readString(restartedSidecar)));
        assertEquals(CleanSetup.Startup.IGNORE, CleanSetup.startup("aborted"));
    }

    @Test
    void failedOrInterruptedCleanupDoesNotResumeOnTheNextStart() throws Exception {
        Path root = server(temp.resolve("partial-clean"));
        Path plugin = root.resolve("plugins/ServerHoster-2.0.4.jar");
        Path sidecar = root.resolve("plugins/ServerhosterPlugin-clean-reprovision.txt");
        CleanSetup.Plan plan = CleanSetup.scan(root, plugin, 2063, 2064, 12_000L);
        Files.writeString(sidecar, CleanSetup.putField(CleanSetup.sidecar("pending", plan), "pluginJar", "plugins/ServerHoster-2.0.4.jar"));
        CleanSetup.finishPending(root, sidecar, path -> {
            throw new java.io.IOException("disk");
        });
        String failed = Files.readString(sidecar);
        assertEquals("aborted", CleanSetup.sidecarStatus(failed));
        assertEquals("failed", CleanSetup.field(failed, "phase"));
        assertTrue(failed.contains("delete failure"));
        assertTrue(Files.exists(root.resolve("world/level.dat")));
        assertTrue(Files.exists(plugin));
        assertEquals(CleanSetup.Startup.IGNORE, CleanSetup.startup(CleanSetup.sidecarStatus(failed)));

        Path restarted = server(temp.resolve("still-pending"));
        Path restartedWorld = restarted.resolve("world/level.dat");
        Path restartedSidecar = restarted.resolve("plugins/ServerhosterPlugin-clean-reprovision.txt");
        Files.writeString(restartedSidecar, "status=pending\nphase=entered\ndelete=world/level.dat\n");
        assertEquals(CleanSetup.Startup.ABORT, CleanSetup.startup("pending"));
        assertTrue(Files.exists(restartedWorld));
        String aborted = CleanSetup.markFailed(Files.readString(restartedSidecar), new IllegalStateException("restarted before completion"));
        assertEquals("aborted", CleanSetup.sidecarStatus(aborted));
        assertTrue(Files.exists(restartedWorld));
    }

    @Test
    void closedPluginLoaderStillFinishesTheHook(@TempDir Path tree) throws Exception {
        Path root = server(tree.resolve("srv"));
        Path plugin = root.resolve("plugins/ServerHoster-2.0.4.jar");
        Path sidecar = root.resolve("plugins/ServerhosterPlugin-clean-reprovision.txt");
        CleanSetup.Plan plan = CleanSetup.scan(root, plugin, 2063, 2064, 13_000L);
        Files.writeString(sidecar, CleanSetup.putField(CleanSetup.sidecar("pending", plan), "pluginJar", "plugins/ServerHoster-2.0.4.jar"));
        Process process = new ProcessBuilder(
                Path.of(System.getProperty("java.home"), "bin", "java").toString(),
                "-cp", Path.of("target/test-classes").toAbsolutePath().toString(),
                "de.aichele.childlauncher.CleanHookChild",
                Path.of("target/classes").toAbsolutePath().toString(),
                Path.of("target/test-classes").toAbsolutePath().toString(),
                root.toAbsolutePath().toString())
                .redirectErrorStream(true)
                .start();
        String output = new String(process.getInputStream().readAllBytes(), java.nio.charset.StandardCharsets.UTF_8);
        assertEquals(0, process.waitFor(), output);
        assertTrue(output.contains("LOADER_CLOSED"), output);
        assertTrue(output.contains("HOOK_ENTER"), output);
        assertTrue(output.contains("HOOK_DONE"), output);
        assertFalse(output.contains("HOOK_THROW"), output);
        assertFalse(Files.exists(root.resolve("world/level.dat")));
        assertFalse(Files.exists(root.resolve("child-server/server.jar")));
        assertTrue(Files.exists(plugin));
        assertTrue(Files.exists(root.resolve("eula.txt")));
        assertTrue(Files.exists(root.resolve("spigot.jar")));
        String done = Files.readString(sidecar);
        assertEquals("done", CleanSetup.sidecarStatus(done));
        assertEquals("done", CleanSetup.field(done, "phase"));
    }

    @Test
    void mutatingRequestsStillNeedTheCsrfHeader() {
        assertTrue(Dashboard.csrfRejected("POST", null));
        assertTrue(Dashboard.csrfRejected("POST", ""));
        assertFalse(Dashboard.csrfRejected("POST", "1"));
        assertFalse(Dashboard.csrfRejected("GET", null));
        assertFalse(Dashboard.csrfRejected("HEAD", null));
    }

    private static String identityOf(Path root) throws Exception {
        return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256")
                .digest(root.toRealPath().toString().getBytes(java.nio.charset.StandardCharsets.UTF_8))).substring(0, 8);
    }

    private static Path server(Path root) throws Exception {
        Files.createDirectories(root.resolve("plugins/ServerhosterPlugin/backups"));
        Files.createDirectories(root.resolve("libraries"));
        Files.createDirectories(root.resolve("world"));
        Files.createDirectories(root.resolve("child-server"));
        Files.writeString(root.resolve("server.properties"), "server-port=2060\nserver-ip=\nonline-mode=true\nenable-rcon=false\n");
        Files.writeString(root.resolve("eula.txt"), "eula=true\n");
        Files.writeString(root.resolve("spigot.jar"), "spigot");
        Files.writeString(root.resolve("libraries/runtime.txt"), "lib");
        Files.writeString(root.resolve("plugins/ServerHoster-2.0.4.jar"), "plugin");
        Files.writeString(root.resolve("plugins/Foreign.jar"), "foreign");
        Files.writeString(root.resolve("plugins/ServerhosterPlugin/config.yml"), "ntfy-token: secret-token\n");
        Files.writeString(root.resolve("plugins/ServerhosterPlugin/dashboard-password.txt"), "secret-password\n");
        Files.writeString(root.resolve("plugins/ServerhosterPlugin/backups/local.zip"), "backup");
        Files.writeString(root.resolve("world/level.dat"), "world");
        Files.writeString(root.resolve("child-server/server.jar"), "child");
        return root;
    }
}
