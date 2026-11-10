[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.insert]] › [[BackupBridge.insert.Z196]]

# BackupBridge.insert.Z196

```mermaid
flowchart TD
  n1["try Z.196"]
  n2["BackupBridge.connect"]:::internal-link
  n3["BackupBridge.table"]:::internal-link
  n4["BackupBridge.ensureTable"]:::internal-link
  n5["BackupBridge.insert.Z196.Z199"]:::internal-link
  n1 -->|"Z.196"| n2
  n3 --> n4
  n4 --> n5
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.196
  Zeile 196: Versuch. Der Fehlerpfad geht in catch.
BackupBridge.connect
  Verbindet `connect`.
BackupBridge.table
  `table` in `BackupBridge.java`.
BackupBridge.ensureTable
  Stellt sicher `ensureTable`.
BackupBridge.insert.Z196.Z199
  Fortsetzung des Ablaufs ab Zeile 199.
```

- Fortsetzung von `BackupBridge.insert`, Quellreihenfolge.
