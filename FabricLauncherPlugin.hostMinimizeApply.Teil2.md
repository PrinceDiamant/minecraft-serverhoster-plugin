[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.hostMinimizeApply]] › [[FabricLauncherPlugin.hostMinimizeApply.Teil2]]

# FabricLauncherPlugin.hostMinimizeApply.Teil2

```mermaid
flowchart TD
  n1["HostMinimize.newLobbyName()"]:::internal-link
  n2["HostMinimize.apply"]:::internal-link
  n3["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n4["HostHeapTune.apply"]:::internal-link
  n5["HostHeapTune.hotspot"]:::internal-link
  n6["FabricLauncherPlugin.hostMinimizeApply.Teil2.Z2292"]:::internal-link
  n7["FabricLauncherPlugin.hostMinimizeApply.Teil2.Z2302"]:::internal-link
  n2 -->|"Z.2290"| n3
  n1 --> n2
  n4 -->|"Z.2291"| n5
  n3 --> n4
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostMinimize.newLobbyName()
  `newLobbyName` in `HostMinimize.java`.
HostMinimize.apply
  Wendet an `apply`. Ruft `assertRoot`, `assertEditable`, `update`.
FabricLauncherPlugin.getWorldRoot
  Liefert `getWorldRoot`.
HostHeapTune.apply
  Wendet an `apply`.
HostHeapTune.hotspot
  `hotspot` in `HostHeapTune.java`. Ruft `manageable`, `get`, `set`.
FabricLauncherPlugin.hostMinimizeApply.Teil2.Z2292
  Fortsetzung des Ablaufs ab Zeile 2292.
FabricLauncherPlugin.hostMinimizeApply.Teil2.Z2302
  Fortsetzung des Ablaufs ab Zeile 2302.
```

- Fortsetzung von `FabricLauncherPlugin.hostMinimizeApply`, Quellreihenfolge.
