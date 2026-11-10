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

```knoten
try Z.1575
  Zeile 1575: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.markManualScheduleRun
  Merkt `markManualScheduleRun`. Ruft `schedules`, `sameScheduleMinute`, `withLastRun`.
FabricLauncherPlugin.runSchedule
  Führt aus `runSchedule`. Ruft `noteTask`, `run`, `TaskDef`.
catch Z.1578 (RuntimeException e)
  Zeile 1578: fängt (RuntimeException e).
throw Z.1580 throw e;
  Zeile 1580: Abbruch `throw e;`.
```

- Fortsetzung von `FabricLauncherPlugin.runScheduleNow`, Quellreihenfolge.
