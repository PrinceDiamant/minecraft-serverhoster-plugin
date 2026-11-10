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
  n3 -->|"Zeile 1520"| n1
  n3 -->|"Zeile 1537"| n4
  n3 -->|"Zeile 1539"| n8
  n4 -->|"Zeile 1549"| n1
  n4 -->|"Zeile 1553"| n5
  n4 -->|"Zeile 1556"| n2
  n6 -->|"Zeile 1576"| n7
  n6 -->|"Zeile 1577"| n8
  n7 -->|"Zeile 1586"| n1
  n7 -->|"Zeile 1590"| n5
  n7 -->|"Zeile 1593"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.schedules
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
FabricLauncherPlugin.saveSchedules
  Das [[Glossar#Plugin|Plugin]] speichert die Zeitpläne.
FabricLauncherPlugin.fireDueSchedules
  Das [[Glossar#Plugin|Plugin]] stößt an Fälliges die Zeitpläne.
FabricLauncherPlugin.markScheduleRun
  Das [[Glossar#Plugin|Plugin]] merkt sich den [[Glossar#Zeitplan|Zeitplan]] den Lauf.
FabricLauncherPlugin.sameScheduleMinute
  Das [[Glossar#Plugin|Plugin]] plant Zeitpunkt.
FabricLauncherPlugin.runScheduleNow
  Das [[Glossar#Plugin|Plugin]] führt aus den [[Glossar#Zeitplan|Zeitplan]] sofort.
FabricLauncherPlugin.markManualScheduleRun
  Das [[Glossar#Plugin|Plugin]] merkt sich die Handarbeit den [[Glossar#Zeitplan|Zeitplan]] den Lauf.
FabricLauncherPlugin.runSchedule
  Das [[Glossar#Plugin|Plugin]] führt aus den [[Glossar#Zeitplan|Zeitplan]].
```

> [!knoten] Was die Blöcke tun
> - **FabricLauncherPlugin.schedules**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer.
> - **FabricLauncherPlugin.saveSchedules**: Das [[Glossar#Plugin|Plugin]] speichert die Zeitpläne.
> - **FabricLauncherPlugin.fireDueSchedules**: Das [[Glossar#Plugin|Plugin]] stößt an Fälliges die Zeitpläne.
> - **FabricLauncherPlugin.markScheduleRun**: Das [[Glossar#Plugin|Plugin]] merkt sich den [[Glossar#Zeitplan|Zeitplan]] den Lauf.
> - **FabricLauncherPlugin.sameScheduleMinute**: Das [[Glossar#Plugin|Plugin]] plant Zeitpunkt.
> - **FabricLauncherPlugin.runScheduleNow**: Das [[Glossar#Plugin|Plugin]] führt aus den [[Glossar#Zeitplan|Zeitplan]] sofort.
> - **FabricLauncherPlugin.markManualScheduleRun**: Das [[Glossar#Plugin|Plugin]] merkt sich die Handarbeit den [[Glossar#Zeitplan|Zeitplan]] den Lauf.
> - **FabricLauncherPlugin.runSchedule**: Das [[Glossar#Plugin|Plugin]] führt aus den [[Glossar#Zeitplan|Zeitplan]].

- Die Zeitpläne. Ein [[Glossar#Wecker|Wecker]] sieht alle zwanzig Sekunden nach, ob einer fällig ist.
