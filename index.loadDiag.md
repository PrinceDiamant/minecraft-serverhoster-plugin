[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Diag]] › [[index.loadDiag]]

# index.loadDiag

`index.loadDiag()` [src/main/resources/web/index.html:193–206](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L193-L206)

```mermaid
flowchart TD
  n1["index.api"]:::internal-link
  n2["index.$"]:::internal-link
  n3["index.loadDiag.Calls196"]:::internal-link
  n4["index.loadDiag.Calls200"]:::internal-link
  n5["index.loadDiag.Calls202"]:::internal-link
  n6["index.loadDiag.metric"]:::internal-link
  n7["index.loadDiag.row"]:::internal-link
  n1 --> n2
  n3 -->|"weiter"| n4
  n4 -->|"weiter"| n5
  n2 --> n3
  n5 -->|"innere Methode"| n6
  n6 -->|"innere Methode"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `loadDiag` in `src/main/resources/web/index.html`
