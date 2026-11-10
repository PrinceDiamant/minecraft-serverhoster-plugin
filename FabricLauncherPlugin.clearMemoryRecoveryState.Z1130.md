[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.clearMemoryRecoveryState]] › [[FabricLauncherPlugin.clearMemoryRecoveryState.Z1130]]

# FabricLauncherPlugin.clearMemoryRecoveryState.Z1130

```mermaid
flowchart TD
  n1["try Z.1130"]
  n2["FabricLauncherPlugin.memoryRecoveryFile"]:::internal-link
  n3["MemoryProtectionPolicy.finishRecovery"]:::internal-link
  n4["catch Z.1135 (IOException e)"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.clearMemoryRecoveryState`, Quellreihenfolge.
