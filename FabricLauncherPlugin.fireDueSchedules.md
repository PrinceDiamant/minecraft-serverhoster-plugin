[[00 Start]] › [[Zeitplaene]] › [[Schedules]] › [[FabricLauncherPlugin.fireDueSchedules]]

# FabricLauncherPlugin.fireDueSchedules

`FabricLauncherPlugin.fireDueSchedules()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1516–1545](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1516-L1545)

```mermaid
flowchart TD
  n1["if Z.1517 (shuttingDown)"]
  n2["return Z.1517 return;"]
  n3["try Z.1519"]
  n4["FabricLauncherPlugin.schedules"]:::internal-link
  n5["catch Z.1521 (RuntimeException e)"]
  n6["return Z.1523 return;"]
  n7["FabricLauncherPlugin.fireDueSchedules.Z1525"]:::internal-link
  n1 -->|"ja"| n2
  n3 --> n4
  n3 -->|"Fehler"| n5
  n5 --> n6
  n2 --> n3
  n1 --> n3
  n4 --> n7
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1517 (shuttingDown)
  Zeile 1517: prüft `(shuttingDown)`.
return Z.1517 return;
  Zeile 1517: Rückgabe `return;`.
try Z.1519
  Zeile 1519: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.schedules
  `schedules` in `FabricLauncherPlugin.java`. Ruft `load`.
catch Z.1521 (RuntimeException e)
  Zeile 1521: fängt (RuntimeException e).
return Z.1523 return;
  Zeile 1523: Rückgabe `return;`.
FabricLauncherPlugin.fireDueSchedules.Z1525
  Fortsetzung des Ablaufs ab Zeile 1525.
```

- `fireDueSchedules` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
