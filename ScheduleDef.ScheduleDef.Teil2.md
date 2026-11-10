[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleDef]] › [[ScheduleDef.Teil1]] › [[ScheduleDef.ScheduleDef]] › [[ScheduleDef.ScheduleDef.Teil2]]

# ScheduleDef.ScheduleDef.Teil2

```mermaid
flowchart TD
  n1["try Z.64"]
  n2["catch Z.66 (DateTimeException e)"]
  n3["throw Z.67 throw new IllegalArgumentException('Ungültige Zei…"]
  n4["ScheduleDef.validateInterval"]:::internal-link
  n5["if Z.71 (actions.isEmpty() // actions.size() ) MAX_ACTION…"]
  n6["throw Z.72 throw new IllegalArgumentException('Ein Zeitplan …"]
  n7["if Z.73 (actions.stream().map(Action::id).distinct().coun…"]
  n8["throw Z.74 throw new IllegalArgumentException('Aktions-IDs m…"]
  n1 -->|"Fehler"| n2
  n2 --> n3
  n1 --> n4
  n3 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ScheduleDef.ScheduleDef`, Quellreihenfolge.
