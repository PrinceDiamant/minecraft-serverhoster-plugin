[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleDef]] › [[ScheduleDef.Teil1]] › [[ScheduleDef.ScheduleDef]] › [[ScheduleDef.ScheduleDef.Teil1]]

# ScheduleDef.ScheduleDef.Teil1

```mermaid
flowchart TD
  n1["if Z.58 (id == null // !id.matches(ID_PATTERN))"]
  n2["throw Z.58 throw new IllegalArgumentException('Ungültige Sch…"]
  n3["if Z.60 (name.isEmpty() // name.length() ) 80)"]
  n4["throw Z.60 throw new IllegalArgumentException('Name muss zwi…"]
  n5["if Z.61 (interval == null)"]
  n6["throw Z.61 throw new IllegalArgumentException('Ungültiges In…"]
  n7["if Z.62 (lastRun ( 0)"]
  n8["throw Z.62 throw new IllegalArgumentException('Ungültiger le…"]
  n9["if Z.63 (timezone == null // timezone.isBlank())"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  n8 --> n9
  n7 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ScheduleDef.ScheduleDef`, Quellreihenfolge.
