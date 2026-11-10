[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]]

# RemoteBackupBridge.Teil2

```mermaid
flowchart TD
  n1["RemoteBackupBridge.connect"]:::internal-link
  n2["RemoteBackupBridge.openFtps"]:::internal-link
  n3["RemoteBackupBridge.openFtp"]:::internal-link
  n4["RemoteBackupBridge.connectControl"]:::internal-link
  n5["RemoteBackupBridge.login"]:::internal-link
  n6["RemoteBackupBridge.configure"]:::internal-link
  n7["RemoteBackupBridge.enterDirectory"]:::internal-link
  n8["RemoteBackupBridge.enterBaseDirectory"]:::internal-link
  n1 -->|"Z.182"| n2
  n1 -->|"Z.183"| n3
  n1 -->|"Z.187"| n6
  n1 -->|"Z.189"| n4
  n1 -->|"Z.199"| n5
  n2 -->|"Z.210"| n6
  n2 -->|"Z.212"| n4
  n2 -->|"Z.213"| n5
  n3 -->|"Z.227"| n6
  n3 -->|"Z.229"| n4
  n3 -->|"Z.231"| n5
  n7 -->|"Z.258"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.connect
  Verbindet `connect`. Ruft `validateCredentials`, `openFtps`, `openFtp`.
RemoteBackupBridge.openFtps
  Öffnet `openFtps`. Ruft `configure`, `connectControl`, `login`.
RemoteBackupBridge.openFtp
  Öffnet `openFtp`. Ruft `configure`, `connectControl`, `warnPlainFtp`.
RemoteBackupBridge.connectControl
  Verbindet `connectControl`. Ruft `replyError`.
RemoteBackupBridge.login
  Meldet an `login`. Ruft `replyError`.
RemoteBackupBridge.configure
  `configure` in `RemoteBackupBridge.java`.
RemoteBackupBridge.enterDirectory
  Wechselt hinein `enterDirectory`. Ruft `enterBaseDirectory`, `replyError`.
RemoteBackupBridge.enterBaseDirectory
  Wechselt hinein `enterBaseDirectory`. Ruft `hasControlCharacter`, `replyError`.
```


