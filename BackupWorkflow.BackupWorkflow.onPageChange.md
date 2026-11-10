[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow.onPageChange]]

# BackupWorkflow.BackupWorkflow.onPageChange

`BackupWorkflow.onPageChange(event: Event)` [ui/src/components/BackupWorkflow.tsx:48–50](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/BackupWorkflow.tsx#L48-L50)

```mermaid
flowchart TD
  n1["if Z.49 (event as CustomEvent(string)).detail === 'backup'"]
  n2["fileEditor.installFileEditors.refresh"]:::internal-link
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.49 (event as CustomEvent(string)).detail === 'backup'
  Zeile 49: prüft `(event as CustomEvent(string)).detail === 'backup'`.
fileEditor.installFileEditors.refresh
  Lädt neu `refresh`. Ruft `editorFor`.
```

- `onPageChange` in `ui/src/components/BackupWorkflow.tsx`
