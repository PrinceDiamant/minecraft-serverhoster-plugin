[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.archive]] › [[BackupBridge.archive.Teil2.Z136.Z138.Z142.Z143.Z144]]

# BackupBridge.archive.Teil2.Z136.Z138.Z142.Z143.Z144

```mermaid
flowchart TD
  n1["for Z.144 (Path p : (Iterable(Path)) walk::iterat…"]
  n2["if Z.145 (Files.isDirectory(p) // Files.isSymbolicLink(p))"]
  n3["if Z.146 (!p.toRealPath().startsWith(guard.root()))"]
  n4["PathGuard.root"]:::internal-link
  n5["BackupBridge.write"]:::internal-link
  n6["PathGuard.root"]:::internal-link
  n3 -->|"Z.146"| n4
  n2 --> n3
  n2 --> n3
  n5 -->|"Z.147"| n6
  n4 --> n5
  n4 --> n5
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupBridge.archive.Teil2.Z136.Z138.Z142.Z143`, Quellreihenfolge.
