[[00 Start]] › [[Child-Prozess]] › [[Neustart]] › [[FabricLauncherPlugin.scheduleRestart]] › [[FabricLauncherPlugin.scheduleRestart.Teil2.Z1916]]

# FabricLauncherPlugin.scheduleRestart.Teil2.Z1916

```mermaid
flowchart TD
  n1["if Z.1916 (!RestartPolicy.mayRetry(slot.attempts, max))"]
  n2["RestartPolicy.mayRetry"]:::internal-link
  n3["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n4["return Z.1923 return;"]
  n1 -->|"Z.1916"| n2
  n3 --> n4
  n2 -->|"ja"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1916 (!RestartPolicy.mayRetry(slot.attempts, max))
  Zeile 1916: prüft `(!RestartPolicy.mayRetry(slot.attempts, max))`.
RestartPolicy.mayRetry
  `mayRetry` in `RestartPolicy.java`.
FabricLauncherPlugin.notifyNtfy
  Meldet `notifyNtfy`. Ruft `ntfySettings`, `backupCredentials`, `send`.
return Z.1923 return;
  Zeile 1923: Rückgabe `return;`.
```

- Fortsetzung von `FabricLauncherPlugin.scheduleRestart.Teil2`, Quellreihenfolge.
