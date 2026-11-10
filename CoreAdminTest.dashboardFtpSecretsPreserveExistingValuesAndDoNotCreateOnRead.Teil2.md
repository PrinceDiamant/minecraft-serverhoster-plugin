[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil1]] › [[CoreAdminTest.dashboardFtpSecretsPreserveExistingValuesAndDoNotCreateOnRead]] › [[CoreAdminTest.dashboardFtpSecretsPreserveExistingValuesAndDoNotCreateOnRead.Teil2]]

# CoreAdminTest.dashboardFtpSecretsPreserveExistingValuesAndDoNotCreateOnRead.Teil2

```mermaid
flowchart TD
  n1["BackupSecrets.saveFtp"]:::internal-link
  n2["BackupSecrets.load"]:::internal-link
  n3["BackupSecrets.saveFtp"]:::internal-link
  n4["BackupSecrets.load"]:::internal-link
  n5["Schritt Z.97 assertTrue(Files.readString(tmp.resolve('secrets.…"]
  n6["BackupSecrets.saveFtp"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CoreAdminTest.dashboardFtpSecretsPreserveExistingValuesAndDoNotCreateOnRead`, Quellreihenfolge.
