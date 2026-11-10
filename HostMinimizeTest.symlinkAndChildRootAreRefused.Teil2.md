[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.symlinkAndChildRootAreRefused]] › [[HostMinimizeTest.symlinkAndChildRootAreRefused.Teil2]]

# HostMinimizeTest.symlinkAndChildRootAreRefused.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.131 Files.createDirectories(same.resolve('plugins/Ser…"]
  n2["Schritt Z.132 Files.writeString(same.resolve('server.properties…"]
  n3["HostMinimize.apply"]:::internal-link
  n4["Schritt Z.136 assertEquals('server-port=2060/n', Files.readStri…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMinimizeTest.symlinkAndChildRootAreRefused`, Quellreihenfolge.
