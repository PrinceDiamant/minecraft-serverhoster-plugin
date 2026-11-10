[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.cleanupLegacy]] › [[SetupWorkflow.SetupWorkflow.cleanupLegacy.Z181]]

# SetupWorkflow.SetupWorkflow.cleanupLegacy.Z181

```mermaid
flowchart TD
  n1["try Z.181"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["hostApi.jsonBody"]:::internal-link
  n4["fileEditor.installFileEditors.refresh"]:::internal-link
  n5["catch Z.188 cause"]
  n6["finally Z.181"]
  n2 -->|"Z.184"| n3
  n3 --> n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow.cleanupLegacy`, Quellreihenfolge.
