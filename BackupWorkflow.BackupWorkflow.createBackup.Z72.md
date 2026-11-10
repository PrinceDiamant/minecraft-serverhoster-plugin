[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow.createBackup]] › [[BackupWorkflow.BackupWorkflow.createBackup.Z72]]

# BackupWorkflow.BackupWorkflow.createBackup.Z72

```mermaid
flowchart TD
  n1["try Z.72"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["fileEditor.installFileEditors.refresh"]:::internal-link
  n4["catch Z.76 cause"]
  n5["finally Z.72"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupWorkflow.BackupWorkflow.createBackup`, Quellreihenfolge.
