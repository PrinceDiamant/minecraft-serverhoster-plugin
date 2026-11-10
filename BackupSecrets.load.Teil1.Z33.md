[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupSecrets]] › [[BackupSecrets.load]] › [[BackupSecrets.load.Teil1.Z33]]

# BackupSecrets.load.Teil1.Z33

```mermaid
flowchart TD
  n1["if Z.33 (!Files.exists(path))"]
  n2["Schritt Z.34 Files.createFile(path);"]
  n3["BackupSecrets.restrict"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupSecrets.load.Teil1`, Quellreihenfolge.
