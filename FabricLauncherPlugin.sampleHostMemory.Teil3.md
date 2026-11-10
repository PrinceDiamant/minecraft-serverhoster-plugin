[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.sampleHostMemory]] › [[FabricLauncherPlugin.sampleHostMemory.Teil3]]

# FabricLauncherPlugin.sampleHostMemory.Teil3

```mermaid
flowchart TD
  n1["if Z.1037 (use )= warning && now - lastMemoryWarningAt )= 3…"]
  n2["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n3["Schritt Z.1046 long cooldown = TimeUnit.SECONDS.toMillis(Math.ma…"]
  n4["MemoryProtectionPolicy.sample"]:::internal-link
  n5["FabricLauncherPlugin.sampleHostMemory.Teil3.Z1052"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.sampleHostMemory`, Quellreihenfolge.
