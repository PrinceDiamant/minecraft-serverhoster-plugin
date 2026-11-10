[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Cases225]]

# Dashboard.handle.Z103.Teil7.Z141.Cases225

```mermaid
flowchart TD
  n1["case Z.225 'POST /api/diag/flags'"]
  n2["Dashboard.handle.Z103.Teil7.Z141.Case225"]:::internal-link
  n3["case Z.226 'GET /api/logs'"]
  n4["Dashboard.logs"]:::internal-link
  n5["case Z.227 'GET /api/tasks'"]
  n6["Dashboard.handle.Z103.Teil7.Z141.Case227"]:::internal-link
  n7["case Z.228 'POST /api/tasks/run'"]
  n8["Dashboard.handle.Z103.Teil7.Z141.Case228"]:::internal-link
  n9["case Z.236 'GET /api/host-minimize'"]
  n10["Dashboard.handle.Z103.Teil7.Z141.Case236"]:::internal-link
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n7 --> n8
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
case Z.225 'POST /api/diag/flags'
  Zeile 225: Zweig `'POST /api/diag/flags'`.
Dashboard.handle.Z103.Teil7.Z141.Case225
  Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 225. Rumpf dieses switch-Zweigs ab Zeile 225.
case Z.226 'GET /api/logs'
  Zeile 226: Zweig `'GET /api/logs'`.
Dashboard.logs
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `logs` in `Dashboard.java`. Ruft `parseInt`, `query`, `safe`.
case Z.227 'GET /api/tasks'
  Zeile 227: Zweig `'GET /api/tasks'`.
Dashboard.handle.Z103.Teil7.Z141.Case227
  Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 227. Rumpf dieses switch-Zweigs ab Zeile 227.
case Z.228 'POST /api/tasks/run'
  Zeile 228: Zweig `'POST /api/tasks/run'`.
Dashboard.handle.Z103.Teil7.Z141.Case228
  Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 228. Rumpf dieses switch-Zweigs ab Zeile 228.
case Z.236 'GET /api/host-minimize'
  Zeile 236: Zweig `'GET /api/host-minimize'`.
Dashboard.handle.Z103.Teil7.Z141.Case236
  Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 236. Rumpf dieses switch-Zweigs ab Zeile 236.
```

> [!knoten]- Was die Blöcke tun
> - **case Z.225 'POST /api/diag/flags'**: Zeile 225: Zweig `'POST /api/diag/flags'`.
> - **Dashboard.handle.Z103.Teil7.Z141.Case225**: Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 225. Rumpf dieses switch-Zweigs ab Zeile 225.
> - **case Z.226 'GET /api/logs'**: Zeile 226: Zweig `'GET /api/logs'`.
> - **Dashboard.logs**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `logs` in `Dashboard.java`. Ruft `parseInt`, `query`, `safe`.
> - **case Z.227 'GET /api/tasks'**: Zeile 227: Zweig `'GET /api/tasks'`.
> - **Dashboard.handle.Z103.Teil7.Z141.Case227**: Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 227. Rumpf dieses switch-Zweigs ab Zeile 227.
> - **case Z.228 'POST /api/tasks/run'**: Zeile 228: Zweig `'POST /api/tasks/run'`.
> - **Dashboard.handle.Z103.Teil7.Z141.Case228**: Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 228. Rumpf dieses switch-Zweigs ab Zeile 228.
> - **case Z.236 'GET /api/host-minimize'**: Zeile 236: Zweig `'GET /api/host-minimize'`.
> - **Dashboard.handle.Z103.Teil7.Z141.Case236**: Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 236. Rumpf dieses switch-Zweigs ab Zeile 236.

- Weitere Wege der Entscheidung in [[Glossar#Zeile|Zeile]] 225.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
