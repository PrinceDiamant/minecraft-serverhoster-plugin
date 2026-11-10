[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow]]

# BackupWorkflow.BackupWorkflow

`BackupWorkflow.BackupWorkflow()` [ui/src/components/BackupWorkflow.tsx:29–232](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/BackupWorkflow.tsx#L29-L232)

```mermaid
flowchart TD
  n1["BackupWorkflow.BackupWorkflow.Teil1"]:::internal-link
  n2["BackupWorkflow.BackupWorkflow.Teil2"]:::internal-link
  n3["BackupWorkflow.BackupWorkflow.onPageChange"]:::internal-link
  n4["BackupWorkflow.BackupWorkflow.onServerChange"]:::internal-link
  n5["BackupWorkflow.BackupWorkflow.createBackup"]:::internal-link
  n6["BackupWorkflow.BackupWorkflow.testTarget"]:::internal-link
  n7["BackupWorkflow.BackupWorkflow.mutateBackup"]:::internal-link
  n1 -->|"weiter"| n2
  n2 -->|"innere Methode"| n3
  n3 -->|"innere Methode"| n4
  n4 -->|"innere Methode"| n5
  n5 -->|"innere Methode"| n6
  n6 -->|"innere Methode"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupWorkflow.BackupWorkflow.Teil1
  Abschnitt 1 dieses Ablaufs, in Quellreihenfolge.
BackupWorkflow.BackupWorkflow.Teil2
  Abschnitt 2 dieses Ablaufs, in Quellreihenfolge.
BackupWorkflow.BackupWorkflow.onPageChange
  Reagiert `onPageChange`. Ruft `refresh`.
BackupWorkflow.BackupWorkflow.onServerChange
  Reagiert `onServerChange`. Ruft `refresh`.
BackupWorkflow.BackupWorkflow.createBackup
  Legt an `createBackup`. Ruft `dashboardRequest`, `refresh`.
BackupWorkflow.BackupWorkflow.testTarget
  Prüft `testTarget`. Ruft `dashboardRequest`.
BackupWorkflow.BackupWorkflow.mutateBackup
  `mutateBackup` in `BackupWorkflow.tsx`. Ruft `dashboardRequest`, `jsonBody`, `refresh`.
```

- `BackupWorkflow` in `ui/src/components/BackupWorkflow.tsx`
- Befund: Altlast, sicher. BackupWorkflow.tsx:214 server= aus #srv; index.html hat nur CSS #srv
