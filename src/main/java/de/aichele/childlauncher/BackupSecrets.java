package de.aichele.childlauncher;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

final class BackupSecrets {
    record Credentials(String username, String password, String ntfyToken) {}

    private BackupSecrets() {}

    static Credentials readExisting(Path pluginDirectory) throws IOException {
        Path path = pluginDirectory.toAbsolutePath().normalize().resolve("secrets.yml");
        if (Files.isSymbolicLink(path)) throw new IOException("Invalid secrets.yml path");
        if (!Files.exists(path)) return new Credentials("", "", "");
        return load(pluginDirectory);
    }

    static Credentials load(Path pluginDirectory) throws IOException {
        Path directory = pluginDirectory.toAbsolutePath().normalize();
        Files.createDirectories(directory);
        Path path = directory.resolve("secrets.yml");
        if (!path.getParent().equals(directory) || Files.isSymbolicLink(path)) {
            throw new IOException("Invalid secrets.yml path");
        }
        if (!Files.exists(path)) {
            Files.createFile(path);
            restrict(path);
            YamlConfiguration initial = new YamlConfiguration();
            initial.set("backup.ftp.username", "");
            initial.set("backup.ftp.password", "");
            initial.set("notifications.ntfy.token", "");
            initial.save(path.toFile());
        }
        restrict(path);
        YamlConfiguration config = new YamlConfiguration();
        try {
            config.load(path.toFile());
        } catch (InvalidConfigurationException e) {
            throw new IOException("Cannot parse secrets.yml in " + directory, e);
        }
        String username = config.getString("backup.ftp.username", "");
        String password = config.getString("backup.ftp.password", "");
        String token = config.getString("notifications.ntfy.token", "");
        if (username == null || password == null || token == null)
            throw new IOException("FTP and ntfy credentials in secrets.yml must be strings");
        return new Credentials(username, password, token);
    }

    static synchronized void saveFtp(Path pluginDirectory, String username, String password) throws IOException {
        if (username == null || username.isBlank() || username.length() > 512 || username.chars().anyMatch(Character::isISOControl))
            throw new IllegalArgumentException("FTP-Benutzername ist ungültig");
        if (password != null && (password.length() > 4096 || password.chars().anyMatch(Character::isISOControl)))
            throw new IllegalArgumentException("FTP-Passwort ist ungültig");
        Credentials existing = load(pluginDirectory);
        Path directory = pluginDirectory.toAbsolutePath().normalize();
        Path target = directory.resolve("secrets.yml");
        YamlConfiguration config = new YamlConfiguration();
        try {
            config.load(target.toFile());
        } catch (InvalidConfigurationException e) {
            throw new IOException("Cannot parse secrets.yml in " + directory, e);
        }
        config.set("backup.ftp.username", username);
        config.set("backup.ftp.password", password == null ? existing.password() : password);
        Path temporary = Files.createTempFile(directory, "secrets-", ".tmp");
        try {
            restrict(temporary);
            config.save(temporary.toFile());
            try {
                Files.move(temporary, target, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            } catch (AtomicMoveNotSupportedException e) {
                Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING);
            }
            restrict(target);
        } finally {
            Files.deleteIfExists(temporary);
        }
    }

    private static void restrict(Path path) throws IOException {
        if (Files.getFileStore(path).supportsFileAttributeView("posix")) {
            Files.setPosixFilePermissions(path, Set.of(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE));
        }
    }
}
