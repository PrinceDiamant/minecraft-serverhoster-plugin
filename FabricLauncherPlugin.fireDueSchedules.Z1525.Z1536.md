[[00 Start]] › [[Zeitplaene]] › [[Schedules]] › [[FabricLauncherPlugin.fireDueSchedules]] › [[FabricLauncherPlugin.fireDueSchedules.Z1525.Z1536]]

# FabricLauncherPlugin.fireDueSchedules.Z1525.Z1536

```mermaid
flowchart TD
  n1["try Z.1536"]
  n2["FabricLauncherPlugin.markScheduleRun"]:::internal-link
  n3["if Z.1538 (started == null)"]
  n4["FabricLauncherPlugin.runSchedule"]:::internal-link
  n5["catch Z.1540 (RuntimeException e)"]
  n3 -->|"nein"| n4
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.fireDueSchedules.Z1525`, Quellreihenfolge.
