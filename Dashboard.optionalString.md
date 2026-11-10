[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.optionalString]]

# Dashboard.optionalString

`Dashboard.optionalString(JsonObject request, String key, String fallback)` [src/main/java/de/aichele/childlauncher/Dashboard.java:590–595](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L590-L595)

```mermaid
flowchart TD
  n1["if Z.591 (!request.has(key))"]
  n2["return Z.591 return fallback;"]
  n3["if Z.592 (!request.get(key).isJsonPrimitive() // !request.…"]
  n4["throw Z.593 throw new IllegalArgumentException(key + ' muss T…"]
  n5["return Z.594 return request.get(key).getAsString();"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `optionalString` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
