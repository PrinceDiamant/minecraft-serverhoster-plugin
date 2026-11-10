[[00 Start]] › [[Dashboard-HTTP]] › [[API-Spieler]] › [[Dashboard.players]]

# Dashboard.players

`Dashboard.players(HttpExchange ex, String sid)` [src/main/java/de/aichele/childlauncher/Dashboard.java:692–700](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L692-L700)

```mermaid
flowchart TD
  n1["for Z.694 (String n : List.of('whitelist', 'ops',…"]
  n2["FabricLauncherPlugin.workDir(String)"]:::internal-link
  n3["Dashboard.readPlayerNames"]:::internal-link
  n4["FabricLauncherPlugin.players(String)"]:::internal-link
  n5["Dashboard.json"]:::internal-link
  n2 --> n3
  n1 -->|"wiederholen"| n2
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `players` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
