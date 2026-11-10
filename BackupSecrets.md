[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupSecrets]]

# BackupSecrets

```mermaid
flowchart TD
  n1["BackupSecrets.BackupSecrets"]:::internal-link
  n2["BackupSecrets.readExisting"]:::internal-link
  n3["BackupSecrets.load"]:::internal-link
  n4["BackupSecrets.saveFtp"]:::internal-link
  n5["BackupSecrets.restrict"]:::internal-link
  n2 -->|"Z.23"| n3
  n3 -->|"Z.35"| n5
  n4 -->|"Z.62"| n3
  n4 -->|"Z.75"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```


