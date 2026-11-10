[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.backupZipAndExternalJdbc]] › [[HosterTest.backupZipAndExternalJdbc.Teil4]]

# HosterTest.backupZipAndExternalJdbc.Teil4

```mermaid
flowchart TD
  n1["BackupBridge.list"]:::internal-link
  n2["Schritt Z.422 Path fresh = Files.createDirectories(tmp.resolve(…"]
  n3["Schritt Z.423 Files.writeString(fresh.resolve('old.txt'), 'x');"]
  n4["BackupBridge.restore"]:::internal-link
  n5["Schritt Z.425 assertEquals('world', Files.readString(fresh.reso…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HosterTest.backupZipAndExternalJdbc`, Quellreihenfolge.
