[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Diag]] › [[index.readCrash]]

# index.readCrash

`index.readCrash()` [src/main/resources/web/index.html:211–211](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L211-L211)

```mermaid
flowchart TD
  n1["index.$"]:::internal-link
  n2["if Z.211 !n"]
  n3["index.toast"]:::internal-link
  n4["return Z.211 return"]
  n5["index.$"]:::internal-link
  n6["index.api"]:::internal-link
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n5 -->|"Z.211"| n6
  n4 --> n5
  n2 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.$
  `$` in `index.html`.
if Z.211 !n
  Zeile 211: prüft `!n`.
index.toast
  Zeigt eine Meldung `toast`. Ruft `$`.
return Z.211 return
  Zeile 211: Rückgabe `return`.
index.api
  Sendet einen Dashboard-Request `api`. Ruft `scoped`, `showLogin`, `toast`.
```

- `readCrash` in `src/main/resources/web/index.html`
