[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.schedulesApi]] › [[Dashboard.schedulesApi.Teil2.Z406.Z409]]

# Dashboard.schedulesApi.Teil2.Z406.Z409

```mermaid
flowchart TD
  n1["sync Z.409"]
  n2["FabricLauncherPlugin.schedules"]:::internal-link
  n3["Dashboard.scheduleIndex"]:::internal-link
  n4["ScheduleDef.withLastRun"]:::internal-link
  n5["FabricLauncherPlugin.saveSchedules"]:::internal-link
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
sync Z.409
  Zeile 409: synchronisierter Block.
FabricLauncherPlugin.schedules
  `schedules` in `FabricLauncherPlugin.java`. Ruft `load`.
Dashboard.scheduleIndex
  Plant `scheduleIndex`.
ScheduleDef.withLastRun
  Liefert eine Kopie mit `withLastRun`. Ruft `ScheduleDef`.
FabricLauncherPlugin.saveSchedules
  Speichert `saveSchedules`. Ruft `toConfig`, `saveConfigWritable`.
```

- Fortsetzung von `Dashboard.schedulesApi.Teil2.Z406`, Quellreihenfolge.
