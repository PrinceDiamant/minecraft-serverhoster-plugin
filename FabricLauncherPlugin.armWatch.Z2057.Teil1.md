[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.armWatch]] › [[FabricLauncherPlugin.armWatch.Z2057.Teil1]]

# FabricLauncherPlugin.armWatch.Z2057.Teil1

```mermaid
flowchart TD
  n1["if Z.2059 (process == null // !process.isAlive())"]
  n2["return Z.2059 return;"]
  n3["if Z.2060 (slot.watchArmed.get() && !replace)"]
  n4["return Z.2060 return;"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.2059 (process == null // !process.isAlive())
  Zeile 2059: prüft `(process == null // !process.isAlive())`.
return Z.2059 return;
  Zeile 2059: Rückgabe `return;`.
if Z.2060 (slot.watchArmed.get() && !replace)
  Zeile 2060: prüft `(slot.watchArmed.get() && !replace)`.
return Z.2060 return;
  Zeile 2060: Rückgabe `return;`.
```

- Fortsetzung von `FabricLauncherPlugin.armWatch.Z2057`, Quellreihenfolge.
