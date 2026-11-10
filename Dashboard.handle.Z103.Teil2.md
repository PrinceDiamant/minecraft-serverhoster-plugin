[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil2]]

# Dashboard.handle.Z103.Teil2

```mermaid
flowchart TD
  n1["if Z.111 (path.startsWith('/assets/') && method.equals('GE…"]
  n2["Dashboard.serveWebAsset"]:::internal-link
  n3["return Z.111 return;"]
  n4["if Z.112 (path.equals('/third-party-notices') && method.eq…"]
  n5["Dashboard.serveThirdPartyNotices"]:::internal-link
  n6["return Z.112 return;"]
  n2 --> n3
  n1 -->|"ja"| n2
  n5 --> n6
  n4 -->|"ja"| n5
  n3 --> n4
  n1 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.111 (path.startsWith('/assets/') && method.equals('GE…
  Zeile 111: prüft `(path.startsWith('/assets/') && method.equals('GE…`.
Dashboard.serveWebAsset
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liefert die Seite eine Datei der Seite. Liefert `serveWebAsset`. Ruft `send`, `sendBytes`.
return Z.111 return;
  Zeile 111: Rückgabe `return;`.
if Z.112 (path.equals('/third-party-notices') && method.eq…
  Zeile 112: prüft `(path.equals('/third-party-notices') && method.eq…`.
Dashboard.serveThirdPartyNotices
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liefert fremde Bausteine die Hinweise. Liefert `serveThirdPartyNotices`. Ruft `send`.
return Z.112 return;
  Zeile 112: Rückgabe `return;`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.111 (path.startsWith('/assets/') && method.equals('GE…**: Zeile 111: prüft `(path.startsWith('/assets/') && method.equals('GE…`.
> - **Dashboard.serveWebAsset**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liefert die Seite eine Datei der Seite. Liefert `serveWebAsset`. Ruft `send`, `sendBytes`.
> - **return Z.111 return;**: Zeile 111: Rückgabe `return;`.
> - **if Z.112 (path.equals('/third-party-notices') && method.eq…**: Zeile 112: prüft `(path.equals('/third-party-notices') && method.eq…`.
> - **Dashboard.serveThirdPartyNotices**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liefert fremde Bausteine die Hinweise. Liefert `serveThirdPartyNotices`. Ruft `send`.
> - **return Z.112 return;**: Zeile 112: Rückgabe `return;`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `Dashboard.handle.Z103`.
