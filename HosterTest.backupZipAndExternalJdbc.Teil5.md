[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.backupZipAndExternalJdbc]] › [[HosterTest.backupZipAndExternalJdbc.Teil5]]

# HosterTest.backupZipAndExternalJdbc.Teil5

```mermaid
flowchart TD
  n1["try Z.427"]
  n2["BackupBridge.restore"]:::internal-link
  n3["Schritt Z.433 assertFalse(Files.exists(tmp.resolve('secret.txt'…"]
  n4["BackupBridge.delete"]:::internal-link
  n5["BackupBridge.delete"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HosterTest.backupZipAndExternalJdbc`, Quellreihenfolge.
