[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.armPipe]] › [[FabricLauncherPlugin.armPipe.Z2073.Teil1]]

# FabricLauncherPlugin.armPipe.Z2073.Teil1

```mermaid
flowchart TD
  n1["if Z.2075 (process == null // !process.isAlive())"]
  n2["return Z.2075 return;"]
  n3["if Z.2076 (slot.pipeFailures )= 3)"]
  n4["if Z.2077 (slot.pipeFailures == 3)"]
  n5["return Z.2082 return;"]
  n6["if Z.2084 (slot.pipeArmed.get())"]
  n7["return Z.2084 return;"]
  n1 -->|"ja"| n2
  n4 --> n5
  n4 --> n5
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n6 -->|"ja"| n7
  n5 --> n6
  n3 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.armPipe.Z2073`, Quellreihenfolge.
