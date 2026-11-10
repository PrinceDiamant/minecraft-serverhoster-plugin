[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryTelemetry]]

# MemoryTelemetry

```mermaid
flowchart TD
  n1["Heap"]:::internal-link
  n2["MemoryTelemetry.MemoryTelemetry"]:::internal-link
  n3["MemoryTelemetry.read"]:::internal-link
  n4["MemoryTelemetry.line"]:::internal-link
  n5["MemoryTelemetry.gcView"]:::internal-link
  n6["MemoryTelemetry.appendRotated"]:::internal-link
  n7["MemoryTelemetry.formatGc"]:::internal-link
  n8["MemoryTelemetry.mib"]:::internal-link
  n9["MemoryTelemetry.number"]:::internal-link
  n3 -->|"Z.49"| n9
  n4 -->|"Z.77"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Heap
  used, committed und max des Heaps in Bytes.
MemoryTelemetry.MemoryTelemetry
  Betrifft den Speicher `MemoryTelemetry`.
MemoryTelemetry.read
  Liest `read`. Ruft `snapshot`, `number`, `current`.
MemoryTelemetry.line
  `line` in `MemoryTelemetry.java`. Ruft `usedMiB`, `committedMiB`, `maxMiB`.
MemoryTelemetry.gcView
  `gcView` in `MemoryTelemetry.java`.
MemoryTelemetry.appendRotated
  Hängt an `appendRotated`.
MemoryTelemetry.formatGc
  Formatiert `formatGc`.
MemoryTelemetry.mib
  `mib` in `MemoryTelemetry.java`.
MemoryTelemetry.number
  `number` in `MemoryTelemetry.java`.
```


