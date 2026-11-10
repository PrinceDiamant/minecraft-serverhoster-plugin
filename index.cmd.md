[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Konsole]] › [[index.cmd]]

# index.cmd

`index.cmd(c)` [src/main/resources/web/index.html:125–125](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L125-L125)

```mermaid
flowchart TD
  n1["index.post"]:::internal-link
  n2["if Z.125 !r.ok"]
  n3["index.toast"]:::internal-link
  n4["if Z.125 cur!=='console'"]
  n5["index.toast"]:::internal-link
  n4 -->|"ja"| n5
  n2 -->|"ja"| n3
  n2 -->|"nein"| n4
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `cmd` in `src/main/resources/web/index.html`
