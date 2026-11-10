[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2411]]

# FabricLauncherPlugin.onCommand.Z2401.Case2411

```mermaid
flowchart TD
  n1["for Z.2411 (TaskDef t : tasks())"]
  n2["FabricLauncherPlugin.tasks"]:::internal-link
  n3["FabricLauncherPlugin.taskNext"]:::internal-link
  n1 -->|"Z.2411"| n2
  n2 -->|"wiederholen"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.2411 (TaskDef t : tasks())
  Zeile 2411: Schleife `(TaskDef t : tasks())`.
FabricLauncherPlugin.tasks
  `tasks` in `FabricLauncherPlugin.java`. Ruft `load`.
FabricLauncherPlugin.taskNext
  `taskNext` in `FabricLauncherPlugin.java`. Ruft `next`.
```

- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401`, Quellreihenfolge.
