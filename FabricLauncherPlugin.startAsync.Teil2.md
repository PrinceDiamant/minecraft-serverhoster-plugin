[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.startAsync]] › [[FabricLauncherPlugin.startAsync.Teil2]]

# FabricLauncherPlugin.startAsync.Teil2

```mermaid
flowchart TD
  n1["if Z.1685 (!slot.launchInProgress.compareAndSet(false, true…"]
  n2["FabricLauncherPlugin.msg"]:::internal-link
  n3["return Z.1687 return;"]
  n4["FabricLauncherPlugin.startAsync.Teil2.Z1689"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  n3 --> n4
  n1 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.startAsync`, Quellreihenfolge.
