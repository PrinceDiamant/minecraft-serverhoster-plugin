[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Dateien]] › [[index.del]] › [[index.del.Teil1]]

# index.del.Teil1

```mermaid
flowchart TD
  n1["if Z.145 !accepted"]
  n2["return Z.145 return;"]
  n3["index.post"]:::internal-link
  n4["index.$"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.145 !accepted
  Zeile 145: prüft `!accepted`.
return Z.145 return;
  Zeile 145: Rückgabe `return;`.
index.post
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen Auftrag, der etwas ändert. Sendet POST `post`. Ruft `api`.
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.145 !accepted**: Zeile 145: prüft `!accepted`.
> - **return Z.145 return;**: Zeile 145: Rückgabe `return;`.
> - **index.post**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen Auftrag, der etwas ändert. Sendet POST `post`. Ruft `api`.
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.del`.
