[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.backupZipAndExternalJdbc]] › [[HosterTest.backupZipAndExternalJdbc.Teil6]]

# HosterTest.backupZipAndExternalJdbc.Teil6

```mermaid
flowchart TD
  n1["BackupBridge.list"]:::internal-link
  n2["BackupBridge.file"]:::internal-link
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupBridge.list
  Listet `list`. Ruft `directory`, `safeId`, `named`.
BackupBridge.file
  Liefert die Datei `file`. Ruft `safeId`, `named`, `directory`.
```

- Fortsetzung von `HosterTest.backupZipAndExternalJdbc`, Quellreihenfolge.
