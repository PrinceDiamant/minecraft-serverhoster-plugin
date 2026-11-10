[[00 Start]] › [[Child-Prozess]] › [[Stopp]] › [[FabricLauncherPlugin.stopProcess]] › [[FabricLauncherPlugin.stopProcess.Z1994.Teil1]]

# FabricLauncherPlugin.stopProcess.Z1994.Teil1

```mermaid
flowchart TD
  n1["if Z.1997 (p == null)"]
  n2["return Z.1997 return true;"]
  n3["if Z.1998 (!p.isAlive())"]
  n4["try Z.1999"]
  n5["return Z.1999 return p.exitValue() == 0;"]
  n6["catch Z.2000 (IllegalThreadStateException …"]
  n7["return Z.2000 return false;"]
  n1 -->|"ja"| n2
  n4 --> n5
  n4 -->|"Fehler"| n6
  n6 --> n7
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.stopProcess.Z1994`, Quellreihenfolge.
