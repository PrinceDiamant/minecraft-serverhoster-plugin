[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[BackupSettings]]

# BackupSettings

```mermaid
flowchart TD
  n1["BackupSettings.loadBackupSettings"]:::internal-link
  n2["BackupSettings.saveBackupSettings"]:::internal-link
  n3["BackupSettings.BackupSettings"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupSettings.loadBackupSettings
  Dieser Teil lädt die [[Glossar#Sicherungskopie|Sicherungskopie]] die [[Glossar#Einstellungen|Einstellungen]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `loadBackupSettings`.
BackupSettings.saveBackupSettings
  Dieser Teil speichert die [[Glossar#Sicherungskopie|Sicherungskopie]] die [[Glossar#Einstellungen|Einstellungen]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `saveBackupSettings`.
BackupSettings.BackupSettings
  Dieser Teil sichert die [[Glossar#Einstellungen|Einstellungen]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `BackupSettings`.
```

> [!knoten]- Was die Blöcke tun
> - **BackupSettings.loadBackupSettings**: Dieser Teil lädt die [[Glossar#Sicherungskopie|Sicherungskopie]] die [[Glossar#Einstellungen|Einstellungen]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `loadBackupSettings`.
> - **BackupSettings.saveBackupSettings**: Dieser Teil speichert die [[Glossar#Sicherungskopie|Sicherungskopie]] die [[Glossar#Einstellungen|Einstellungen]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `saveBackupSettings`.
> - **BackupSettings.BackupSettings**: Dieser Teil sichert die [[Glossar#Einstellungen|Einstellungen]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `BackupSettings`.

- Die [[Glossar#Einstellungen|Einstellungen]], die für jede [[Glossar#Sicherungskopie|Sicherungskopie]] gelten.
