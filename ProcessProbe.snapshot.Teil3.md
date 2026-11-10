[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[ProcessProbe]] › [[ProcessProbe.snapshot]] › [[ProcessProbe.snapshot.Teil3]]

# ProcessProbe.snapshot.Teil3

```mermaid
flowchart TD
  n1["try Z.46"]
  n2["Schritt Z.47 String raw = Files.readString(Path.of('/proc/' + …"]
  n3["catch Z.49 (Exception ignored)"]
  n4["return Z.50 return m;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n2 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ProcessProbe.snapshot`, Quellreihenfolge.
