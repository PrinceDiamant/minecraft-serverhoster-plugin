[[00 Start]] › [[Plugin-Kern]] › [[Befehle]]

# Befehle

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.onCommand"]:::internal-link
  n2["FabricLauncherPlugin.onTabComplete"]:::internal-link
  n3["FabricLauncherPlugin.msg"]:::internal-link
  n1 -->|"Zeile 2403"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.onCommand
  Nimmt den [[Glossar#Befehl|Befehl]] /child entgegen, zum Beispiel Start, [[Glossar#Stopp|Stopp]], Status oder [[Glossar#Sicherungskopie|Sicherungskopie]].
FabricLauncherPlugin.onTabComplete
  Schlägt die nächsten Wörter vor, während jemand /child tippt.
FabricLauncherPlugin.msg
  Schickt eine [[Glossar#Zeile|Zeile]] an den Menschen, der einen [[Glossar#Befehl|Befehl]] getippt hat.
```

> [!knoten] Was die Blöcke tun
> - **FabricLauncherPlugin.onCommand**: Nimmt den [[Glossar#Befehl|Befehl]] /child entgegen, zum Beispiel Start, [[Glossar#Stopp|Stopp]], Status oder [[Glossar#Sicherungskopie|Sicherungskopie]].
> - **FabricLauncherPlugin.onTabComplete**: Schlägt die nächsten Wörter vor, während jemand /child tippt.
> - **FabricLauncherPlugin.msg**: Schickt eine [[Glossar#Zeile|Zeile]] an den Menschen, der einen [[Glossar#Befehl|Befehl]] getippt hat.

- Der [[Glossar#Befehl|Befehl]] /child. Damit startet, stoppt oder prüft man den [[Glossar#Spielserver|Spielserver]]. Nur jemand mit Operator-Recht darf das.
