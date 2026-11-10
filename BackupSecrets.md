[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupSecrets]]

# BackupSecrets

```mermaid
flowchart TD
  n1["BackupSecrets.BackupSecrets"]:::internal-link
  n2["BackupSecrets.readExisting"]:::internal-link
  n3["BackupSecrets.load"]:::internal-link
  n4["BackupSecrets.saveFtp"]:::internal-link
  n5["BackupSecrets.restrict"]:::internal-link
  n2 -->|"Z.23"| n3
  n3 -->|"Z.35"| n5
  n4 -->|"Z.62"| n3
  n4 -->|"Z.75"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupSecrets.BackupSecrets
  Dieser Teil sichert die Zugangsdaten. Im [[Glossar#Quelltext|Quelltext]] heißt das `BackupSecrets`.
BackupSecrets.readExisting
  Dieser Teil liest hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `readExisting`.
BackupSecrets.load
  Dieser Teil lädt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `load`.
BackupSecrets.saveFtp
  Dieser Teil speichert die Übertragung. Im [[Glossar#Quelltext|Quelltext]] heißt das `saveFtp`.
BackupSecrets.restrict
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `restrict`.
```

> [!knoten]- Was die Blöcke tun
> - **BackupSecrets.BackupSecrets**: Dieser Teil sichert die Zugangsdaten. Im [[Glossar#Quelltext|Quelltext]] heißt das `BackupSecrets`.
> - **BackupSecrets.readExisting**: Dieser Teil liest hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `readExisting`.
> - **BackupSecrets.load**: Dieser Teil lädt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `load`.
> - **BackupSecrets.saveFtp**: Dieser Teil speichert die Übertragung. Im [[Glossar#Quelltext|Quelltext]] heißt das `saveFtp`.
> - **BackupSecrets.restrict**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `restrict`.

- Die Zugangsdaten für die [[Glossar#Sicherungskopie|Sicherungskopie]] auf einem anderen Rechner.
