[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil1]] › [[RemoteBackupBridge.archive]] › [[RemoteBackupBridge.archive.Z92.Teil1.Z99]]

# RemoteBackupBridge.archive.Z92.Teil1.Z99

```mermaid
flowchart TD
  n1["try Z.99"]
  n2["RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1"]:::internal-link
  n3["RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil2"]:::internal-link
  n4["catch Z.130 (Exception e)"]
  n5["if Z.131 (pending)"]
  n6["try Z.132"]
  n7["catch Z.132 (IOException abortError)"]
  n8["try Z.134"]
  n9["catch Z.134 (IOException cleanupError)"]
  n10["throw Z.135 throw e;"]
  n2 -->|"weiter"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n6 -->|"Fehler"| n7
  n5 -->|"ja"| n6
  n8 -->|"Fehler"| n9
  n6 --> n8
  n7 --> n8
  n5 --> n8
  n8 --> n10
  n9 --> n10
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridge.archive.Z92.Teil1`, Quellreihenfolge.
