[[00 Start]] › [[Zeitplaene]] › [[Schedules]] › [[FabricLauncherPlugin.markManualScheduleRun]] › [[FabricLauncherPlugin.markManualScheduleRun.Z1584.Z1587]]

# FabricLauncherPlugin.markManualScheduleRun.Z1584.Z1587

```mermaid
flowchart TD
  n1["for Z.1587 (int i = 0; i ( current.size(); i++)"]
  n2["if Z.1589 (!schedule.id().equals(id))"]
  n3["if Z.1590 (sameScheduleMinute(schedule, timestamp))"]
  n4["FabricLauncherPlugin.sameScheduleMinute"]:::internal-link
  n5["return Z.1590 return schedule;"]
  n6["ScheduleDef.withLastRun"]:::internal-link
  n7["FabricLauncherPlugin.saveSchedules"]:::internal-link
  n8["return Z.1594 return started;"]
  n3 -->|"Z.1590"| n4
  n4 -->|"ja"| n5
  n2 --> n3
  n2 --> n3
  n5 --> n6
  n4 --> n6
  n6 --> n7
  n7 --> n8
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.markManualScheduleRun.Z1584`, Quellreihenfolge.
