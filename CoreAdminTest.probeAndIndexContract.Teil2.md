[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil3]] › [[CoreAdminTest.probeAndIndexContract]] › [[CoreAdminTest.probeAndIndexContract.Teil2]]

# CoreAdminTest.probeAndIndexContract.Teil2

```mermaid
flowchart TD
  n1["ProcessProbe.jcmd(long,String)"]:::internal-link
  n2["Schritt Z.366 Path dir = Files.createDirectories(tmp.resolve('d…"]
  n3["Schritt Z.367 Files.writeString(dir.resolve('a.txt'), '12345');"]
  n4["ProcessProbe.disk"]:::internal-link
  n5["Schritt Z.371 String html = Files.readString(Path.of('src/main/…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CoreAdminTest.probeAndIndexContract`, Quellreihenfolge.
