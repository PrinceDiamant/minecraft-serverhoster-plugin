[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[Session]] › [[RemoteBackupBridge.Session.close]] › [[RemoteBackupBridge.Session.close.Teil1]]

# RemoteBackupBridge.Session.close.Teil1

```mermaid
flowchart TD
  n1["if Z.35 (!client.isConnected())"]
  n2["return Z.35 return;"]
  n3["try Z.37"]
  n4["if Z.39 (!FTPReply.isPositiveCompletion(client.getReplyCo…"]
  n5["RemoteBackupBridge.replyError"]:::internal-link
  n6["catch Z.40 (IOException e)"]
  n1 -->|"ja"| n2
  n4 -->|"ja"| n5
  n3 --> n4
  n3 -->|"Fehler"| n6
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridge.Session.close`, Quellreihenfolge.
