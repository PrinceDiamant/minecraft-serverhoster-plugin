[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[TaskWorkflow]] › [[TaskWorkflow.dateLabel]]

# TaskWorkflow.dateLabel

`TaskWorkflow.dateLabel(value: string)` [ui/src/components/TaskWorkflow.tsx:102–106](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/TaskWorkflow.tsx#L102-L106)

```mermaid
flowchart TD
  n1["if Z.103 !value"]
  n2["return Z.103 return 'Noch nicht ausgeführt';"]
  n3["return Z.105 return Number.isNaN(time.getTime()) ? value : tim…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `dateLabel` in `ui/src/components/TaskWorkflow.tsx`
