[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.openFtps]] › [[RemoteBackupBridge.openFtps.Z211]]

# RemoteBackupBridge.openFtps.Z211

```mermaid
flowchart TD
  n1["try Z.211"]
  n2["RemoteBackupBridge.openFtps.Z211.Teil1"]:::internal-link
  n3["RemoteBackupBridge.openFtps.Z211.Teil2"]:::internal-link
  n4["catch Z.219 (IOException / RuntimeExcepti…"]
  n5["RemoteBackupBridge.disconnectAfterFailure"]:::internal-link
  n6["throw Z.221 throw e;"]
  n2 -->|"weiter"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n5 --> n6
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridge.openFtps`, Quellreihenfolge.
