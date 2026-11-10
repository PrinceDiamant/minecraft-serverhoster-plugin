[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.startAsync]] › [[FabricLauncherPlugin.startAsync.Teil1]]

# FabricLauncherPlugin.startAsync.Teil1

```mermaid
flowchart TD
  n1["if Z.1672 (hostFirstSetupRestartRequired // hostFirstSetupB…"]
  n2["FabricLauncherPlugin.msg"]:::internal-link
  n3["return Z.1674 return;"]
  n4["if Z.1676 (setupRequired)"]
  n5["FabricLauncherPlugin.msg"]:::internal-link
  n6["return Z.1678 return;"]
  n7["FabricLauncherPlugin.slot"]:::internal-link
  n8["FabricLauncherPlugin.invalidateRestarts"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  n5 --> n6
  n4 -->|"ja"| n5
  n3 --> n4
  n1 --> n4
  n6 --> n7
  n4 --> n7
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1672 (hostFirstSetupRestartRequired // hostFirstSetupB…
  Zeile 1672: prüft `(hostFirstSetupRestartRequired // hostFirstSetupB…`.
FabricLauncherPlugin.msg
  Sendet eine Chat-Zeile `msg`.
return Z.1674 return;
  Zeile 1674: Rückgabe `return;`.
if Z.1676 (setupRequired)
  Zeile 1676: prüft `(setupRequired)`.
return Z.1678 return;
  Zeile 1678: Rückgabe `return;`.
FabricLauncherPlugin.slot
  `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
FabricLauncherPlugin.invalidateRestarts
  Verwirft `invalidateRestarts`.
```

- Fortsetzung von `FabricLauncherPlugin.startAsync`, Quellreihenfolge.
