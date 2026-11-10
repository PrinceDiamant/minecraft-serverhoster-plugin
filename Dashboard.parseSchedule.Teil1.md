[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.parseSchedule]] › [[Dashboard.parseSchedule.Teil1]]

# Dashboard.parseSchedule.Teil1

```mermaid
flowchart TD
  n1["try Z.433"]
  n2["catch Z.435 (JsonParseException / Illegal…"]
  n3["throw Z.436 throw new IllegalArgumentException('Ungültiger Ze…"]
  n4["if Z.438 (raw == null)"]
  n5["throw Z.438 throw new IllegalArgumentException('Ungültiger Ze…"]
  n6["if Z.441 (key instanceof String name)"]
  n1 -->|"Fehler"| n2
  n2 --> n3
  n4 -->|"ja"| n5
  n1 --> n4
  n3 --> n4
  n5 --> n6
  n4 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.parseSchedule`, Quellreihenfolge.
