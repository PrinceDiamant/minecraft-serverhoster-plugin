[[00 Start]] › [[Backup]] › [[Backup-Dateien]] › [[FabricLauncherPlugin.restoreBackup]] › [[FabricLauncherPlugin.restoreBackup.Z1446]]

# FabricLauncherPlugin.restoreBackup.Z1446

```mermaid
flowchart TD
  n1["if Z.1446 (remoteBackupSelected())"]
  n2["FabricLauncherPlugin.remoteBackupSelected"]:::internal-link
  n3["Schritt Z.1447 Path temp = Files.createTempFile(getDataFolder().…"]
  n4["FabricLauncherPlugin.restoreBackup.Z1446.Z1448"]:::internal-link
  n5["BackupBridge.restore"]:::internal-link
  n6["FabricLauncherPlugin.profile"]:::internal-link
  n7["ServerProfile.directory"]:::internal-link
  n8["FabricLauncherPlugin.backupSpec"]:::internal-link
  n1 -->|"Z.1446"| n2
  n3 --> n4
  n5 -->|"Z.1458"| n6
  n6 -->|"Z.1458"| n7
  n7 -->|"Z.1458"| n8
  n2 -->|"ja"| n3
  n2 -->|"nein"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.restoreBackup`, Quellreihenfolge.
