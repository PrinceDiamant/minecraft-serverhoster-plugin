[[00 Start]] › [[Plugin-Kern]] › [[Diagnose]]

# Diagnose

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.planText"]:::internal-link
  n2["FabricLauncherPlugin.jarView"]:::internal-link
  n3["FabricLauncherPlugin.jarText"]:::internal-link
  n4["FabricLauncherPlugin.crashFiles"]:::internal-link
  n5["FabricLauncherPlugin.crashText"]:::internal-link
  n6["FabricLauncherPlugin.msptHistory()"]:::internal-link
  n7["FabricLauncherPlugin.msptHistory(String)"]:::internal-link
  n8["FabricLauncherPlugin.diskCached"]:::internal-link
  n9["FabricLauncherPlugin.diagMap()"]:::internal-link
  n10["FabricLauncherPlugin.diagMap(String)"]:::internal-link
  n11["FabricLauncherPlugin.jcmd(String)"]:::internal-link
  n12["FabricLauncherPlugin.jcmd(String,String)"]:::internal-link
  n9 -->|"Zeile 879"| n10
  n10 -->|"Zeile 903"| n8
  n11 -->|"Zeile 1266"| n12
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n6 fill:#f88,stroke:#900
  style n7 fill:#f88,stroke:#900
```

```knoten
FabricLauncherPlugin.planText
  Schreibt den [[Glossar#Startplan|Startplan]] als lesbaren Text.
FabricLauncherPlugin.jarView
  Zeigt, welche [[Glossar#Programmdatei|Programmdatei]] der [[Glossar#Spielserver|Spielserver]] benutzt.
FabricLauncherPlugin.jarText
  Zeigt Einzelheiten aus der [[Glossar#Programmdatei|Programmdatei]].
FabricLauncherPlugin.crashFiles
  Listet die [[Glossar#Absturzbericht|Absturzberichte]].
FabricLauncherPlugin.crashText
  Zeigt den Text eines [[Glossar#Absturzbericht|Absturzberichts]].
FabricLauncherPlugin.msptHistory()
  Liefert den Verlauf, wie lange ein [[Glossar#Spielschritt|Spielschritt]] jeweils gedauert hat. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.msptHistory(String)
  Liefert den Verlauf, wie lange ein [[Glossar#Spielschritt|Spielschritt]] jeweils gedauert hat. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.diskCached
  Sagt, wie voll die Festplatte ist. Der Wert darf kurz zwischengespeichert sein.
FabricLauncherPlugin.diagMap()
  Sammelt die [[Glossar#Diagnose|Diagnose]] in einer Übersicht.
FabricLauncherPlugin.diagMap(String)
  Sammelt die [[Glossar#Diagnose|Diagnose]] in einer Übersicht.
FabricLauncherPlugin.jcmd(String)
  Fragt ein Hilfswerkzeug von Java, wie es dem laufenden Programm geht.
FabricLauncherPlugin.jcmd(String,String)
  Fragt ein Hilfswerkzeug von Java, wie es dem laufenden Programm geht.
```

> [!knoten] Was die Blöcke tun
> - **FabricLauncherPlugin.planText**: Schreibt den [[Glossar#Startplan|Startplan]] als lesbaren Text.
> - **FabricLauncherPlugin.jarView**: Zeigt, welche [[Glossar#Programmdatei|Programmdatei]] der [[Glossar#Spielserver|Spielserver]] benutzt.
> - **FabricLauncherPlugin.jarText**: Zeigt Einzelheiten aus der [[Glossar#Programmdatei|Programmdatei]].
> - **FabricLauncherPlugin.crashFiles**: Listet die [[Glossar#Absturzbericht|Absturzberichte]].
> - **FabricLauncherPlugin.crashText**: Zeigt den Text eines [[Glossar#Absturzbericht|Absturzberichts]].
> - **FabricLauncherPlugin.msptHistory()**: Liefert den Verlauf, wie lange ein [[Glossar#Spielschritt|Spielschritt]] jeweils gedauert hat. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.msptHistory(String)**: Liefert den Verlauf, wie lange ein [[Glossar#Spielschritt|Spielschritt]] jeweils gedauert hat. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.diskCached**: Sagt, wie voll die Festplatte ist. Der Wert darf kurz zwischengespeichert sein.
> - **FabricLauncherPlugin.diagMap()**: Sammelt die [[Glossar#Diagnose|Diagnose]] in einer Übersicht.
> - **FabricLauncherPlugin.diagMap(String)**: Sammelt die [[Glossar#Diagnose|Diagnose]] in einer Übersicht.
> - **FabricLauncherPlugin.jcmd(String)**: Fragt ein Hilfswerkzeug von Java, wie es dem laufenden Programm geht.
> - **FabricLauncherPlugin.jcmd(String,String)**: Fragt ein Hilfswerkzeug von Java, wie es dem laufenden Programm geht.

- Eine Übersicht zum Nachsehen: Platte, [[Glossar#Startplan|Startplan]], [[Glossar#Programmdatei|Programmdatei]], [[Glossar#Absturzbericht|Absturzberichte]] und die Dauer der [[Glossar#Spielschritt|Spielschritte]].
