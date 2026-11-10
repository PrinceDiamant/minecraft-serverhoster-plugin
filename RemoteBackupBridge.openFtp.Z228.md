[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.openFtp]] › [[RemoteBackupBridge.openFtp.Z228]]

# RemoteBackupBridge.openFtp.Z228

```mermaid
flowchart TD
  n1["try Z.228"]
  n2["RemoteBackupBridge.connectControl"]:::internal-link
  n3["RemoteBackupBridge.warnPlainFtp"]:::internal-link
  n4["RemoteBackupBridge.login"]:::internal-link
  n5["return Z.232 return new Session(client, false);"]
  n6["catch Z.233 (IOException / RuntimeExcepti…"]
  n7["RemoteBackupBridge.disconnectAfterFailure"]:::internal-link
  n8["throw Z.235 throw e;"]
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n1 --> n2
  n1 -->|"Fehler"| n6
  n7 --> n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridge.openFtp`, Quellreihenfolge.
