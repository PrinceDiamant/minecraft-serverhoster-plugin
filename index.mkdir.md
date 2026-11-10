[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Dateien]] › [[index.mkdir]]

# index.mkdir

`index.mkdir()` [src/main/resources/web/index.html:146–146](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L146-L146)

```mermaid
flowchart TD
  n1["if Z.146 !n"]
  n2["return Z.146 return;"]
  n3["index.post"]:::internal-link
  n4["index.jp"]:::internal-link
  n5["index.ls"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"Z.146"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.146 !n
  Zeile 146: prüft `!n`.
return Z.146 return;
  Zeile 146: Rückgabe `return;`.
index.post
  Sendet POST `post`. Ruft `api`.
index.jp
  Baut einen Pfad `jp`.
index.ls
  Listet das Verzeichnis `ls`. Ruft `api`, `esc`, `jp`.
```

- `mkdir` in `src/main/resources/web/index.html`
