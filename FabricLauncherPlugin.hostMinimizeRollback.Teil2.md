[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.hostMinimizeRollback]] › [[FabricLauncherPlugin.hostMinimizeRollback.Teil2]]

# FabricLauncherPlugin.hostMinimizeRollback.Teil2

```mermaid
flowchart TD
  n1["HostMinimize.restore"]:::internal-link
  n2["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n3["FabricLauncherPlugin.hostProtectedPaths"]:::internal-link
  n4["FabricLauncherPlugin.restoreHostHeap"]:::internal-link
  n5["FabricLauncherPlugin.hostMinimizeStateFile"]:::internal-link
  n6["FabricLauncherPlugin.hostMinimizeView"]:::internal-link
  n7["return Z.2333 return view;"]
  n1 -->|"Z.2328"| n2
  n2 -->|"Z.2328"| n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.hostMinimizeRollback`, Quellreihenfolge.
