[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.openFtps]] › [[RemoteBackupBridge.openFtps.Z211.Teil1]]

# RemoteBackupBridge.openFtps.Z211.Teil1

```mermaid
flowchart TD
  n1["RemoteBackupBridge.connectControl"]:::internal-link
  n2["RemoteBackupBridge.login"]:::internal-link
  n3["if Z.215 (!FTPReply.isPositiveCompletion(client.getReplyCo…"]
  n4["RemoteBackupBridge.replyError"]:::internal-link
  n5["throw Z.215 throw replyError(client, 'set FTPS prot…"]
  n6["if Z.217 (!FTPReply.isPositiveCompletion(client.getReplyCo…"]
  n7["RemoteBackupBridge.replyError"]:::internal-link
  n8["throw Z.217 throw replyError(client, 'enable protec…"]
  n1 --> n2
  n4 --> n5
  n3 -->|"ja"| n4
  n2 --> n3
  n7 --> n8
  n6 -->|"ja"| n7
  n5 --> n6
  n3 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridge.openFtps.Z211`, Quellreihenfolge.
