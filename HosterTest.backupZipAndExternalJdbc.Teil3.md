[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.backupZipAndExternalJdbc]] › [[HosterTest.backupZipAndExternalJdbc.Teil3]]

# HosterTest.backupZipAndExternalJdbc.Teil3

```mermaid
flowchart TD
  n1["BackupBridge.archive"]:::internal-link
  n2["try Z.413"]
  n3["for Z.414 (var ignored : ds)"]
  n4["BackupBridge.count"]:::internal-link
  n5["BackupBridge.table"]:::internal-link
  n2 --> n3
  n1 --> n2
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n4 fill:#f88,stroke:#900
```

```knoten
BackupBridge.archive
  Packt `archive`. Ruft `open`, `safeId`, `resolve`.
try Z.413
  Zeile 413: Versuch. Der Fehlerpfad geht in catch.
for Z.414 (var ignored : ds)
  Zeile 414: Schleife `(var ignored : ds)`.
BackupBridge.count
  Zählt `count`. Ruft `connect`, `table`. Befund: toter Code (wahrscheinlich).
BackupBridge.table
  `table` in `BackupBridge.java`.
```

- Fortsetzung von `HosterTest.backupZipAndExternalJdbc`, Quellreihenfolge.
