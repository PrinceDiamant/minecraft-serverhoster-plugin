[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil1]] › [[BackupBridge.restoreZip]] › [[BackupBridge.restoreZip.Z84]]

# BackupBridge.restoreZip.Z84

```mermaid
flowchart TD
  n1["try Z.84"]
  n2["if Z.85 (z.size() ) MAX_RESTORE_FILES)"]
  n3["throw Z.85 throw new IOException('zip too large');"]
  n4["BackupBridge.restoreZip.Z84.Z87"]:::internal-link
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupBridge.restoreZip`, Quellreihenfolge.
