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

```knoten
try Z.1448
  Zeile 1448: Versuch. Der Fehlerpfad geht in catch.
FabricLauncherPlugin.backupCredentials
  Das [[Glossar#Plugin|Plugin]] sichert die Zugangsdaten. Sichert `backupCredentials`. Ruft `load`.
try Z.1450
  Zeile 1450: Versuch. Der Fehlerpfad geht in catch.
RemoteBackupBridge.download
  Die Sicherung über das Netz holt das. Liefert zum Herunterladen `download`. Ruft `safeId`, `named`, `connect`.
FabricLauncherPlugin.remoteBackupSettings
  Das [[Glossar#Plugin|Plugin]] sichert die [[Glossar#Einstellungen|Einstellungen]]. `remoteBackupSettings` in `FabricLauncherPlugin.java`.
BackupBridge.restoreZip
  Die Sicherung auf diesem Rechner stellt wieder her hier einen Schritt. Eine Ebene tiefer steht er genauer. Stellt wieder her `restoreZip`. Ruft `open`, `resolve`.
FabricLauncherPlugin.profile
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `profile` in `FabricLauncherPlugin.java`.
ServerProfile.directory
  Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `ServerProfile.java`.
finally Z.1448
  Läuft danach immer, auch nach einem Fehler.
Schritt Z.1455 Files.deleteIfExists(temp);
  Zeile 1455: Dateioperation. `Files.deleteIfExists(temp);`
```

> [!knoten]- Was die Blöcke tun
> - **try Z.1448**: Zeile 1448: Versuch. Der Fehlerpfad geht in catch.
> - **FabricLauncherPlugin.backupCredentials**: Das [[Glossar#Plugin|Plugin]] sichert die Zugangsdaten. Sichert `backupCredentials`. Ruft `load`.
> - **try Z.1450**: Zeile 1450: Versuch. Der Fehlerpfad geht in catch.
> - **RemoteBackupBridge.download**: Die Sicherung über das Netz holt das. Liefert zum Herunterladen `download`. Ruft `safeId`, `named`, `connect`.
> - **FabricLauncherPlugin.remoteBackupSettings**: Das [[Glossar#Plugin|Plugin]] sichert die [[Glossar#Einstellungen|Einstellungen]]. `remoteBackupSettings` in `FabricLauncherPlugin.java`.
> - **BackupBridge.restoreZip**: Die Sicherung auf diesem Rechner stellt wieder her hier einen Schritt. Eine Ebene tiefer steht er genauer. Stellt wieder her `restoreZip`. Ruft `open`, `resolve`.
> - **FabricLauncherPlugin.profile**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `profile` in `FabricLauncherPlugin.java`.
> - **ServerProfile.directory**: Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `ServerProfile.java`.
> - **finally Z.1448**: Läuft danach immer, auch nach einem Fehler.
> - **Schritt Z.1455 Files.deleteIfExists(temp);**: Zeile 1455: Dateioperation. `Files.deleteIfExists(temp);`

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 1448 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.restoreBackup.Z1446`.
