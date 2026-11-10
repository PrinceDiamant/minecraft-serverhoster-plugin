[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[CronExpr]] › [[CronExpr.next]] › [[CronExpr.next.Z17]]

# CronExpr.next.Z17

```mermaid
flowchart TD
  n1["for Z.17 (int i = 0; i ( 366 * 24 * 60; i++)"]
  n2["if Z.18 (matches(expr, t))"]
  n3["CronExpr.matches"]:::internal-link
  n4["return Z.18 return t;"]
  n5["CronExpr.field"]:::internal-link
  n6["CronExpr.field"]:::internal-link
  n2 -->|"Z.18"| n3
  n3 -->|"ja"| n4
  n4 --> n5
  n3 --> n5
  n5 --> n6
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.17 (int i = 0; i ( 366 * 24 * 60; i++)
  Zeile 17: Schleife `(int i = 0; i ( 366 * 24 * 60; i++)`.
if Z.18 (matches(expr, t))
  Zeile 18: prüft `(matches(expr, t))`.
CronExpr.matches
  `matches` in `CronExpr.java`. Ruft `field`, `dow`.
return Z.18 return t;
  Zeile 18: Rückgabe `return t;`.
CronExpr.field
  `field` in `CronExpr.java`.
```

- Fortsetzung von `CronExpr.next`, Quellreihenfolge.
