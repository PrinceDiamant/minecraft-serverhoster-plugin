[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Logs]] › [[index.loadLogs]] › [[index.loadLogs.Z150.Teil1]]

# index.loadLogs.Z150.Teil1

```mermaid
flowchart TD
  n1["index.api"]:::internal-link
  n2["index.$"]:::internal-link
  n3["index.esc"]:::internal-link
  n4["if Z.151 prev&&fs.some(e=)e.name===prev)"]
  n5["if Z.151 fs.some(e=)e.name==='latest.log')"]
  n1 --> n2
  n2 --> n3
  n4 -->|"nein"| n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.api
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
index.esc
  Macht einen Text so ungefährlich, dass die Seite ihn anzeigen kann. Maskiert HTML `esc`.
if Z.151 prev&&fs.some(e=)e.name===prev)
  Zeile 151: prüft `prev&&fs.some(e=)e.name===prev)`.
if Z.151 fs.some(e=)e.name==='latest.log')
  Zeile 151: prüft `fs.some(e=)e.name==='latest.log')`.
```

> [!knoten]- Was die Blöcke tun
> - **index.api**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
> - **index.esc**: Macht einen Text so ungefährlich, dass die Seite ihn anzeigen kann. Maskiert HTML `esc`.
> - **if Z.151 prev&&fs.some(e=)e.name===prev)**: Zeile 151: prüft `prev&&fs.some(e=)e.name===prev)`.
> - **if Z.151 fs.some(e=)e.name==='latest.log')**: Zeile 151: prüft `fs.some(e=)e.name==='latest.log')`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.loadLogs.Z150`.
