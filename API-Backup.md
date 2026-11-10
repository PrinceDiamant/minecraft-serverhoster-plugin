[[00 Start]] › [[Dashboard-HTTP]] › [[API-Backup]]

# API-Backup

```mermaid
flowchart TD
  n1["Dashboard.backupJson"]:::internal-link
  n2["Dashboard.backupDownload"]:::internal-link
  n3["Dashboard.backupMutate"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
Dashboard.backupJson
  Sichert `backupJson`.
Dashboard.backupDownload
  Sichert `backupDownload`. Ruft `backupFiles`, `downloadBackup`. Befund: Logikrisiko (sicher).
Dashboard.backupMutate
  Sichert `backupMutate`. Ruft `readBodyText`, `json`, `restoreBackup`.
```


