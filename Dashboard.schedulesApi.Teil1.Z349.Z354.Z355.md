[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.schedulesApi]] › [[Dashboard.schedulesApi.Teil1.Z349.Z354.Z355]]

# Dashboard.schedulesApi.Teil1.Z349.Z354.Z355

```mermaid
flowchart TD
  n1["sync Z.355"]
  n2["FabricLauncherPlugin.schedules"]:::internal-link
  n3["if Z.358 (schedules.size() )= ScheduleDef.MAX_SCHEDULES)"]
  n4["throw Z.359 throw new IllegalArgumentException('Zu viele Zeit…"]
  n5["if Z.360 (schedules.stream().anyMatch(item -) item.id().eq…"]
  n6["throw Z.361 throw new IllegalArgumentException('Schedule-ID e…"]
  n7["FabricLauncherPlugin.saveSchedules"]:::internal-link
  n3 -->|"ja"| n4
  n2 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
sync Z.355
  Zeile 355: synchronisierter Block.
FabricLauncherPlugin.schedules
  `schedules` in `FabricLauncherPlugin.java`. Ruft `load`.
if Z.358 (schedules.size() )= ScheduleDef.MAX_SCHEDULES)
  Zeile 358: prüft `(schedules.size() )= ScheduleDef.MAX_SCHEDULES)`.
throw Z.359 throw new IllegalArgumentException('Zu viele Zeit…
  Zeile 359: Abbruch `throw new IllegalArgumentException('Zu viele Zeit…`.
if Z.360 (schedules.stream().anyMatch(item -) item.id().eq…
  Zeile 360: prüft `(schedules.stream().anyMatch(item -) item.id().eq…`.
throw Z.361 throw new IllegalArgumentException('Schedule-ID e…
  Zeile 361: Abbruch `throw new IllegalArgumentException('Schedule-ID e…`.
FabricLauncherPlugin.saveSchedules
  Speichert `saveSchedules`. Ruft `toConfig`, `saveConfigWritable`.
```

- Fortsetzung von `Dashboard.schedulesApi.Teil1.Z349.Z354`, Quellreihenfolge.
