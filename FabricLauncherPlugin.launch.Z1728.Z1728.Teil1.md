[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.launch]] › [[FabricLauncherPlugin.launch.Z1728.Z1728.Teil1]]

# FabricLauncherPlugin.launch.Z1728.Z1728.Teil1

```mermaid
flowchart TD
  n1["if Z.1730 (slot.running())"]
  n2["ChildSlot.running"]:::internal-link
  n3["throw Z.1730 throw new IllegalStateException('already running'…"]
  n4["ServerProfile.directory"]:::internal-link
  n5["Schritt Z.1735 Files.createDirectories(wd);"]
  n6["FabricLauncherPlugin.copyPlayerFiles"]:::internal-link
  n1 -->|"Z.1730"| n2
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.launch.Z1728.Z1728`, Quellreihenfolge.
