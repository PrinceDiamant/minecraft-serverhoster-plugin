[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil1]] › [[RemoteBackupBridge.archive]] › [[RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil2]]

# RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil2

```mermaid
flowchart TD
  n1["if Z.127 (!completed)"]
  n2["RemoteBackupBridge.replyError"]:::internal-link
  n3["throw Z.127 throw replyError(client, 'complete remo…"]
  n4["if Z.128 (files == 0)"]
  n5["throw Z.128 throw new IOException('nothing to archive');"]
  n6["if Z.129 (!client.rename(partial, name))"]
  n7["RemoteBackupBridge.replyError"]:::internal-link
  n8["throw Z.129 throw replyError(client, 'finalize remo…"]
  n2 --> n3
  n1 -->|"ja"| n2
  n4 -->|"ja"| n5
  n3 --> n4
  n1 --> n4
  n7 --> n8
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridge.archive.Z92.Teil1.Z99`, Quellreihenfolge.
