[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.Teil4.Calls283]]

# SetupWizard.SetupWizard.Teil4.Calls283

```mermaid
flowchart TD
  n1["SetupWizard.SetupWizard.chooseAction"]:::internal-link
  n2["SetupWizard.SetupWizard.chooseCandidate"]:::internal-link
  n3["VersionSelect.VersionSelect"]:::internal-link
  n4["BackupSettings.BackupSettings"]:::internal-link
  n5["BackupSettings.saveBackupSettings"]:::internal-link
  n6["hostApi.dashboardRequest"]:::internal-link
  n1 -->|"Z.296"| n2
  n2 -->|"Z.310"| n3
  n3 -->|"Z.319"| n4
  n4 -->|"Z.330"| n5
  n5 -->|"Z.332"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWizard.SetupWizard.Teil4`, Quellreihenfolge.
