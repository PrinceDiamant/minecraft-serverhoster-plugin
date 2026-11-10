[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Dateien]] › [[index.del]] › [[index.del.Teil2]]

# index.del.Teil2

```mermaid
flowchart TD
  n1["if Z.145 ep===p//ep.startsWith(p+'/')"]
  n2["index.$"]:::internal-link
  n3["index.$"]:::internal-link
  n4["index.toast"]:::internal-link
  n5["index.ls"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  n3 --> n4
  n1 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.145 ep===p//ep.startsWith(p+'/')
  Zeile 145: prüft `ep===p//ep.startsWith(p+'/')`.
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
index.toast
  Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] einen kurzen Hinweis. Zeigt eine Meldung `toast`. Ruft `$`.
index.ls
  Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] den Inhalt eines Ordners. Listet das Verzeichnis `ls`. Ruft `api`, `esc`, `jp`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.145 ep===p//ep.startsWith(p+'/')**: Zeile 145: prüft `ep===p//ep.startsWith(p+'/')`.
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
> - **index.toast**: Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] einen kurzen Hinweis. Zeigt eine Meldung `toast`. Ruft `$`.
> - **index.ls**: Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] den Inhalt eines Ordners. Listet das Verzeichnis `ls`. Ruft `api`, `esc`, `jp`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.del`.
