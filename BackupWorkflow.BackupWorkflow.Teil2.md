[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow]] › [[BackupWorkflow.BackupWorkflow.Teil2]]

# BackupWorkflow.BackupWorkflow.Teil2

```mermaid
flowchart TD
  n1["BackupWorkflow.BackupWorkflow.testTarget"]:::internal-link
  n2["BackupWorkflow.BackupWorkflow.createBackup"]:::internal-link
  n3["fileEditor.installFileEditors.refresh"]:::internal-link
  n4["hostApi.formatBytes"]:::internal-link
  n5["BackupWorkflow.BackupWorkflow.mutateBackup"]:::internal-link
  n6["BackupWorkflow.BackupWorkflow.mutateBackup"]:::internal-link
  n7["return Z.137 return ( (div className='feature-workfl…"]
  n1 -->|"Z.151"| n2
  n2 -->|"Z.184"| n3
  n3 -->|"Z.210"| n4
  n4 -->|"Z.217"| n5
  n5 -->|"Z.220"| n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupWorkflow.BackupWorkflow.testTarget
  Die [[Glossar#Bedienseite|Bedienseite]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `testTarget`. Ruft `dashboardRequest`.
BackupWorkflow.BackupWorkflow.createBackup
  Die [[Glossar#Bedienseite|Bedienseite]] legt an die [[Glossar#Sicherungskopie|Sicherungskopie]]. Legt an `createBackup`. Ruft `dashboardRequest`, `refresh`.
fileEditor.installFileEditors.refresh
  Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Lädt neu `refresh`. Ruft `editorFor`.
hostApi.formatBytes
  Die [[Glossar#Bedienseite|Bedienseite]] macht lesbar die Größe. Formatiert `formatBytes`.
BackupWorkflow.BackupWorkflow.mutateBackup
  Die [[Glossar#Bedienseite|Bedienseite]] sichert das. `mutateBackup` in `BackupWorkflow.tsx`. Ruft `dashboardRequest`, `jsonBody`, `refresh`.
return Z.137 return ( (div className='feature-workfl…
  Zeile 137: Rückgabe `return ( (div className='feature-workfl…`.
```

> [!knoten]- Was die Blöcke tun
> - **BackupWorkflow.BackupWorkflow.testTarget**: Die [[Glossar#Bedienseite|Bedienseite]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `testTarget`. Ruft `dashboardRequest`.
> - **BackupWorkflow.BackupWorkflow.createBackup**: Die [[Glossar#Bedienseite|Bedienseite]] legt an die [[Glossar#Sicherungskopie|Sicherungskopie]]. Legt an `createBackup`. Ruft `dashboardRequest`, `refresh`.
> - **fileEditor.installFileEditors.refresh**: Die [[Glossar#Bedienseite|Bedienseite]] lädt neu das. Lädt neu `refresh`. Ruft `editorFor`.
> - **hostApi.formatBytes**: Die [[Glossar#Bedienseite|Bedienseite]] macht lesbar die Größe. Formatiert `formatBytes`.
> - **BackupWorkflow.BackupWorkflow.mutateBackup**: Die [[Glossar#Bedienseite|Bedienseite]] sichert das. `mutateBackup` in `BackupWorkflow.tsx`. Ruft `dashboardRequest`, `jsonBody`, `refresh`.
> - **return Z.137 return ( (div className='feature-workfl…**: Zeile 137: Rückgabe `return ( (div className='feature-workfl…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `BackupWorkflow.BackupWorkflow`.
