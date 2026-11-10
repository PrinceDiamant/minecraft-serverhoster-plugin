[[00 Start]] › [[Backup]] › [[Backup-Dateien]] › [[FabricLauncherPlugin.downloadBackup]] › [[FabricLauncherPlugin.downloadBackup.Z1428]]

# FabricLauncherPlugin.downloadBackup.Z1428

```mermaid
flowchart TD
  n1["if Z.1428 (remoteBackupSelected())"]
  n2["FabricLauncherPlugin.remoteBackupSelected"]:::internal-link
  n3["FabricLauncherPlugin.backupCredentials"]:::internal-link
  n4["RemoteBackupBridge.download"]:::internal-link
  n5["FabricLauncherPlugin.remoteBackupSettings"]:::internal-link
  n6["BackupBridge.file"]:::internal-link
  n7["FabricLauncherPlugin.backupSpec"]:::internal-link
  n1 -->|"Z.1428"| n2
  n4 -->|"Z.1430"| n5
  n3 --> n4
  n6 -->|"Z.1432"| n7
  n2 -->|"ja"| n3
  n2 -->|"nein"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1428 (remoteBackupSelected())
  Zeile 1428: prüft `(remoteBackupSelected())`.
FabricLauncherPlugin.remoteBackupSelected
  `remoteBackupSelected` in `FabricLauncherPlugin.java`.
FabricLauncherPlugin.backupCredentials
  Sichert `backupCredentials`. Ruft `load`.
RemoteBackupBridge.download
  Liefert zum Herunterladen `download`. Ruft `safeId`, `named`, `connect`.
FabricLauncherPlugin.remoteBackupSettings
  `remoteBackupSettings` in `FabricLauncherPlugin.java`.
BackupBridge.file
  Liefert die Datei `file`. Ruft `safeId`, `named`, `directory`.
FabricLauncherPlugin.backupSpec
  Sichert `backupSpec`.
```

- Fortsetzung von `FabricLauncherPlugin.downloadBackup`, Quellreihenfolge.
