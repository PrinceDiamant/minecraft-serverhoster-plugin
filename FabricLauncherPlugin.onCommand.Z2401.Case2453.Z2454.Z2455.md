[[00 Start]] › [[Plugin-Kern]] › [[Befehle]] › [[FabricLauncherPlugin.onCommand]] › [[FabricLauncherPlugin.onCommand.Z2401.Case2453.Z2454.Z2455]]

# FabricLauncherPlugin.onCommand.Z2401.Case2453.Z2454.Z2455

```mermaid
flowchart TD
  n1["if Z.2455 (a.length ( 2)"]
  n2["FabricLauncherPlugin.crashFiles"]:::internal-link
  n3["if Z.2457 (files.isEmpty())"]
  n4["for Z.2458 (String f : files)"]
  n5["FabricLauncherPlugin.crashText"]:::internal-link
  n6["for Z.2463 (int i = 0; i ( n; i++)"]
  n7["if Z.2464 (lines.length ) n)"]
  n2 --> n3
  n3 --> n4
  n3 --> n4
  n5 --> n6
  n6 --> n7
  n1 -->|"ja"| n2
  n1 -->|"nein"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.onCommand.Z2401.Case2453.Z2454`, Quellreihenfolge.
