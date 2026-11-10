[[00 Start]] › [[Dashboard-HTTP]] › [[API-Backup]] › [[Dashboard.backupMutate]] › [[Dashboard.backupMutate.Z626]]

# Dashboard.backupMutate.Z626

```mermaid
flowchart TD
  n1["if Z.626 (restore)"]
  n2["FabricLauncherPlugin.restoreBackup"]:::internal-link
  n3["FabricLauncherPlugin.info(String,String)"]:::internal-link
  n4["Dashboard.json"]:::internal-link
  n5["FabricLauncherPlugin.deleteBackup"]:::internal-link
  n6["FabricLauncherPlugin.info(String,String)"]:::internal-link
  n7["Dashboard.json"]:::internal-link
  n2 --> n3
  n3 --> n4
  n5 --> n6
  n6 --> n7
  n1 -->|"ja"| n2
  n1 -->|"nein"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.626 (restore)
  Zeile 626: prüft `(restore)`.
FabricLauncherPlugin.restoreBackup
  Stellt wieder her `restoreBackup`. Ruft `slot`, `running`, `remoteBackupSelected`.
FabricLauncherPlugin.info(String,String)
  Schreibt eine Infozeile `info`. Ruft `slot`.
Dashboard.json
  Antwortet mit JSON `json`. Ruft `sendBytes`.
FabricLauncherPlugin.deleteBackup
  Löscht `deleteBackup`. Ruft `remoteBackupSelected`, `backupCredentials`, `delete`.
```

- Fortsetzung von `Dashboard.backupMutate`, Quellreihenfolge.
