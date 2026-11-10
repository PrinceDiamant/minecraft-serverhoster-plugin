[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.Teil4.Calls258]]

# SetupWorkflow.SetupWorkflow.Teil4.Calls258

```mermaid
flowchart TD
  n1["fileEditor.installFileEditors.refresh"]:::internal-link
  n2["SetupWorkflow.SetupWorkflow.cleanupLegacy"]:::internal-link
  n3["SetupWorkflow.SetupWorkflow.submit"]:::internal-link
  n4["VersionSelect.versionIsValid"]:::internal-link
  n5["SetupWorkflow.SetupWorkflow.submit"]:::internal-link
  n6["VersionSelect.versionIsValid"]:::internal-link
  n1 -->|"Z.275"| n2
  n2 -->|"Z.325"| n3
  n3 -->|"Z.327"| n4
  n4 -->|"Z.327"| n5
  n5 -->|"Z.328"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow.Teil4`, Quellreihenfolge.
