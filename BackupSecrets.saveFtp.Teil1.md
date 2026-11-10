[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupSecrets]] › [[BackupSecrets.saveFtp]] › [[BackupSecrets.saveFtp.Teil1]]

# BackupSecrets.saveFtp.Teil1

```mermaid
flowchart TD
  n1["if Z.58 (username == null // username.isBlank() // userna…"]
  n2["throw Z.59 throw new IllegalArgumentException('FTP-Benutzern…"]
  n3["if Z.60 (password != null && (password.length() ) 4096 //…"]
  n4["throw Z.61 throw new IllegalArgumentException('FTP-Passwort …"]
  n5["BackupSecrets.load"]:::internal-link
  n6["try Z.66"]
  n7["catch Z.68 (InvalidConfigurationExceptio…"]
  n8["throw Z.69 throw new IOException('Cannot parse secrets.yml i…"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  n6 -->|"Fehler"| n7
  n7 --> n8
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `BackupSecrets.saveFtp`, Quellreihenfolge.
