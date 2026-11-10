[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil1]] › [[BackupBridge.restoreZip]] › [[BackupBridge.restoreZip.Z84.Z87.Teil1]]

# BackupBridge.restoreZip.Z84.Z87.Teil1

```mermaid
flowchart TD
  n1["if Z.89 (e.isDirectory())"]
  n2["if Z.91 (raw.isBlank() // raw.contains('/0'))"]
  n3["throw Z.91 throw new SecurityException('zip entry');"]
  n4["if Z.92 (e.getSize() ) MAX_RESTORE_BYTES)"]
  n5["throw Z.92 throw new IOException('zip entry too large');"]
  n6["PathGuard.resolve"]:::internal-link
  n7["if Z.94 (Files.isSymbolicLink(target))"]
  n8["throw Z.94 throw new SecurityException('symlink');"]
  n2 -->|"ja"| n3
  n1 --> n2
  n1 --> n2
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n4
  n5 --> n6
  n4 --> n6
  n7 -->|"ja"| n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupBridge.restoreZip.Z84.Z87`, Quellreihenfolge.
