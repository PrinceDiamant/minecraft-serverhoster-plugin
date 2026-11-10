package de.aichele.serverhoster;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class SetupDiscovery {
    record Candidate(Path path, boolean hasServerFiles, List<String> contents) {
        Map<String, Object> view() {
            Map<String, Object> result = new LinkedHashMap<>();
            result.put("path", path.toString());
            result.put("configured", false);
            result.put("type", "");
            result.put("mcVersion", "");
            result.put("port", 0);
            result.put("hasServerFiles", hasServerFiles);
            result.put("contents", contents);
            return result;
        }
    }

    private static final Set<String> SKIP = Set.of("plugins", "logs", "libraries", "cache", "world", "world_nether", "world_the_end", "worlds", "versions", "build-tools", "bundler");

    private SetupDiscovery() {}

    static List<Candidate> scan(Path serverRoot) throws IOException {
        Path root = serverRoot.toAbsolutePath().normalize();
        java.util.Properties hostProperties = new java.util.Properties();
        Path propertiesPath = root.resolve("server.properties");
        if (Files.isRegularFile(propertiesPath, LinkOption.NOFOLLOW_LINKS)) {
            try (var reader = Files.newBufferedReader(propertiesPath)) {
                hostProperties.load(reader);
            }
        }
        String hostLevel = hostProperties.getProperty("level-name", "world").toLowerCase(java.util.Locale.ROOT);
        Map<Path, Boolean> configured = new LinkedHashMap<>();

        try (DirectoryStream<Path> entries = Files.newDirectoryStream(root)) {
            int examined = 0;
            for (Path entry : entries) {
                if (++examined > 2_048) throw new IOException("Server root exceeds the bounded setup scan limit");
                String entryName = entry.getFileName().toString().toLowerCase(java.util.Locale.ROOT);
                if (entryName.contains(".serverhoster-delete-pending-")
                        || entryName.contains(".serverhoster-reset-pending-")
                        || entryName.startsWith("serverhoster-lobby-")
                        || entryName.equals(hostLevel)
                        || entryName.equals(hostLevel + "_nether")
                        || entryName.equals(hostLevel + "_the_end")
                        || SKIP.contains(entryName)
                        || Files.isSymbolicLink(entry)
                        || !Files.isDirectory(entry, LinkOption.NOFOLLOW_LINKS)) continue;
                Path path = entry.toAbsolutePath().normalize();
                if (isServerDirectory(path)) configured.putIfAbsent(path, true);
            }
        }

        List<Candidate> result = new ArrayList<>();
        for (Path path : configured.keySet()) {
            result.add(new Candidate(path, hasServerFiles(path), topLevelEntries(path)));
        }
        return List.copyOf(result);
    }

    static Path resolveNewDirectory(Path serverRoot, String value) {
        if (value == null || value.isBlank()) throw new IllegalArgumentException("Serverordner fehlt");
        Path root = serverRoot.toAbsolutePath().normalize();
        Path requested = Path.of(value.trim());
        if (requested.isAbsolute()) throw new IllegalArgumentException("Neue Serverordner müssen relativ zum Serververzeichnis sein");
        Path resolved = root.resolve(requested).normalize();
        if (!resolved.startsWith(root) || resolved.equals(root))
            throw new IllegalArgumentException("Serverordner liegt außerhalb des erlaubten Bereichs");
        Path relative = root.relativize(resolved);
        if (SKIP.contains(relative.getName(0).toString().toLowerCase(java.util.Locale.ROOT)))
            throw new IllegalArgumentException("Serverordner darf kein bekanntes Host-Verzeichnis sein");
        Path current = root;
        for (Path segment : root.relativize(resolved)) {
            current = current.resolve(segment);
            if (Files.isSymbolicLink(current))
                throw new IllegalArgumentException("Serverordner enthält einen symbolischen Link");
        }
        return resolved;
    }

    static boolean isSafeArchiveTarget(Path serverRoot, Path target) throws IOException {
        Path root = serverRoot.toAbsolutePath().normalize().toRealPath();
        if (Files.isSymbolicLink(target) || !Files.isDirectory(target, LinkOption.NOFOLLOW_LINKS)) return false;
        Path real = target.toRealPath();
        if (!real.startsWith(root) || real.equals(root)) return false;
        return !SKIP.contains(real.getFileName().toString().toLowerCase(java.util.Locale.ROOT));
    }

    private static boolean isServerDirectory(Path path) throws IOException {
        return !Files.isSymbolicLink(path) && Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)
                && hasServerFiles(path);
    }

    private static boolean hasServerFiles(Path path) throws IOException {
        for (String marker : List.of("server.properties", "eula.txt", "level.dat")) {
            if (Files.isRegularFile(path.resolve(marker), LinkOption.NOFOLLOW_LINKS)) return true;
        }
        try (DirectoryStream<Path> entries = Files.newDirectoryStream(path, "*.jar")) {
            for (Path entry : entries)
                if (!Files.isSymbolicLink(entry) && Files.isRegularFile(entry, LinkOption.NOFOLLOW_LINKS)) return true;
            return false;
        }
    }

    private static List<String> topLevelEntries(Path path) throws IOException {
        List<String> names = new ArrayList<>();
        try (DirectoryStream<Path> entries = Files.newDirectoryStream(path)) {
            for (Path entry : entries) {
                if (names.size() == 20) {
                    names.add("...");
                    break;
                }
                names.add(entry.getFileName().toString() + (Files.isDirectory(entry, LinkOption.NOFOLLOW_LINKS) ? "/" : ""));
            }
        }
        return List.copyOf(names);
    }
}
