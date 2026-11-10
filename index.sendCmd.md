[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Konsole]] › [[index.sendCmd]]

# index.sendCmd

`index.sendCmd()` [src/main/resources/web/index.html:126–126](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L126-L126)

```mermaid
flowchart TD
  n1["index.$"]:::internal-link
  n2["if Z.126 !v"]
  n3["return Z.126 return;"]
  n4["index.cmd"]:::internal-link
  n5["index.$"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
index.$
  `$` in `index.html`.
if Z.126 !v
  Zeile 126: prüft `!v`.
return Z.126 return;
  Zeile 126: Rückgabe `return;`.
index.cmd
  Sendet einen Befehl `cmd`. Ruft `post`, `toast`.
```

- `sendCmd` in `src/main/resources/web/index.html`
