[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[BackupSettings]] › [[BackupSettings.saveBackupSettings]]

# BackupSettings.saveBackupSettings

`BackupSettings.saveBackupSettings(settings: Settings, credentials: Credentials, options: BackupOptions)` [ui/src/components/BackupSettings.tsx:35–61](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/ui/src/components/BackupSettings.tsx#L35-L61)

```mermaid
flowchart TD
  n1["if Z.36 !options.paths.length // options.paths.some((path…"]
  n2["throw Z.37 throw new Error('Bitte mindestens einen Backup-Pf…"]
  n3["if Z.38 !Number.isInteger(options.keep) // options.keep (…"]
  n4["throw Z.39 throw new Error('Die Anzahl der Backups muss zwis…"]
  n5["BackupSettings.saveBackupSettings.Z40"]:::internal-link
  n6["hostApi.dashboardRequest"]:::internal-link
  n7["hostApi.jsonBody"]:::internal-link
  n8["hostApi.dashboardRequest"]:::internal-link
  n9["hostApi.jsonBody"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  n6 -->|"Z.59"| n7
  n5 --> n6
  n8 -->|"Z.60"| n9
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.36 !options.paths.length // options.paths.some((path…
  Zeile 36: prüft `!options.paths.length // options.paths.some((path…`.
throw Z.37 throw new Error('Bitte mindestens einen Backup-Pf…
  Zeile 37: Abbruch `throw new Error('Bitte mindestens einen Backup-Pf…`.
if Z.38 !Number.isInteger(options.keep) // options.keep (…
  Zeile 38: prüft `!Number.isInteger(options.keep) // options.keep (…`.
throw Z.39 throw new Error('Die Anzahl der Backups muss zwis…
  Zeile 39: Abbruch `throw new Error('Die Anzahl der Backups muss zwis…`.
BackupSettings.saveBackupSettings.Z40
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 40 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 40.
hostApi.dashboardRequest
  Schickt von der [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an das [[Glossar#Plugin|Plugin]]. `dashboardRequest` in `hostApi.ts`.
hostApi.jsonBody
  Baut den Text, den die [[Glossar#Bedienseite|Bedienseite]] als Auftrag mitschickt. Antwortet mit JSON `jsonBody`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.36 !options.paths.length // options.paths.some((path…**: Zeile 36: prüft `!options.paths.length // options.paths.some((path…`.
> - **throw Z.37 throw new Error('Bitte mindestens einen Backup-Pf…**: Zeile 37: Abbruch `throw new Error('Bitte mindestens einen Backup-Pf…`.
> - **if Z.38 !Number.isInteger(options.keep) // options.keep (…**: Zeile 38: prüft `!Number.isInteger(options.keep) // options.keep (…`.
> - **throw Z.39 throw new Error('Die Anzahl der Backups muss zwis…**: Zeile 39: Abbruch `throw new Error('Die Anzahl der Backups muss zwis…`.
> - **BackupSettings.saveBackupSettings.Z40**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 40 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 40.
> - **hostApi.dashboardRequest**: Schickt von der [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an das [[Glossar#Plugin|Plugin]]. `dashboardRequest` in `hostApi.ts`.
> - **hostApi.jsonBody**: Baut den Text, den die [[Glossar#Bedienseite|Bedienseite]] als Auftrag mitschickt. Antwortet mit JSON `jsonBody`.

- Dieser Teil speichert die [[Glossar#Sicherungskopie|Sicherungskopie]] die [[Glossar#Einstellungen|Einstellungen]].
- `saveBackupSettings` in `ui/src/components/BackupSettings.tsx`
