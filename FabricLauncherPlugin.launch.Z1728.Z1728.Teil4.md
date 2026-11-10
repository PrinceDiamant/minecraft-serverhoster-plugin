[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.launch]] › [[FabricLauncherPlugin.launch.Z1728.Z1728.Teil4]]

# FabricLauncherPlugin.launch.Z1728.Z1728.Teil4

```mermaid
flowchart TD
  n1["ConsoleBuffer.add"]:::internal-link
  n2["FabricLauncherPlugin.rememberProcess"]:::internal-link
  n3["FabricLauncherPlugin.armPipe"]:::internal-link
  n4["FabricLauncherPlugin.consolePrefix"]:::internal-link
  n1 --> n2
  n3 -->|"Z.1762"| n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ConsoleBuffer.add
  Fügt hinzu `add`.
FabricLauncherPlugin.rememberProcess
  Merkt sich den Prozess `rememberProcess`. Ruft `write`, `processRecord`, `directory`.
FabricLauncherPlugin.armPipe
  Hängt die Überwachung an `armPipe`. Ruft `pipe`.
FabricLauncherPlugin.consolePrefix
  Liefert die Konsole `consolePrefix`.
```

- Fortsetzung von `FabricLauncherPlugin.launch.Z1728.Z1728`, Quellreihenfolge.
