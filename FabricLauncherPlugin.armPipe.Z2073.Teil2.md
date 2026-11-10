[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.armPipe]] › [[FabricLauncherPlugin.armPipe.Z2073.Teil2]]

# FabricLauncherPlugin.armPipe.Z2073.Teil2

```mermaid
flowchart TD
  n1["try Z.2087"]
  n2["FabricLauncherPlugin.pipe"]:::internal-link
  n3["catch Z.2089 (RejectedExecutionException e)"]
  n4["if Z.2090 (slot.pipeGeneration.get() == generation)"]
  n5["throw Z.2091 throw e;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n4 --> n5
  n4 --> n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.armPipe.Z2073`, Quellreihenfolge.
