[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow]] › [[SetupWorkflow.SetupWorkflow.submit]] › [[SetupWorkflow.SetupWorkflow.submit.Z100.Teil2]]

# SetupWorkflow.SetupWorkflow.submit.Z100.Teil2

```mermaid
flowchart TD
  n1["fileEditor.installFileEditors.refresh"]:::internal-link
  n2["if Z.155 state?.cleanupAvailable"]
  n3["if Z.162 shouldClean"]
  n4["SetupWorkflow.SetupWorkflow.cleanupLegacy"]:::internal-link
  n3 -->|"ja"| n4
  n2 -->|"ja"| n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
fileEditor.installFileEditors.refresh
  Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Lädt neu `refresh`. Ruft `editorFor`.
if Z.155 state?.cleanupAvailable
  Zeile 155: prüft `state?.cleanupAvailable`.
if Z.162 shouldClean
  Zeile 162: prüft `shouldClean`.
SetupWorkflow.SetupWorkflow.cleanupLegacy
  Die [[Glossar#Bedienseite|Bedienseite]] räumt auf den alten Weg. Räumt auf `cleanupLegacy`. Ruft `dashboardRequest`, `jsonBody`, `refresh`.
```

> [!knoten]- Was die Blöcke tun
> - **fileEditor.installFileEditors.refresh**: Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Lädt neu `refresh`. Ruft `editorFor`.
> - **if Z.155 state?.cleanupAvailable**: Zeile 155: prüft `state?.cleanupAvailable`.
> - **if Z.162 shouldClean**: Zeile 162: prüft `shouldClean`.
> - **SetupWorkflow.SetupWorkflow.cleanupLegacy**: Die [[Glossar#Bedienseite|Bedienseite]] räumt auf den alten Weg. Räumt auf `cleanupLegacy`. Ruft `dashboardRequest`, `jsonBody`, `refresh`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `SetupWorkflow.SetupWorkflow.submit.Z100`.
