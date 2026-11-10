[[00 Start]] › [[Zeitplaene]] › [[Tasks]] › [[FabricLauncherPlugin.executeTask]] › [[FabricLauncherPlugin.executeTask.Z1331.Case1336]]

# FabricLauncherPlugin.executeTask.Z1331.Case1336

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.send"]:::internal-link
  n2["FabricLauncherPlugin.slot"]:::internal-link
  n3["FabricLauncherPlugin.slot"]:::internal-link
  n1 -->|"Z.1338"| n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.send
  Sendet `send`. Ruft `running`.
FabricLauncherPlugin.slot
  `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
```

- Fortsetzung von `FabricLauncherPlugin.executeTask.Z1331`, Quellreihenfolge.
