[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[MemoryIncidentReport]]

# MemoryIncidentReport

```mermaid
flowchart TD
  n1["MemoryIncidentReport.MemoryIncidentReport"]:::internal-link
  n2["MemoryIncidentReport.write"]:::internal-link
  n1 -->|"Quelltext"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
MemoryIncidentReport.MemoryIncidentReport
  Betrifft den Speicher `MemoryIncidentReport`.
MemoryIncidentReport.write
  Schreibt `write`. Ruft `cgroupUsePercent`.
```


