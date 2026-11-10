[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[PlayerWorkflow]] › [[PlayerWorkflow.PlayerWorkflow]] › [[PlayerWorkflow.PlayerWorkflow.onPageChange]]

# PlayerWorkflow.PlayerWorkflow.onPageChange

`PlayerWorkflow.onPageChange(event: Event)` [ui/src/components/PlayerWorkflow.tsx:55–59](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/PlayerWorkflow.tsx#L55-L59)

```mermaid
flowchart TD
  n1["if Z.57 selected && !active.current"]
  n2["fileEditor.installFileEditors.refresh"]:::internal-link
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `onPageChange` in `ui/src/components/PlayerWorkflow.tsx`
