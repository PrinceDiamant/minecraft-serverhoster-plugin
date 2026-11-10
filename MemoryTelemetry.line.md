[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryTelemetry]] › [[MemoryTelemetry.line]]

# MemoryTelemetry.line

`MemoryTelemetry.line(Instant time, Heap heap, long hostRssMiB, HostMemoryProbe.Snapshot host, long childRssMiB, long childSwapMiB, List<GcDiagnostics.Collector> collectors)` [src/main/java/de/aichele/childlauncher/MemoryTelemetry.java:56–78](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/MemoryTelemetry.java#L56-L78)

```mermaid
flowchart TD
  n1["MemoryTelemetry.Heap.usedMiB"]:::internal-link
  n2["MemoryTelemetry.Heap.committedMiB"]:::internal-link
  n3["MemoryTelemetry.Heap.maxMiB"]:::internal-link
  n4["MemoryTelemetry.formatGc"]:::internal-link
  n5["return Z.58 return 'timestamp=' + time + ' heapJvm=…"]
  n1 -->|"Z.62"| n2
  n2 -->|"Z.63"| n3
  n3 -->|"Z.77"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `line` in `src/main/java/de/aichele/childlauncher/MemoryTelemetry.java`
