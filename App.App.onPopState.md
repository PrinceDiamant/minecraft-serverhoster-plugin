[[00 Start]] › [[Dashboard-UI]] › [[UI-App]] › [[App.App]] › [[App.App.onPopState]]

# App.App.onPopState

`App.onPopState()` [ui/src/App.tsx:186–192](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/App.tsx#L186-L192)

```mermaid
flowchart TD
  n1["if Z.187 document.getElementById('app')?.classList.contain…"]
  n2["App.tabFromPath"]:::internal-link
  n3["App.App.navigateTo"]:::internal-link
  n4["App.tabFromPath"]:::internal-link
  n3 -->|"Z.190"| n4
  n1 -->|"ja"| n2
  n1 -->|"nein"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.187 document.getElementById('app')?.classList.contain…
  Zeile 187: prüft `document.getElementById('app')?.classList.contain…`.
App.tabFromPath
  Wechselt den Tab `tabFromPath`.
App.App.navigateTo
  Wechselt die Route `navigateTo`. Ruft `tab`.
```

- `onPopState` in `ui/src/App.tsx`
