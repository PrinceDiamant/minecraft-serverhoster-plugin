[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[TickQueryFilter]] › [[TickQueryFilter.consume]] › [[TickQueryFilter.consume.Z26]]

# TickQueryFilter.consume.Z26

```mermaid
flowchart TD
  n1["if Z.26 (avg.find())"]
  n2["try Z.27"]
  n3["catch Z.32 (NumberFormatException ignore…"]
  n4["return Z.33 return true;"]
  n2 -->|"Fehler"| n3
  n2 --> n4
  n3 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `TickQueryFilter.consume`, Quellreihenfolge.
