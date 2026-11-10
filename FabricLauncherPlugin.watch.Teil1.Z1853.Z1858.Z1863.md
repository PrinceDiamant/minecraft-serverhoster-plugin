[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.watch]] › [[FabricLauncherPlugin.watch.Teil1.Z1853.Z1858.Z1863]]

# FabricLauncherPlugin.watch.Teil1.Z1853.Z1858.Z1863

```mermaid
flowchart TD
  n1["if Z.1863 (!shuttingDown && slot.process == p)"]
  n2["try Z.1865"]
  n3["FabricLauncherPlugin.armWatch"]:::internal-link
  n4["catch Z.1867 (RejectedExecutionException e…"]
  n5["return Z.1870 return;"]
  n2 --> n3
  n2 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.watch.Teil1.Z1853.Z1858`, Quellreihenfolge.
