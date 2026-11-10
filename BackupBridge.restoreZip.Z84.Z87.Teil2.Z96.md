[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil1]] › [[BackupBridge.restoreZip]] › [[BackupBridge.restoreZip.Z84.Z87.Teil2.Z96]]

# BackupBridge.restoreZip.Z84.Z87.Teil2.Z96

```mermaid
flowchart TD
  n1["try Z.96"]
  n2["while Z.99 ((r = in.read(buf)) ) 0)"]
  n3["if Z.101 (bytes ) MAX_RESTORE_BYTES)"]
  n4["throw Z.101 throw new IOException('zip too large');"]
  n3 -->|"ja"| n4
  n2 -->|"wiederholen"| n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupBridge.restoreZip.Z84.Z87.Teil2`, Quellreihenfolge.
