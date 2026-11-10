[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.finish]] › [[SetupWizard.SetupWizard.finish.Z135.Teil2.Z196.Z197]]

# SetupWizard.SetupWizard.finish.Z135.Teil2.Z196.Z197

```mermaid
flowchart TD
  n1["try Z.197"]
  n2["BackupSettings.loadBackupSettings"]:::internal-link
  n3["BackupSettings.saveBackupSettings"]:::internal-link
  n4["SetupWizard.finish.createSchedule"]:::internal-link
  n5["catch Z.212 cause"]
  n2 --> n3
  n3 --> n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupWizard.SetupWizard.finish.Z135.Teil2.Z196`, Quellreihenfolge.
