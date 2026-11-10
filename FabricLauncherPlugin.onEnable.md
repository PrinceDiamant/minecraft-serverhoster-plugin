[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]]

# FabricLauncherPlugin.onEnable

`FabricLauncherPlugin.onEnable()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:96–180](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L96-L180)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.onEnable.Teil1"]:::internal-link
  n2["FabricLauncherPlugin.onEnable.Teil2"]:::internal-link
  n3["FabricLauncherPlugin.onEnable.Teil3"]:::internal-link
  n4["FabricLauncherPlugin.onEnable.Teil4"]:::internal-link
  n5["FabricLauncherPlugin.onEnable.Teil5"]:::internal-link
  n6["FabricLauncherPlugin.onEnable.Teil6"]:::internal-link
  n1 -->|"weiter"| n2
  n2 -->|"weiter"| n3
  n3 -->|"weiter"| n4
  n4 -->|"weiter"| n5
  n5 -->|"weiter"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.onEnable.Teil1
  Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
FabricLauncherPlugin.onEnable.Teil2
  Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
FabricLauncherPlugin.onEnable.Teil3
  Abschnitt 3 dieses Ablaufs, in Quellreihenfolge.
FabricLauncherPlugin.onEnable.Teil4
  Abschnitt 4 dieses Ablaufs, in Quellreihenfolge.
FabricLauncherPlugin.onEnable.Teil5
  Abschnitt 5 dieses Ablaufs, in Quellreihenfolge.
FabricLauncherPlugin.onEnable.Teil6
  Abschnitt 6 dieses Ablaufs, in Quellreihenfolge.
```

```mermaid
sequenceDiagram
  participant Main as Main-Thread
  participant Save as ServerhosterPlugin-Save
  participant Mem as ServerhosterPlugin-Memory
  participant Sup as ServerhosterPlugin-Supervisor
  participant Hook as ShutdownHook
  Main->>Save: save-all alle saveAllIntervalMinutes, Standard 5 min, Z.149
  Main->>Save: fireDueTasks 20 s / 20 s, Z.151
  Main->>Save: fireDueSchedules 20 s / 20 s, Z.152
  Main->>Mem: sampleHostMemory max(15, sampleIntervalSeconds) s, Code-Standard 30, Z.153
  Main->>Sup: recoverChildSupervision 5 s / 5 s, Z.158
  Note over Hook: shutdownHookTimeoutSeconds Standard 25 s, Z.135
```

- Spigot `onEnable`: Profile, Sampler, Dashboard, fünf Scheduler.
- Befund: Logikrisiko, sicher. Z.153 Fallback 30 s, writeMemoryIncidentReport Z.1223 Fallback 15 s, config.yml:38 ist 15
