[[00 Start]] › [[Backup]] › [[Backup-Dateien]] › [[FabricLauncherPlugin.restoreBackup]] › [[FabricLauncherPlugin.restoreBackup.Z1446.Z1448]]

# FabricLauncherPlugin.restoreBackup.Z1446.Z1448

```mermaid
flowchart TD
  n1["try Z.1448"]
  n2["FabricLauncherPlugin.backupCredentials"]:::internal-link
  n3["try Z.1450"]
  n4["RemoteBackupBridge.download"]:::internal-link
  n5["FabricLauncherPlugin.remoteBackupSettings"]:::internal-link
  n6["BackupBridge.restoreZip"]:::internal-link
  n7["FabricLauncherPlugin.profile"]:::internal-link
  n8["ServerProfile.directory"]:::internal-link
  n9["finally Z.1448"]
  n10["Schritt Z.1455 Files.deleteIfExists(temp);"]
  n4 -->|"Z.1451"| n5
  n3 --> n4
  n2 --> n3
  n6 -->|"Z.1453"| n7
  n7 -->|"Z.1453"| n8
  n5 --> n6
  n1 --> n2
  n8 --> n9
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.restoreBackup.Z1446`, Quellreihenfolge.
