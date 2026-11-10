[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Stopp]] › [[FabricLauncherPlugin.requestChildEmergencyStop]]

# FabricLauncherPlugin.requestChildEmergencyStop

`FabricLauncherPlugin.requestChildEmergencyStop(HostMemoryProbe.Snapshot snapshot)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1147–1201](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1147-L1201)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.requestChildEmergencyStop.Teil1"]:::internal-link
  n2["FabricLauncherPlugin.requestChildEmergencyStop.Teil2"]:::internal-link
  n3["FabricLauncherPlugin.requestChildEmergencyStop.Teil3"]:::internal-link
  n4["FabricLauncherPlugin.requestChildEmergencyStop.Teil4"]:::internal-link
  n1 -->|"weiter"| n2
  n2 -->|"weiter"| n3
  n3 -->|"weiter"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Stoppt den Child. Logtext sagt Emergency restart.
- Befund: Kommentar widerspricht Code, sicher. Z.1175 Emergency restart warning, Z.1197–1199 wantRunning=false und stopBlocking, kein Start
