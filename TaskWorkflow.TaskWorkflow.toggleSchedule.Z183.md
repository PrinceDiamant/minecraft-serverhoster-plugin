[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow.toggleSchedule]] › [[TaskWorkflow.TaskWorkflow.toggleSchedule.Z183]]

# TaskWorkflow.TaskWorkflow.toggleSchedule.Z183

```mermaid
flowchart TD
  n1["try Z.183"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["hostApi.jsonBody"]:::internal-link
  n4["fileEditor.installFileEditors.refresh"]:::internal-link
  n5["catch Z.189 cause"]
  n6["finally Z.183"]
  n2 -->|"Z.186"| n3
  n3 --> n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `TaskWorkflow.TaskWorkflow.toggleSchedule`, Quellreihenfolge.
