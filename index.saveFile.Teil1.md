[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Dateien]] › [[index.saveFile]] › [[index.saveFile.Teil1]]

# index.saveFile.Teil1

```mermaid
flowchart TD
  n1["index.$"]:::internal-link
  n2["if Z.143 p.endsWith('.gz')"]
  n3["index.toast"]:::internal-link
  n4["return Z.143 return"]
  n5["index.$"]:::internal-link
  n6["index.post"]:::internal-link
  n7["index.toast"]:::internal-link
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n4 --> n5
  n2 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
if Z.143 p.endsWith('.gz')
  Zeile 143: prüft `p.endsWith('.gz')`.
index.toast
  Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] einen kurzen Hinweis. Zeigt eine Meldung `toast`. Ruft `$`.
return Z.143 return
  Zeile 143: Rückgabe `return`.
index.post
  Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen Auftrag, der etwas ändert. Sendet POST `post`. Ruft `api`.
```

> [!knoten]- Was die Blöcke tun
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
> - **if Z.143 p.endsWith('.gz')**: Zeile 143: prüft `p.endsWith('.gz')`.
> - **index.toast**: Zeigt in der älteren [[Glossar#Bedienseite|Bedienseite]] einen kurzen Hinweis. Zeigt eine Meldung `toast`. Ruft `$`.
> - **return Z.143 return**: Zeile 143: Rückgabe `return`.
> - **index.post**: Schickt von der älteren [[Glossar#Bedienseite|Bedienseite]] einen Auftrag, der etwas ändert. Sendet POST `post`. Ruft `api`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.saveFile`.
