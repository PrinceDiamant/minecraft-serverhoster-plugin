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

- Fortsetzung von `BackupBridge.archive`, Quellreihenfolge.
