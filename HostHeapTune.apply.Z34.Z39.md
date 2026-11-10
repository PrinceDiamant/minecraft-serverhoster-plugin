[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostHeapTune]] › [[HostHeapTune.apply]] › [[HostHeapTune.apply.Z34.Z39]]

# HostHeapTune.apply.Z34.Z39

```mermaid
flowchart TD
  n1["try Z.39"]
  n2["if Z.40 (!options.manageable(flag.name()))"]
  n3["catch Z.48 (Exception e)"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostHeapTune.apply.Z34`, Quellreihenfolge.
