[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow]] › [[TaskWorkflow.TaskWorkflow.Teil2.Calls254]]

# TaskWorkflow.TaskWorkflow.Teil2.Calls254

```mermaid
flowchart TD
  n1["fileEditor.installFileEditors.refresh"]:::internal-link
  n2["TaskWorkflow.newDraft"]:::internal-link
  n3["TaskWorkflow.newDraft"]:::internal-link
  n4["TaskWorkflow.describeSchedule"]:::internal-link
  n5["TaskWorkflow.TaskWorkflow.toggleSchedule"]:::internal-link
  n6["TaskWorkflow.draftFrom"]:::internal-link
  n1 -->|"Z.257"| n2
  n2 -->|"Z.302"| n3
  n3 -->|"Z.315"| n4
  n4 -->|"Z.326"| n5
  n5 -->|"Z.329"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
fileEditor.installFileEditors.refresh
  Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Lädt neu `refresh`. Ruft `editorFor`.
TaskWorkflow.newDraft
  Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `newDraft` in `TaskWorkflow.tsx`. Ruft `newId`.
TaskWorkflow.describeSchedule
  Die [[Glossar#Bedienseite|Bedienseite]] plant das. Beschreibt `describeSchedule`.
TaskWorkflow.TaskWorkflow.toggleSchedule
  Die [[Glossar#Bedienseite|Bedienseite]] schaltet um den [[Glossar#Zeitplan|Zeitplan]]. Schaltet um `toggleSchedule`. Ruft `dashboardRequest`, `jsonBody`, `refresh`.
TaskWorkflow.draftFrom
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um aus. Baut einen Entwurf `draftFrom`.
```

> [!knoten]- Was die Blöcke tun
> - **fileEditor.installFileEditors.refresh**: Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Lädt neu `refresh`. Ruft `editorFor`.
> - **TaskWorkflow.newDraft**: Die [[Glossar#Bedienseite|Bedienseite]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `newDraft` in `TaskWorkflow.tsx`. Ruft `newId`.
> - **TaskWorkflow.describeSchedule**: Die [[Glossar#Bedienseite|Bedienseite]] plant das. Beschreibt `describeSchedule`.
> - **TaskWorkflow.TaskWorkflow.toggleSchedule**: Die [[Glossar#Bedienseite|Bedienseite]] schaltet um den [[Glossar#Zeitplan|Zeitplan]]. Schaltet um `toggleSchedule`. Ruft `dashboardRequest`, `jsonBody`, `refresh`.
> - **TaskWorkflow.draftFrom**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um aus. Baut einen Entwurf `draftFrom`.

- Weitere [[Glossar#Funktion|Funktionen]], die ab [[Glossar#Zeile|Zeile]] 254 aufgerufen werden.
- Fortsetzung von `TaskWorkflow.TaskWorkflow.Teil2`.
