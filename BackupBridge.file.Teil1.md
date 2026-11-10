[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil1]] › [[BackupBridge.file]] › [[BackupBridge.file.Teil1]]

# BackupBridge.file.Teil1

```mermaid
flowchart TD
  n1["BackupBridge.safeId"]:::internal-link
  n2["if Z.61 (!named(safe, name))"]
  n3["BackupBridge.named"]:::internal-link
  n4["throw Z.61 throw new IllegalArgumentException('backup name');"]
  n5["BackupBridge.directory"]:::internal-link
  n6["if Z.64 (f.getParent() == null // !f.getParent().equals(d…"]
  n7["throw Z.64 throw new IllegalArgumentException('backup name');"]
  n8["if Z.65 (!Files.isRegularFile(f) // Files.isSymbolicLink(…"]
  n9["throw Z.65 throw new IllegalArgumentException('backup name');"]
  n2 -->|"Z.61"| n3
  n3 -->|"ja"| n4
  n1 --> n2
  n4 --> n5
  n3 --> n5
  n6 -->|"ja"| n7
  n5 --> n6
  n8 -->|"ja"| n9
  n7 --> n8
  n6 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupBridge.file`, Quellreihenfolge.
