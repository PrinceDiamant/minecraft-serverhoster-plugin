[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[HostMemoryProbe]] › [[HostMemoryProbe.meminfo]] › [[HostMemoryProbe.meminfo.Z49.Z50]]

# HostMemoryProbe.meminfo.Z49.Z50

```mermaid
flowchart TD
  n1["for Z.50 (String line : Files.readAllLines(path))"]
  n2["if Z.52 (colon ( 0)"]
  n3["if Z.54 (parts.length ) 0)"]
  n4["try Z.55"]
  n5["catch Z.56 (NumberFormatException ignore…"]
  n4 -->|"Fehler"| n5
  n3 -->|"ja"| n4
  n2 --> n3
  n2 --> n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HostMemoryProbe.meminfo.Z49`, Quellreihenfolge.
