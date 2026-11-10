[[00 Start]] › [[Child-Prozess]] › [[Neustart]] › [[FabricLauncherPlugin.scheduleRestart]]

# FabricLauncherPlugin.scheduleRestart

`FabricLauncherPlugin.scheduleRestart(ChildSlot slot)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1893–1963](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1893-L1963)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.scheduleRestart.Teil1"]:::internal-link
  n2["FabricLauncherPlugin.scheduleRestart.Teil2"]:::internal-link
  n3["FabricLauncherPlugin.scheduleRestart.Teil3"]:::internal-link
  n1 -->|"weiter"| n2
  n2 -->|"weiter"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.scheduleRestart.Teil1
  Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
FabricLauncherPlugin.scheduleRestart.Teil2
  Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
FabricLauncherPlugin.scheduleRestart.Teil3
  Abschnitt 3 dieses Ablaufs, in Quellreihenfolge.
```

```mermaid
sequenceDiagram
  participant Watch as Watch-Thread
  participant Pool as ServerhosterPlugin
  Watch->>Watch: delaySeconds(base, cap, attempts) Z.1927
  Note over Watch: base autoRestart.initialDelaySeconds Standard 5 s
  Note over Watch: cap autoRestart.maxDelaySeconds Standard 300 s
  Watch->>Pool: exec.submit Z.1935
  Pool->>Pool: Thread.sleep(delay * 1000 ms)
  Pool->>Pool: restartSingle
```

- `scheduleRestart` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
