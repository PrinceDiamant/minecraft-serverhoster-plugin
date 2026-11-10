[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.launch]] › [[FabricLauncherPlugin.launch.Z1728]]

# FabricLauncherPlugin.launch.Z1728

```mermaid
flowchart TD
  n1["try Z.1728"]
  n2["FabricLauncherPlugin.launch.Z1728.Z1728"]:::internal-link
  n3["if Z.1766 (stopAfterStart)"]
  n4["FabricLauncherPlugin.stopProcess"]:::internal-link
  n5["return Z.1767 return true;"]
  n6["catch Z.1768 (Exception e)"]
  n7["if Z.1769 (started != null)"]
  n8["FabricLauncherPlugin.abandonFailedStart"]:::internal-link
  n9["if Z.1770 (e instanceof InterruptedException)"]
  n10["throw Z.1771 throw e;"]
  n11["finally Z.1728"]
  n12["if Z.1773 (claimed && started == null && slot.phase == Supe…"]
  n3 -->|"ja"| n4
  n2 --> n3
  n4 --> n5
  n3 --> n5
  n1 --> n2
  n1 -->|"Fehler"| n6
  n7 -->|"ja"| n8
  n8 --> n9
  n7 --> n9
  n9 --> n10
  n9 --> n10
  n6 --> n7
  n5 --> n11
  n10 --> n11
  n11 --> n12
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.launch`, Quellreihenfolge.
