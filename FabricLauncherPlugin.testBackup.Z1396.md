[[00 Start]] › [[Backup]] › [[Backup-Lauf]] › [[FabricLauncherPlugin.testBackup]] › [[FabricLauncherPlugin.testBackup.Z1396]]

# FabricLauncherPlugin.testBackup.Z1396

```mermaid
flowchart TD
  n1["if Z.1396 (remoteBackupSelected())"]
  n2["FabricLauncherPlugin.remoteBackupSelected"]:::internal-link
  n3["FabricLauncherPlugin.backupCredentials"]:::internal-link
  n4["RemoteBackupBridge.test"]:::internal-link
  n5["FabricLauncherPlugin.remoteBackupSettings"]:::internal-link
  n6["Schritt Z.1402 Files.createDirectories(directory);"]
  n7["Schritt Z.1403 Path probe = Files.createTempFile(directory, '.ba…"]
  n8["try Z.1404"]
  n9["Schritt Z.1404 Files.delete(probe);"]
  n10["finally Z.1404"]
  n11["Schritt Z.1405 Files.deleteIfExists(probe);"]
  n1 -->|"Z.1396"| n2
  n4 -->|"Z.1398"| n5
  n3 --> n4
  n6 --> n7
  n8 --> n9
  n9 --> n10
  n10 --> n11
  n7 --> n8
  n2 -->|"ja"| n3
  n2 -->|"nein"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.testBackup`, Quellreihenfolge.
