[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil4]]

# FabricLauncherPlugin.onEnable.Teil4

```mermaid
flowchart TD
  n1["Schritt Z.148 Runtime.getRuntime().addShutdownHook(shutdownHook…"]
  n2["Schritt Z.149 long every = getConfig().getLong('saveAllInterval…"]
  n3["FabricLauncherPlugin.onEnable.Teil4.Z150"]:::internal-link
  n4["FabricLauncherPlugin.fireDueTasks"]:::internal-link
  n5["FabricLauncherPlugin.fireDueSchedules"]:::internal-link
  n6["Schritt Z.153 long memoryInterval = Math.max(15, getConfig().ge…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n4 fill:#f88,stroke:#900
```

- Fortsetzung von `FabricLauncherPlugin.onEnable`, Quellreihenfolge.
