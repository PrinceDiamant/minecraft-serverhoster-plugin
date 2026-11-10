[[00 Start]] › [[Child-Prozess]] › [[Neustart]] › [[FabricLauncherPlugin.scheduleRestart]] › [[FabricLauncherPlugin.scheduleRestart.Teil1.Z1906]]

# FabricLauncherPlugin.scheduleRestart.Teil1.Z1906

```mermaid
flowchart TD
  n1["try Z.1906"]
  n2["RestartPolicy.maxAttempts"]:::internal-link
  n3["catch Z.1909 (IllegalArgumentException e)"]
  n4["return Z.1914 return;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.scheduleRestart.Teil1`, Quellreihenfolge.
