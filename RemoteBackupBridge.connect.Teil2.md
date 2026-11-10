[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.connect]] › [[RemoteBackupBridge.connect.Teil2]]

# RemoteBackupBridge.connect.Teil2

```mermaid
flowchart TD
  n1["if Z.182 ('FTPS'.equals(protocol))"]
  n2["RemoteBackupBridge.openFtps"]:::internal-link
  n3["return Z.182 return openFtps(settings, username, pas…"]
  n4["if Z.183 ('FTP'.equals(protocol))"]
  n5["RemoteBackupBridge.openFtp"]:::internal-link
  n6["return Z.183 return openFtp(settings, username, pass…"]
  n7["if Z.184 (settings.port() == 990)"]
  n8["RemoteBackupBridge.openFtps"]:::internal-link
  n9["return Z.184 return openFtps(settings, username, pas…"]
  n10["RemoteBackupBridge.configure"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  n5 --> n6
  n4 -->|"ja"| n5
  n3 --> n4
  n1 --> n4
  n8 --> n9
  n7 -->|"ja"| n8
  n6 --> n7
  n4 --> n7
  n9 --> n10
  n7 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.182 ('FTPS'.equals(protocol))
  Zeile 182: prüft `('FTPS'.equals(protocol))`.
RemoteBackupBridge.openFtps
  Öffnet `openFtps`. Ruft `configure`, `connectControl`, `login`.
return Z.182 return openFtps(settings, username, pas…
  Zeile 182: Rückgabe `return openFtps(settings, username, pas…`.
if Z.183 ('FTP'.equals(protocol))
  Zeile 183: prüft `('FTP'.equals(protocol))`.
RemoteBackupBridge.openFtp
  Öffnet `openFtp`. Ruft `configure`, `connectControl`, `warnPlainFtp`.
return Z.183 return openFtp(settings, username, pass…
  Zeile 183: Rückgabe `return openFtp(settings, username, pass…`.
if Z.184 (settings.port() == 990)
  Zeile 184: prüft `(settings.port() == 990)`.
return Z.184 return openFtps(settings, username, pas…
  Zeile 184: Rückgabe `return openFtps(settings, username, pas…`.
RemoteBackupBridge.configure
  `configure` in `RemoteBackupBridge.java`.
```

- Fortsetzung von `RemoteBackupBridge.connect`, Quellreihenfolge.
