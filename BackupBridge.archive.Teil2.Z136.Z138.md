[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.archive]] › [[BackupBridge.archive.Teil2.Z136.Z138]]

# BackupBridge.archive.Teil2.Z136.Z138

```mermaid
flowchart TD
  n1["for Z.138 (String rel : paths)"]
  n2["try Z.140"]
  n3["PathGuard.resolve"]:::internal-link
  n4["catch Z.140 (SecurityException e)"]
  n5["if Z.141 (!Files.exists(start) // Files.isSymbolicLink(sta…"]
  n6["BackupBridge.archive.Teil2.Z136.Z138.Z142"]:::internal-link
  n2 --> n3
  n2 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  n5 --> n6
  n5 --> n6
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupBridge.archive.Teil2.Z136`, Quellreihenfolge.
