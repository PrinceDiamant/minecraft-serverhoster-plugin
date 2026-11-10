[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[ProcessProbe]] › [[ProcessProbe.snapshot]] › [[ProcessProbe.snapshot.Teil2.Z29.Z30.Z31.Z32.Z33.Z34]]

# ProcessProbe.snapshot.Teil2.Z29.Z30.Z31.Z32.Z33.Z34

```mermaid
flowchart TD
  n1["if Z.34 (l.startsWith('VmSize:'))"]
  n2["ProcessProbe.kb"]:::internal-link
  n3["if Z.35 (l.startsWith('Threads:'))"]
  n4["ProcessProbe.kb"]:::internal-link
  n5["if Z.36 (l.startsWith('State:'))"]
  n3 -->|"ja"| n4
  n3 -->|"nein"| n5
  n1 -->|"ja"| n2
  n1 -->|"nein"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ProcessProbe.snapshot.Teil2.Z29.Z30.Z31.Z32.Z33`, Quellreihenfolge.
