[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.Teil2]]

# SetupWorkflow.SetupWorkflow.Teil2

```mermaid
flowchart TD
  n1["hostApi.dashboardRequest"]:::internal-link
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["fileEditor.installFileEditors.refresh"]:::internal-link
  n1 -->|"Z.66"| n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
hostApi.dashboardRequest
  `dashboardRequest` in `hostApi.ts`.
fileEditor.installFileEditors.refresh
  Lädt neu `refresh`. Ruft `editorFor`.
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow`, Quellreihenfolge.
