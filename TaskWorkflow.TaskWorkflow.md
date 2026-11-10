[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow]]

# TaskWorkflow.TaskWorkflow

`TaskWorkflow.TaskWorkflow()` [ui/src/components/TaskWorkflow.tsx:117–460](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/TaskWorkflow.tsx#L117-L460)

```mermaid
flowchart TD
  n1["TaskWorkflow.TaskWorkflow.Teil1"]:::internal-link
  n2["TaskWorkflow.TaskWorkflow.Teil2"]:::internal-link
  n3["TaskWorkflow.TaskWorkflow.onPageChange"]:::internal-link
  n4["TaskWorkflow.TaskWorkflow.saveDraft"]:::internal-link
  n5["TaskWorkflow.TaskWorkflow.toggleSchedule"]:::internal-link
  n6["TaskWorkflow.TaskWorkflow.runSchedule"]:::internal-link
  n7["TaskWorkflow.TaskWorkflow.deleteSchedule"]:::internal-link
  n8["TaskWorkflow.TaskWorkflow.runLegacyTask"]:::internal-link
  n9["TaskWorkflow.TaskWorkflow.updateDraft"]:::internal-link
  n1 -->|"weiter"| n2
  n2 -->|"innere Methode"| n3
  n3 -->|"innere Methode"| n4
  n4 -->|"innere Methode"| n5
  n5 -->|"innere Methode"| n6
  n6 -->|"innere Methode"| n7
  n7 -->|"innere Methode"| n8
  n8 -->|"innere Methode"| n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `TaskWorkflow` in `ui/src/components/TaskWorkflow.tsx`
