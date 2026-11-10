[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.requestChildEmergencyStop]] › [[FabricLauncherPlugin.requestChildEmergencyStop.Teil1.Z1150]]

# FabricLauncherPlugin.requestChildEmergencyStop.Teil1.Z1150

```mermaid
flowchart TD
  n1["try Z.1150"]
  n2["FabricLauncherPlugin.memoryRecoveryFile"]:::internal-link
  n3["catch Z.1153 (IOException e)"]
  n4["MemoryProtectionPolicy.resetCriticalSamples"]:::internal-link
  n5["return Z.1156 return;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n4 --> n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.requestChildEmergencyStop.Teil1`, Quellreihenfolge.
