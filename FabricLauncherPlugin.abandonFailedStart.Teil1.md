[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.abandonFailedStart]] › [[FabricLauncherPlugin.abandonFailedStart.Teil1]]

# FabricLauncherPlugin.abandonFailedStart.Teil1

```mermaid
flowchart TD
  n1["ChildLaunchCleanup.abandon"]:::internal-link
  n2["sync Z.2133"]
  n3["if Z.2135 (slot.process == process)"]
  n2 --> n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.abandonFailedStart`, Quellreihenfolge.
