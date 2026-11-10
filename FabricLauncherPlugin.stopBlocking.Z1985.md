[[00 Start]] › [[Child-Prozess]] › [[Stopp]] › [[FabricLauncherPlugin.stopBlocking]] › [[FabricLauncherPlugin.stopBlocking.Z1985]]

# FabricLauncherPlugin.stopBlocking.Z1985

```mermaid
flowchart TD
  n1["try Z.1985"]
  n2["if Z.1986 (!slot.running())"]
  n3["ChildSlot.running"]:::internal-link
  n4["return Z.1986 return;"]
  n5["FabricLauncherPlugin.stopProcess"]:::internal-link
  n6["finally Z.1985"]
  n7["if Z.1989 (!slot.running())"]
  n8["ChildSlot.running"]:::internal-link
  n2 -->|"Z.1986"| n3
  n3 -->|"ja"| n4
  n4 --> n5
  n3 --> n5
  n1 --> n2
  n5 --> n6
  n7 -->|"Z.1989"| n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.stopBlocking`, Quellreihenfolge.
