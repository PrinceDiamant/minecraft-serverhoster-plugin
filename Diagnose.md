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
  n9 -->|"Z.879"| n10
  n10 -->|"Z.903"| n8
  n11 -->|"Z.1266"| n12
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n6 fill:#f88,stroke:#900
  style n7 fill:#f88,stroke:#900
```

```knoten
FabricLauncherPlugin.planText
  Zeigt den Startplan `planText`. Ruft `text`, `javaBin`, `profile`.
FabricLauncherPlugin.jarView
  Betrifft das Jar `jarView`. Ruft `view`, `inspect`, `profile`.
FabricLauncherPlugin.jarText
  Betrifft das Jar `jarText`. Ruft `text`, `inspect`, `profile`.
FabricLauncherPlugin.crashFiles
  Betrifft Crash-Reports `crashFiles`. Ruft `list`, `profile`, `directory`.
FabricLauncherPlugin.crashText
  Betrifft Crash-Reports `crashText`. Ruft `read`, `profile`, `directory`.
FabricLauncherPlugin.msptHistory()
  Liefert die Tickzeiten `msptHistory`. Ruft `focusSlot`, `msptHistory`. Befund: toter Code (prüfen).
FabricLauncherPlugin.msptHistory(String)
  Liefert die Tickzeiten `msptHistory`. Ruft `slot`, `msptHistory`. Befund: toter Code (prüfen).
FabricLauncherPlugin.diskCached
  Liest die Platte `diskCached`. Ruft `disk`, `workDir`.
FabricLauncherPlugin.diagMap()
  Sammelt die Diagnose `diagMap`. Ruft `diagMap`.
FabricLauncherPlugin.diagMap(String)
  Sammelt die Diagnose `diagMap`. Ruft `slot`, `pid`, `running`.
FabricLauncherPlugin.jcmd(String)
  `jcmd` in `FabricLauncherPlugin.java`. Ruft `jcmd`.
FabricLauncherPlugin.jcmd(String,String)
  `jcmd` in `FabricLauncherPlugin.java`. Ruft `jcmd`, `slot`, `pid`.
```


