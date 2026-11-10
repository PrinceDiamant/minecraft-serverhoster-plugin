[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.applyCurrentMemorySettings]] › [[FabricLauncherPlugin.applyCurrentMemorySettings.Teil1.Z946.Z947]]

# FabricLauncherPlugin.applyCurrentMemorySettings.Teil1.Z946.Z947

```mermaid
flowchart TD
  n1["if Z.947 (policy ( 4)"]
  n2["Schritt Z.948 boolean wasEnabled = getConfig().getBoolean('memo…"]
  n3["Schritt Z.949 getConfig().set('memoryProtection.autoStopChild',…"]
  n4["Schritt Z.950 getConfig().set('memoryProtection.autoShutdown', …"]
  n5["Schritt Z.951 getConfig().set('memoryProtection.policyVersion',…"]
  n6["FabricLauncherPlugin.saveConfigWritable"]:::internal-link
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.applyCurrentMemorySettings.Teil1.Z946`, Quellreihenfolge.
