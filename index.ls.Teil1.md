[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Dateien]] › [[index.ls]] › [[index.ls.Teil1]]

# index.ls.Teil1

```mermaid
flowchart TD
  n1["index.api"]:::internal-link
  n2["index.esc"]:::internal-link
  n3["for Z.135 parts"]
  n4["index.jp"]:::internal-link
  n5["index.esc"]:::internal-link
  n6["index.esc"]:::internal-link
  n1 --> n2
  n5 -->|"Z.135"| n6
  n4 --> n5
  n3 -->|"wiederholen"| n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.api
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
index.esc
  Macht einen Text so ungefährlich, dass die Seite ihn anzeigen kann. Maskiert HTML `esc`.
for Z.135 parts
  Zeile 135: Schleife `parts`.
index.jp
  Baut in der älteren [[Glossar#Bedienseite|Bedienseite]] einen Dateipfad aus seinen Teilen. Baut einen Pfad `jp`.
```

> [!knoten]- Was die Blöcke tun
> - **index.api**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
> - **index.esc**: Macht einen Text so ungefährlich, dass die Seite ihn anzeigen kann. Maskiert HTML `esc`.
> - **for Z.135 parts**: Zeile 135: Schleife `parts`.
> - **index.jp**: Baut in der älteren [[Glossar#Bedienseite|Bedienseite]] einen Dateipfad aus seinen Teilen. Baut einen Pfad `jp`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.ls`.
