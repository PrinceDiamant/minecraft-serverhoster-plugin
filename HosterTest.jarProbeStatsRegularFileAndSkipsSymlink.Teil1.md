[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.jarProbeStatsRegularFileAndSkipsSymlink]] › [[HosterTest.jarProbeStatsRegularFileAndSkipsSymlink.Teil1]]

# HosterTest.jarProbeStatsRegularFileAndSkipsSymlink.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.457 Path dir = Files.createDirectories(tmp.resolve('j…"]
  n2["Schritt Z.459 Files.writeString(jar, 'not-a-real-server');"]
  n3["HosterTest.profile"]:::internal-link
  n4["JarProbe.inspect"]:::internal-link
  n5["Schritt Z.466 assertEquals(Files.size(jar), info.bytes());"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HosterTest.jarProbeStatsRegularFileAndSkipsSymlink`, Quellreihenfolge.
