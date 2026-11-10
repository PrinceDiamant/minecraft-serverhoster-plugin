[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[CronExpr]]

# CronExpr

```mermaid
flowchart TD
  n1["CronExpr.CronExpr"]:::internal-link
  n2["CronExpr.next"]:::internal-link
  n3["CronExpr.matches"]:::internal-link
  n4["CronExpr.dow"]:::internal-link
  n5["CronExpr.field"]:::internal-link
  n6["CronExpr.normZone"]:::internal-link
  n7["CronExpr.normAction"]:::internal-link
  n2 -->|"Z.18"| n3
  n2 -->|"Z.19"| n5
  n3 -->|"Z.33"| n5
  n3 -->|"Z.33"| n4
  n4 -->|"Z.43"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
CronExpr.CronExpr
  `CronExpr` in `CronExpr.java`.
CronExpr.next
  Geht zum nächsten Schritt `next`. Ruft `matches`, `field`.
CronExpr.matches
  `matches` in `CronExpr.java`. Ruft `field`, `dow`.
CronExpr.dow
  `dow` in `CronExpr.java`. Ruft `field`.
CronExpr.field
  `field` in `CronExpr.java`.
CronExpr.normZone
  `normZone` in `CronExpr.java`.
CronExpr.normAction
  `normAction` in `CronExpr.java`.
```


