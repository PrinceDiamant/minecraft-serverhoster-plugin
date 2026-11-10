[[00 Start]] › [[Dashboard-HTTP]] › [[API-Antworten]]

# API-Antworten

```mermaid
flowchart TD
  n1["Dashboard.parseInt"]:::internal-link
  n2["Dashboard.readOr"]:::internal-link
  n3["Dashboard.readBodyText"]:::internal-link
  n4["Dashboard.body"]:::internal-link
  n5["Dashboard.query"]:::internal-link
  n6["Dashboard.json"]:::internal-link
  n7["Dashboard.text"]:::internal-link
  n8["Dashboard.send"]:::internal-link
  n9["Dashboard.sendBytes"]:::internal-link
  n4 -->|"Z.983"| n3
  n6 -->|"Z.996"| n9
  n7 -->|"Z.997"| n9
  n8 -->|"Z.998"| n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.parseInt
  Wertet aus `parseInt`.
Dashboard.readOr
  Liest `readOr`.
Dashboard.readBodyText
  Liest `readBodyText`.
Dashboard.body
  `body` in `Dashboard.java`. Ruft `readBodyText`.
Dashboard.query
  Fragt ab `query`.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
Dashboard.text
  Antwortet mit Text `text`. Ruft `sendBytes`.
Dashboard.send
  Sendet `send`. Ruft `sendBytes`.
Dashboard.sendBytes
  Sendet `sendBytes`.
```


