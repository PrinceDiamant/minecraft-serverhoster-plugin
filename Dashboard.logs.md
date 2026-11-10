[[00 Start]] › [[Dashboard-HTTP]] › [[API-Dateien]] › [[Dashboard.logs]]

# Dashboard.logs

`Dashboard.logs(HttpExchange ex, Map<String, String> q, String sid)` [src/main/java/de/aichele/childlauncher/Dashboard.java:918–925](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L918-L925)

```mermaid
flowchart TD
  n1["if Z.920 (name.contains('/') // name.contains('//') // nam…"]
  n2["throw Z.920 throw new SecurityException('Pfad außerhalb des S…"]
  n3["Dashboard.parseInt"]:::internal-link
  n4["Dashboard.parseInt"]:::internal-link
  n5["LogQuery.query"]:::internal-link
  n6["Dashboard.safe"]:::internal-link
  n7["Dashboard.json"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n5 -->|"Z.923"| n6
  n4 --> n5
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `logs` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
