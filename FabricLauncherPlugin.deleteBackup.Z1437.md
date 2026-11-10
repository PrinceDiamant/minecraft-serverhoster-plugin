[[00 Start]] › [[Backup]] › [[Backup-Dateien]] › [[FabricLauncherPlugin.deleteBackup]] › [[FabricLauncherPlugin.deleteBackup.Z1437]]

# FabricLauncherPlugin.deleteBackup.Z1437

```mermaid
flowchart TD
  n1["if Z.1437 (remoteBackupSelected())"]
  n2["FabricLauncherPlugin.remoteBackupSelected"]:::internal-link
  n3["FabricLauncherPlugin.backupCredentials"]:::internal-link
  n4["RemoteBackupBridge.delete"]:::internal-link
  n5["FabricLauncherPlugin.remoteBackupSettings"]:::internal-link
  n6["BackupBridge.delete"]:::internal-link
  n7["FabricLauncherPlugin.backupSpec"]:::internal-link
  n1 -->|"Z.1437"| n2
  n4 -->|"Z.1439"| n5
  n3 --> n4
  n6 -->|"Z.1440"| n7
  n2 -->|"ja"| n3
  n2 -->|"nein"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1437 (remoteBackupSelected())
  Zeile 1437: prüft `(remoteBackupSelected())`.
FabricLauncherPlugin.remoteBackupSelected
  `remoteBackupSelected` in `FabricLauncherPlugin.java`.
FabricLauncherPlugin.backupCredentials
  Sichert `backupCredentials`. Ruft `load`.
RemoteBackupBridge.delete
  Löscht `delete`. Ruft `safeId`, `named`, `connect`.
FabricLauncherPlugin.remoteBackupSettings
  `remoteBackupSettings` in `FabricLauncherPlugin.java`.
BackupBridge.delete
  Löscht `delete`. Ruft `file`.
FabricLauncherPlugin.backupSpec
  Sichert `backupSpec`.
```

- Fortsetzung von `FabricLauncherPlugin.deleteBackup`, Quellreihenfolge.
