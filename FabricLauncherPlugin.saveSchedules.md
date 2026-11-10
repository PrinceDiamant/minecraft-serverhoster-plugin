[[00 Start]] › [[Zeitplaene]] › [[Schedules]] › [[FabricLauncherPlugin.saveSchedules]]

# FabricLauncherPlugin.saveSchedules

`FabricLauncherPlugin.saveSchedules(List<ScheduleDef> schedules)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1300–1309](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1300-L1309)

```mermaid
flowchart TD
  n1["if Z.1301 (schedules.size() ) ScheduleDef.MAX_SCHEDULES)"]
  n2["throw Z.1302 throw new IllegalArgumentException('Zu viele Zeit…"]
  n3["if Z.1303 (schedules.stream().map(ScheduleDef::id).distinct…"]
  n4["throw Z.1304 throw new IllegalArgumentException('Schedule-IDs …"]
  n5["sync Z.1305"]
  n6["ScheduleDef.toConfig"]:::internal-link
  n7["FabricLauncherPlugin.saveConfigWritable"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n6 --> n7
  n5 --> n6
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `saveSchedules` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
