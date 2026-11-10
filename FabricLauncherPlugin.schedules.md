[[00 Start]] › [[Zeitplaene]] › [[Schedules]] › [[FabricLauncherPlugin.schedules]]

# FabricLauncherPlugin.schedules

`FabricLauncherPlugin.schedules()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1292–1298](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1292-L1298)

```mermaid
flowchart TD
  n1["sync Z.1292"]
  n2["if Z.1294 (getConfig().contains('schedules') && !(getConfig…"]
  n3["throw Z.1295 throw new IllegalArgumentException('schedules mus…"]
  n4["ScheduleDef.load"]:::internal-link
  n5["return Z.1296 return ScheduleDef.load(getConfig().get…"]
  n2 -->|"ja"| n3
  n4 --> n5
  n3 --> n4
  n2 --> n4
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `schedules` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
