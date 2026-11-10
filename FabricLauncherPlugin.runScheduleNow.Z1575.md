[[00 Start]] › [[Zeitplaene]] › [[Schedules]] › [[FabricLauncherPlugin.runScheduleNow]] › [[FabricLauncherPlugin.runScheduleNow.Z1575]]

# FabricLauncherPlugin.runScheduleNow.Z1575

```mermaid
flowchart TD
  n1["try Z.1575"]
  n2["FabricLauncherPlugin.markManualScheduleRun"]:::internal-link
  n3["FabricLauncherPlugin.runSchedule"]:::internal-link
  n4["catch Z.1578 (RuntimeException e)"]
  n5["throw Z.1580 throw e;"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.runScheduleNow`, Quellreihenfolge.
