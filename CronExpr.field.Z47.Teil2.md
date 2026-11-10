[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[CronExpr]] › [[CronExpr.field]] › [[CronExpr.field.Z47.Teil2]]

# CronExpr.field.Z47.Teil2

```mermaid
flowchart TD
  n1["if Z.56 (!stepPart.equals('*'))"]
  n2["if Z.58 (dash )= 0)"]
  n3["if Z.65 (value )= from && value (= to && (value - from) %…"]
  n4["return Z.65 return true;"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CronExpr.field.Z47`, Quellreihenfolge.
