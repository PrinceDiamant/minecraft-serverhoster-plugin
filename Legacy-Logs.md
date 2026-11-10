[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Logs]]

# Legacy-Logs

```mermaid
flowchart TD
  n1["index.loadLogs"]:::internal-link
  n2["index.loadLog"]:::internal-link
  n3["index.renderLog"]:::internal-link
  n1 -->|"Z.151"| n2
  n2 -->|"Z.154"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.loadLogs
  Lädt `loadLogs`. Ruft `api`, `$`, `esc`.
index.loadLog
  Lädt `loadLog`. Ruft `$`, `api`, `renderLog`.
index.renderLog
  Zeichnet `renderLog`. Ruft `$`, `cls`.
```


