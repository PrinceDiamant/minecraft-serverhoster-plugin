[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[SpigotBuilder]] › [[SpigotBuilder.build]] › [[SpigotBuilder.build.Teil4]]

# SpigotBuilder.build.Teil4

```mermaid
flowchart TD
  n1["if Z.50 (p.exitValue() != 0 // !Files.isRegularFile(jar))"]
  n2["throw Z.50 throw new IOException('BuildTools exit ' + p.exit…"]
  n3["return Z.51 return jar;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SpigotBuilder.build`, Quellreihenfolge.
