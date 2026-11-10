[[00 Start]] › [[Backup]] › [[Backup-Dateien]]

# Backup-Dateien

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.backupFiles"]:::internal-link
  n2["FabricLauncherPlugin.backupFile"]:::internal-link
  n3["FabricLauncherPlugin.downloadBackup"]:::internal-link
  n4["FabricLauncherPlugin.deleteBackup"]:::internal-link
  n5["FabricLauncherPlugin.restoreBackup"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```

```knoten
FabricLauncherPlugin.backupFiles
  Das [[Glossar#Plugin|Plugin]] sichert die Dateien.
FabricLauncherPlugin.backupFile
  Das [[Glossar#Plugin|Plugin]] sichert die Datei. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
FabricLauncherPlugin.downloadBackup
  Das [[Glossar#Plugin|Plugin]] holt die [[Glossar#Sicherungskopie|Sicherungskopie]].
FabricLauncherPlugin.deleteBackup
  Das [[Glossar#Plugin|Plugin]] löscht die [[Glossar#Sicherungskopie|Sicherungskopie]].
FabricLauncherPlugin.restoreBackup
  Das [[Glossar#Plugin|Plugin]] stellt wieder her die [[Glossar#Sicherungskopie|Sicherungskopie]].
```

> [!knoten] Was die Blöcke tun
> - **FabricLauncherPlugin.backupFiles**: Das [[Glossar#Plugin|Plugin]] sichert die Dateien.
> - **FabricLauncherPlugin.backupFile**: Das [[Glossar#Plugin|Plugin]] sichert die Datei. Auffällig: im normalen Betrieb ruft das niemand auf. Das nennt man [[Glossar#Ungenutzt|Ungenutzt]].
> - **FabricLauncherPlugin.downloadBackup**: Das [[Glossar#Plugin|Plugin]] holt die [[Glossar#Sicherungskopie|Sicherungskopie]].
> - **FabricLauncherPlugin.deleteBackup**: Das [[Glossar#Plugin|Plugin]] löscht die [[Glossar#Sicherungskopie|Sicherungskopie]].
> - **FabricLauncherPlugin.restoreBackup**: Das [[Glossar#Plugin|Plugin]] stellt wieder her die [[Glossar#Sicherungskopie|Sicherungskopie]].

- Wie die [[Glossar#Sicherungskopie|Sicherungskopie]] heißt, wo sie liegt, und wie viele alte Kopien behalten werden.
