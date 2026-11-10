[[00 Start]] › [[Child-Prozess]] › [[Neustart]] › [[FabricLauncherPlugin.scheduleRestart]] › [[FabricLauncherPlugin.scheduleRestart.Teil1]]

# FabricLauncherPlugin.scheduleRestart.Teil1

```mermaid
flowchart TD
  n1["if Z.1894 (shuttingDown)"]
  n2["return Z.1894 return;"]
  n3["if Z.1895 (!slot.wantRunning)"]
  n4["return Z.1897 return;"]
  n5["if Z.1899 (!getConfig().getBoolean('autoRestart.enabled', t…"]
  n6["return Z.1903 return;"]
  n7["FabricLauncherPlugin.scheduleRestart.Teil1.Z1906"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.scheduleRestart`, Quellreihenfolge.
