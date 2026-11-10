[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryTelemetry]] › [[MemoryTelemetry.formatGc]]

# MemoryTelemetry.formatGc

`MemoryTelemetry.formatGc(List<GcDiagnostics.Collector> collectors)` [src/main/java/de/aichele/childlauncher/MemoryTelemetry.java:108–120](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/MemoryTelemetry.java#L108-L120)

```mermaid
flowchart TD
  n1["if Z.109 (collectors == null // collectors.isEmpty())"]
  n2["return Z.109 return 'none';"]
  n3["for Z.111 (int i = 0; i ( collectors.size(); i++)"]
  n4["if Z.112 (i ) 0)"]
  n5["return Z.119 return text.toString();"]
  n1 -->|"ja"| n2
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `formatGc` in `src/main/java/de/aichele/childlauncher/MemoryTelemetry.java`
