[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Dateien]] › [[index.newFile]]

# index.newFile

`index.newFile()` [src/main/resources/web/index.html:147–147](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L147-L147)

```mermaid
flowchart TD
  n1["if Z.147 !n"]
  n2["return Z.147 return;"]
  n3["index.post"]:::internal-link
  n4["index.jp"]:::internal-link
  n5["index.ls"]:::internal-link
  n6["index.openFile"]:::internal-link
  n7["index.jp"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"Z.147"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n6 -->|"Z.147"| n7
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.147 !n
  Zeile 147: prüft `!n`.
return Z.147 return;
  Zeile 147: Rückgabe `return;`.
index.post
  Sendet POST `post`. Ruft `api`.
index.jp
  Baut einen Pfad `jp`.
index.ls
  Listet das Verzeichnis `ls`. Ruft `api`, `esc`, `jp`.
index.openFile
  Öffnet `openFile`. Ruft `api`, `$`.
```

- `newFile` in `src/main/resources/web/index.html`
