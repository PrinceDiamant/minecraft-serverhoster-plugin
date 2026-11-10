[[00 Start]] › [[Plugin-Kern]] › [[Slot-Aktionen]] › [[FabricLauncherPlugin.send]] › [[FabricLauncherPlugin.send.Z1975]]

# FabricLauncherPlugin.send.Z1975

```mermaid
flowchart TD
  n1["try Z.1975"]
  n2["sync Z.1975"]
  n3["return Z.1975 return true;"]
  n4["catch Z.1976 (IOException e)"]
  n5["return Z.1976 return false;"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.send`, Quellreihenfolge.
