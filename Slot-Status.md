[[00 Start]] › [[Plugin-Kern]] › [[Slot-Status]]

# Slot-Status

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.running()"]:::internal-link
  n2["FabricLauncherPlugin.running(String)"]:::internal-link
  n3["FabricLauncherPlugin.pid()"]:::internal-link
  n4["FabricLauncherPlugin.pid(String)"]:::internal-link
  n5["FabricLauncherPlugin.uptimeMillis()"]:::internal-link
  n6["FabricLauncherPlugin.uptimeMillis(String)"]:::internal-link
  n7["FabricLauncherPlugin.lastStatus()"]:::internal-link
  n8["FabricLauncherPlugin.lastStatus(String)"]:::internal-link
  n9["FabricLauncherPlugin.console()"]:::internal-link
  n10["FabricLauncherPlugin.console(String)"]:::internal-link
  n11["FabricLauncherPlugin.players()"]:::internal-link
  n12["FabricLauncherPlugin.players(String)"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  n6 -->|"Quelltext"| n7
  n7 -->|"Quelltext"| n8
  n8 -->|"Quelltext"| n9
  n9 -->|"Quelltext"| n10
  n10 -->|"Quelltext"| n11
  n11 -->|"Quelltext"| n12
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n1 fill:#f88,stroke:#900
  style n2 fill:#f88,stroke:#900
  style n3 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
  style n5 fill:#f88,stroke:#900
  style n6 fill:#f88,stroke:#900
  style n7 fill:#f88,stroke:#900
  style n8 fill:#f88,stroke:#900
  style n9 fill:#f88,stroke:#900
  style n11 fill:#f88,stroke:#900
```

```knoten
FabricLauncherPlugin.running()
  Sagt, ob der Prozess läuft `running`. Ruft `focusSlot`, `running`. Befund: toter Code (prüfen).
FabricLauncherPlugin.running(String)
  Sagt, ob der Prozess läuft `running`. Ruft `slot`, `running`. Befund: toter Code (prüfen).
FabricLauncherPlugin.pid()
  Liefert die Prozessnummer `pid`. Ruft `focusSlot`, `pid`. Befund: toter Code (prüfen).
FabricLauncherPlugin.pid(String)
  Liefert die Prozessnummer `pid`. Ruft `slot`, `pid`. Befund: toter Code (prüfen).
FabricLauncherPlugin.uptimeMillis()
  Liefert die Laufzeit `uptimeMillis`. Ruft `focusSlot`, `uptimeMillis`. Befund: toter Code (sicher).
FabricLauncherPlugin.uptimeMillis(String)
  Liefert die Laufzeit `uptimeMillis`. Ruft `slot`, `uptimeMillis`. Befund: toter Code (sicher).
FabricLauncherPlugin.lastStatus()
  `lastStatus` in `FabricLauncherPlugin.java`. Ruft `focusSlot`. Befund: toter Code (sicher).
FabricLauncherPlugin.lastStatus(String)
  `lastStatus` in `FabricLauncherPlugin.java`. Ruft `slot`. Befund: toter Code (sicher).
FabricLauncherPlugin.console()
  Liefert die Konsole `console`. Ruft `focusSlot`. Befund: toter Code (prüfen).
FabricLauncherPlugin.console(String)
  Liefert die Konsole `console`. Ruft `slot`.
FabricLauncherPlugin.players()
  Liefert die Spieler `players`. Ruft `focusSlot`. Befund: toter Code (prüfen).
FabricLauncherPlugin.players(String)
  Liefert die Spieler `players`. Ruft `slot`.
```


