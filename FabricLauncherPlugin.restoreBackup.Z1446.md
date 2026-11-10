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

```knoten
if Z.1446 (remoteBackupSelected())
  Zeile 1446: prüft `(remoteBackupSelected())`.
FabricLauncherPlugin.remoteBackupSelected
  `remoteBackupSelected` in `FabricLauncherPlugin.java`.
Schritt Z.1447 Path temp = Files.createTempFile(getDataFolder().…
  Zeile 1447: Dateioperation. `Path temp = Files.createTempFile(getDataFolder().…`
FabricLauncherPlugin.restoreBackup.Z1446.Z1448
  Fortsetzung des Ablaufs ab Zeile 1448.
BackupBridge.restore
  Stellt wieder her `restore`. Ruft `file`, `restoreZip`.
FabricLauncherPlugin.profile
  `profile` in `FabricLauncherPlugin.java`.
ServerProfile.directory
  `directory` in `ServerProfile.java`.
FabricLauncherPlugin.backupSpec
  Sichert `backupSpec`.
```

- Fortsetzung von `FabricLauncherPlugin.restoreBackup`, Quellreihenfolge.
