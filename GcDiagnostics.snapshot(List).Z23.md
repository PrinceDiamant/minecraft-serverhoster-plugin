[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[GcDiagnostics]] › [[GcDiagnostics.snapshot(List)]] › [[GcDiagnostics.snapshot(List).Z23]]

# GcDiagnostics.snapshot(List).Z23

```mermaid
flowchart TD
  n1["for Z.23 (GarbageCollectorMXBean bean : beans)"]
  n2["if Z.24 (bean == null)"]
  n3["if Z.26 (bean instanceof com.sun.management.GarbageCollec…"]
  n4["if Z.28 (info != null)"]
  n3 -->|"ja"| n4
  n2 --> n3
  n2 --> n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `GcDiagnostics.snapshot(List)`, Quellreihenfolge.
