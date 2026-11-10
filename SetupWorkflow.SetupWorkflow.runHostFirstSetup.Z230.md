[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.runHostFirstSetup]] › [[SetupWorkflow.SetupWorkflow.runHostFirstSetup.Z230]]

# SetupWorkflow.SetupWorkflow.runHostFirstSetup.Z230

```mermaid
flowchart TD
  n1["try Z.230"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["hostApi.jsonBody"]:::internal-link
  n4["catch Z.237 cause"]
  n5["finally Z.230"]
  n2 -->|"Z.233"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow.runHostFirstSetup`, Quellreihenfolge.
