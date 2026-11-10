[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Altlast]] › [[index.loadBackup]]

# index.loadBackup

`index.loadBackup()` [src/main/resources/web/index.html:214–215](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L214-L215)

```mermaid
flowchart TD
  n1["index.api"]:::internal-link
  n2["index.$"]:::internal-link
  n3["index.$"]:::internal-link
  n4["index.$"]:::internal-link
  n5["index.esc"]:::internal-link
  n6["index.fmtSize"]:::internal-link
  n1 --> n2
  n2 --> n3
  n4 -->|"Z.215"| n5
  n5 -->|"Z.215"| n6
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.api
  Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
index.$
  `$` in `index.html`.
index.esc
  Maskiert HTML `esc`.
index.fmtSize
  Formatiert `fmtSize`.
```

- `loadBackup` in `src/main/resources/web/index.html`
