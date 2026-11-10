[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.prepareFiles]] › [[FabricLauncherPlugin.prepareFiles.Z2531.Case2574]]

# FabricLauncherPlugin.prepareFiles.Z2531.Case2574

```mermaid
flowchart TD
  n1["if Z.2576 (!Files.exists(jar))"]
  n2["throw Z.2576 throw new FileNotFoundException('Custom jar not f…"]
  n3["return Z.2577 return jar;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.prepareFiles.Z2531`, Quellreihenfolge.
