[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.finish]] › [[SetupWizard.SetupWizard.finish.Z135]]

# SetupWizard.SetupWizard.finish.Z135

```mermaid
flowchart TD
  n1["try Z.135"]
  n2["SetupWizard.SetupWizard.finish.Z135.Teil1"]:::internal-link
  n3["SetupWizard.SetupWizard.finish.Z135.Teil2"]:::internal-link
  n4["SetupWizard.SetupWizard.finish.Z135.Teil3"]:::internal-link
  n5["catch Z.236 cause"]
  n6["finally Z.135"]
  n2 -->|"weiter"| n3
  n3 -->|"weiter"| n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWizard.SetupWizard.finish`, Quellreihenfolge.
