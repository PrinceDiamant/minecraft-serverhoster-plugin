[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.openChild]]

# FabricLauncherPlugin.openChild

`FabricLauncherPlugin.openChild(CommandSender s, String id)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1712–1722](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1712-L1722)

```mermaid
flowchart TD
  n1["if Z.1713 (!slot(id).wantRunning)"]
  n2["FabricLauncherPlugin.slot"]:::internal-link
  n3["return Z.1713 return;"]
  n4["FabricLauncherPlugin.openChild.Z1714"]:::internal-link
  n1 -->|"Z.1713"| n2
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1713 (!slot(id).wantRunning)
  Zeile 1713: prüft `(!slot(id).wantRunning)`.
FabricLauncherPlugin.slot
  `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
return Z.1713 return;
  Zeile 1713: Rückgabe `return;`.
FabricLauncherPlugin.openChild.Z1714
  Fortsetzung des Ablaufs ab Zeile 1714.
```

- `openChild` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
