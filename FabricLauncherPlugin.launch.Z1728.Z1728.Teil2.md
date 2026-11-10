[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.launch]] › [[FabricLauncherPlugin.launch.Z1728.Z1728.Teil2]]

# FabricLauncherPlugin.launch.Z1728.Z1728.Teil2

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.prepareFiles"]:::internal-link
  n2["Schritt Z.1739 Files.writeString(wd.resolve('eula.txt'), 'eula=t…"]
  n3["FabricLauncherPlugin.writeProperties"]:::internal-link
  n4["FabricLauncherPlugin.javaBin"]:::internal-link
  n5["LaunchPlan.argv(String,ServerProfile,Path)"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.launch.Z1728.Z1728`, Quellreihenfolge.
