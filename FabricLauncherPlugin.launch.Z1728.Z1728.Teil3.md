[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.launch]] › [[FabricLauncherPlugin.launch.Z1728.Z1728.Teil3]]

# FabricLauncherPlugin.launch.Z1728.Z1728.Teil3

```mermaid
flowchart TD
  n1["if Z.1744 (!slot.wantRunning // slot.stopRequested // shutt…"]
  n2["return Z.1746 return false;"]
  n3["FabricLauncherPlugin.reapLeftover"]:::internal-link
  n4["Schritt Z.1751 Process p = new ProcessBuilder(cmd).directory(wd.…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.launch.Z1728.Z1728`, Quellreihenfolge.
