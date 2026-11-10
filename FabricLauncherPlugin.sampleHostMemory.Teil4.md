[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.sampleHostMemory]] › [[FabricLauncherPlugin.sampleHostMemory.Teil4]]

# FabricLauncherPlugin.sampleHostMemory.Teil4

```mermaid
flowchart TD
  n1["if Z.1058 (decision == MemoryProtectionPolicy.Decision.RELE…"]
  n2["FabricLauncherPlugin.clearMemoryRecoveryState"]:::internal-link
  n3["FabricLauncherPlugin.resumeConfiguredAutoStart"]:::internal-link
  n4["return Z.1061 return;"]
  n5["if Z.1063 (decision == MemoryProtectionPolicy.Decision.STOP…"]
  n6["FabricLauncherPlugin.requestChildEmergencyStop"]:::internal-link
  n2 --> n3
  n3 --> n4
  n1 -->|"ja"| n2
  n5 -->|"ja"| n6
  n4 --> n5
  n1 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n6 fill:#f88,stroke:#900
```

- Fortsetzung von `FabricLauncherPlugin.sampleHostMemory`, Quellreihenfolge.
