[[00 Start]] › [[Zeitplaene]] › [[Tasks]] › [[FabricLauncherPlugin.executeTask]] › [[FabricLauncherPlugin.executeTask.Z1331]]

# FabricLauncherPlugin.executeTask.Z1331

```mermaid
flowchart TD
  n1["switch Z.1331 (task.action)"]
  n2["case Z.1332 'start'"]
  n3["FabricLauncherPlugin.startAsync"]:::internal-link
  n4["case Z.1333 'stop'"]
  n5["FabricLauncherPlugin.executeTask.Z1331.Case1333"]:::internal-link
  n6["case Z.1334 'restart'"]
  n7["FabricLauncherPlugin.requestRestart(String)"]:::internal-link
  n8["case Z.1335 'backup'"]
  n9["FabricLauncherPlugin.runScheduledBackup"]:::internal-link
  n10["case Z.1336 'command', 'save-all'"]
  n11["FabricLauncherPlugin.executeTask.Z1331.Case1336"]:::internal-link
  n12["case Z.1341 default"]
  n13["throw Z.1341 throw new IllegalArgumentException('action ' + ta…"]
  n1 --> n2
  n2 --> n3
  n1 --> n4
  n4 --> n5
  n1 --> n6
  n6 --> n7
  n1 --> n8
  n8 --> n9
  n1 --> n10
  n10 --> n11
  n1 --> n12
  n12 --> n13
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.executeTask`, Quellreihenfolge.
