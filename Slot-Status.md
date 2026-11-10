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
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  n5 -->|"Kapitel im Text"| n6
  n6 -->|"Kapitel im Text"| n7
  n7 -->|"Kapitel im Text"| n8
  n8 -->|"Kapitel im Text"| n9
  n9 -->|"Kapitel im Text"| n10
  n10 -->|"Kapitel im Text"| n11
  n11 -->|"Kapitel im Text"| n12
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
  Sagt, ob der [[Glossar#Spielserver|Spielserver]] gerade läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.running(String)
  Sagt, ob der [[Glossar#Spielserver|Spielserver]] gerade läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.pid()
  Liefert die Programmnummer des [[Glossar#Spielserver|Spielservers]]. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.pid(String)
  Liefert die Programmnummer des [[Glossar#Spielserver|Spielservers]]. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.uptimeMillis()
  Sagt, wie lange der [[Glossar#Spielserver|Spielserver]] schon läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.uptimeMillis(String)
  Sagt, wie lange der [[Glossar#Spielserver|Spielserver]] schon läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.lastStatus()
  Der letzte kurze Zustandstext, zum Beispiel startet oder läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.lastStatus(String)
  Der letzte kurze Zustandstext, zum Beispiel startet oder läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.console()
  Liefert die letzten [[Glossar#Zeile|Zeilen]] der [[Glossar#Konsole|Konsole]]. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.console(String)
  Liefert die letzten [[Glossar#Zeile|Zeilen]] der [[Glossar#Konsole|Konsole]].
FabricLauncherPlugin.players()
  Liefert die [[Glossar#Spieler|Spieler]], die gerade online sind. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.players(String)
  Liefert die [[Glossar#Spieler|Spieler]], die gerade online sind.
```

> [!knoten] Was die Blöcke tun
> - **FabricLauncherPlugin.running()**: Sagt, ob der [[Glossar#Spielserver|Spielserver]] gerade läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.running(String)**: Sagt, ob der [[Glossar#Spielserver|Spielserver]] gerade läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.pid()**: Liefert die Programmnummer des [[Glossar#Spielserver|Spielservers]]. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.pid(String)**: Liefert die Programmnummer des [[Glossar#Spielserver|Spielservers]]. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.uptimeMillis()**: Sagt, wie lange der [[Glossar#Spielserver|Spielserver]] schon läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.uptimeMillis(String)**: Sagt, wie lange der [[Glossar#Spielserver|Spielserver]] schon läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.lastStatus()**: Der letzte kurze Zustandstext, zum Beispiel startet oder läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.lastStatus(String)**: Der letzte kurze Zustandstext, zum Beispiel startet oder läuft. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.console()**: Liefert die letzten [[Glossar#Zeile|Zeilen]] der [[Glossar#Konsole|Konsole]]. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.console(String)**: Liefert die letzten [[Glossar#Zeile|Zeilen]] der [[Glossar#Konsole|Konsole]].
> - **FabricLauncherPlugin.players()**: Liefert die [[Glossar#Spieler|Spieler]], die gerade online sind. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.players(String)**: Liefert die [[Glossar#Spieler|Spieler]], die gerade online sind.

- Ob der [[Glossar#Spielserver|Spielserver]] läuft, welche Programmnummer er hat, wie lange schon, was die [[Glossar#Konsole|Konsole]] zuletzt sagte, und wer spielt.
