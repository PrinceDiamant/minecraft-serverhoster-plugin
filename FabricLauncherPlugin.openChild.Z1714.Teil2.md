[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.openChild]] › [[FabricLauncherPlugin.openChild.Z1714.Teil2]]

# FabricLauncherPlugin.openChild.Z1714.Teil2

```mermaid
flowchart TD
  n1["if Z.1719 (launch(profile(id), slot))"]
  n2["FabricLauncherPlugin.launch"]:::internal-link
  n3["FabricLauncherPlugin.profile"]:::internal-link
  n4["FabricLauncherPlugin.msg"]:::internal-link
  n5["FabricLauncherPlugin.msg"]:::internal-link
  n1 -->|"Z.1719"| n2
  n2 -->|"Z.1719"| n3
  n3 -->|"ja"| n4
  n3 -->|"nein"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.openChild.Z1714`, Quellreihenfolge.
