[[00 Start]] › [[Child-Prozess]] › [[Neustart]] › [[FabricLauncherPlugin.scheduleRestart]] › [[FabricLauncherPlugin.scheduleRestart.Teil2]]

# FabricLauncherPlugin.scheduleRestart.Teil2

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.scheduleRestart.Teil2.Z1916"]:::internal-link
  n2["if Z.1925 (!slot.restartQueued.compareAndSet(false, true))"]
  n3["return Z.1925 return;"]
  n4["Schritt Z.1927 long base = getConfig().getLong('autoRestart.init…"]
  n5["Schritt Z.1928 long cap = getConfig().getLong('autoRestart.maxDe…"]
  n6["RestartBackoff.delaySeconds"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.scheduleRestart`, Quellreihenfolge.
