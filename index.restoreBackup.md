[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Altlast]] › [[index.restoreBackup]]

# index.restoreBackup

`index.restoreBackup(name)` [src/main/resources/web/index.html:217–217](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L217-L217)

```mermaid
flowchart TD
  n1["if Z.217 c!==name"]
  n2["return Z.217 return;"]
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

- `restoreBackup` in `src/main/resources/web/index.html`
