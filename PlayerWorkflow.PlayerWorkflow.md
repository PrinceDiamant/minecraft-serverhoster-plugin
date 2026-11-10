[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[PlayerWorkflow]] › [[PlayerWorkflow.PlayerWorkflow]]

# PlayerWorkflow.PlayerWorkflow

`PlayerWorkflow.PlayerWorkflow()` [ui/src/components/PlayerWorkflow.tsx:20–203](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/PlayerWorkflow.tsx#L20-L203)

```mermaid
flowchart TD
  n1["PlayerWorkflow.PlayerWorkflow.Teil1"]:::internal-link
  n2["PlayerWorkflow.PlayerWorkflow.Teil2"]:::internal-link
  n3["PlayerWorkflow.PlayerWorkflow.onPageChange"]:::internal-link
  n4["PlayerWorkflow.PlayerWorkflow.onVisibilityChange"]:::internal-link
  n5["PlayerWorkflow.PlayerWorkflow.runPlayerAction"]:::internal-link
  n1 -->|"weiter"| n2
  n2 -->|"innere Methode"| n3
  n3 -->|"innere Methode"| n4
  n4 -->|"innere Methode"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
PlayerWorkflow.PlayerWorkflow.Teil1
  Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
PlayerWorkflow.PlayerWorkflow.Teil2
  Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
PlayerWorkflow.PlayerWorkflow.onPageChange
  Reagiert `onPageChange`. Ruft `refresh`.
PlayerWorkflow.PlayerWorkflow.onVisibilityChange
  Reagiert `onVisibilityChange`. Ruft `refresh`.
PlayerWorkflow.PlayerWorkflow.runPlayerAction
  Führt aus `runPlayerAction`. Ruft `sendCommand`, `refresh`.
```

- `PlayerWorkflow` in `ui/src/components/PlayerWorkflow.tsx`
