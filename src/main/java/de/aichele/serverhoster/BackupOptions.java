package de.aichele.serverhoster;

import java.util.List;

record BackupOptions(List<String> paths, int keep) {
    BackupOptions {
        if (paths == null || paths.isEmpty() || paths.size() > 50)
            throw new IllegalArgumentException("Bitte 1 bis 50 Backup-Pfade angeben");
        for (String path : paths) {
            if (path == null || path.isBlank() || path.length() > 512 || path.startsWith("/")
                    || path.startsWith("\\") || path.matches("^[A-Za-z]:.*")
                    || path.chars().anyMatch(Character::isISOControl))
                throw new IllegalArgumentException("Backup-Pfade müssen relative Child-Pfade sein");
            for (String segment : path.replace('\\', '/').split("/"))
                if ("..".equals(segment)) throw new IllegalArgumentException("Backup-Pfade dürfen kein '..' enthalten");
        }
        paths = List.copyOf(paths);
        if (keep < 0 || keep > 10000)
            throw new IllegalArgumentException("Anzahl der Backups muss zwischen 0 und 10000 liegen");
    }
}
