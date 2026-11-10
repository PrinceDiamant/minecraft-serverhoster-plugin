[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[SpigotBuilder]] › [[SpigotBuilder.build]] › [[SpigotBuilder.build.Teil3]]

# SpigotBuilder.build.Teil3

```mermaid
flowchart TD
  n1["try Z.42"]
  n2["while Z.43 ((line = in.readLine()) != null)"]
  n3["catch Z.44 (IOException ignored)"]
  n4["if Z.48 (!p.waitFor(45, TimeUnit.MINUTES))"]
  n5["throw Z.48 throw new IOException('BuildTools timeout');"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n4 -->|"ja"| n5
  n2 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SpigotBuilder.build`, Quellreihenfolge.
