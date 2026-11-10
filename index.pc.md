[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Altlast]] › [[index.pc]]

# index.pc

`index.pc(c)` [src/main/resources/web/index.html:127–127](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L127-L127)

```mermaid
flowchart TD
  n1["index.$"]:::internal-link
  n2["if Z.127 !/^/w(1,16)$/.test(n)"]
  n3["index.toast"]:::internal-link
  n4["return Z.127 return"]
  n5["index.cmd"]:::internal-link
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n4 --> n5
  n2 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `pc` in `src/main/resources/web/index.html`
