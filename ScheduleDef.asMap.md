[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleDef]] › [[ScheduleDef.Teil2]] › [[ScheduleDef.asMap]]

# ScheduleDef.asMap

`ScheduleDef.asMap(Object value)` [src/main/java/de/aichele/childlauncher/ScheduleDef.java:156–160](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ScheduleDef.java#L156-L160)

```mermaid
flowchart TD
  n1["if Z.157 (value instanceof Map(?, ?) map)"]
  n2["return Z.157 return map;"]
  n3["if Z.158 (value instanceof ConfigurationSection section)"]
  n4["return Z.158 return section.getValues(false);"]
  n5["return Z.159 return null;"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `asMap` in `src/main/java/de/aichele/childlauncher/ScheduleDef.java`
