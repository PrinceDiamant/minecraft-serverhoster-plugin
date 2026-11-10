[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.recoverChildSupervision]] › [[FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034.Case2043]]

# FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034.Case2043

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.armWatch"]:::internal-link
  n2["FabricLauncherPlugin.armPipe"]:::internal-link
  n3["FabricLauncherPlugin.consolePrefix"]:::internal-link
  n2 -->|"Z.2046"| n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.armWatch
  Hängt die Überwachung an `armWatch`. Ruft `watch`.
FabricLauncherPlugin.armPipe
  Hängt die Überwachung an `armPipe`. Ruft `pipe`.
FabricLauncherPlugin.consolePrefix
  Liefert die Konsole `consolePrefix`.
```

- Fortsetzung von `FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034`, Quellreihenfolge.
