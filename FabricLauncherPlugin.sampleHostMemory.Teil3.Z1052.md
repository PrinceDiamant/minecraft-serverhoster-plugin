[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.sampleHostMemory]] › [[FabricLauncherPlugin.sampleHostMemory.Teil3.Z1052]]

# FabricLauncherPlugin.sampleHostMemory.Teil3.Z1052

```mermaid
flowchart TD
  n1["if Z.1052 (decision == MemoryProtectionPolicy.Decision.RELE…"]
  n2["FabricLauncherPlugin.clearMemoryRecoveryState"]:::internal-link
  n3["FabricLauncherPlugin.resumeConfiguredAutoStart"]:::internal-link
  n4["return Z.1056 return;"]
  n2 --> n3
  n3 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.sampleHostMemory.Teil3`, Quellreihenfolge.
