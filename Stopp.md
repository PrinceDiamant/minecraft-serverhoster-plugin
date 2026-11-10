[[00 Start]] › [[Child-Prozess]] › [[Stopp]]

# Stopp

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.stopBlocking"]:::internal-link
  n2["FabricLauncherPlugin.stopProcess"]:::internal-link
  n3["FabricLauncherPlugin.invalidateRestarts"]:::internal-link
  n1 -->|"Z.1981"| n3
  n1 -->|"Z.1987"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `ChildStopSequence.stop`: Poll 250 ms, Stop erneut alle 5 s, TERM-Gnade 10 s.
