[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Cases152]]

# Dashboard.handle.Z103.Teil7.Z141.Cases152

```mermaid
flowchart TD
  n1["case Z.152 'POST /api/action'"]
  n2["Dashboard.handle.Z103.Teil7.Z141.Case152"]:::internal-link
  n3["case Z.166 'GET /api/props'"]
  n4["Dashboard.handle.Z103.Teil7.Z141.Case166"]:::internal-link
  n5["case Z.167 'GET /api/properties/preview'"]
  n6["Dashboard.handle.Z103.Teil7.Z141.Case167"]:::internal-link
  n7["case Z.170 'POST /api/props'"]
  n8["Dashboard.saveProps"]:::internal-link
  n9["case Z.171 'GET /api/config'"]
  n10["Dashboard.handle.Z103.Teil7.Z141.Case171"]:::internal-link
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n7 --> n8
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
case Z.152 'POST /api/action'
  Zeile 152: Zweig `'POST /api/action'`.
Dashboard.handle.Z103.Teil7.Z141.Case152
  Rumpf dieses switch-Zweigs ab Zeile 152.
case Z.166 'GET /api/props'
  Zeile 166: Zweig `'GET /api/props'`.
Dashboard.handle.Z103.Teil7.Z141.Case166
  Rumpf dieses switch-Zweigs ab Zeile 166.
case Z.167 'GET /api/properties/preview'
  Zeile 167: Zweig `'GET /api/properties/preview'`.
Dashboard.handle.Z103.Teil7.Z141.Case167
  Rumpf dieses switch-Zweigs ab Zeile 167.
case Z.170 'POST /api/props'
  Zeile 170: Zweig `'POST /api/props'`.
Dashboard.saveProps
  Speichert `saveProps`. Ruft `readBodyText`, `workDir`, `syncPropertiesEdit`.
case Z.171 'GET /api/config'
  Zeile 171: Zweig `'GET /api/config'`.
Dashboard.handle.Z103.Teil7.Z141.Case171
  Rumpf dieses switch-Zweigs ab Zeile 171.
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
