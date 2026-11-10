[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleDef]] › [[ScheduleDef.Teil1]] › [[ScheduleDef.validateInterval]]

# ScheduleDef.validateInterval

`ScheduleDef.validateInterval(Interval interval, int intervalValue, int timeValue)` [src/main/java/de/aichele/childlauncher/ScheduleDef.java:147–154](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ScheduleDef.java#L147-L154)

```mermaid
flowchart TD
  n1["if Z.153 (!valid)"]
  n2["throw Z.153 throw new IllegalArgumentException('Ungültige Int…"]
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `validateInterval` in `src/main/java/de/aichele/childlauncher/ScheduleDef.java`
