[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil1]] › [[CoreAdminTest.dashboardFtpSecretsPreserveExistingValuesAndDoNotCreateOnRead]] › [[CoreAdminTest.dashboardFtpSecretsPreserveExistingValuesAndDoNotCreateOnRead.Teil1]]

# CoreAdminTest.dashboardFtpSecretsPreserveExistingValuesAndDoNotCreateOnRead.Teil1

```mermaid
flowchart TD
  n1["BackupSecrets.readExisting"]:::internal-link
  n2["Schritt Z.86 assertFalse(Files.exists(tmp.resolve('secrets.yml…"]
  n3["Schritt Z.87 Files.writeString(tmp.resolve('secrets.yml'), 'no…"]
  n4["BackupSecrets.saveFtp"]:::internal-link
  n5["BackupSecrets.readExisting"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `CoreAdminTest.dashboardFtpSecretsPreserveExistingValuesAndDoNotCreateOnRead`, Quellreihenfolge.
