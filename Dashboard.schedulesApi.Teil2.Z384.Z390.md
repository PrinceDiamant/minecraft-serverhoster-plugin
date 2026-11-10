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
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `schedules` in `FabricLauncherPlugin.java`. Ruft `load`.
Dashboard.scheduleIndex
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] plant die Position. Plant `scheduleIndex`.
ScheduleDef.withEnabled
  Der [[Glossar#Zeitplan|Zeitplan]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert eine Kopie mit `withEnabled`. Ruft `ScheduleDef`.
FabricLauncherPlugin.saveSchedules
  Das [[Glossar#Plugin|Plugin]] speichert die Zeitpläne. Speichert `saveSchedules`. Ruft `toConfig`, `saveConfigWritable`.
```

> [!knoten]- Was die Blöcke tun
> - **sync Z.390**: Zeile 390: synchronisierter Block.
> - **FabricLauncherPlugin.schedules**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `schedules` in `FabricLauncherPlugin.java`. Ruft `load`.
> - **Dashboard.scheduleIndex**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] plant die Position. Plant `scheduleIndex`.
> - **ScheduleDef.withEnabled**: Der [[Glossar#Zeitplan|Zeitplan]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert eine Kopie mit `withEnabled`. Ruft `ScheduleDef`.
> - **FabricLauncherPlugin.saveSchedules**: Das [[Glossar#Plugin|Plugin]] speichert die Zeitpläne. Speichert `saveSchedules`. Ruft `toConfig`, `saveConfigWritable`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 390 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `Dashboard.schedulesApi.Teil2.Z384`.
