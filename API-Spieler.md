[[00 Start]] › [[Dashboard-HTTP]] › [[API-Spieler]]

# API-Spieler

```mermaid
flowchart TD
  n1["Dashboard.players"]:::internal-link
  n2["Dashboard.readPlayerNames"]:::internal-link
  n1 -->|"Z.696"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.players
  Liefert die Spieler `players`. Ruft `workDir`, `readPlayerNames`, `players`.
Dashboard.readPlayerNames
  Liest `readPlayerNames`.
```


