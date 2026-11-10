[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[BackupSettings]] › [[BackupSettings.saveBackupSettings]] › [[BackupSettings.saveBackupSettings.Z40]]

# BackupSettings.saveBackupSettings.Z40

```mermaid
flowchart TD
  n1["if Z.40 settings.backupStorage === 'remote'"]
  n2["if Z.41 !credentials.username.trim()"]
  n3["throw Z.41 throw new Error('Bitte gib den FTP-Benutzernamen …"]
  n4["if Z.42 !credentials.password && !credentials.passwordSet"]
  n5["throw Z.42 throw new Error('Bitte gib das FTP-Passwort ein.'…"]
  n6["if Z.43 location.protocol !== 'https:' // settings.backup…"]
  n7["if Z.49 !accepted"]
  n8["throw Z.49 throw new Error('Speichern abgebrochen.');"]
  n9["hostApi.dashboardRequest"]:::internal-link
  n10["hostApi.jsonBody"]:::internal-link
  n2 -->|"ja"| n3
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n4
  n7 -->|"ja"| n8
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  n9 -->|"Z.53"| n10
  n8 --> n9
  n7 --> n9
  n6 --> n9
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.40 settings.backupStorage === 'remote'
  Zeile 40: prüft `settings.backupStorage === 'remote'`.
if Z.41 !credentials.username.trim()
  Zeile 41: prüft `!credentials.username.trim()`.
throw Z.41 throw new Error('Bitte gib den FTP-Benutzernamen …
  Zeile 41: Abbruch `throw new Error('Bitte gib den FTP-Benutzernamen …`.
if Z.42 !credentials.password && !credentials.passwordSet
  Zeile 42: prüft `!credentials.password && !credentials.passwordSet`.
throw Z.42 throw new Error('Bitte gib das FTP-Passwort ein.'…
  Zeile 42: Abbruch `throw new Error('Bitte gib das FTP-Passwort ein.'…`.
if Z.43 location.protocol !== 'https:' // settings.backup…
  Zeile 43: prüft `location.protocol !== 'https:' // settings.backup…`.
if Z.49 !accepted
  Zeile 49: prüft `!accepted`.
throw Z.49 throw new Error('Speichern abgebrochen.');
  Zeile 49: Abbruch `throw new Error('Speichern abgebrochen.');`.
hostApi.dashboardRequest
  Schickt von der [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an das [[Glossar#Plugin|Plugin]]. `dashboardRequest` in `hostApi.ts`.
hostApi.jsonBody
  Baut den Text, den die [[Glossar#Bedienseite|Bedienseite]] als Auftrag mitschickt. Antwortet mit JSON `jsonBody`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.40 settings.backupStorage === 'remote'**: Zeile 40: prüft `settings.backupStorage === 'remote'`.
> - **if Z.41 !credentials.username.trim()**: Zeile 41: prüft `!credentials.username.trim()`.
> - **throw Z.41 throw new Error('Bitte gib den FTP-Benutzernamen …**: Zeile 41: Abbruch `throw new Error('Bitte gib den FTP-Benutzernamen …`.
> - **if Z.42 !credentials.password && !credentials.passwordSet**: Zeile 42: prüft `!credentials.password && !credentials.passwordSet`.
> - **throw Z.42 throw new Error('Bitte gib das FTP-Passwort ein.'…**: Zeile 42: Abbruch `throw new Error('Bitte gib das FTP-Passwort ein.'…`.
> - **if Z.43 location.protocol !== 'https:' // settings.backup…**: Zeile 43: prüft `location.protocol !== 'https:' // settings.backup…`.
> - **if Z.49 !accepted**: Zeile 49: prüft `!accepted`.
> - **throw Z.49 throw new Error('Speichern abgebrochen.');**: Zeile 49: Abbruch `throw new Error('Speichern abgebrochen.');`.
> - **hostApi.dashboardRequest**: Schickt von der [[Glossar#Bedienseite|Bedienseite]] eine Anfrage an das [[Glossar#Plugin|Plugin]]. `dashboardRequest` in `hostApi.ts`.
> - **hostApi.jsonBody**: Baut den Text, den die [[Glossar#Bedienseite|Bedienseite]] als Auftrag mitschickt. Antwortet mit JSON `jsonBody`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 40 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `BackupSettings.saveBackupSettings`.
