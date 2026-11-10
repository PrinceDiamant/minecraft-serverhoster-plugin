[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.enterBaseDirectory]] › [[RemoteBackupBridge.enterBaseDirectory.Z269]]

# RemoteBackupBridge.enterBaseDirectory.Z269

```mermaid
flowchart TD
  n1["for Z.269 (String segment : path.split('/'))"]
  n2["if Z.270 (segment.isBlank() // '.'.equals(segment))"]
  n3["if Z.271 ('..'.equals(segment))"]
  n4["throw Z.271 throw new IOException('backup.remote.directory ca…"]
  n5["if Z.272 (!client.changeWorkingDirectory(segment))"]
  n6["if Z.274 (!client.changeWorkingDirectory(segment))"]
  n7["RemoteBackupBridge.replyError"]:::internal-link
  n8["throw Z.274 throw replyError(client, 'create or ent…"]
  n3 -->|"ja"| n4
  n2 --> n3
  n2 --> n3
  n7 --> n8
  n6 -->|"ja"| n7
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridge.enterBaseDirectory`, Quellreihenfolge.
