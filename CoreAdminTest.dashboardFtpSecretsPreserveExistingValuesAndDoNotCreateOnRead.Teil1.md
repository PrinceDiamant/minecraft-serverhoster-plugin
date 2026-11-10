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

```knoten
BackupSecrets.readExisting
  Liest `readExisting`. Ruft `load`.
Schritt Z.86 assertFalse(Files.exists(tmp.resolve('secrets.yml…
  Zeile 86: Dateioperation. `assertFalse(Files.exists(tmp.resolve('secrets.yml…`
Schritt Z.87 Files.writeString(tmp.resolve('secrets.yml'), 'no…
  Zeile 87: schreibt Text in eine Datei. `Files.writeString(tmp.resolve('secrets.yml'), 'no…`
BackupSecrets.saveFtp
  Speichert `saveFtp`. Ruft `load`, `restrict`.
```

- Fortsetzung von `CoreAdminTest.dashboardFtpSecretsPreserveExistingValuesAndDoNotCreateOnRead`, Quellreihenfolge.
