[[00 Start]] › [[Plugin-Kern]] › [[Slot-Aktionen]]

# Slot-Aktionen

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.sendCommand(String)"]:::internal-link
  n2["FabricLauncherPlugin.sendCommand(String,String)"]:::internal-link
  n3["FabricLauncherPlugin.requestStart()"]:::internal-link
  n4["FabricLauncherPlugin.requestStop()"]:::internal-link
  n5["FabricLauncherPlugin.requestRestart()"]:::internal-link
  n6["FabricLauncherPlugin.requestStart(String)"]:::internal-link
  n7["FabricLauncherPlugin.requestStart(CommandSender,String)"]:::internal-link
  n8["FabricLauncherPlugin.requestStop(String)"]:::internal-link
  n9["FabricLauncherPlugin.requestRestart(String)"]:::internal-link
  n10["FabricLauncherPlugin.info(String)"]:::internal-link
  n11["FabricLauncherPlugin.info(String,String)"]:::internal-link
  n12["FabricLauncherPlugin.send"]:::internal-link
  n1 -->|"Z.316"| n2
  n2 -->|"Z.317"| n12
  n3 -->|"Z.318"| n6
  n4 -->|"Z.319"| n8
  n5 -->|"Z.320"| n9
  n10 -->|"Z.338"| n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
  style n5 fill:#f88,stroke:#900
```

```knoten
FabricLauncherPlugin.sendCommand(String)
  Sendet `sendCommand`. Ruft `sendCommand`.
FabricLauncherPlugin.sendCommand(String,String)
  Sendet `sendCommand`. Ruft `send`, `slot`.
FabricLauncherPlugin.requestStart()
  Fordert an `requestStart`. Ruft `requestStart`. Befund: toter Code (sicher).
FabricLauncherPlugin.requestStop()
  Fordert an `requestStop`. Ruft `requestStop`. Befund: toter Code (sicher).
FabricLauncherPlugin.requestRestart()
  Fordert an `requestRestart`. Ruft `requestRestart`. Befund: toter Code (sicher).
FabricLauncherPlugin.requestStart(String)
  Fordert an `requestStart`. Ruft `startAsync`.
FabricLauncherPlugin.requestStart(CommandSender,String)
  Fordert an `requestStart`. Ruft `startAsync`.
FabricLauncherPlugin.requestStop(String)
  Fordert an `requestStop`. Ruft `slot`, `stopBlocking`.
FabricLauncherPlugin.requestRestart(String)
  Fordert an `requestRestart`. Ruft `slot`, `stopBlocking`, `reloadProfiles`.
FabricLauncherPlugin.info(String)
  Schreibt eine Infozeile `info`. Ruft `info`.
FabricLauncherPlugin.info(String,String)
  Schreibt eine Infozeile `info`. Ruft `slot`.
FabricLauncherPlugin.send
  Sendet `send`. Ruft `running`.
```


