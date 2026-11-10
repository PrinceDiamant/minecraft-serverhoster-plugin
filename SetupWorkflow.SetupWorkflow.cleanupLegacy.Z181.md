[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.cleanupLegacy]] › [[SetupWorkflow.SetupWorkflow.cleanupLegacy.Z181]]

# SetupWorkflow.SetupWorkflow.cleanupLegacy.Z181

```mermaid
flowchart TD
  n1["try Z.181"]
  n2["hostApi.dashboardRequest"]:::internal-link
  n3["hostApi.jsonBody"]:::internal-link
  n4["fileEditor.installFileEditors.refresh"]:::internal-link
  n5["catch Z.188 cause"]
  n6["finally Z.181"]
  n2 -->|"Z.184"| n3
  n3 --> n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n4 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.181
  Zeile 181: Versuch. Der Fehlerpfad geht in catch.
hostApi.dashboardRequest
  `dashboardRequest` in `hostApi.ts`.
hostApi.jsonBody
  Antwortet mit JSON `jsonBody`.
fileEditor.installFileEditors.refresh
  Lädt neu `refresh`. Ruft `editorFor`.
catch Z.188 cause
  Zeile 188: fängt cause.
finally Z.181
  Läuft danach immer, auch nach einem Fehler.
```

- Fortsetzung von `SetupWorkflow.SetupWorkflow.cleanupLegacy`, Quellreihenfolge.
