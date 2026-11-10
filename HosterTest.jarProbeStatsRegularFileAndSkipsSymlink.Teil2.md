[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.jarProbeStatsRegularFileAndSkipsSymlink]] › [[HosterTest.jarProbeStatsRegularFileAndSkipsSymlink.Teil2]]

# HosterTest.jarProbeStatsRegularFileAndSkipsSymlink.Teil2

```mermaid
flowchart TD
  n1["JarProbe.text"]:::internal-link
  n2["HosterTest.profile"]:::internal-link
  n3["JarProbe.inspect"]:::internal-link
  n4["JarProbe.text"]:::internal-link
  n5["Schritt Z.474 Path outside = Files.createDirectories(tmp.resolv…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
JarProbe.text
  Antwortet mit Text `text`.
HosterTest.profile
  `profile` in `HosterTest.java`. Ruft `ServerProfile`. Nur Test.
JarProbe.inspect
  `inspect` in `JarProbe.java`. Ruft `jarPath`, `jarName`.
Schritt Z.474 Path outside = Files.createDirectories(tmp.resolv…
  Zeile 474: Dateioperation. `Path outside = Files.createDirectories(tmp.resolv…`
```

- Fortsetzung von `HosterTest.jarProbeStatsRegularFileAndSkipsSymlink`, Quellreihenfolge.
