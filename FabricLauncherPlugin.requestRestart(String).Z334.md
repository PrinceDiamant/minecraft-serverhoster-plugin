[[00 Start]] › [[Plugin-Kern]] › [[Slot-Aktionen]] › [[FabricLauncherPlugin.requestRestart(String)]] › [[FabricLauncherPlugin.requestRestart(String).Z334]]

# FabricLauncherPlugin.requestRestart(String).Z334

```mermaid
flowchart TD
  n1["Schritt Z.334 exec.submit(() -) ( ChildSlot s = slot(id); s.wan…"]
  n2["FabricLauncherPlugin.slot"]:::internal-link
  n3["FabricLauncherPlugin.stopBlocking"]:::internal-link
  n4["FabricLauncherPlugin.reloadProfiles"]:::internal-link
  n5["FabricLauncherPlugin.startAsync"]:::internal-link
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n4 fill:#f88,stroke:#900
```

```knoten
Schritt Z.334 exec.submit(() -) ( ChildSlot s = slot(id); s.wan…
  Zeile 334: legt die Arbeit auf den Pool ServerhosterPlugin. `exec.submit(() -) ( ChildSlot s = slot(id); s.wan…`
FabricLauncherPlugin.slot
  `slot` in `FabricLauncherPlugin.java`. Ruft `profile`, `ChildSlot`.
FabricLauncherPlugin.stopBlocking
  Stoppt `stopBlocking`. Ruft `invalidateRestarts`, `running`, `stopProcess`.
FabricLauncherPlugin.reloadProfiles
  `Profiles.load`, danach nur `getFirst()`. Befund: angemeldet aber nicht umgesetzt (sicher).
FabricLauncherPlugin.startAsync
  Startet `startAsync`. Ruft `msg`, `slot`, `invalidateRestarts`.
```

- Fortsetzung von `FabricLauncherPlugin.requestRestart(String)`, Quellreihenfolge.
