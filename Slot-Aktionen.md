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
  n1 -->|"Zeile 316"| n2
  n2 -->|"Zeile 317"| n12
  n3 -->|"Zeile 318"| n6
  n4 -->|"Zeile 319"| n8
  n5 -->|"Zeile 320"| n9
  n10 -->|"Zeile 338"| n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
  style n5 fill:#f88,stroke:#900
```

```knoten
FabricLauncherPlugin.sendCommand(String)
  Schickt einen [[Glossar#Befehl|Befehl]] in die [[Glossar#Konsole|Konsole]] des [[Glossar#Spielserver|Spielservers]].
FabricLauncherPlugin.sendCommand(String,String)
  Schickt einen [[Glossar#Befehl|Befehl]] in die [[Glossar#Konsole|Konsole]] des [[Glossar#Spielserver|Spielservers]].
FabricLauncherPlugin.requestStart()
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu starten. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.requestStop()
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu stoppen. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.requestRestart()
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] neu zu starten. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.requestStart(String)
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu starten.
FabricLauncherPlugin.requestStart(CommandSender,String)
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu starten.
FabricLauncherPlugin.requestStop(String)
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu stoppen.
FabricLauncherPlugin.requestRestart(String)
  Bittet darum, den [[Glossar#Spielserver|Spielserver]] neu zu starten.
FabricLauncherPlugin.info(String)
  Schreibt eine Hinweiszeile in die [[Glossar#Konsole|Konsole]] des [[Glossar#Spielserver|Spielservers]].
FabricLauncherPlugin.info(String,String)
  Schreibt eine Hinweiszeile in die [[Glossar#Konsole|Konsole]] des [[Glossar#Spielserver|Spielservers]].
FabricLauncherPlugin.send
  Schickt Text an den laufenden [[Glossar#Spielserver|Spielserver]].
```

> [!knoten] Was die Blöcke tun
> - **FabricLauncherPlugin.sendCommand(String)**: Schickt einen [[Glossar#Befehl|Befehl]] in die [[Glossar#Konsole|Konsole]] des [[Glossar#Spielserver|Spielservers]].
> - **FabricLauncherPlugin.sendCommand(String,String)**: Schickt einen [[Glossar#Befehl|Befehl]] in die [[Glossar#Konsole|Konsole]] des [[Glossar#Spielserver|Spielservers]].
> - **FabricLauncherPlugin.requestStart()**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu starten. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.requestStop()**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu stoppen. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.requestRestart()**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] neu zu starten. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.requestStart(String)**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu starten.
> - **FabricLauncherPlugin.requestStart(CommandSender,String)**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu starten.
> - **FabricLauncherPlugin.requestStop(String)**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] zu stoppen.
> - **FabricLauncherPlugin.requestRestart(String)**: Bittet darum, den [[Glossar#Spielserver|Spielserver]] neu zu starten.
> - **FabricLauncherPlugin.info(String)**: Schreibt eine Hinweiszeile in die [[Glossar#Konsole|Konsole]] des [[Glossar#Spielserver|Spielservers]].
> - **FabricLauncherPlugin.info(String,String)**: Schreibt eine Hinweiszeile in die [[Glossar#Konsole|Konsole]] des [[Glossar#Spielserver|Spielservers]].
> - **FabricLauncherPlugin.send**: Schickt Text an den laufenden [[Glossar#Spielserver|Spielserver]].

- Dem laufenden [[Glossar#Spielserver|Spielserver]] einen [[Glossar#Befehl|Befehl]] schicken, oder ihn starten, stoppen und neu starten.
