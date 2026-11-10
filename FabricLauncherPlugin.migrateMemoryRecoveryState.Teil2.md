[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.migrateMemoryRecoveryState]] › [[FabricLauncherPlugin.migrateMemoryRecoveryState.Teil2]]

# FabricLauncherPlugin.migrateMemoryRecoveryState.Teil2

```mermaid
flowchart TD
  n1["if Z.788 (timestamp (= 0)"]
  n2["throw Z.788 throw new IOException('Legacy memory recovery tim…"]
  n3["FabricLauncherPlugin.memoryRecoveryFile"]:::internal-link
  n4["FabricLauncherPlugin.copyLegacyFile"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.migrateMemoryRecoveryState`, Quellreihenfolge.
