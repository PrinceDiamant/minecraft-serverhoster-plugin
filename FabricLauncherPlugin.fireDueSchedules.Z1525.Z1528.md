[[00 Start]] › [[Zeitplaene]] › [[Schedules]] › [[FabricLauncherPlugin.fireDueSchedules]] › [[FabricLauncherPlugin.fireDueSchedules.Z1525.Z1528]]

# FabricLauncherPlugin.fireDueSchedules.Z1525.Z1528

```mermaid
flowchart TD
  n1["try Z.1528"]
  n2["if Z.1530 (!CronExpr.matches(schedule.cron(), now))"]
  n3["CronExpr.matches"]:::internal-link
  n4["ScheduleDef.cron"]:::internal-link
  n5["catch Z.1531 (RuntimeException e)"]
  n2 -->|"Z.1530"| n3
  n3 -->|"Z.1530"| n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.fireDueSchedules.Z1525`, Quellreihenfolge.
