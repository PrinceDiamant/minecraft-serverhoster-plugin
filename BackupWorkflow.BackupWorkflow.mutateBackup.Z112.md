[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow.mutateBackup]] › [[BackupWorkflow.BackupWorkflow.mutateBackup.Z112]]

# BackupWorkflow.BackupWorkflow.mutateBackup.Z112

```mermaid
flowchart TD
  n1["try Z.112"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["hostApi.jsonBody"]:::internal-link
  n4["fileEditor.installFileEditors.refresh"]:::internal-link
  n5["catch Z.121 cause"]
  n6["finally Z.112"]
  n2 -->|"Z.115"| n3
  n3 --> n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupWorkflow.BackupWorkflow.mutateBackup`, Quellreihenfolge.
