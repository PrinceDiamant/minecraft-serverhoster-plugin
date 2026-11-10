[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Dateien]] › [[index.openFile]] › [[index.openFile.Teil1]]

# index.openFile.Teil1

```mermaid
flowchart TD
  n1["if Z.141 //.(jar/zip/mca/dat/png/gz/db/lock)$/i.test(p)&&!…"]
  n2["if Z.141 !accepted"]
  n3["return Z.141 return"]
  n4["index.api"]:::internal-link
  n5["index.$"]:::internal-link
  n6["index.$"]:::internal-link
  n2 -->|"ja"| n3
  n1 -->|"ja"| n2
  n3 --> n4
  n2 --> n4
  n1 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.141 //.(jar/zip/mca/dat/png/gz/db/lock)$/i.test(p)&&!…
  Zeile 141: prüft `//.(jar/zip/mca/dat/png/gz/db/lock)$/i.test(p)&&!…`.
if Z.141 !accepted
  Zeile 141: prüft `!accepted`.
return Z.141 return
  Zeile 141: Rückgabe `return`.
index.api
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.141 //.(jar/zip/mca/dat/png/gz/db/lock)$/i.test(p)&&!…**: Zeile 141: prüft `//.(jar/zip/mca/dat/png/gz/db/lock)$/i.test(p)&&!…`.
> - **if Z.141 !accepted**: Zeile 141: prüft `!accepted`.
> - **return Z.141 return**: Zeile 141: Rückgabe `return`.
> - **index.api**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.openFile`.
