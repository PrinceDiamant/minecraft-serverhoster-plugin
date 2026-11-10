[[00 Start]] › [[Child-Prozess]] › [[Neustart]] › [[FabricLauncherPlugin.restartSingle]] › [[FabricLauncherPlugin.restartSingle.Z1965]]

# FabricLauncherPlugin.restartSingle.Z1965

```mermaid
flowchart TD
  n1["sync Z.1965"]
  n2["if Z.1967 (slot.scheduleToken.get() != token // !slot.wantR…"]
  n3["ChildSlot.running"]:::internal-link
  n4["return Z.1967 return;"]
  n5["FabricLauncherPlugin.launch"]:::internal-link
  n6["FabricLauncherPlugin.profile"]:::internal-link
  n2 -->|"Z.1967"| n3
  n3 -->|"ja"| n4
  n5 -->|"Z.1968"| n6
  n4 --> n5
  n3 --> n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.restartSingle`, Quellreihenfolge.
