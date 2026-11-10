[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.openChild]] › [[FabricLauncherPlugin.openChild.Z1714.Teil1]]

# FabricLauncherPlugin.openChild.Z1714.Teil1

```mermaid
flowchart TD
  n1["if Z.1715 (!slot(id).wantRunning)"]
  n2["FabricLauncherPlugin.slot"]:::internal-link
  n3["return Z.1715 return;"]
  n4["FabricLauncherPlugin.slot"]:::internal-link
  n5["if Z.1717 (!slot.wantRunning)"]
  n6["return Z.1717 return;"]
  n7["if Z.1718 (slot.running())"]
  n8["ChildSlot.running"]:::internal-link
  n9["FabricLauncherPlugin.msg"]:::internal-link
  n10["return Z.1718 return;"]
  n1 -->|"Z.1715"| n2
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  n7 -->|"Z.1718"| n8
  n9 --> n10
  n8 -->|"ja"| n9
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.openChild.Z1714`, Quellreihenfolge.
