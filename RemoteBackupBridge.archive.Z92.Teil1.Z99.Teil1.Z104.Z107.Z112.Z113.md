[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil1]] › [[RemoteBackupBridge.archive]] › [[RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1.Z104.Z107.Z112.Z113]]

# RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1.Z104.Z107.Z112.Z113

```mermaid
flowchart TD
  n1["try Z.113"]
  n2["for Z.114 (Path file : (Iterable(Path)) walk::ite…"]
  n3["if Z.115 (Files.isDirectory(file) // Files.isSymbolicLink(…"]
  n4["if Z.116 (!file.toRealPath().startsWith(guard.root()))"]
  n5["PathGuard.root"]:::internal-link
  n6["BackupBridge.write"]:::internal-link
  n7["PathGuard.root"]:::internal-link
  n4 -->|"Z.116"| n5
  n3 --> n4
  n3 --> n4
  n6 -->|"Z.117"| n7
  n5 --> n6
  n5 --> n6
  n2 -->|"wiederholen"| n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridge.archive.Z92.Teil1.Z99.Teil1.Z104.Z107.Z112`, Quellreihenfolge.
