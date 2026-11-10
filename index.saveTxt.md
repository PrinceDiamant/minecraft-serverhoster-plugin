[[00 Start]] › [[Dashboard-UI]] › [[Legacy-Dateien]] › [[index.saveTxt]]

# index.saveTxt

`index.saveTxt(w)` [src/main/resources/web/index.html:131–131](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/resources/web/index.html#L131-L131)

```mermaid
flowchart TD
  n1["index.$"]:::internal-link
  n2["index.post"]:::internal-link
  n3["index.toast"]:::internal-link
  n4["if Z.131 w==='props'"]
  n5["index.loadPropertiesPreview"]:::internal-link
  n1 --> n2
  n2 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `saveTxt` in `src/main/resources/web/index.html`
