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

- Fortsetzung von `RemoteBackupBridge.connect`, Quellreihenfolge.
