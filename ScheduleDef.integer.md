[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleDef]] › [[ScheduleDef.Teil2]] › [[ScheduleDef.integer]]

# ScheduleDef.integer

`ScheduleDef.integer(Map<?, ?> map, String key)` [src/main/java/de/aichele/childlauncher/ScheduleDef.java:176–192](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ScheduleDef.java#L176-L192)

```mermaid
flowchart TD
  n1["if Z.178 (value instanceof Number number)"]
  n2["if Z.180 (numeric != Math.rint(numeric) // numeric ( Integ…"]
  n3["throw Z.181 throw new IllegalArgumentException('Ungültige Zah…"]
  n4["return Z.182 return number.intValue();"]
  n5["if Z.184 (value instanceof String text)"]
  n6["try Z.185"]
  n7["return Z.186 return Integer.parseInt(text);"]
  n8["catch Z.187 (NumberFormatException e)"]
  n9["throw Z.188 throw new IllegalArgumentException('Ungültige Zah…"]
  n10["throw Z.191 throw new IllegalArgumentException('Zahl fehlt: '…"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"ja"| n2
  n6 --> n7
  n6 -->|"Fehler"| n8
  n8 --> n9
  n5 -->|"ja"| n6
  n4 --> n5
  n1 --> n5
  n7 --> n10
  n9 --> n10
  n5 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `integer` in `src/main/java/de/aichele/childlauncher/ScheduleDef.java`
