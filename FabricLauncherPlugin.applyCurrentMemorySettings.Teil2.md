[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.applyCurrentMemorySettings]] › [[FabricLauncherPlugin.applyCurrentMemorySettings.Teil2]]

# FabricLauncherPlugin.applyCurrentMemorySettings.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.967 getConfig().set('memoryProtection.recoverySamples…"]
  n2["Schritt Z.968 getConfig().set('memoryProtection.recoveryCooldow…"]
  n3["Schritt Z.969 getConfig().set('memoryProtection.policyVersion',…"]
  n4["FabricLauncherPlugin.saveConfigWritable"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.applyCurrentMemorySettings`, Quellreihenfolge.
