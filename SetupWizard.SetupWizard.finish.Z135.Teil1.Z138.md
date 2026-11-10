[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.finish]] › [[SetupWizard.SetupWizard.finish.Z135.Teil1.Z138]]

# SetupWizard.SetupWizard.finish.Z135.Teil1.Z138

```mermaid
flowchart TD
  n1["if Z.138 action === 'delete' // action === 'reset'"]
  n2["if Z.148 !accepted"]
  n3["return Z.148 return;"]
  n4["if Z.150 action === 'import' && !candidate?.legacyVersion"]
  n5["if Z.156 !accepted"]
  n6["return Z.156 return;"]
  n2 -->|"ja"| n3
  n5 -->|"ja"| n6
  n4 -->|"ja"| n5
  n1 -->|"ja"| n2
  n1 -->|"nein"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWizard.SetupWizard.finish.Z135.Teil1`, Quellreihenfolge.
