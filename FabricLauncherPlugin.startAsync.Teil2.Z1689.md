[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.startAsync]] › [[FabricLauncherPlugin.startAsync.Teil2.Z1689]]

# FabricLauncherPlugin.startAsync.Teil2.Z1689

```mermaid
flowchart TD
  n1["try Z.1689"]
  n2["FabricLauncherPlugin.startAsync.Teil2.Z1689.Z1690"]:::internal-link
  n3["catch Z.1704 (RejectedExecutionException e)"]
  n4["FabricLauncherPlugin.msg"]:::internal-link
  n1 --> n2
  n1 -->|"Fehler"| n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.1689
  Zeile 1689: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.startAsync.Teil2.Z1689.Z1690
  Fortsetzung des Ablaufs ab Zeile 1690.
catch Z.1704 (RejectedExecutionException e)
  Zeile 1704: fängt (RejectedExecutionException e).
FabricLauncherPlugin.msg
  Sendet eine Chat-Zeile `msg`.
```

- Fortsetzung von `FabricLauncherPlugin.startAsync.Teil2`, Quellreihenfolge.
