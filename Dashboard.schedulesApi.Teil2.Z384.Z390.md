[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.schedulesApi]] › [[Dashboard.schedulesApi.Teil2.Z384.Z390]]

# Dashboard.schedulesApi.Teil2.Z384.Z390

```mermaid
flowchart TD
  n1["sync Z.390"]
  n2["FabricLauncherPlugin.schedules"]:::internal-link
  n3["Dashboard.scheduleIndex"]:::internal-link
  n4["ScheduleDef.withEnabled"]:::internal-link
  n5["FabricLauncherPlugin.saveSchedules"]:::internal-link
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
sync Z.390
  Zeile 390: synchronisierter Block.
FabricLauncherPlugin.schedules
  `schedules` in `FabricLauncherPlugin.java`. Ruft `load`.
Dashboard.scheduleIndex
  Plant `scheduleIndex`.
ScheduleDef.withEnabled
  Liefert eine Kopie mit `withEnabled`. Ruft `ScheduleDef`.
FabricLauncherPlugin.saveSchedules
  Speichert `saveSchedules`. Ruft `toConfig`, `saveConfigWritable`.
```

- Fortsetzung von `Dashboard.schedulesApi.Teil2.Z384`, Quellreihenfolge.
