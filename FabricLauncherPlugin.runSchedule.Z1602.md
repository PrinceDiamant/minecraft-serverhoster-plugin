[[00 Start]] › [[Zeitplaene]] › [[Schedules]] › [[FabricLauncherPlugin.runSchedule]] › [[FabricLauncherPlugin.runSchedule.Z1602]]

# FabricLauncherPlugin.runSchedule.Z1602

```mermaid
flowchart TD
  n1["try Z.1602"]
  n2["FabricLauncherPlugin.runSchedule.Z1602.Z1603"]:::internal-link
  n3["FabricLauncherPlugin.noteTask"]:::internal-link
  n4["catch Z.1616 (InterruptedException e)"]
  n5["FabricLauncherPlugin.noteTask"]:::internal-link
  n6["catch Z.1620 (Exception e)"]
  n7["FabricLauncherPlugin.noteTask"]:::internal-link
  n8["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n9["finally Z.1602"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  n1 -->|"Fehler"| n6
  n7 --> n8
  n6 --> n7
  n3 --> n9
  n5 --> n9
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.runSchedule`, Quellreihenfolge.
