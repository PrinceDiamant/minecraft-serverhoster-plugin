[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Logs]] › [[index.loadLog]] › [[index.loadLog.Teil1]]

# index.loadLog.Teil1

```mermaid
flowchart TD
  n1["index.$"]:::internal-link
  n2["if Z.152 !n"]
  n3["return Z.152 return;"]
  n4["index.$"]:::internal-link
  n5["index.$"]:::internal-link
  n6["index.api"]:::internal-link
  n7["index.$"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n4 -->|"Z.152"| n5
  n3 --> n4
  n2 --> n4
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
if Z.152 !n
  Zeile 152: prüft `!n`.
return Z.152 return;
  Zeile 152: Rückgabe `return;`.
index.api
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
```

> [!knoten]- Was die Blöcke tun
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
> - **if Z.152 !n**: Zeile 152: prüft `!n`.
> - **return Z.152 return;**: Zeile 152: Rückgabe `return;`.
> - **index.api**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]]. Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.loadLog`.
