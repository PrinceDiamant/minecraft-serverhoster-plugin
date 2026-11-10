[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Sitzung]] › [[index.tab]] › [[index.tab.Teil1]]

# index.tab.Teil1

```mermaid
flowchart TD
  n1["for Z.88 TABS"]
  n2["index.$"]:::internal-link
  n3["index.$"]:::internal-link
  n4["if Z.89 t==='props'"]
  n5["index.loadTxt"]:::internal-link
  n6["index.loadPropertiesPreview"]:::internal-link
  n2 --> n3
  n1 -->|"wiederholen"| n2
  n5 --> n6
  n4 -->|"ja"| n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.88 TABS
  Zeile 88: Schleife `TABS`.
index.$
  Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
if Z.89 t==='props'
  Zeile 89: prüft `t==='props'`.
index.loadTxt
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt den Text. Lädt `loadTxt`. Ruft `api`, `$`.
index.loadPropertiesPreview
  Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die Eigenschaften die Vorschau. Lädt `loadPropertiesPreview`. Ruft `api`, `$`, `esc`.
```

> [!knoten]- Was die Blöcke tun
> - **for Z.88 TABS**: Zeile 88: Schleife `TABS`.
> - **index.$**: Sucht auf der älteren [[Glossar#Bedienseite|Bedienseite]] ein einzelnes Element. `$` in `index.html`.
> - **if Z.89 t==='props'**: Zeile 89: prüft `t==='props'`.
> - **index.loadTxt**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt den Text. Lädt `loadTxt`. Ruft `api`, `$`.
> - **index.loadPropertiesPreview**: Die ältere [[Glossar#Bedienseite|Bedienseite]] lädt die Eigenschaften die Vorschau. Lädt `loadPropertiesPreview`. Ruft `api`, `$`, `esc`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `index.tab`.
