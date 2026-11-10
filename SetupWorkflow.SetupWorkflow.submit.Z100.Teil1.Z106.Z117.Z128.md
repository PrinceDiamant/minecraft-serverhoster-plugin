[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.submit]] › [[SetupWorkflow.SetupWorkflow.submit.Z100.Teil1.Z106.Z117.Z128]]

# SetupWorkflow.SetupWorkflow.submit.Z100.Teil1.Z106.Z117.Z128

```mermaid
flowchart TD
  n1["if Z.128 action === 'import' && !state?.candidates.find((c…"]
  n2["if Z.134 !accepted"]
  n3["return Z.134 return;"]
  n4["if Z.144 !accepted"]
  n5["return Z.144 return;"]
  n2 -->|"ja"| n3
  n4 -->|"ja"| n5
  n1 -->|"ja"| n2
  n1 -->|"nein"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow.submit.Z100.Teil1.Z106.Z117`, Quellreihenfolge.
