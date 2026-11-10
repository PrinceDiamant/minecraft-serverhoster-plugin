[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow.Teil2.Calls444]]

# TaskWorkflow.TaskWorkflow.Teil2.Calls444

```mermaid
flowchart TD
  n1["TaskWorkflow.TaskWorkflow.updateDraft"]:::internal-link
  n2["TaskWorkflow.TaskWorkflow.saveDraft"]:::internal-link
  n1 -->|"Z.451"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
TaskWorkflow.TaskWorkflow.updateDraft
  Aktualisiert `updateDraft`.
TaskWorkflow.TaskWorkflow.saveDraft
  Speichert `saveDraft`. Ruft `dashboardRequest`, `jsonBody`, `refresh`.
```

- Fortsetzung von `TaskWorkflow.TaskWorkflow.Teil2`, Quellreihenfolge.
