[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Cases186]]

# Dashboard.handle.Z103.Teil7.Z141.Cases186

```mermaid
flowchart TD
  n1["case Z.186 'GET /api/backup/options'"]
  n2["Dashboard.json"]:::internal-link
  n3["case Z.188 'POST /api/backup/options'"]
  n4["Dashboard.handle.Z103.Teil7.Z141.Case188"]:::internal-link
  n5["case Z.206 'GET /api/players'"]
  n6["Dashboard.players"]:::internal-link
  n7["case Z.207 'POST /api/players/refresh'"]
  n8["Dashboard.handle.Z103.Teil7.Z141.Case207"]:::internal-link
  n9["case Z.214 'GET /api/fs/list'"]
  n10["Dashboard.fsList"]:::internal-link
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n7 --> n8
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
case Z.186 'GET /api/backup/options'
  Zeile 186: Zweig `'GET /api/backup/options'`.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
case Z.188 'POST /api/backup/options'
  Zeile 188: Zweig `'POST /api/backup/options'`.
Dashboard.handle.Z103.Teil7.Z141.Case188
  Rumpf dieses switch-Zweigs ab Zeile 188.
case Z.206 'GET /api/players'
  Zeile 206: Zweig `'GET /api/players'`.
Dashboard.players
  Liefert die Spieler `players`. Ruft `workDir`, `readPlayerNames`, `players`.
case Z.207 'POST /api/players/refresh'
  Zeile 207: Zweig `'POST /api/players/refresh'`.
Dashboard.handle.Z103.Teil7.Z141.Case207
  Rumpf dieses switch-Zweigs ab Zeile 207.
case Z.214 'GET /api/fs/list'
  Zeile 214: Zweig `'GET /api/fs/list'`.
Dashboard.fsList
  `fsList` in `Dashboard.java`. Ruft `safe`, `json`, `rel`.
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
