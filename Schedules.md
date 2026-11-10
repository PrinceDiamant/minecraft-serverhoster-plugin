[[00 Start]] › [[Zeitplaene]] › [[Schedules]]

# Schedules

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.schedules"]:::internal-link
  n2["FabricLauncherPlugin.saveSchedules"]:::internal-link
  n3["FabricLauncherPlugin.fireDueSchedules"]:::internal-link
  n4["FabricLauncherPlugin.markScheduleRun"]:::internal-link
  n5["FabricLauncherPlugin.sameScheduleMinute"]:::internal-link
  n6["FabricLauncherPlugin.runScheduleNow"]:::internal-link
  n7["FabricLauncherPlugin.markManualScheduleRun"]:::internal-link
  n8["FabricLauncherPlugin.runSchedule"]:::internal-link
  n3 -->|"Z.1520"| n1
  n3 -->|"Z.1537"| n4
  n3 -->|"Z.1539"| n8
  n4 -->|"Z.1549"| n1
  n4 -->|"Z.1553"| n5
  n4 -->|"Z.1556"| n2
  n6 -->|"Z.1576"| n7
  n6 -->|"Z.1577"| n8
  n7 -->|"Z.1586"| n1
  n7 -->|"Z.1590"| n5
  n7 -->|"Z.1593"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.schedules
  `schedules` in `FabricLauncherPlugin.java`. Ruft `load`.
FabricLauncherPlugin.saveSchedules
  Speichert `saveSchedules`. Ruft `toConfig`, `saveConfigWritable`.
FabricLauncherPlugin.fireDueSchedules
  Führt Fälliges aus in `fireDueSchedules`. Ruft `schedules`, `matches`, `cron`.
FabricLauncherPlugin.markScheduleRun
  Merkt `markScheduleRun`. Ruft `schedules`, `sameScheduleMinute`, `withLastRun`.
FabricLauncherPlugin.sameScheduleMinute
  Vergleicht `sameScheduleMinute`.
FabricLauncherPlugin.runScheduleNow
  Führt aus `runScheduleNow`. Ruft `markManualScheduleRun`, `runSchedule`.
FabricLauncherPlugin.markManualScheduleRun
  Merkt `markManualScheduleRun`. Ruft `schedules`, `sameScheduleMinute`, `withLastRun`.
FabricLauncherPlugin.runSchedule
  Führt aus `runSchedule`. Ruft `noteTask`, `run`, `TaskDef`.
```


