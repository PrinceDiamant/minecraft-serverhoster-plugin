[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.hostMinimizeApply]] › [[FabricLauncherPlugin.hostMinimizeApply.Teil1.Z2274.Z2276]]

# FabricLauncherPlugin.hostMinimizeApply.Teil1.Z2274.Z2276

```mermaid
flowchart TD
  n1["if Z.2276 (slot.running())"]
  n2["ChildSlot.running"]:::internal-link
  n3["if Z.2281 (process != null)"]
  n4["FabricLauncherPlugin.armWatch"]:::internal-link
  n5["throw Z.2282 throw new IOException('Der Child läuft noch. Host…"]
  n1 -->|"Z.2276"| n2
  n3 -->|"ja"| n4
  n4 --> n5
  n3 --> n5
  n2 -->|"ja"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.hostMinimizeApply.Teil1.Z2274`, Quellreihenfolge.
