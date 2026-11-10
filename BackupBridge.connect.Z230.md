[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil3]] › [[BackupBridge.connect]] › [[BackupBridge.connect.Z230]]

# BackupBridge.connect.Z230

```mermaid
flowchart TD
  n1["if Z.230 (spec.driverJar != null && !spec.driverJar.isBlan…"]
  n2["if Z.234 (c == null)"]
  n3["throw Z.234 throw new java.sql.SQLException('driver rejected …"]
  n4["return Z.235 return c;"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupBridge.connect`, Quellreihenfolge.
