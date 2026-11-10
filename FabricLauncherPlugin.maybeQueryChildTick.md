[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.maybeQueryChildTick]]

# FabricLauncherPlugin.maybeQueryChildTick

`FabricLauncherPlugin.maybeQueryChildTick(String id)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1819–1825](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1819-L1825)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.slot"]:::internal-link
  n2["if Z.1822 (!slot.running() // now - slot.queryAt ( 10_000 /…"]
  n3["ChildSlot.running"]:::internal-link
  n4["return Z.1822 return;"]
  n5["FabricLauncherPlugin.send"]:::internal-link
  n2 -->|"Z.1822"| n3
  n3 -->|"ja"| n4
  n1 --> n2
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.slot
  `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
if Z.1822 (!slot.running() // now - slot.queryAt ( 10_000 /…
  Zeile 1822: prüft `(!slot.running() // now - slot.queryAt ( 10_000 /…`.
ChildSlot.running
  Sagt, ob der Prozess läuft `running`.
return Z.1822 return;
  Zeile 1822: Rückgabe `return;`.
FabricLauncherPlugin.send
  Sendet `send`. Ruft `running`.
```

```mermaid
sequenceDiagram
  participant HTTP as Dashboard-Thread
  participant Child as Child-Konsole
  HTTP->>HTTP: skip unter 10000 ms seit Query oder 30000 ms seit Start, Z.1822
  HTTP->>Child: tick query
```

- `maybeQueryChildTick` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
