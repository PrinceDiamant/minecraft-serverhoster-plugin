[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil1]] › [[RemoteBackupBridge.list]] › [[RemoteBackupBridge.list.Z70]]

# RemoteBackupBridge.list.Z70

```mermaid
flowchart TD
  n1["try Z.70"]
  n2["RemoteBackupBridge.connect"]:::internal-link
  n3["RemoteBackupBridge.enterDirectory"]:::internal-link
  n4["for Z.73 (FTPFile file : session.client().listFi…"]
  n5["if Z.74 (file == null // !file.isFile() // !BackupBridge.…"]
  n6["BackupBridge.named"]:::internal-link
  n7["return Z.79 return entries;"]
  n1 -->|"Z.70"| n2
  n5 -->|"Z.74"| n6
  n4 -->|"wiederholen"| n5
  n3 --> n4
  n6 --> n7
  n6 --> n7
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.70
  Zeile 70: Versuch. Der Fehlerpfad geht in catch.
RemoteBackupBridge.connect
  Verbindet `connect`. Ruft `validateCredentials`, `openFtps`, `openFtp`.
RemoteBackupBridge.enterDirectory
  Wechselt hinein `enterDirectory`. Ruft `enterBaseDirectory`, `replyError`.
for Z.73 (FTPFile file : session.client().listFi…
  Zeile 73: Schleife `(FTPFile file : session.client().listFi…`.
if Z.74 (file == null // !file.isFile() // !BackupBridge.…
  Zeile 74: prüft `(file == null // !file.isFile() // !BackupBridge.…`.
BackupBridge.named
  `named` in `BackupBridge.java`.
return Z.79 return entries;
  Zeile 79: Rückgabe `return entries;`.
```

- Fortsetzung von `RemoteBackupBridge.list`, Quellreihenfolge.
