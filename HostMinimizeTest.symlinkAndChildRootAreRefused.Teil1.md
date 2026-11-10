[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.symlinkAndChildRootAreRefused]] › [[HostMinimizeTest.symlinkAndChildRootAreRefused.Teil1]]

# HostMinimizeTest.symlinkAndChildRootAreRefused.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.118 Files.createDirectories(data);"]
  n2["Schritt Z.119 Files.createDirectories(child);"]
  n3["Schritt Z.120 Files.writeString(child.resolve('server.propertie…"]
  n4["try Z.121"]
  n5["Schritt Z.122 Files.createSymbolicLink(root.resolve('server.pro…"]
  n6["catch Z.123 (UnsupportedOperationExceptio…"]
  n7["HostMinimize.apply"]:::internal-link
  n8["Schritt Z.128 assertEquals('server-port=2063/n', Files.readStri…"]
  n1 --> n2
  n2 --> n3
  n4 --> n5
  n4 -->|"Fehler"| n6
  n3 --> n4
  n5 --> n7
  n6 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimizeTest.symlinkAndChildRootAreRefused`, Quellreihenfolge.
