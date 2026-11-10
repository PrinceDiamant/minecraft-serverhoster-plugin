[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupSecrets]] › [[BackupSecrets.saveFtp]] › [[BackupSecrets.saveFtp.Teil2.Z74]]

# BackupSecrets.saveFtp.Teil2.Z74

```mermaid
flowchart TD
  n1["try Z.74"]
  n2["BackupSecrets.restrict"]:::internal-link
  n3["try Z.77"]
  n4["Schritt Z.78 Files.move(temporary, target, StandardCopyOption.…"]
  n5["catch Z.79 (AtomicMoveNotSupportedExcept…"]
  n6["Schritt Z.80 Files.move(temporary, target, StandardCopyOption.…"]
  n7["BackupSecrets.restrict"]:::internal-link
  n8["finally Z.74"]
  n9["Schritt Z.84 Files.deleteIfExists(temporary);"]
  n3 --> n4
  n3 -->|"Fehler"| n5
  n5 --> n6
  n2 --> n3
  n4 --> n7
  n6 --> n7
  n1 --> n2
  n7 --> n8
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupSecrets.saveFtp.Teil2`, Quellreihenfolge.
