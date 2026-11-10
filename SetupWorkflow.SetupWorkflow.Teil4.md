[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.Teil4]]

# SetupWorkflow.SetupWorkflow.Teil4

```mermaid
flowchart TD
  n1["if Z.248 state.required"]
  n2["SetupWizard.SetupWizard"]:::internal-link
  n3["return Z.248 return (SetupWizard state=(state) host=…"]
  n4["SetupWorkflow.SetupWorkflow.Teil4.Calls258"]:::internal-link
  n5["SetupWorkflow.SetupWorkflow.Teil4.Calls328"]:::internal-link
  n6["SetupWorkflow.SetupWorkflow.Teil4.Calls372"]:::internal-link
  n7["return Z.250 return ( (section className='setup-work…"]
  n2 --> n3
  n1 -->|"ja"| n2
  n4 -->|"weiter"| n5
  n5 -->|"weiter"| n6
  n6 --> n7
  n3 --> n4
  n1 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow`, Quellreihenfolge.
