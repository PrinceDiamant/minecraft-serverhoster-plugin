[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.watch]] › [[FabricLauncherPlugin.watch.Teil3]]

# FabricLauncherPlugin.watch.Teil3

```mermaid
flowchart TD
  n1["if Z.1890 (slot.wantRunning && !shuttingDown && slot.schedu…"]
  n2["FabricLauncherPlugin.scheduleRestart"]:::internal-link
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.watch`, Quellreihenfolge.
