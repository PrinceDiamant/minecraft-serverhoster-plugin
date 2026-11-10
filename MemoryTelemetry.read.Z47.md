[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryTelemetry]] › [[MemoryTelemetry.read]] › [[MemoryTelemetry.read.Z47]]

# MemoryTelemetry.read.Z47

```mermaid
flowchart TD
  n1["if Z.47 (childPid ) 0)"]
  n2["ProcessProbe.snapshot"]:::internal-link
  n3["MemoryTelemetry.number"]:::internal-link
  n4["MemoryTelemetry.number"]:::internal-link
  n2 --> n3
  n3 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.47 (childPid ) 0)
  Zeile 47: prüft `(childPid ) 0)`.
ProcessProbe.snapshot
  `snapshot` in `ProcessProbe.java`. Ruft `kb`.
MemoryTelemetry.number
  `number` in `MemoryTelemetry.java`.
```

- Fortsetzung von `MemoryTelemetry.read`, Quellreihenfolge.
