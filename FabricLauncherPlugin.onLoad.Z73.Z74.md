[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onLoad]] › [[FabricLauncherPlugin.onLoad.Z73.Z74]]

# FabricLauncherPlugin.onLoad.Z73.Z74

```mermaid
flowchart TD
  n1["if Z.74 (HostFirstSetup.shouldRun(marker, freshInstall))"]
  n2["HostFirstSetup.shouldRun"]:::internal-link
  n3["FabricLauncherPlugin.configuredPath"]:::internal-link
  n4["HostFirstSetup.apply(Path,Path,Path,Path,List)"]:::internal-link
  n5["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n6["FabricLauncherPlugin.runningPluginJar"]:::internal-link
  n7["FabricLauncherPlugin.hostProtectedPaths"]:::internal-link
  n8["if Z.79 (result.applied())"]
  n9["if Z.82 (!result.disabledPluginJars().isEmpty())"]
  n10["if Z.87 ('manual-required'.equals(HostFirstSetup.readStat…"]
  n11["HostFirstSetup.readState"]:::internal-link
  n1 -->|"Z.74"| n2
  n4 -->|"Z.76"| n5
  n5 -->|"Z.76"| n6
  n6 -->|"Z.77"| n7
  n3 --> n4
  n8 -->|"ja"| n9
  n7 --> n8
  n10 -->|"Z.87"| n11
  n2 -->|"ja"| n3
  n2 -->|"nein"| n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

- Fortsetzung von `FabricLauncherPlugin.onLoad.Z73`, Quellreihenfolge.
