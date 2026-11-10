[[00 Start]] › [[Backup]] › [[Backup-Lauf]]

# Backup-Lauf

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.runBackup"]:::internal-link
  n2["FabricLauncherPlugin.testBackup"]:::internal-link
  n3["FabricLauncherPlugin.remoteBackupSelected"]:::internal-link
  n4["FabricLauncherPlugin.remoteBackupSettings"]:::internal-link
  n5["FabricLauncherPlugin.backupCredentials"]:::internal-link
  n6["FabricLauncherPlugin.backupSpec"]:::internal-link
  n7["FabricLauncherPlugin.runScheduledBackup"]:::internal-link
  n1 -->|"Z.1367"| n6
  n1 -->|"Z.1368"| n3
  n1 -->|"Z.1369"| n5
  n1 -->|"Z.1370"| n4
  n2 -->|"Z.1394"| n6
  n2 -->|"Z.1396"| n3
  n2 -->|"Z.1397"| n5
  n2 -->|"Z.1398"| n4
  n7 -->|"Z.1660"| n1
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.runBackup
  Führt aus `runBackup`. Ruft `slot`, `running`, `send`.
FabricLauncherPlugin.testBackup
  Prüft `testBackup`. Ruft `backupSpec`, `remoteBackupSelected`, `backupCredentials`.
FabricLauncherPlugin.remoteBackupSelected
  `remoteBackupSelected` in `FabricLauncherPlugin.java`.
FabricLauncherPlugin.remoteBackupSettings
  `remoteBackupSettings` in `FabricLauncherPlugin.java`.
FabricLauncherPlugin.backupCredentials
  Sichert `backupCredentials`. Ruft `load`.
FabricLauncherPlugin.backupSpec
  Sichert `backupSpec`.
FabricLauncherPlugin.runScheduledBackup
  Führt aus `runScheduledBackup`. Ruft `slot`, `running`, `add`.
```


