[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupSecrets]] › [[BackupSecrets.load]] › [[BackupSecrets.load.Teil2]]

# BackupSecrets.load.Teil2

```mermaid
flowchart TD
  n1["if Z.52 (username == null // password == null // token ==…"]
  n2["throw Z.53 throw new IOException('FTP and ntfy credentials i…"]
  n3["return Z.54 return new Credentials(username, password, token);"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupSecrets.load`, Quellreihenfolge.
