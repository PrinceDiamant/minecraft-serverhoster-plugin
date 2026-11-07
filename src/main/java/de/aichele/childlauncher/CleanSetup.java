package de.aichele.childlauncher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

/**
 * Explicit full reset of one outer server directory. It does not keep a hidden copy.
 * The caller must stop the child first and only delete through {@link #execute} after a fresh scan matches.
 */
final class CleanSetup {
    static final long TICKET_TTL_MS = 10 * 60 * 1000L;
    static final int MAX_ENTRIES = 100_000;
    private static final Set<String> SHALLOW = Set.of("/", "/home", "/opt", "/var", "/srv", "/root", "/mnt", "/data");

    record Plan(String identity, String planHash, long expiresAt, List<String> delete, List<String> keep,
                List<String> reprovision, int serverPort, int childPort, int dashboardPort, String serverIp,
                boolean onlineMode, boolean enableRcon) {}

    @FunctionalInterface
    interface Deleter {
        void delete(Path path) throws IOException;
    }

    private CleanSetup() {}

    static Plan scan(Path root, Path pluginJar, int childPort, int dashboardPort, long now) throws IOException {
        Path realRoot = requireServerRoot(root);
        if (pluginJar == null || !pluginJar.toAbsolutePath().normalize().startsWith(realRoot))
            throw new SecurityException("The running ServerHoster jar must stay inside this server directory");
        String pluginRel = realRoot.relativize(pluginJar.toAbsolutePath().normalize()).toString().replace('\\', '/');
        TreeSet<String> delete = new TreeSet<>();
        TreeSet<String> keep = new TreeSet<>();
        int seen = 0;
        try (var walk = Files.walk(realRoot)) {
            var it = walk.iterator();
            while (it.hasNext()) {
                if (++seen > MAX_ENTRIES) throw new IOException("Server directory is too large to clean safely");
                Path path = it.next();
                String relative = realRoot.relativize(path).toString().replace('\\', '/');
                if (relative.isEmpty()) {
                    keep.add(".");
                    continue;
                }
                if (keepPath(relative, pluginRel)) keep.add(relative);
                else delete.add(relative);
            }
        }
        keep.add("plugins/ServerhosterPlugin-clean-reprovision.txt");
        delete.remove("plugins/ServerhosterPlugin-clean-reprovision.txt");
        List<String> reprovision = List.of(
                "server.properties", "bukkit.yml", "spigot.yml",
                "plugins/ServerhosterPlugin/config.yml",
                "plugins/ServerhosterPlugin/dashboard-password.txt");
        var props = readKey(realRoot.resolve("server.properties"));
        int serverPort = parsePort(props.get("server-port"), 25565);
        Plan unsigned = new Plan(identity(realRoot), "", now + TICKET_TTL_MS, List.copyOf(delete), List.copyOf(keep),
                reprovision, serverPort, childPort, dashboardPort, props.getOrDefault("server-ip", ""),
                !"false".equalsIgnoreCase(props.getOrDefault("online-mode", "true")),
                "true".equalsIgnoreCase(props.getOrDefault("enable-rcon", "false")));
        return new Plan(unsigned.identity(), hash(unsigned), unsigned.expiresAt(), unsigned.delete(), unsigned.keep(),
                unsigned.reprovision(), unsigned.serverPort(), unsigned.childPort(), unsigned.dashboardPort(),
                unsigned.serverIp(), unsigned.onlineMode(), unsigned.enableRcon());
    }

    static String confirmPhrase(Plan plan) {
        return "CLEAN " + plan.identity() + " " + plan.planHash().substring(0, 8);
    }

    static String sidecar(String status, Plan plan) {
        StringBuilder text = new StringBuilder();
        text.append("status=").append(status).append('\n');
        text.append("identity=").append(plan.identity()).append('\n');
        text.append("planHash=").append(plan.planHash()).append('\n');
        text.append("expiresAt=").append(plan.expiresAt()).append('\n');
        text.append("serverPort=").append(plan.serverPort()).append('\n');
        text.append("childPort=").append(plan.childPort()).append('\n');
        text.append("dashboardPort=").append(plan.dashboardPort()).append('\n');
        text.append("serverIp=").append(plan.serverIp()).append('\n');
        text.append("onlineMode=").append(plan.onlineMode()).append('\n');
        text.append("enableRcon=").append(plan.enableRcon()).append('\n');
        for (String path : plan.delete()) text.append("delete=").append(path).append('\n');
        return text.toString();
    }

    static Plan parseSidecar(String text) {
        java.util.Map<String, String> values = new java.util.LinkedHashMap<>();
        List<String> delete = new ArrayList<>();
        for (String line : text.split("\n")) {
            int eq = line.indexOf('=');
            if (eq < 1) continue;
            String key = line.substring(0, eq);
            String value = line.substring(eq + 1);
            if ("delete".equals(key)) delete.add(value);
            else values.put(key, value);
        }
        return new Plan(values.getOrDefault("identity", ""), values.getOrDefault("planHash", ""),
                Long.parseLong(values.getOrDefault("expiresAt", "0")), List.copyOf(delete), List.of(),
                List.of("server.properties", "bukkit.yml", "spigot.yml",
                        "plugins/ServerhosterPlugin/config.yml", "plugins/ServerhosterPlugin/dashboard-password.txt"),
                Integer.parseInt(values.getOrDefault("serverPort", "25565")),
                Integer.parseInt(values.getOrDefault("childPort", "2063")),
                Integer.parseInt(values.getOrDefault("dashboardPort", "2064")),
                values.getOrDefault("serverIp", ""), Boolean.parseBoolean(values.getOrDefault("onlineMode", "true")),
                Boolean.parseBoolean(values.getOrDefault("enableRcon", "false")));
    }

    static String sidecarStatus(String text) {
        for (String line : text.split("\n")) if (line.startsWith("status=")) return line.substring("status=".length());
        return "";
    }

    static void checkTicket(Plan ticket, Plan fresh, String confirm, long now) {
        if (ticket == null || fresh == null) throw new IllegalArgumentException("Clean-Setup-Ticket fehlt");
        if (now > ticket.expiresAt()) throw new IllegalArgumentException("Das Clean-Setup-Ticket ist abgelaufen");
        if (!ticket.identity().equals(fresh.identity()) || !durableHash(ticket).equals(durableHash(fresh))
                || ticket.serverPort() != fresh.serverPort() || ticket.childPort() != fresh.childPort()
                || ticket.dashboardPort() != fresh.dashboardPort() || ticket.onlineMode() != fresh.onlineMode()
                || ticket.enableRcon() != fresh.enableRcon() || !ticket.serverIp().equals(fresh.serverIp()))
            throw new IllegalStateException("Der Serverinhalt hat sich seit der Vorschau geändert");
        if (!confirmPhrase(ticket).equals(confirm))
            throw new IllegalArgumentException("Die Bestätigung stimmt nicht. Erforderlich ist exakt: " + confirmPhrase(ticket));
    }

    static boolean volatilePath(String relative) {
        return relative.equals("logs") || relative.startsWith("logs/")
                || relative.equals("crash-reports") || relative.startsWith("crash-reports/")
                || relative.endsWith(".lock");
    }

    private static String durableHash(Plan plan) {
        return hash(new Plan(plan.identity(), "", 0,
                plan.delete().stream().filter(path -> !volatilePath(path)).toList(),
                plan.keep().stream().filter(path -> !volatilePath(path)).toList(),
                plan.reprovision(), plan.serverPort(), plan.childPort(), plan.dashboardPort(),
                plan.serverIp(), plan.onlineMode(), plan.enableRcon()));
    }

    static void provision(Path root, Plan plan, String lobbyName) throws IOException {
        if (root == null || Files.isSymbolicLink(root)) throw new SecurityException("server root must not be a symlink");
        Path real = root.toRealPath();
        if (!identity(real).equals(plan.identity())) throw new SecurityException("server identity does not match the clean plan");
        if (!HostMinimize.lobbyNameSafe(lobbyName) || Files.exists(real.resolve(lobbyName)))
            throw new IOException("Fresh lobby name is not usable");
        String settings = "{\"biome\":\"minecraft:the_void\",\"features\":true,\"lakes\":false,\"layers\":[{\"block\":\"minecraft:air\",\"height\":1}],\"structure_overrides\":[]}";
        List<String> lines = List.of(
                "level-name=" + lobbyName,
                "level-type=minecraft:flat",
                "generator-settings=" + settings,
                "generate-structures=false",
                "allow-nether=false",
                "view-distance=2",
                "simulation-distance=2",
                "spawn-monsters=false",
                "spawn-animals=false",
                "spawn-npcs=false",
                "spawn-protection=0",
                "max-players=1",
                "entity-broadcast-range-percentage=10",
                "max-world-size=16",
                "pause-when-empty-seconds=60",
                "white-list=true",
                "enforce-whitelist=true",
                "server-port=" + plan.serverPort(),
                "server-ip=" + plan.serverIp(),
                "online-mode=" + plan.onlineMode(),
                "enable-rcon=" + plan.enableRcon());
        Files.writeString(real.resolve("server.properties"), String.join("\n", lines) + "\n");
        Files.writeString(real.resolve("bukkit.yml"), """
                settings:
                  allow-end: false
                  allow-nether: false
                spawn-limits:
                  monsters: 0
                  animals: 0
                  water-animals: 0
                  water-ambient: 0
                  water-underground-creature: 0
                  axolotls: 0
                  ambient: 0
                """);
        Files.writeString(real.resolve("spigot.yml"), """
                world-settings:
                  default:
                    view-distance: 2
                    simulation-distance: 2
                    mob-spawn-range: 0
                """);
        Files.createDirectories(real.resolve("child-server"));
    }

    static void execute(Path root, List<String> delete, String pluginJarRelative, Deleter deleter) throws IOException {
        Path realRoot = requireServerRoot(root);
        List<String> ordered = new ArrayList<>(delete);
        ordered.sort(Comparator.comparingInt((String path) -> path.split("/").length).reversed().thenComparing(Comparator.reverseOrder()));
        List<Path> targets = new ArrayList<>();
        for (String relative : ordered) {
            Path path = validateInside(realRoot, relative);
            if (keepPath(relative, pluginJarRelative)) throw new SecurityException("refusing to delete a protected path: " + relative);
            targets.add(path);
        }
        for (int i = 0; i < targets.size(); i++) {
            try {
                deleter.delete(targets.get(i));
            } catch (IOException e) {
                throw new IOException("Clean setup stopped after a delete failure at " + ordered.get(i), e);
            }
        }
    }

    static Path validateInside(Path root, String relative) throws IOException {
        if (relative == null || relative.isBlank() || relative.startsWith("/") || relative.startsWith("\\")
                || relative.contains("..") || relative.contains("\\"))
            throw new SecurityException("illegal clean path");
        Path realRoot = root.toRealPath();
        Path path = realRoot.resolve(relative).normalize();
        if (!path.startsWith(realRoot)) throw new SecurityException("path escapes the server root");
        if (Files.isSymbolicLink(path)) return path;
        if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            Path real = path.toRealPath();
            if (!real.startsWith(realRoot)) throw new SecurityException("real path escapes the server root");
        }
        return path;
    }

    static Path requireServerRoot(Path root) throws IOException {
        if (root == null) throw new SecurityException("server root is missing");
        if (Files.isSymbolicLink(root)) throw new SecurityException("server root must not be a symlink");
        if (!Files.isDirectory(root)) throw new IOException("server root is not a directory");
        Path real = root.toRealPath();
        if (real.getNameCount() < 2 || SHALLOW.contains(real.toString()) || "LiteStorage".equalsIgnoreCase(real.getFileName().toString()))
            throw new SecurityException("refusing to clean a hosting parent or filesystem root");
        if (real.getParent() != null && "LiteStorage".equalsIgnoreCase(String.valueOf(real.getParent().getFileName())))
            throw new SecurityException("refusing to clean inside LiteStorage");
        if (!Files.isRegularFile(real.resolve("server.properties"), LinkOption.NOFOLLOW_LINKS)
                || !Files.isDirectory(real.resolve("plugins"), LinkOption.NOFOLLOW_LINKS))
            throw new SecurityException("directory is not an outer Spigot server root");
        return real;
    }

    static boolean keepPath(String relative, String pluginJarRelative) {
        if (relative == null || relative.isBlank() || ".".equals(relative)) return true;
        if (relative.equals(pluginJarRelative)) return true;
        if (relative.equals("eula.txt") || relative.equals("plugins")) return true;
        if (relative.equals("plugins/ServerhosterPlugin-clean-reprovision.txt")) return true;
        if (isRuntimeTree(relative)) return true;
        return !relative.contains("/") && relative.toLowerCase(Locale.ROOT).endsWith(".jar");
    }

    private static boolean isRuntimeTree(String relative) {
        return relative.equals("bundler") || relative.startsWith("bundler/")
                || relative.equals("libraries") || relative.startsWith("libraries/")
                || relative.equals("versions") || relative.startsWith("versions/");
    }

    private static String hash(Plan plan) {
        StringBuilder text = new StringBuilder();
        text.append(plan.identity()).append('\n').append(plan.serverPort()).append('\n').append(plan.childPort())
                .append('\n').append(plan.dashboardPort()).append('\n').append(plan.serverIp()).append('\n')
                .append(plan.onlineMode()).append('\n').append(plan.enableRcon()).append('\n');
        for (String path : plan.delete()) text.append("D ").append(path).append('\n');
        for (String path : plan.keep()) text.append("K ").append(path).append('\n');
        for (String path : plan.reprovision()) text.append("R ").append(path).append('\n');
        try {
            return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(text.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        } catch (Exception e) {
            throw new IllegalStateException("SHA-256 is unavailable", e);
        }
    }

    private static String identity(Path realRoot) {
        try {
            return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256")
                    .digest(realRoot.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8))).substring(0, 8);
        } catch (Exception e) {
            throw new IllegalStateException("SHA-256 is unavailable", e);
        }
    }

    private static java.util.Map<String, String> readKey(Path file) throws IOException {
        java.util.Map<String, String> values = new java.util.LinkedHashMap<>();
        if (!Files.isRegularFile(file, LinkOption.NOFOLLOW_LINKS)) return values;
        for (String line : Files.readAllLines(file)) {
            String trimmed = line.trim();
            if (trimmed.isEmpty() || trimmed.startsWith("#") || !trimmed.contains("=")) continue;
            int eq = trimmed.indexOf('=');
            values.put(trimmed.substring(0, eq).trim(), trimmed.substring(eq + 1).trim());
        }
        return values;
    }

    private static int parsePort(String value, int fallback) {
        try {
            int port = Integer.parseInt(value);
            return port >= 1 && port <= 65535 ? port : fallback;
        } catch (NumberFormatException e) {
            return fallback;
        }
    }
}
