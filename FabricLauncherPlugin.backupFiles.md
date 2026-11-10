[[00 Start]] › [[Backup]] › [[Backup-Dateien]] › [[FabricLauncherPlugin.backupFiles]]

# FabricLauncherPlugin.backupFiles

`FabricLauncherPlugin.backupFiles(String id)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1414–1420](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1414-L1420)

```mermaid
flowchart TD
  n1["if Z.1415 (remoteBackupSelected())"]
  n2["FabricLauncherPlugin.remoteBackupSelected"]:::internal-link
  n3["FabricLauncherPlugin.backupCredentials"]:::internal-link
  n4["RemoteBackupBridge.list"]:::internal-link
  n5["FabricLauncherPlugin.remoteBackupSettings"]:::internal-link
  n6["return Z.1417 return RemoteBackupBridge.list(remoteBa…"]
  n7["BackupBridge.list"]:::internal-link
  n8["FabricLauncherPlugin.backupSpec"]:::internal-link
  n9["return Z.1419 return BackupBridge.list(backupSpec(), …"]
  n1 -->|"Z.1415"| n2
  n4 -->|"Z.1417"| n5
  n5 --> n6
  n3 --> n4
  n2 -->|"ja"| n3
  n7 -->|"Z.1419"| n8
  n8 --> n9
  n6 --> n7
  n2 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `backupFiles` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
