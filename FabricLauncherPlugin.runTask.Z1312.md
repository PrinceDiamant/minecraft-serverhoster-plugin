[[00 Start]] › [[Zeitplaene]] › [[Tasks]] › [[FabricLauncherPlugin.runTask]] › [[FabricLauncherPlugin.runTask.Z1312]]

# FabricLauncherPlugin.runTask.Z1312

```mermaid
flowchart TD
  n1["try Z.1312"]
  n2["FabricLauncherPlugin.executeTask"]:::internal-link
  n3["FabricLauncherPlugin.noteTask"]:::internal-link
  n4["catch Z.1315 (InterruptedException e)"]
  n5["FabricLauncherPlugin.noteTask"]:::internal-link
  n6["catch Z.1319 (Exception e)"]
  n7["FabricLauncherPlugin.noteTask"]:::internal-link
  n8["if Z.1322 (!'backup'.equals(task.action))"]
  n9["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  n1 -->|"Fehler"| n6
  n8 -->|"ja"| n9
  n7 --> n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.runTask`, Quellreihenfolge.
