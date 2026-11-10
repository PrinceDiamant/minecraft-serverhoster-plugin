[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onTabComplete]] › [[FabricLauncherPlugin.onTabComplete.Teil2]]

# FabricLauncherPlugin.onTabComplete.Teil2

```mermaid
flowchart TD
  n1["if Z.2518 (a.length == 2 && a(0).equalsIgnoreCase('versions…"]
  n2["return Z.2518 return List.of('fabric', 'paper', 'vanilla', 'spi…"]
  n3["return Z.2519 return List.of();"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.onTabComplete`, Quellreihenfolge.
