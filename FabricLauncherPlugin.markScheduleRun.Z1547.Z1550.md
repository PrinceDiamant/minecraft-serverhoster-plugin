[[00 Start]] › [[Zeitplaene]] › [[Schedules]] › [[FabricLauncherPlugin.markScheduleRun]] › [[FabricLauncherPlugin.markScheduleRun.Z1547.Z1550]]

# FabricLauncherPlugin.markScheduleRun.Z1547.Z1550

```mermaid
flowchart TD
  n1["for Z.1550 (int i = 0; i ( current.size(); i++)"]
  n2["if Z.1552 (!schedule.id().equals(id) // !schedule.enabled())"]
  n3["if Z.1553 (sameScheduleMinute(schedule, timestamp))"]
  n4["FabricLauncherPlugin.sameScheduleMinute"]:::internal-link
  n5["return Z.1553 return null;"]
  n6["ScheduleDef.withLastRun"]:::internal-link
  n7["FabricLauncherPlugin.saveSchedules"]:::internal-link
  n8["return Z.1557 return started;"]
  n3 -->|"Z.1553"| n4
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

```knoten
for Z.1550 (int i = 0; i ( current.size(); i++)
  Zeile 1550: Schleife `(int i = 0; i ( current.size(); i++)`.
if Z.1552 (!schedule.id().equals(id) // !schedule.enabled())
  Zeile 1552: prüft `(!schedule.id().equals(id) // !schedule.enabled())`.
if Z.1553 (sameScheduleMinute(schedule, timestamp))
  Zeile 1553: prüft `(sameScheduleMinute(schedule, timestamp))`.
FabricLauncherPlugin.sameScheduleMinute
  Das [[Glossar#Plugin|Plugin]] plant Zeitpunkt. Vergleicht `sameScheduleMinute`.
return Z.1553 return null;
  Zeile 1553: Rückgabe `return null;`.
ScheduleDef.withLastRun
  Der [[Glossar#Zeitplan|Zeitplan]] kümmert sich um den letzten Stand den Lauf. Liefert eine Kopie mit `withLastRun`. Ruft `ScheduleDef`.
FabricLauncherPlugin.saveSchedules
  Das [[Glossar#Plugin|Plugin]] speichert die Zeitpläne. Speichert `saveSchedules`. Ruft `toConfig`, `saveConfigWritable`.
return Z.1557 return started;
  Zeile 1557: Rückgabe `return started;`.
```

> [!knoten]- Was die Blöcke tun
> - **for Z.1550 (int i = 0; i ( current.size(); i++)**: Zeile 1550: Schleife `(int i = 0; i ( current.size(); i++)`.
> - **if Z.1552 (!schedule.id().equals(id) // !schedule.enabled())**: Zeile 1552: prüft `(!schedule.id().equals(id) // !schedule.enabled())`.
> - **if Z.1553 (sameScheduleMinute(schedule, timestamp))**: Zeile 1553: prüft `(sameScheduleMinute(schedule, timestamp))`.
> - **FabricLauncherPlugin.sameScheduleMinute**: Das [[Glossar#Plugin|Plugin]] plant Zeitpunkt. Vergleicht `sameScheduleMinute`.
> - **return Z.1553 return null;**: Zeile 1553: Rückgabe `return null;`.
> - **ScheduleDef.withLastRun**: Der [[Glossar#Zeitplan|Zeitplan]] kümmert sich um den letzten Stand den Lauf. Liefert eine Kopie mit `withLastRun`. Ruft `ScheduleDef`.
> - **FabricLauncherPlugin.saveSchedules**: Das [[Glossar#Plugin|Plugin]] speichert die Zeitpläne. Speichert `saveSchedules`. Ruft `toConfig`, `saveConfigWritable`.
> - **return Z.1557 return started;**: Zeile 1557: Rückgabe `return started;`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1550 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.markScheduleRun.Z1547`.
