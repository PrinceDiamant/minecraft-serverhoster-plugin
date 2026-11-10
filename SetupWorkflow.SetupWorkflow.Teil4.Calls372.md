[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.Teil4.Calls372]]

# SetupWorkflow.SetupWorkflow.Teil4.Calls372

```mermaid
flowchart TD
  n1["SetupWorkflow.SetupWorkflow.runHostFirstSetup"]:::internal-link
  n2["SetupWorkflow.SetupWorkflow.hostAction"]:::internal-link
  n3["SetupWorkflow.SetupWorkflow.hostAction"]:::internal-link
  n1 -->|"Z.386"| n2
  n2 -->|"Z.387"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SetupWorkflow.SetupWorkflow.runHostFirstSetup
  Führt aus `runHostFirstSetup`. Ruft `dashboardRequest`, `jsonBody`.
SetupWorkflow.SetupWorkflow.hostAction
  Betrifft den Host `hostAction`. Ruft `dashboardRequest`, `jsonBody`.
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow.Teil4`, Quellreihenfolge.
