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
  Das [[Glossar#Plugin|Plugin]] sichert die Auswahl. `remoteBackupSelected` in `FabricLauncherPlugin.java`.
FabricLauncherPlugin.backupCredentials
  Das [[Glossar#Plugin|Plugin]] sichert die Zugangsdaten. Sichert `backupCredentials`. Ruft `load`.
RemoteBackupBridge.delete
  Die Sicherung über das Netz löscht das. Löscht `delete`. Ruft `safeId`, `named`, `connect`.
FabricLauncherPlugin.remoteBackupSettings
  Das [[Glossar#Plugin|Plugin]] sichert die [[Glossar#Einstellungen|Einstellungen]]. `remoteBackupSettings` in `FabricLauncherPlugin.java`.
BackupBridge.delete
  Die Sicherung auf diesem Rechner löscht das. Löscht `delete`. Ruft `file`.
FabricLauncherPlugin.backupSpec
  Das [[Glossar#Plugin|Plugin]] sichert die Vorgabe. Sichert `backupSpec`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.1437 (remoteBackupSelected())**: Zeile 1437: prüft `(remoteBackupSelected())`.
> - **FabricLauncherPlugin.remoteBackupSelected**: Das [[Glossar#Plugin|Plugin]] sichert die Auswahl. `remoteBackupSelected` in `FabricLauncherPlugin.java`.
> - **FabricLauncherPlugin.backupCredentials**: Das [[Glossar#Plugin|Plugin]] sichert die Zugangsdaten. Sichert `backupCredentials`. Ruft `load`.
> - **RemoteBackupBridge.delete**: Die Sicherung über das Netz löscht das. Löscht `delete`. Ruft `safeId`, `named`, `connect`.
> - **FabricLauncherPlugin.remoteBackupSettings**: Das [[Glossar#Plugin|Plugin]] sichert die [[Glossar#Einstellungen|Einstellungen]]. `remoteBackupSettings` in `FabricLauncherPlugin.java`.
> - **BackupBridge.delete**: Die Sicherung auf diesem Rechner löscht das. Löscht `delete`. Ruft `file`.
> - **FabricLauncherPlugin.backupSpec**: Das [[Glossar#Plugin|Plugin]] sichert die Vorgabe. Sichert `backupSpec`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1437 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.deleteBackup`.
