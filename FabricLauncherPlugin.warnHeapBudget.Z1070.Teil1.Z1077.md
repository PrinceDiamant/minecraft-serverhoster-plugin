[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.warnHeapBudget]] › [[FabricLauncherPlugin.warnHeapBudget.Z1070.Teil1.Z1077]]

# FabricLauncherPlugin.warnHeapBudget.Z1070.Teil1.Z1077

```mermaid
flowchart TD
  n1["if Z.1077 (childXmx ( 0)"]
  n2["if Z.1078 (memoryBudgetWarnings.add('invalid-xmx:' + profil…"]
  n3["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n2 -->|"ja"| n3
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.warnHeapBudget.Z1070.Teil1`, Quellreihenfolge.
