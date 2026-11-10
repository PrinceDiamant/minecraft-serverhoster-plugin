[[00 Start]] › [[Child-Prozess]] › [[Neustart]]

# Neustart

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.scheduleRestart"]:::internal-link
  n2["FabricLauncherPlugin.restartSingle"]:::internal-link
  n1 -->|"Z.1949"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Backoff `autoRestart.initialDelaySeconds` Standard 5 s, Deckel `maxDelaySeconds` Standard 300 s.
