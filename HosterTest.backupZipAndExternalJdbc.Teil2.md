[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.backupZipAndExternalJdbc]] › [[HosterTest.backupZipAndExternalJdbc.Teil2]]

# HosterTest.backupZipAndExternalJdbc.Teil2

```mermaid
flowchart TD
  n1["if Z.400 (linked)"]
  n2["try Z.401"]
  n3["BackupBridge.count"]:::internal-link
  n4["try Z.406"]
  n5["BackupBridge.archive"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
```

```knoten
if Z.400 (linked)
  Zeile 400: prüft `(linked)`.
try Z.401
  Zeile 401: Versuch. Der Fehlerpfad geht in catch.
BackupBridge.count
  Zählt `count`. Ruft `connect`, `table`. Befund: toter Code (wahrscheinlich).
try Z.406
  Zeile 406: Versuch. Der Fehlerpfad geht in catch.
BackupBridge.archive
  Packt `archive`. Ruft `open`, `safeId`, `resolve`.
```

- Fortsetzung von `HosterTest.backupZipAndExternalJdbc`, Quellreihenfolge.
