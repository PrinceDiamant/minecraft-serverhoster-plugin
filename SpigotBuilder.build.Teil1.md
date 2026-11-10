[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[SpigotBuilder]] › [[SpigotBuilder.build]] › [[SpigotBuilder.build.Teil1]]

# SpigotBuilder.build.Teil1

```mermaid
flowchart TD
  n1["SpigotBuilder.assertRev"]:::internal-link
  n2["if Z.29 (Files.isRegularFile(jar))"]
  n3["return Z.29 return jar;"]
  n4["Schritt Z.31 Files.createDirectories(tools);"]
  n5["Schritt Z.32 Files.createDirectories(outputDir);"]
  n6["if Z.34 (!Files.isRegularFile(bt))"]
  n7["Upstream.download(String,Path)"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n6 -->|"ja"| n7
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SpigotBuilder.build`, Quellreihenfolge.
