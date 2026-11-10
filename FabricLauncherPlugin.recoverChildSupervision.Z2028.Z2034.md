[[00 Start]] › [[Child-Prozess]] › [[Pipe-Watch]] › [[FabricLauncherPlugin.recoverChildSupervision]] › [[FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034]]

# FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034

```mermaid
flowchart TD
  n1["switch Z.2034 (action)"]
  n2["case Z.2035 REATTACH_WATCH"]
  n3["FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034.Case2035"]:::internal-link
  n4["case Z.2039 REATTACH_PIPE"]
  n5["FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034.Case2039"]:::internal-link
  n6["case Z.2043 REATTACH_BOTH"]
  n7["FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034.Case2043"]:::internal-link
  n8["case Z.2048 SCHEDULE_RESTART"]
  n9["FabricLauncherPlugin.recoverChildSupervision.Z2028.Z2034.Case2048"]:::internal-link
  n10["case Z.2052 NONE"]
  n1 --> n2
  n2 --> n3
  n1 --> n4
  n4 --> n5
  n1 --> n6
  n6 --> n7
  n1 --> n8
  n8 --> n9
  n1 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.recoverChildSupervision.Z2028`, Quellreihenfolge.
