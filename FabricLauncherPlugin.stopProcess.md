[[00 Start]] › [[Child-Prozess]] › [[Stopp]] › [[FabricLauncherPlugin.stopProcess]]

# FabricLauncherPlugin.stopProcess

`FabricLauncherPlugin.stopProcess(ChildSlot slot, long timeout, boolean useStdout)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1994–2019](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1994-L2019)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.stopProcess.Z1994"]:::internal-link
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.stopProcess.Z1994
  Fortsetzung des Ablaufs ab Zeile 1994.
```

```mermaid
sequenceDiagram
  participant Caller
  participant Seq as ChildStopSequence.stop
  Caller->>Seq: startupStopTimeoutSeconds Standard 180 s, Z.2005
  Caller->>Seq: stopTimeoutSeconds Standard 60 s, Z.2009
  Note over Seq: Poll 250 ms, Stop erneut 5000 ms, TERM-Gnade 10 s, Z.2011
```

- `stopProcess` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
