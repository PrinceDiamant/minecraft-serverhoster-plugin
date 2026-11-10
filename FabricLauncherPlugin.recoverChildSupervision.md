[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.recoverChildSupervision]]

# FabricLauncherPlugin.recoverChildSupervision

`FabricLauncherPlugin.recoverChildSupervision()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:2026–2055](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L2026-L2055)

```mermaid
flowchart TD
  n1["if Z.2027 (shuttingDown)"]
  n2["return Z.2027 return;"]
  n3["FabricLauncherPlugin.recoverChildSupervision.Z2028"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.2027 (shuttingDown)
  Zeile 2027: prüft `(shuttingDown)`.
return Z.2027 return;
  Zeile 2027: Rückgabe `return;`.
FabricLauncherPlugin.recoverChildSupervision.Z2028
  Fortsetzung des Ablaufs ab Zeile 2028.
```

- `recoverChildSupervision` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
