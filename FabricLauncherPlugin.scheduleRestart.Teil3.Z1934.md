[[00 Start]] › [[Child-Prozess]] › [[Neustart]] › [[FabricLauncherPlugin.scheduleRestart]] › [[FabricLauncherPlugin.scheduleRestart.Teil3.Z1934]]

# FabricLauncherPlugin.scheduleRestart.Teil3.Z1934

```mermaid
flowchart TD
  n1["try Z.1934"]
  n2["FabricLauncherPlugin.scheduleRestart.Teil3.Z1934.Z1935"]:::internal-link
  n3["catch Z.1959 (RejectedExecutionException e)"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.1934
  Zeile 1934: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.scheduleRestart.Teil3.Z1934.Z1935
  Fortsetzung des Ablaufs ab Zeile 1935.
catch Z.1959 (RejectedExecutionException e)
  Zeile 1959: fängt (RejectedExecutionException e).
```

- Fortsetzung von `FabricLauncherPlugin.scheduleRestart.Teil3`, Quellreihenfolge.
