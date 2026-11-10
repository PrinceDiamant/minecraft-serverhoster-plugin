[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]]

# Dashboard.handle

`Dashboard.handle(HttpExchange ex)` [src/main/java/de/aichele/childlauncher/Dashboard.java:102–281](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L102-L281)

```mermaid
flowchart TD
  n1["Dashboard.handle.Z103"]:::internal-link
  n2["Dashboard.handle.Aufrufe"]:::internal-link
  n1 -->|"weitere Aufrufe"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.handle.Z103
  Fortsetzung des Ablaufs ab Zeile 103.
Dashboard.handle.Aufrufe
  Eigene Aufrufe, die der Parser nicht in den gezeichneten Ablauf gesetzt hat.
```

- Ein HTTP-Kontext `/`, verzweigt nach Methode und Pfad.
- ungeprüft: Ablaufparser oder nachgetragene Aufrufe, siehe [[bericht]].
