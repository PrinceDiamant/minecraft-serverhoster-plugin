[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]]

# Speicher-Messung

```mermaid
flowchart TD
  n1["MemoryTelemetry"]:::internal-link
  n2["HostMemoryProbe"]:::internal-link
  n3["GcDiagnostics"]:::internal-link
  n4["ProcessProbe"]:::internal-link
  n5["MemoryProtectionPolicy"]:::internal-link
  n6["MemoryIncidentReport"]:::internal-link
  n7["RuntimeLimits"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  n6 -->|"Quelltext"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `HostMemoryProbe`, `MemoryTelemetry`, `MemoryProtectionPolicy`, `ProcessProbe`.
