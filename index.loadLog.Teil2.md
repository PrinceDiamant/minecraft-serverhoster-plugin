[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Logs]] › [[index.loadLog]] › [[index.loadLog.Teil2]]

# index.loadLog.Teil2

```mermaid
flowchart TD
  n1["index.renderLog"]:::internal-link
  n2["index.$"]:::internal-link
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.renderLog
  Die ältere [[Glossar#Bedienseite|Bedienseite]] zeichnet das Protokoll. Zeichnet `renderLog`. Ruft `$`, `cls`.
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
```

> [!knoten]- Was die Blöcke tun
> - **index.renderLog**: Die ältere [[Glossar#Bedienseite|Bedienseite]] zeichnet das Protokoll. Zeichnet `renderLog`. Ruft `$`, `cls`.
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.loadLog`.
