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

```knoten
try Z.112
  Zeile 112: Versuch. Der Fehlerpfad geht in catch.
hostApi.dashboardRequest
  `dashboardRequest` in `hostApi.ts`.
hostApi.jsonBody
  Antwortet mit JSON `jsonBody`.
fileEditor.installFileEditors.refresh
  Lädt neu `refresh`. Ruft `editorFor`.
catch Z.121 cause
  Zeile 121: fängt cause.
finally Z.112
  Läuft danach immer, auch nach einem Fehler.
```

- Fortsetzung von `BackupWorkflow.BackupWorkflow.mutateBackup`, Quellreihenfolge.
