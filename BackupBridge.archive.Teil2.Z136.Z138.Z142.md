[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.archive]] › [[BackupBridge.archive.Teil2.Z136.Z138.Z142]]

# BackupBridge.archive.Teil2.Z136.Z138.Z142

```mermaid
flowchart TD
  n1["if Z.142 (Files.isDirectory(start))"]
  n2["BackupBridge.archive.Teil2.Z136.Z138.Z142.Z143"]:::internal-link
  n3["if Z.150 (pRealInside(guard, start))"]
  n4["BackupBridge.pRealInside"]:::internal-link
  n5["BackupBridge.write"]:::internal-link
  n6["PathGuard.root"]:::internal-link
  n3 -->|"Z.150"| n4
  n5 -->|"Z.150"| n6
  n4 -->|"ja"| n5
  n1 -->|"ja"| n2
  n1 -->|"nein"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupBridge.archive.Teil2.Z136.Z138`, Quellreihenfolge.
