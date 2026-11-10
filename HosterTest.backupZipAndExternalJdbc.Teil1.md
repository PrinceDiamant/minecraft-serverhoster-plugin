[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.backupZipAndExternalJdbc]] › [[HosterTest.backupZipAndExternalJdbc.Teil1]]

# HosterTest.backupZipAndExternalJdbc.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.388 Path world = Files.createDirectories(tmp.resolve(…"]
  n2["Schritt Z.389 Files.writeString(world.resolve('level.dat'), 'wo…"]
  n3["Schritt Z.390 Files.writeString(world.resolve('session.lock'), …"]
  n4["Schritt Z.391 Files.createDirectories(tmp.resolve('outside'));"]
  n5["Schritt Z.392 Files.writeString(tmp.resolve('outside/secret.txt…"]
  n6["HosterTest.tryCreateSymbolicLink"]:::internal-link
  n7["BackupBridge.archive"]:::internal-link
  n8["Schritt Z.397 assertTrue(Files.size(Path.of(r.path())) ) 0);"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HosterTest.backupZipAndExternalJdbc`, Quellreihenfolge.
