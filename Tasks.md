[[00 Start]] › [[Zeitplaene]] › [[Tasks]]

# Tasks

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.tasks"]:::internal-link
  n2["FabricLauncherPlugin.runTask"]:::internal-link
  n3["FabricLauncherPlugin.executeTask"]:::internal-link
  n4["FabricLauncherPlugin.taskLast"]:::internal-link
  n5["FabricLauncherPlugin.taskNext"]:::internal-link
  n6["FabricLauncherPlugin.noteTask"]:::internal-link
  n7["FabricLauncherPlugin.fireDueTasks"]:::internal-link
  n2 -->|"Z.1313"| n3
  n2 -->|"Z.1314"| n6
  n7 -->|"Z.1499"| n1
  n7 -->|"Z.1512"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n7 fill:#f88,stroke:#900
```

```knoten
FabricLauncherPlugin.tasks
  `tasks` in `FabricLauncherPlugin.java`. Ruft `load`.
FabricLauncherPlugin.runTask
  Führt aus `runTask`. Ruft `executeTask`, `noteTask`, `notifyNtfy`.
FabricLauncherPlugin.executeTask
  Führt aus `executeTask`. Ruft `startAsync`, `slot`, `stopBlocking`.
FabricLauncherPlugin.taskLast
  `taskLast` in `FabricLauncherPlugin.java`.
FabricLauncherPlugin.taskNext
  `taskNext` in `FabricLauncherPlugin.java`. Ruft `next`.
FabricLauncherPlugin.noteTask
  Merkt `noteTask`.
FabricLauncherPlugin.fireDueTasks
  Führt Fälliges aus in `fireDueTasks`. Ruft `tasks`, `matches`, `runTask`. Befund: Altlast (sicher).
```


