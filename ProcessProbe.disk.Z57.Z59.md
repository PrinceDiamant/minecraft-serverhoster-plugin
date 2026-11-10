[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[ProcessProbe]] › [[ProcessProbe.disk]] › [[ProcessProbe.disk.Z57.Z59]]

# ProcessProbe.disk.Z57.Z59

```mermaid
flowchart TD
  n1["while Z.59 (it.hasNext())"]
  n2["if Z.61 (files ) maxEntries)"]
  n3["if Z.62 (Files.isSymbolicLink(p) // Files.isDirectory(p))"]
  n4["try Z.64"]
  n5["Schritt Z.64 bytes += Files.size(p);"]
  n6["catch Z.64 (IOException ignored)"]
  n2 --> n3
  n2 --> n3
  n4 --> n5
  n4 -->|"Fehler"| n6
  n3 --> n4
  n3 --> n4
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ProcessProbe.disk.Z57`, Quellreihenfolge.
