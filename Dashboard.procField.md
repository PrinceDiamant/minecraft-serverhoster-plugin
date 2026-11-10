[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.procField]]

# Dashboard.procField

`Dashboard.procField(long pid, String key)` [src/main/java/de/aichele/childlauncher/Dashboard.java:660–664](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L660-L664)

```mermaid
flowchart TD
  n1["try Z.661"]
  n2["for Z.661 (String l : Files.readAllLines(Paths.ge…"]
  n3["if Z.661 (l.startsWith(key))"]
  n4["return Z.661 return Long.parseLong(l.replaceAll('//D', ''));"]
  n5["catch Z.662 (Exception ignored)"]
  n6["return Z.663 return -1;"]
  n3 -->|"ja"| n4
  n2 -->|"wiederholen"| n3
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n3 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `procField` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
