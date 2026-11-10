[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.Teil3]]

# SetupWorkflow.SetupWorkflow.Teil3

```mermaid
flowchart TD
  n1["if Z.244 !state && !error"]
  n2["return Z.244 return (section className='setup-workflow')(p)Ein…"]
  n3["if Z.245 !state"]
  n4["fileEditor.installFileEditors.refresh"]:::internal-link
  n5["return Z.245 return (section className='setup-workfl…"]
  n6["if Z.246 state.required && !host && !error"]
  n7["return Z.246 return (section className='setup-workflow')(p)Hos…"]
  n8["if Z.247 state.required && !host"]
  n9["fileEditor.installFileEditors.refresh"]:::internal-link
  n10["return Z.247 return (section className='setup-workfl…"]
  n1 -->|"ja"| n2
  n4 --> n5
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n6 -->|"ja"| n7
  n5 --> n6
  n3 --> n6
  n9 --> n10
  n8 -->|"ja"| n9
  n7 --> n8
  n6 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow`, Quellreihenfolge.
