[[00 Start]] › [[Dashboard-HTTP]] › [[API-Spieler]] › [[Dashboard.readPlayerNames]]

# Dashboard.readPlayerNames

`Dashboard.readPlayerNames(Path file)` [src/main/java/de/aichele/childlauncher/Dashboard.java:702–719](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L702-L719)

```mermaid
flowchart TD
  n1["if Z.703 (Files.notExists(file))"]
  n2["return Z.703 return List.of();"]
  n3["Dashboard.readPlayerNames.Z704"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `readPlayerNames` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
