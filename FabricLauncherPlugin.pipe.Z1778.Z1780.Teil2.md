[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.pipe]] › [[FabricLauncherPlugin.pipe.Z1778.Z1780.Teil2]]

# FabricLauncherPlugin.pipe.Z1778.Z1780.Teil2

```mermaid
flowchart TD
  n1["if Z.1786 (ChildSlot.isReadyLine(line))"]
  n2["ChildSlot.isReadyLine"]:::internal-link
  n3["if Z.1788 (slot.stopRequested)"]
  n4["FabricLauncherPlugin.stopBlocking"]:::internal-link
  n1 -->|"Z.1786"| n2
  n3 -->|"ja"| n4
  n2 -->|"ja"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1786 (ChildSlot.isReadyLine(line))
  Zeile 1786: prüft `(ChildSlot.isReadyLine(line))`.
ChildSlot.isReadyLine
  Prüft `isReadyLine`.
if Z.1788 (slot.stopRequested)
  Zeile 1788: prüft `(slot.stopRequested)`.
FabricLauncherPlugin.stopBlocking
  Stoppt `stopBlocking`. Ruft `invalidateRestarts`, `running`, `stopProcess`.
```

- Fortsetzung von `FabricLauncherPlugin.pipe.Z1778.Z1780`, Quellreihenfolge.
