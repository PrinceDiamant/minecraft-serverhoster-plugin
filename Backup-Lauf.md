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
  n1 -->|"Zeile 1367"| n6
  n1 -->|"Zeile 1368"| n3
  n1 -->|"Zeile 1369"| n5
  n1 -->|"Zeile 1370"| n4
  n2 -->|"Zeile 1394"| n6
  n2 -->|"Zeile 1396"| n3
  n2 -->|"Zeile 1397"| n5
  n2 -->|"Zeile 1398"| n4
  n7 -->|"Zeile 1660"| n1
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.runBackup
  Das [[Glossar#Plugin|Plugin]] führt aus die [[Glossar#Sicherungskopie|Sicherungskopie]].
FabricLauncherPlugin.testBackup
  Das [[Glossar#Plugin|Plugin]] prüft die [[Glossar#Sicherungskopie|Sicherungskopie]].
FabricLauncherPlugin.remoteBackupSelected
  Das [[Glossar#Plugin|Plugin]] sichert die Auswahl.
FabricLauncherPlugin.remoteBackupSettings
  Das [[Glossar#Plugin|Plugin]] sichert die [[Glossar#Einstellungen|Einstellungen]].
FabricLauncherPlugin.backupCredentials
  Das [[Glossar#Plugin|Plugin]] sichert die Zugangsdaten.
FabricLauncherPlugin.backupSpec
  Das [[Glossar#Plugin|Plugin]] sichert die Vorgabe.
FabricLauncherPlugin.runScheduledBackup
  Das [[Glossar#Plugin|Plugin]] führt aus zur geplanten Zeit die [[Glossar#Sicherungskopie|Sicherungskopie]].
```

> [!knoten] Was die Blöcke tun
> - **FabricLauncherPlugin.runBackup**: Das [[Glossar#Plugin|Plugin]] führt aus die [[Glossar#Sicherungskopie|Sicherungskopie]].
> - **FabricLauncherPlugin.testBackup**: Das [[Glossar#Plugin|Plugin]] prüft die [[Glossar#Sicherungskopie|Sicherungskopie]].
> - **FabricLauncherPlugin.remoteBackupSelected**: Das [[Glossar#Plugin|Plugin]] sichert die Auswahl.
> - **FabricLauncherPlugin.remoteBackupSettings**: Das [[Glossar#Plugin|Plugin]] sichert die [[Glossar#Einstellungen|Einstellungen]].
> - **FabricLauncherPlugin.backupCredentials**: Das [[Glossar#Plugin|Plugin]] sichert die Zugangsdaten.
> - **FabricLauncherPlugin.backupSpec**: Das [[Glossar#Plugin|Plugin]] sichert die Vorgabe.
> - **FabricLauncherPlugin.runScheduledBackup**: Das [[Glossar#Plugin|Plugin]] führt aus zur geplanten Zeit die [[Glossar#Sicherungskopie|Sicherungskopie]].

- Ein Durchlauf, der die [[Glossar#Sicherungskopie|Sicherungskopie]] packt und ablegt.
