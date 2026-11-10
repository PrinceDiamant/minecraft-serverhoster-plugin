[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.watch]] › [[FabricLauncherPlugin.watch.Teil1]]

# FabricLauncherPlugin.watch.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.watch.Teil1.Z1853"]:::internal-link
  n2["sync Z.1876"]
  n3["if Z.1877 (slot.process == p)"]
  n4["if Z.1878 (slot.phase == SupervisorHealth.Phase.RUNNING)"]
  n2 --> n3
  n1 --> n2
  n3 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.watch`, Quellreihenfolge.
