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
  `TaskDef` in `TaskDef.java`. Ruft `normZone`, `normAction`.
FabricLauncherPlugin.runScheduledBackup
  Führt aus `runScheduledBackup`. Ruft `slot`, `running`, `add`.
FabricLauncherPlugin.slot
  `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
FabricLauncherPlugin.send
  Sendet `send`. Ruft `running`.
ConsoleBuffer.add
  Fügt hinzu `add`.
```

- Fortsetzung von `FabricLauncherPlugin.runSchedule`, Quellreihenfolge.
- ungeprüft: Ablaufparser oder nachgetragene Aufrufe, siehe [[bericht]].
