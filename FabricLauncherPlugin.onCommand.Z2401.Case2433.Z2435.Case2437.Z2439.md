[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2433.Z2435.Case2437.Z2439]]

# FabricLauncherPlugin.onCommand.Z2401.Case2433.Z2435.Case2437.Z2439

```mermaid
flowchart TD
  n1["Schritt Z.2439 exec.submit(() -) ( try ( msg(s, String.valueOf(h…"]
  n2["try Z.2439"]
  n3["FabricLauncherPlugin.msg"]:::internal-link
  n4["FabricLauncherPlugin.hostMinimizeApply"]:::internal-link
  n5["catch Z.2439 (Exception e)"]
  n6["FabricLauncherPlugin.msg"]:::internal-link
  n3 -->|"Z.2439"| n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n5 --> n6
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401.Case2433.Z2435.Case2437`, Quellreihenfolge.
