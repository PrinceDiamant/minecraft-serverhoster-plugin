[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.archive]] › [[BackupBridge.archive.Teil2]]

# BackupBridge.archive.Teil2

```mermaid
flowchart TD
  n1["BackupBridge.archive.Teil2.Z136"]:::internal-link
  n2["if Z.156 (files == 0)"]
  n3["Schritt Z.156 Files.deleteIfExists(zip);"]
  n4["throw Z.156 throw new IOException('nothing to archive');"]
  n5["Schritt Z.158 long bytes = Files.size(zip);"]
  n6["BackupBridge.retain"]:::internal-link
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n4 --> n5
  n2 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupBridge.archive`, Quellreihenfolge.
