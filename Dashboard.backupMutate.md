[[00 Start]] › [[Dashboard-HTTP]] › [[API-Backup]] › [[Dashboard.backupMutate]]

# Dashboard.backupMutate

`Dashboard.backupMutate(HttpExchange ex, String sid, boolean restore)` [src/main/java/de/aichele/childlauncher/Dashboard.java:621–635](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L621-L635)

```mermaid
flowchart TD
  n1["Dashboard.readBodyText"]:::internal-link
  n2["if Z.625 (!name.equals(confirm))"]
  n3["Dashboard.json"]:::internal-link
  n4["return Z.625 return;"]
  n5["Dashboard.backupMutate.Z626"]:::internal-link
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n4 --> n5
  n2 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `backupMutate` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
