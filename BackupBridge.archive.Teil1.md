[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.archive]] › [[BackupBridge.archive.Teil1]]

# BackupBridge.archive.Teil1

```mermaid
flowchart TD
  n1["if Z.127 (spec.directory == null // spec.directory.isBlank…"]
  n2["throw Z.127 throw new IOException('backup directory');"]
  n3["PathGuard.open"]:::internal-link
  n4["Schritt Z.130 Files.createDirectories(dir);"]
  n5["BackupBridge.safeId"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.127 (spec.directory == null // spec.directory.isBlank…
  Zeile 127: prüft `(spec.directory == null // spec.directory.isBlank…`.
throw Z.127 throw new IOException('backup directory');
  Zeile 127: Abbruch `throw new IOException('backup directory');`.
PathGuard.open
  Öffnet `open`. Ruft `PathGuard`.
Schritt Z.130 Files.createDirectories(dir);
  Zeile 130: Dateioperation. `Files.createDirectories(dir);`
BackupBridge.safeId
  Prüft die Pfadgrenze `safeId`.
```

- Fortsetzung von `BackupBridge.archive`, Quellreihenfolge.
