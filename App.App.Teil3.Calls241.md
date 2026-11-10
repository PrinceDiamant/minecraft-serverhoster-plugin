[[00 Start]] › [[Dashboard-UI]] › [[UI-App]] › [[App.App]] › [[App.App.Teil3.Calls241]]

# App.App.Teil3.Calls241

```mermaid
flowchart TD
  n1["SetupWorkflow.SetupWorkflow"]:::internal-link
  n2["TaskWorkflow.TaskWorkflow"]:::internal-link
  n3["BackupWorkflow.BackupWorkflow"]:::internal-link
  n4["SettingsWorkflow.SettingsWorkflow"]:::internal-link
  n1 -->|"Z.242"| n2
  n2 -->|"Z.243"| n3
  n3 -->|"Z.244"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
```

```knoten
SetupWorkflow.SetupWorkflow
  `SetupWorkflow` in `SetupWorkflow.tsx`. Ruft `dashboardRequest`, `refresh`, `SetupWizard`.
TaskWorkflow.TaskWorkflow
  `TaskWorkflow` in `TaskWorkflow.tsx`. Ruft `dashboardRequest`, `refresh`, `newDraft`.
BackupWorkflow.BackupWorkflow
  Sichert `BackupWorkflow`. Ruft `dashboardRequest`, `refresh`, `testTarget`. Befund: Altlast (sicher).
SettingsWorkflow.SettingsWorkflow
  `SettingsWorkflow` in `SettingsWorkflow.tsx`. Ruft `loadBackupSettings`, `refresh`, `save`.
```

- Fortsetzung von `App.App.Teil3`, Quellreihenfolge.
