[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]] › [[BackupBridge.archive]] › [[BackupBridge.archive.Teil2.Z136]]

# BackupBridge.archive.Teil2.Z136

```mermaid
flowchart TD
  n1["try Z.136"]
  n2["BackupBridge.archive.Teil2.Z136.Z138"]:::internal-link
  n3["catch Z.152 (Exception e)"]
  n4["try Z.153"]
  n5["Schritt Z.153 Files.deleteIfExists(zip);"]
  n6["catch Z.153 (IOException cleanupError)"]
  n7["throw Z.154 throw e;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n4 --> n5
  n4 -->|"Fehler"| n6
  n5 --> n7
  n6 --> n7
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupBridge.archive.Teil2`, Quellreihenfolge.
