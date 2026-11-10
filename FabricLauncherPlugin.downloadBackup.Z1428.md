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

- Fortsetzung von `FabricLauncherPlugin.downloadBackup`, Quellreihenfolge.
