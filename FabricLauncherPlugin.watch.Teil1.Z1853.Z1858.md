[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.watch]] › [[FabricLauncherPlugin.watch.Teil1.Z1853.Z1858]]

# FabricLauncherPlugin.watch.Teil1.Z1853.Z1858

```mermaid
flowchart TD
  n1["if Z.1858 (!p.isAlive())"]
  n2["try Z.1859"]
  n3["catch Z.1862 (IllegalThreadStateException …"]
  n4["FabricLauncherPlugin.watch.Teil1.Z1853.Z1858.Z1863"]:::internal-link
  n2 -->|"Fehler"| n3
  n1 -->|"ja"| n2
  n1 -->|"nein"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.watch.Teil1.Z1853`, Quellreihenfolge.
