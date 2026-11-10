[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Cases215]]

# Dashboard.handle.Z103.Teil7.Z141.Cases215

```mermaid
flowchart TD
  n1["case Z.215 'GET /api/fs/read'"]
  n2["Dashboard.fsRead"]:::internal-link
  n3["case Z.216 'GET /api/fs/download'"]
  n4["Dashboard.fsDownload"]:::internal-link
  n5["case Z.217 'POST /api/fs/write'"]
  n6["Dashboard.fsWrite"]:::internal-link
  n7["case Z.218 'POST /api/fs/upload'"]
  n8["Dashboard.fsUpload"]:::internal-link
  n9["case Z.219 'POST /api/fs/rename'"]
  n10["Dashboard.fsRename"]:::internal-link
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n7 --> n8
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
case Z.215 'GET /api/fs/read'
  Zeile 215: Zweig `'GET /api/fs/read'`.
Dashboard.fsRead
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest eine Datei. `fsRead` in `Dashboard.java`. Ruft `safe`, `json`, `text`.
case Z.216 'GET /api/fs/download'
  Zeile 216: Zweig `'GET /api/fs/download'`.
Dashboard.fsDownload
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] holt eine Datei. `fsDownload` in `Dashboard.java`. Ruft `safe`, `json`.
case Z.217 'POST /api/fs/write'
  Zeile 217: Zweig `'POST /api/fs/write'`.
Dashboard.fsWrite
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] schreibt eine Datei. `fsWrite` in `Dashboard.java`. Ruft `safe`, `json`, `readBodyText`.
case Z.218 'POST /api/fs/upload'
  Zeile 218: Zweig `'POST /api/fs/upload'`.
Dashboard.fsUpload
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] schickt eine Datei. `fsUpload` in `Dashboard.java`. Ruft `safe`, `json`, `rel`.
case Z.219 'POST /api/fs/rename'
  Zeile 219: Zweig `'POST /api/fs/rename'`.
Dashboard.fsRename
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] benennt um eine Datei. `fsRename` in `Dashboard.java`. Ruft `readBodyText`, `safe`, `root`.
```

> [!knoten]- Was die Blöcke tun
> - **case Z.215 'GET /api/fs/read'**: Zeile 215: Zweig `'GET /api/fs/read'`.
> - **Dashboard.fsRead**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest eine Datei. `fsRead` in `Dashboard.java`. Ruft `safe`, `json`, `text`.
> - **case Z.216 'GET /api/fs/download'**: Zeile 216: Zweig `'GET /api/fs/download'`.
> - **Dashboard.fsDownload**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] holt eine Datei. `fsDownload` in `Dashboard.java`. Ruft `safe`, `json`.
> - **case Z.217 'POST /api/fs/write'**: Zeile 217: Zweig `'POST /api/fs/write'`.
> - **Dashboard.fsWrite**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] schreibt eine Datei. `fsWrite` in `Dashboard.java`. Ruft `safe`, `json`, `readBodyText`.
> - **case Z.218 'POST /api/fs/upload'**: Zeile 218: Zweig `'POST /api/fs/upload'`.
> - **Dashboard.fsUpload**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] schickt eine Datei. `fsUpload` in `Dashboard.java`. Ruft `safe`, `json`, `rel`.
> - **case Z.219 'POST /api/fs/rename'**: Zeile 219: Zweig `'POST /api/fs/rename'`.
> - **Dashboard.fsRename**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] benennt um eine Datei. `fsRename` in `Dashboard.java`. Ruft `readBodyText`, `safe`, `root`.

- Weitere Wege der Entscheidung in [[Glossar#Zeile|Zeile]] 215.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
