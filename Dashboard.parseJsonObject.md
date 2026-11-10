[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.parseJsonObject]]

# Dashboard.parseJsonObject

`Dashboard.parseJsonObject(String json)` [src/main/java/de/aichele/childlauncher/Dashboard.java:447–455](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L447-L455)

```mermaid
flowchart TD
  n1["try Z.448"]
  n2["if Z.450 (value.isJsonObject())"]
  n3["return Z.450 return value.getAsJsonObject();"]
  n4["catch Z.451 (JsonParseException / Illegal…"]
  n5["throw Z.452 throw new IllegalArgumentException('Ungültiger JS…"]
  n6["throw Z.454 throw new IllegalArgumentException('JSON-Objekt e…"]
  n2 -->|"ja"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  n3 --> n6
  n2 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `parseJsonObject` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
