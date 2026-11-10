[[00 Start]] › [[Zeitplaene]] › [[Schedules]] › [[FabricLauncherPlugin.runSchedule]] › [[FabricLauncherPlugin.runSchedule.Aufrufe]]

# FabricLauncherPlugin.runSchedule.Aufrufe

```mermaid
flowchart TD
  n1["TaskDef.TaskDef"]:::internal-link
  n2["FabricLauncherPlugin.runScheduledBackup"]:::internal-link
  n3["FabricLauncherPlugin.slot"]:::internal-link
  n4["FabricLauncherPlugin.send"]:::internal-link
  n5["ConsoleBuffer.add"]:::internal-link
  n1 -->|"Z.1607"| n2
  n2 -->|"Z.1609"| n3
  n3 -->|"Z.1610"| n4
  n4 -->|"Z.1612"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
TaskDef.TaskDef
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `TaskDef` in `TaskDef.java`. Ruft `normZone`, `normAction`.
FabricLauncherPlugin.runScheduledBackup
  Das [[Glossar#Plugin|Plugin]] führt aus zur geplanten Zeit die [[Glossar#Sicherungskopie|Sicherungskopie]]. Führt aus `runScheduledBackup`. Ruft `slot`, `running`, `add`.
FabricLauncherPlugin.slot
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
FabricLauncherPlugin.send
  Schickt Text an den laufenden [[Glossar#Spielserver|Spielserver]]. Sendet `send`. Ruft `running`.
ConsoleBuffer.add
  Dieser Teil fügt hinzu das. Fügt hinzu `add`.
```

> [!knoten]- Was die Blöcke tun
> - **TaskDef.TaskDef**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `TaskDef` in `TaskDef.java`. Ruft `normZone`, `normAction`.
> - **FabricLauncherPlugin.runScheduledBackup**: Das [[Glossar#Plugin|Plugin]] führt aus zur geplanten Zeit die [[Glossar#Sicherungskopie|Sicherungskopie]]. Führt aus `runScheduledBackup`. Ruft `slot`, `running`, `add`.
> - **FabricLauncherPlugin.slot**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
> - **FabricLauncherPlugin.send**: Schickt Text an den laufenden [[Glossar#Spielserver|Spielserver]]. Sendet `send`. Ruft `running`.
> - **ConsoleBuffer.add**: Dieser Teil fügt hinzu das. Fügt hinzu `add`.

- Aufrufe, die das Diagramm nicht in den gezeichneten Ablauf gesetzt hat.
- Fortsetzung von `FabricLauncherPlugin.runSchedule`.
- ungeprüft: Ablaufparser oder nachgetragene Aufrufe, siehe [[bericht]].
