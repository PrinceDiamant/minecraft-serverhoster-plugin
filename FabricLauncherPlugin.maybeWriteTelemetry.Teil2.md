[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Probe]] › [[FabricLauncherPlugin.maybeWriteTelemetry]] › [[FabricLauncherPlugin.maybeWriteTelemetry.Teil2]]

# FabricLauncherPlugin.maybeWriteTelemetry.Teil2

```mermaid
flowchart TD
  n1["if Z.928 (maxBytes ( 100_000)"]
  n2["FabricLauncherPlugin.warnOnce"]:::internal-link
  n3["if Z.933 (lastTelemetryWriteAt != 0 && now - lastTelemetry…"]
  n4["return Z.933 return;"]
  n5["FabricLauncherPlugin.maybeWriteTelemetry.Teil2.Z935"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.maybeWriteTelemetry`, Quellreihenfolge.
