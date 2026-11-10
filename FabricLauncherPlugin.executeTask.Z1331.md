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

```knoten
switch Z.1331 (task.action)
  Zeile 1331: Verzweigung nach `(task.action)`.
case Z.1332 'start'
  Zeile 1332: Zweig `'start'`.
FabricLauncherPlugin.startAsync
  Startet `startAsync`. Ruft `msg`, `slot`, `invalidateRestarts`.
case Z.1333 'stop'
  Zeile 1333: Zweig `'stop'`.
FabricLauncherPlugin.executeTask.Z1331.Case1333
  Rumpf dieses switch-Zweigs ab Zeile 1333.
case Z.1334 'restart'
  Zeile 1334: Zweig `'restart'`.
FabricLauncherPlugin.requestRestart(String)
  Fordert an `requestRestart`. Ruft `slot`, `stopBlocking`, `reloadProfiles`.
case Z.1335 'backup'
  Zeile 1335: Zweig `'backup'`.
FabricLauncherPlugin.runScheduledBackup
  Führt aus `runScheduledBackup`. Ruft `slot`, `running`, `add`.
case Z.1336 'command', 'save-all'
  Zeile 1336: Zweig `'command', 'save-all'`.
FabricLauncherPlugin.executeTask.Z1331.Case1336
  Rumpf dieses switch-Zweigs ab Zeile 1336.
case Z.1341 default
  Zeile 1341: Zweig `default`.
throw Z.1341 throw new IllegalArgumentException('action ' + ta…
  Zeile 1341: Abbruch `throw new IllegalArgumentException('action ' + ta…`.
```

- Fortsetzung von `FabricLauncherPlugin.executeTask`, Quellreihenfolge.
