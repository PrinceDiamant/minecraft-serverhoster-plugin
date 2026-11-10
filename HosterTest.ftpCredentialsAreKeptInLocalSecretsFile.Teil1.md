[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil1]] › [[HosterTest.ftpCredentialsAreKeptInLocalSecretsFile]] › [[HosterTest.ftpCredentialsAreKeptInLocalSecretsFile.Teil1]]

# HosterTest.ftpCredentialsAreKeptInLocalSecretsFile.Teil1

```mermaid
flowchart TD
  n1["BackupSecrets.load"]:::internal-link
  n2["Schritt Z.37 Files.writeString(secrets, 'backup:/n ftp:/n user…"]
  n3["BackupSecrets.load"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupSecrets.load
  Lädt `load`. Ruft `restrict`.
Schritt Z.37 Files.writeString(secrets, 'backup:/n ftp:/n user…
  Zeile 37: schreibt Text in eine Datei. `Files.writeString(secrets, 'backup:/n ftp:/n user…`
```

- Fortsetzung von `HosterTest.ftpCredentialsAreKeptInLocalSecretsFile`, Quellreihenfolge.
