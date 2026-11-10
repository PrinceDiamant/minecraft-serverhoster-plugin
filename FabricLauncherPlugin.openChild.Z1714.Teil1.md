[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.openChild]] › [[FabricLauncherPlugin.openChild.Z1714.Teil1]]

# FabricLauncherPlugin.openChild.Z1714.Teil1

```mermaid
flowchart TD
  n1["if Z.1715 (!slot(id).wantRunning)"]
  n2["FabricLauncherPlugin.slot"]:::internal-link
  n3["return Z.1715 return;"]
  n4["FabricLauncherPlugin.slot"]:::internal-link
  n5["if Z.1717 (!slot.wantRunning)"]
  n6["return Z.1717 return;"]
  n7["if Z.1718 (slot.running())"]
  n8["ChildSlot.running"]:::internal-link
  n9["FabricLauncherPlugin.msg"]:::internal-link
  n10["return Z.1718 return;"]
  n1 -->|"Z.1715"| n2
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  n7 -->|"Z.1718"| n8
  n9 --> n10
  n8 -->|"ja"| n9
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1715 (!slot(id).wantRunning)
  Zeile 1715: prüft `(!slot(id).wantRunning)`.
FabricLauncherPlugin.slot
  `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
return Z.1715 return;
  Zeile 1715: Rückgabe `return;`.
if Z.1717 (!slot.wantRunning)
  Zeile 1717: prüft `(!slot.wantRunning)`.
return Z.1717 return;
  Zeile 1717: Rückgabe `return;`.
if Z.1718 (slot.running())
  Zeile 1718: prüft `(slot.running())`.
ChildSlot.running
  Sagt, ob der Prozess läuft `running`.
FabricLauncherPlugin.msg
  Sendet eine Chat-Zeile `msg`.
return Z.1718 return;
  Zeile 1718: Rückgabe `return;`.
```

- Fortsetzung von `FabricLauncherPlugin.openChild.Z1714`, Quellreihenfolge.
