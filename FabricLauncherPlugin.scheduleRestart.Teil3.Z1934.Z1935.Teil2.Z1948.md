[[00 Start]] › [[Child-Prozess]] › [[Neustart]] › [[FabricLauncherPlugin.scheduleRestart]] › [[FabricLauncherPlugin.scheduleRestart.Teil3.Z1934.Z1935.Teil2.Z1948]]

# FabricLauncherPlugin.scheduleRestart.Teil3.Z1934.Z1935.Teil2.Z1948

```mermaid
flowchart TD
  n1["try Z.1948"]
  n2["FabricLauncherPlugin.restartSingle"]:::internal-link
  n3["catch Z.1950 (Exception e)"]
  n4["StartFailureStatus.text"]:::internal-link
  n5["finally Z.1948"]
  n6["if Z.1955 (slot.scheduleToken.get() == token)"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n3 --> n4
  n2 --> n5
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.scheduleRestart.Teil3.Z1934.Z1935.Teil2`, Quellreihenfolge.
