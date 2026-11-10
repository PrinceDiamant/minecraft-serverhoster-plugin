[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWizard]] › [[SetupWizard.SetupWizard]] › [[SetupWizard.SetupWizard.finish]] › [[SetupWizard.SetupWizard.finish.Z135.Teil2.Z185]]

# SetupWizard.SetupWizard.finish.Z135.Teil2.Z185

```mermaid
flowchart TD
  n1["if Z.185 action !== 'import'"]
  n2["BackupSettings.saveBackupSettings"]:::internal-link
  n3["if Z.187 backupSettings.backupStorage === 'remote'"]
  n4["SetupWizard.finish.createSchedule"]:::internal-link
  n2 --> n3
  n3 --> n4
  n3 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.185 action !== 'import'
  Zeile 185: prüft `action !== 'import'`.
BackupSettings.saveBackupSettings
  Speichert `saveBackupSettings`. Ruft `dashboardRequest`, `jsonBody`.
if Z.187 backupSettings.backupStorage === 'remote'
  Zeile 187: prüft `backupSettings.backupStorage === 'remote'`.
SetupWizard.finish.createSchedule
  Legt an `createSchedule`. Ruft `dashboardRequest`, `jsonBody`.
```

- Fortsetzung von `SetupWizard.SetupWizard.finish.Z135.Teil2`, Quellreihenfolge.
