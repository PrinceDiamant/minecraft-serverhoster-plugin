[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.next]] › [[SetupWizard.SetupWizard.next.Z110]]

# SetupWizard.SetupWizard.next.Z110

```mermaid
flowchart TD
  n1["if Z.110 step === 1"]
  n2["if Z.111 !path"]
  n3["return Z.113 return;"]
  n4["if Z.115 action !== 'import' && (!versionIsValid(type, mcV…"]
  n5["VersionSelect.versionIsValid"]:::internal-link
  n6["return Z.118 return;"]
  n2 -->|"ja"| n3
  n4 -->|"Z.115"| n5
  n5 -->|"ja"| n6
  n3 --> n4
  n2 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWizard.SetupWizard.next`, Quellreihenfolge.
