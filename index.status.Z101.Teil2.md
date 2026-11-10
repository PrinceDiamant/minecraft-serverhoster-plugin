[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Status]] › [[index.status]] › [[index.status.Z101.Teil2]]

# index.status.Z101.Teil2

```mermaid
flowchart TD
  n1["index.$"]:::internal-link
  n2["index.esc"]:::internal-link
  n3["index.lifecycleLabel"]:::internal-link
  n4["if Z.103 s.setupRequired&&!window.setupRedirected"]
  n5["if Z.103 window.dashboardUi"]
  n6["index.tab"]:::internal-link
  n1 -->|"Z.102"| n2
  n2 -->|"Z.102"| n3
  n5 -->|"nein"| n6
  n4 -->|"ja"| n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.$
  `$` in `index.html`.
index.esc
  Maskiert HTML `esc`.
index.lifecycleLabel
  `lifecycleLabel` in `index.html`.
if Z.103 s.setupRequired&&!window.setupRedirected
  Zeile 103: prüft `s.setupRequired&&!window.setupRedirected`.
if Z.103 window.dashboardUi
  Zeile 103: prüft `window.dashboardUi`.
index.tab
  Wechselt den Tab `tab`. Ruft `$`, `loadTxt`, `loadPropertiesPreview`.
```

- Fortsetzung von `index.status.Z101`, Quellreihenfolge.
