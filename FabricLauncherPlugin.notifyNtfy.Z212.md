[[00 Start]] › [[Plugin-Kern]] › [[Benachrichtigung]] › [[FabricLauncherPlugin.notifyNtfy]] › [[FabricLauncherPlugin.notifyNtfy.Z212]]

# FabricLauncherPlugin.notifyNtfy.Z212

```mermaid
flowchart TD
  n1["try Z.212"]
  n2["FabricLauncherPlugin.notifyNtfy.Z212.Z213"]:::internal-link
  n3["catch Z.221 (RejectedExecutionException e)"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.212
  Zeile 212: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.notifyNtfy.Z212.Z213
  Fortsetzung des Ablaufs ab Zeile 213.
catch Z.221 (RejectedExecutionException e)
  Zeile 221: fängt (RejectedExecutionException e).
```

- Fortsetzung von `FabricLauncherPlugin.notifyNtfy`, Quellreihenfolge.
