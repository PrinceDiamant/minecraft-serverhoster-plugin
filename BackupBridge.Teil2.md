[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]]

# BackupBridge.Teil2

```mermaid
flowchart TD
  n1["BackupBridge.named"]:::internal-link
  n2["BackupBridge.archive"]:::internal-link
  n3["BackupBridge.test"]:::internal-link
  n4["BackupBridge.write"]:::internal-link
  n5["BackupBridge.pRealInside"]:::internal-link
  n6["BackupBridge.retain"]:::internal-link
  n7["BackupBridge.insert"]:::internal-link
  n8["BackupBridge.ensureTable"]:::internal-link
  n2 -->|"Z.147"| n4
  n2 -->|"Z.150"| n5
  n2 -->|"Z.159"| n6
  n2 -->|"Z.162"| n7
  n3 -->|"Z.170"| n8
  n7 -->|"Z.198"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupBridge.named
  `named` in `BackupBridge.java`.
BackupBridge.archive
  Packt `archive`. Ruft `open`, `safeId`, `resolve`.
BackupBridge.test
  Prüft `test`. Ruft `connect`, `ensureTable`, `table`.
BackupBridge.write
  Schreibt `write`.
BackupBridge.pRealInside
  `pRealInside` in `BackupBridge.java`. Ruft `root`.
BackupBridge.retain
  Behält die letzten Stücke `retain`.
BackupBridge.insert
  Fügt ein `insert`. Ruft `connect`, `table`, `ensureTable`.
BackupBridge.ensureTable
  Stellt sicher `ensureTable`.
```


