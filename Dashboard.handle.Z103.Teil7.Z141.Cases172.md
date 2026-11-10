[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Cases172]]

# Dashboard.handle.Z103.Teil7.Z141.Cases172

```mermaid
flowchart TD
  n1["case Z.172 'POST /api/config'"]
  n2["Dashboard.saveConfig"]:::internal-link
  n3["case Z.173 'GET /api/settings'"]
  n4["Dashboard.handle.Z103.Teil7.Z141.Case173"]:::internal-link
  n5["case Z.174 'POST /api/settings'"]
  n6["Dashboard.handle.Z103.Teil7.Z141.Case174"]:::internal-link
  n7["case Z.175 'GET /api/backup/credentials'"]
  n8["Dashboard.handle.Z103.Teil7.Z141.Case175"]:::internal-link
  n9["case Z.180 'POST /api/backup/credentials'"]
  n10["Dashboard.handle.Z103.Teil7.Z141.Case180"]:::internal-link
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n7 --> n8
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
case Z.172 'POST /api/config'
  Zeile 172: Zweig `'POST /api/config'`.
Dashboard.saveConfig
  Speichert `saveConfig`. Ruft `readBodyText`, `json`, `configMutationLock`.
case Z.173 'GET /api/settings'
  Zeile 173: Zweig `'GET /api/settings'`.
Dashboard.handle.Z103.Teil7.Z141.Case173
  Rumpf dieses switch-Zweigs ab Zeile 173.
case Z.174 'POST /api/settings'
  Zeile 174: Zweig `'POST /api/settings'`.
Dashboard.handle.Z103.Teil7.Z141.Case174
  Rumpf dieses switch-Zweigs ab Zeile 174.
case Z.175 'GET /api/backup/credentials'
  Zeile 175: Zweig `'GET /api/backup/credentials'`.
Dashboard.handle.Z103.Teil7.Z141.Case175
  Rumpf dieses switch-Zweigs ab Zeile 175.
case Z.180 'POST /api/backup/credentials'
  Zeile 180: Zweig `'POST /api/backup/credentials'`.
Dashboard.handle.Z103.Teil7.Z141.Case180
  Rumpf dieses switch-Zweigs ab Zeile 180.
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
