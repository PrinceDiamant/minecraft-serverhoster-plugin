[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.warnHeapBudget]] › [[FabricLauncherPlugin.warnHeapBudget.Z1070.Teil2]]

# FabricLauncherPlugin.warnHeapBudget.Z1070.Teil2

```mermaid
flowchart TD
  n1["if Z.1088 (childXms ) 2L * 1024 * 1024 * 1024 && memoryBudg…"]
  n2["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n3["if Z.1094 (childXmx ) Long.MAX_VALUE - outerXmx)"]
  n4["if Z.1095 (childXmx + outerXmx ) cgroupLimit && memoryBudge…"]
  n5["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.warnHeapBudget.Z1070`, Quellreihenfolge.
