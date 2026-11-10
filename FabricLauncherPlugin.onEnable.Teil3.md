[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil3]]

# FabricLauncherPlugin.onEnable.Teil3

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.recoverPendingSetupDirectories"]:::internal-link
  n2["FabricLauncherPlugin.loadMemoryRecoveryState"]:::internal-link
  n3["FabricLauncherPlugin.loadLatestMemoryIncidentReport"]:::internal-link
  n4["FabricLauncherPlugin.sampleHostMemory"]:::internal-link
  n5["FabricLauncherPlugin.onEnable.Teil3.Z128"]:::internal-link
  n6["RuntimeLimits.boundedSeconds"]:::internal-link
  n7["FabricLauncherPlugin.onEnable.Teil3.Z136"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n4 fill:#f88,stroke:#900
```

- Fortsetzung von `FabricLauncherPlugin.onEnable`, Quellreihenfolge.
