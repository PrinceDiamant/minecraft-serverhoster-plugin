[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.connect]] › [[RemoteBackupBridge.connect.Teil3.Z188]]

# RemoteBackupBridge.connect.Teil3.Z188

```mermaid
flowchart TD
  n1["try Z.188"]
  n2["RemoteBackupBridge.connect.Teil3.Z188.Teil1"]:::internal-link
  n3["RemoteBackupBridge.connect.Teil3.Z188.Teil2"]:::internal-link
  n4["catch Z.201 (IOException / RuntimeExcepti…"]
  n5["RemoteBackupBridge.disconnectAfterFailure"]:::internal-link
  n6["throw Z.203 throw e;"]
  n2 -->|"weiter"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n5 --> n6
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridge.connect.Teil3`, Quellreihenfolge.
