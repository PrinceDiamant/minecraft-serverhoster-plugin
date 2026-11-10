[[00 Start]] › [[Dashboard-UI]] › [[UI-App]] › [[App.App]] › [[App.App.navigateTo]]

# App.App.navigateTo

`App.navigateTo(requestedTab: string, mode: "push" | "replace")` [ui/src/App.tsx:248–259](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/App.tsx#L248-L259)

```mermaid
flowchart TD
  n1["if Z.252 window.location.pathname !== path"]
  n2["if Z.253 mode === 'push'"]
  n3["index.tab"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.252 window.location.pathname !== path
  Zeile 252: prüft `window.location.pathname !== path`.
if Z.253 mode === 'push'
  Zeile 253: prüft `mode === 'push'`.
index.tab
  Wechselt den Tab `tab`. Ruft `$`, `loadTxt`, `loadPropertiesPreview`.
```

- `navigateTo` in `ui/src/App.tsx`
