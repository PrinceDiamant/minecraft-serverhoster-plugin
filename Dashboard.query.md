[[00 Start]] › [[Dashboard-HTTP]] › [[API-Antworten]] › [[Dashboard.query]]

# Dashboard.query

`Dashboard.query(HttpExchange ex)` [src/main/java/de/aichele/childlauncher/Dashboard.java:985–994](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L985-L994)

```mermaid
flowchart TD
  n1["if Z.988 (raw == null)"]
  n2["return Z.988 return m;"]
  n3["for Z.989 (String kv : raw.split('&'))"]
  n4["if Z.991 (i ) 0)"]
  n5["return Z.993 return m;"]
  n1 -->|"ja"| n2
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `query` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
