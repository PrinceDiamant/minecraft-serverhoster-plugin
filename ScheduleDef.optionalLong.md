[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleDef]] › [[ScheduleDef.Teil2]] › [[ScheduleDef.optionalLong]]

# ScheduleDef.optionalLong

`ScheduleDef.optionalLong(Map<?, ?> map, String key, long fallback)` [src/main/java/de/aichele/childlauncher/ScheduleDef.java:194–212](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ScheduleDef.java#L194-L212)

```mermaid
flowchart TD
  n1["if Z.196 (value == null)"]
  n2["return Z.196 return fallback;"]
  n3["if Z.197 (value instanceof Number number)"]
  n4["try Z.198"]
  n5["return Z.199 return new BigDecimal(number.toString()).longValu…"]
  n6["catch Z.200 (ArithmeticException / Number…"]
  n7["throw Z.201 throw new IllegalArgumentException('Ungültige Zah…"]
  n8["if Z.204 (value instanceof String text)"]
  n9["try Z.205"]
  n10["return Z.206 return Long.parseLong(text);"]
  n11["catch Z.207 (NumberFormatException e)"]
  n12["throw Z.208 throw new IllegalArgumentException('Ungültige Zah…"]
  n13["throw Z.211 throw new IllegalArgumentException('Ungültige Zah…"]
  n1 -->|"ja"| n2
  n4 --> n5
  n4 -->|"Fehler"| n6
  n6 --> n7
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n9 --> n10
  n9 -->|"Fehler"| n11
  n11 --> n12
  n8 -->|"ja"| n9
  n5 --> n8
  n7 --> n8
  n3 --> n8
  n10 --> n13
  n12 --> n13
  n8 --> n13
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `optionalLong` in `src/main/java/de/aichele/childlauncher/ScheduleDef.java`
