[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.connect]] › [[RemoteBackupBridge.connect.Teil1]]

# RemoteBackupBridge.connect.Teil1

```mermaid
flowchart TD
  n1["if Z.177 (settings.host() == null // settings.host().isBla…"]
  n2["throw Z.177 throw new IOException('backup.remote.host is requ…"]
  n3["RemoteBackupBridge.validateCredentials"]:::internal-link
  n4["if Z.180 (!List.of('AUTO', 'FTP', 'FTPS').contains(protoco…"]
  n5["throw Z.180 throw new IOException('backup.remote.protocol mus…"]
  n6["if Z.181 (settings.port() ( 1 // settings.port() ) 65535)"]
  n7["throw Z.181 throw new IOException('backup.remote.port is inva…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.177 (settings.host() == null // settings.host().isBla…
  Zeile 177: prüft `(settings.host() == null // settings.host().isBla…`.
throw Z.177 throw new IOException('backup.remote.host is requ…
  Zeile 177: Abbruch `throw new IOException('backup.remote.host is requ…`.
RemoteBackupBridge.validateCredentials
  Die Sicherung über das Netz prüft die Zugangsdaten. Prüft `validateCredentials`. Ruft `hasControlCharacter`.
if Z.180 (!List.of('AUTO', 'FTP', 'FTPS').contains(protoco…
  Zeile 180: prüft `(!List.of('AUTO', 'FTP', 'FTPS').contains(protoco…`.
throw Z.180 throw new IOException('backup.remote.protocol mus…
  Zeile 180: Abbruch `throw new IOException('backup.remote.protocol mus…`.
if Z.181 (settings.port() ( 1 // settings.port() ) 65535)
  Zeile 181: prüft `(settings.port() ( 1 // settings.port() ) 65535)`.
throw Z.181 throw new IOException('backup.remote.port is inva…
  Zeile 181: Abbruch `throw new IOException('backup.remote.port is inva…`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.177 (settings.host() == null // settings.host().isBla…**: Zeile 177: prüft `(settings.host() == null // settings.host().isBla…`.
> - **throw Z.177 throw new IOException('backup.remote.host is requ…**: Zeile 177: Abbruch `throw new IOException('backup.remote.host is requ…`.
> - **RemoteBackupBridge.validateCredentials**: Die Sicherung über das Netz prüft die Zugangsdaten. Prüft `validateCredentials`. Ruft `hasControlCharacter`.
> - **if Z.180 (!List.of('AUTO', 'FTP', 'FTPS').contains(protoco…**: Zeile 180: prüft `(!List.of('AUTO', 'FTP', 'FTPS').contains(protoco…`.
> - **throw Z.180 throw new IOException('backup.remote.protocol mus…**: Zeile 180: Abbruch `throw new IOException('backup.remote.protocol mus…`.
> - **if Z.181 (settings.port() ( 1 // settings.port() ) 65535)**: Zeile 181: prüft `(settings.port() ( 1 // settings.port() ) 65535)`.
> - **throw Z.181 throw new IOException('backup.remote.port is inva…**: Zeile 181: Abbruch `throw new IOException('backup.remote.port is inva…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `RemoteBackupBridge.connect`.
