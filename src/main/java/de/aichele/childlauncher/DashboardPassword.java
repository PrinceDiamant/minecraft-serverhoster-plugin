package de.aichele.childlauncher;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.PosixFilePermissions;

final class DashboardPassword {
    private DashboardPassword() {}

    static String read(Path file, boolean setupRequired) throws IOException {
        if (Files.isSymbolicLink(file)) throw new IOException("Dashboard password file must not be a symlink");
        if (!Files.exists(file, LinkOption.NOFOLLOW_LINKS)) {
            if (!setupRequired) throw new IOException("Dashboard password is missing for an existing installation");
            return null;
        }
        if (!Files.isRegularFile(file, LinkOption.NOFOLLOW_LINKS)) throw new IOException("Dashboard password must be a regular file");
        String password = Files.readString(file, StandardCharsets.UTF_8).trim();
        if (password.isEmpty()) throw new IOException("Dashboard password file is empty");
        return password;
    }

    static void create(Path file, String password) throws IOException {
        if (password == null || password.length() < 12 || password.length() > 128
                || !password.equals(password.trim()) || password.chars().anyMatch(Character::isISOControl))
            throw new IllegalArgumentException("Das Passwort muss 12 bis 128 Zeichen lang sein und darf keine Steuerzeichen oder Leerzeichen am Rand enthalten.");
        Path parent = file.toAbsolutePath().normalize().getParent();
        Files.createDirectories(parent);
        if (Files.getFileStore(parent).supportsFileAttributeView("posix"))
            Files.createFile(file, PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------")));
        else Files.createFile(file);
        try {
            Files.writeString(file, password + "\n", StandardCharsets.UTF_8, StandardOpenOption.WRITE);
        } catch (IOException e) {
            try { Files.deleteIfExists(file); } catch (IOException cleanup) { e.addSuppressed(cleanup); }
            throw e;
        }
    }
}
