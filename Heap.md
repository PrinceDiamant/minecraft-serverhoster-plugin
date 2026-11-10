[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryTelemetry]] › [[Heap]]

# Heap

```mermaid
flowchart TD
  n1["MemoryTelemetry.Heap.current"]:::internal-link
  n2["MemoryTelemetry.Heap.usedMiB"]:::internal-link
  n3["MemoryTelemetry.Heap.committedMiB"]:::internal-link
  n4["MemoryTelemetry.Heap.maxMiB"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
MemoryTelemetry.Heap.current
  `current` in `MemoryTelemetry.java`.
MemoryTelemetry.Heap.usedMiB
  `usedMiB` in `MemoryTelemetry.java`. Ruft `mib`.
MemoryTelemetry.Heap.committedMiB
  `committedMiB` in `MemoryTelemetry.java`. Ruft `mib`.
MemoryTelemetry.Heap.maxMiB
  Begrenzt nach oben `maxMiB`. Ruft `mib`.
```


