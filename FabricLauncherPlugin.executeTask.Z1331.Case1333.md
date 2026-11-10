[[00 Start]] › [[Zeitplaene]] › [[Tasks]] › [[FabricLauncherPlugin.executeTask]] › [[FabricLauncherPlugin.executeTask.Z1331.Case1333]]

# FabricLauncherPlugin.executeTask.Z1331.Case1333

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.slot"]:::internal-link
  n2["FabricLauncherPlugin.stopBlocking"]:::internal-link
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.slot
  `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
FabricLauncherPlugin.stopBlocking
  Stoppt `stopBlocking`. Ruft `invalidateRestarts`, `running`, `stopProcess`.
```

- Fortsetzung von `FabricLauncherPlugin.executeTask.Z1331`, Quellreihenfolge.
