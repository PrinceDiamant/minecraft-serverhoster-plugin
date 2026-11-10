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

- Fortsetzung von `RemoteBackupBridge.list`, Quellreihenfolge.
