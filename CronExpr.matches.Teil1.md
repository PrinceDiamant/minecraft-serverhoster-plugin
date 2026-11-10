[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[CronExpr]] › [[CronExpr.matches]] › [[CronExpr.matches.Teil1]]

# CronExpr.matches.Teil1

```mermaid
flowchart TD
  n1["if Z.27 (expr == null)"]
  n2["throw Z.27 throw new IllegalArgumentException('cron');"]
  n3["if Z.29 (f.length != 5)"]
  n4["throw Z.29 throw new IllegalArgumentException('cron needs 5 …"]
  n5["CronExpr.field"]:::internal-link
  n6["CronExpr.dow"]:::internal-link
  n7["CronExpr.field"]:::internal-link
  n8["CronExpr.dow"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"Z.33"| n6
  n6 -->|"Z.34"| n7
  n7 -->|"Z.34"| n8
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.27 (expr == null)
  Zeile 27: prüft `(expr == null)`.
throw Z.27 throw new IllegalArgumentException('cron');
  Zeile 27: Abbruch `throw new IllegalArgumentException('cron');`.
if Z.29 (f.length != 5)
  Zeile 29: prüft `(f.length != 5)`.
throw Z.29 throw new IllegalArgumentException('cron needs 5 …
  Zeile 29: Abbruch `throw new IllegalArgumentException('cron needs 5 …`.
CronExpr.field
  `field` in `CronExpr.java`.
CronExpr.dow
  `dow` in `CronExpr.java`. Ruft `field`.
```

- Fortsetzung von `CronExpr.matches`, Quellreihenfolge.
