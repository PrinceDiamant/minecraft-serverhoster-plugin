[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.scheduleJson]] › [[Dashboard.scheduleJson.Z460]]

# Dashboard.scheduleJson.Z460

```mermaid
flowchart TD
  n1["if Z.460 (schedule.enabled())"]
  n2["try Z.461"]
  n3["CronExpr.next"]:::internal-link
  n4["ScheduleDef.cron"]:::internal-link
  n5["catch Z.465 (RuntimeException e)"]
  n3 -->|"Z.462"| n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.scheduleJson`, Quellreihenfolge.
