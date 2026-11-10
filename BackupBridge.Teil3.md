[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil3]]

# BackupBridge.Teil3

```mermaid
flowchart TD
  n1["BackupBridge.table"]:::internal-link
  n2["BackupBridge.connect"]:::internal-link
  n3["BackupBridge.count"]:::internal-link
  n3 -->|"Z.242"| n2
  n3 -->|"Z.242"| n1
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
```

```knoten
BackupBridge.table
  `table` in `BackupBridge.java`.
BackupBridge.connect
  Verbindet `connect`.
BackupBridge.count
  Zählt `count`. Ruft `connect`, `table`. Befund: toter Code (wahrscheinlich).
```


