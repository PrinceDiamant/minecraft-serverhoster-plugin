[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil1]] › [[RemoteBackupBridge.archive]] › [[RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1.Z104.Z107]]

# RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1.Z104.Z107

```mermaid
flowchart TD
  n1["for Z.107 (String relative : paths)"]
  n2["try Z.109"]
  n3["PathGuard.resolve"]:::internal-link
  n4["catch Z.110 (SecurityException e)"]
  n5["if Z.111 (!Files.exists(start) // Files.isSymbolicLink(sta…"]
  n6["RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1.Z104.Z107.Z112"]:::internal-link
  n2 --> n3
  n2 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  n5 --> n6
  n5 --> n6
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1.Z104`, Quellreihenfolge.
