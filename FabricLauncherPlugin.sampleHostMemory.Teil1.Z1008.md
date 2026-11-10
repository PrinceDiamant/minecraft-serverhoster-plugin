[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.sampleHostMemory]] › [[FabricLauncherPlugin.sampleHostMemory.Teil1.Z1008]]

# FabricLauncherPlugin.sampleHostMemory.Teil1.Z1008

```mermaid
flowchart TD
  n1["if Z.1008 (!getConfig().getBoolean('memoryTelemetry.enabled…"]
  n2["for Z.1012 (ChildSlot slot : slots.values())"]
  n3["ChildSlot.pid"]:::internal-link
  n4["if Z.1014 (pid ) 0)"]
  n5["MemoryTelemetry.read"]:::internal-link
  n6["FabricLauncherPlugin.maybeWriteTelemetry"]:::internal-link
  n3 --> n4
  n2 -->|"wiederholen"| n3
  n4 --> n5
  n4 --> n5
  n5 --> n6
  n1 -->|"nein"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.sampleHostMemory.Teil1`, Quellreihenfolge.
