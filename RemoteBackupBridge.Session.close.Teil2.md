[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[Session]] › [[RemoteBackupBridge.Session.close]] › [[RemoteBackupBridge.Session.close.Teil2]]

# RemoteBackupBridge.Session.close.Teil2

```mermaid
flowchart TD
  n1["try Z.43"]
  n2["catch Z.44 (IOException e)"]
  n3["if Z.45 (failure == null)"]
  n4["if Z.48 (failure != null)"]
  n5["throw Z.48 throw failure;"]
  n1 -->|"Fehler"| n2
  n2 --> n3
  n4 -->|"ja"| n5
  n1 --> n4
  n3 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridge.Session.close`, Quellreihenfolge.
