[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.submit]] › [[SetupWorkflow.SetupWorkflow.submit.Z100]]

# SetupWorkflow.SetupWorkflow.submit.Z100

```mermaid
flowchart TD
  n1["try Z.100"]
  n2["SetupWorkflow.SetupWorkflow.submit.Z100.Teil1"]:::internal-link
  n3["SetupWorkflow.SetupWorkflow.submit.Z100.Teil2"]:::internal-link
  n4["catch Z.164 cause"]
  n5["finally Z.100"]
  n2 -->|"weiter"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow.submit`, Quellreihenfolge.
