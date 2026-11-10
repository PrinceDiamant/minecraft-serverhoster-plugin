[[00 Start]] › [[Zeitplaene]] › [[Tasks]] › [[FabricLauncherPlugin.fireDueTasks]] › [[FabricLauncherPlugin.fireDueTasks.Z1499.Teil2]]

# FabricLauncherPlugin.fireDueTasks.Z1499.Teil2

```mermaid
flowchart TD
  n1["try Z.1506"]
  n2["CronExpr.matches"]:::internal-link
  n3["catch Z.1507 (RuntimeException e)"]
  n4["if Z.1508 (!due)"]
  n5["if Z.1510 (taskFired.putIfAbsent(mark, '1') != null)"]
  n6["if Z.1511 (taskFired.size() ) 500)"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n2 --> n4
  n3 --> n4
  n4 --> n5
  n4 --> n5
  n5 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.fireDueTasks.Z1499`, Quellreihenfolge.
