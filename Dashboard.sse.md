[[00 Start]] › [[Dashboard-HTTP]] › [[API-Status]] › [[Dashboard.sse]]

# Dashboard.sse

`Dashboard.sse(HttpExchange ex, String sid)` [src/main/java/de/aichele/childlauncher/Dashboard.java:722–746](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L722-L746)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.console(String)"]:::internal-link
  n2["ConsoleBuffer.subscribe"]:::internal-link
  n3["Dashboard.sse.Z729"]:::internal-link
  n1 -->|"Z.728"| n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```mermaid
sequenceDiagram
  participant HTTP as ServerhosterPlugin-Web
  participant Q as Queue
  HTTP->>Q: poll 15 s, Z.734
  Note over Q: Kapazitaet 5000, Batch im Code danach
```

- `sse` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
