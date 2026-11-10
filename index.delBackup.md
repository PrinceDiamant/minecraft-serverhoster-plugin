[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Altlast]] › [[index.delBackup]]

# index.delBackup

`index.delBackup(name)` [src/main/resources/web/index.html:216–216](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L216-L216)

```mermaid
flowchart TD
  n1["if Z.216 c!==name"]
  n2["return Z.216 return;"]
  n3["index.post"]:::internal-link
  n4["index.toast"]:::internal-link
  n5["index.loadBackup"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.216 c!==name
  Zeile 216: prüft `c!==name`.
return Z.216 return;
  Zeile 216: Rückgabe `return;`.
index.post
  Sendet POST `post`. Ruft `api`.
index.toast
  Zeigt eine Meldung `toast`. Ruft `$`.
index.loadBackup
  Lädt `loadBackup`. Ruft `api`, `$`, `esc`.
```

- `delBackup` in `src/main/resources/web/index.html`
