[[00 Start]] › [[Backup]] › [[Backup-Lauf]] › [[FabricLauncherPlugin.runBackup]] › [[FabricLauncherPlugin.runBackup.Z1360.Z1362.Z1368]]

# FabricLauncherPlugin.runBackup.Z1360.Z1362.Z1368

```mermaid
flowchart TD
  n1["if Z.1368 (remoteBackupSelected())"]
  n2["FabricLauncherPlugin.remoteBackupSelected"]:::internal-link
  n3["FabricLauncherPlugin.backupCredentials"]:::internal-link
  n4["RemoteBackupBridge.archive"]:::internal-link
  n5["FabricLauncherPlugin.profile"]:::internal-link
  n6["ServerProfile.directory"]:::internal-link
  n7["FabricLauncherPlugin.remoteBackupSettings"]:::internal-link
  n8["if Z.1375 (!r.db().isBlank() && !'ok'.equals(r.db()))"]
  n9["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n10["BackupBridge.archive"]:::internal-link
  n11["FabricLauncherPlugin.profile"]:::internal-link
  n12["ServerProfile.directory"]:::internal-link
  n13["if Z.1380 (!r.db().isBlank() && !'ok'.equals(r.db()))"]
  n14["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n1 -->|"Z.1368"| n2
  n4 -->|"Z.1370"| n5
  n5 -->|"Z.1370"| n6
  n6 -->|"Z.1370"| n7
  n3 --> n4
  n8 -->|"ja"| n9
  n7 --> n8
  n10 -->|"Z.1378"| n11
  n11 -->|"Z.1378"| n12
  n13 -->|"ja"| n14
  n12 --> n13
  n2 -->|"ja"| n3
  n2 -->|"nein"| n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.runBackup.Z1360.Z1362`, Quellreihenfolge.
