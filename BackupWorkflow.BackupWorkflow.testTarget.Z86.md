[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow.testTarget]] › [[BackupWorkflow.BackupWorkflow.testTarget.Z86]]

# BackupWorkflow.BackupWorkflow.testTarget.Z86

```mermaid
flowchart TD
  n1["try Z.86"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["catch Z.91 cause"]
  n4["finally Z.86"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n2 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.86
  Zeile 86: Versuch. Der Fehlerpfad geht in catch.
hostApi.dashboardRequest
  `dashboardRequest` in `hostApi.ts`.
catch Z.91 cause
  Zeile 91: fängt cause.
finally Z.86
  Läuft danach immer, auch nach einem Fehler.
```

- Fortsetzung von `BackupWorkflow.BackupWorkflow.testTarget`, Quellreihenfolge.
