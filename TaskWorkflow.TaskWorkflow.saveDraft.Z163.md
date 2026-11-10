[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow.saveDraft]] › [[TaskWorkflow.TaskWorkflow.saveDraft.Z163]]

# TaskWorkflow.TaskWorkflow.saveDraft.Z163

```mermaid
flowchart TD
  n1["try Z.163"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["hostApi.jsonBody"]:::internal-link
  n4["fileEditor.installFileEditors.refresh"]:::internal-link
  n5["catch Z.173 cause"]
  n6["finally Z.163"]
  n2 -->|"Z.168"| n3
  n3 --> n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `TaskWorkflow.TaskWorkflow.saveDraft`, Quellreihenfolge.
