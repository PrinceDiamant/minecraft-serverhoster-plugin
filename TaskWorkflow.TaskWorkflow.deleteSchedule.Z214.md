[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow.deleteSchedule]] › [[TaskWorkflow.TaskWorkflow.deleteSchedule.Z214]]

# TaskWorkflow.TaskWorkflow.deleteSchedule.Z214

```mermaid
flowchart TD
  n1["try Z.214"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["fileEditor.installFileEditors.refresh"]:::internal-link
  n4["catch Z.218 cause"]
  n5["finally Z.214"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `TaskWorkflow.TaskWorkflow.deleteSchedule`, Quellreihenfolge.
