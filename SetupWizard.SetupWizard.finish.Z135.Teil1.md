[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.finish]] › [[SetupWizard.SetupWizard.finish.Z135.Teil1]]

# SetupWizard.SetupWizard.finish.Z135.Teil1

```mermaid
flowchart TD
  n1["SetupWizard.SetupWizard.finish.Z135.Teil1.Z138"]:::internal-link
  n2["if Z.160 minimize"]
  n3["if Z.167 !accepted"]
  n4["return Z.167 return;"]
  n5["if Z.170 !backupSettings"]
  n6["throw Z.170 throw new Error('Backup-Einstellungen wurden nich…"]
  n3 -->|"ja"| n4
  n2 -->|"ja"| n3
  n1 --> n2
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n2 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWizard.SetupWizard.finish.Z135`, Quellreihenfolge.
