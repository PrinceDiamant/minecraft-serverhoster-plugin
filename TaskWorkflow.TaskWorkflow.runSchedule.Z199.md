[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow.runSchedule]] › [[TaskWorkflow.TaskWorkflow.runSchedule.Z199]]

# TaskWorkflow.TaskWorkflow.runSchedule.Z199

```mermaid
flowchart TD
  n1["try Z.199"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["fileEditor.installFileEditors.refresh"]:::internal-link
  n4["catch Z.203 cause"]
  n5["finally Z.199"]
  n2 --> n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.199
  Zeile 199: Versuch. Der Fehlerpfad geht in catch.
hostApi.dashboardRequest
  `dashboardRequest` in `hostApi.ts`.
fileEditor.installFileEditors.refresh
  Lädt neu `refresh`. Ruft `editorFor`.
catch Z.203 cause
  Zeile 203: fängt cause.
finally Z.199
  Läuft danach immer, auch nach einem Fehler.
```

- Fortsetzung von `TaskWorkflow.TaskWorkflow.runSchedule`, Quellreihenfolge.
