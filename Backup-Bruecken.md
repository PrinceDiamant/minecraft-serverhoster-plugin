[[00 Start]] › [[Backup]] › [[Backup-Bruecken]]

# Backup-Bruecken

```mermaid
flowchart TD
  n1["BackupBridge"]:::internal-link
  n2["BackupOptions"]:::internal-link
  n3["BackupSecrets"]:::internal-link
  n4["RemoteBackupBridge"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupBridge
  Packt die [[Glossar#Sicherungskopie|Sicherungskopie]] auf diesem Rechner und kann sie wieder auspacken.
BackupOptions
  Die Angaben für einen einzelnen Sicherungslauf, zum Beispiel was mit hineinkommt.
BackupSecrets
  Die Zugangsdaten für die [[Glossar#Sicherungskopie|Sicherungskopie]] auf einem anderen Rechner.
RemoteBackupBridge
  Schickt die [[Glossar#Sicherungskopie|Sicherungskopie]] über das Netz auf einen anderen Rechner und holt sie von dort zurück.
```

> [!knoten] Was die Blöcke tun
> - **BackupBridge**: Packt die [[Glossar#Sicherungskopie|Sicherungskopie]] auf diesem Rechner und kann sie wieder auspacken.
> - **BackupOptions**: Die Angaben für einen einzelnen Sicherungslauf, zum Beispiel was mit hineinkommt.
> - **BackupSecrets**: Die Zugangsdaten für die [[Glossar#Sicherungskopie|Sicherungskopie]] auf einem anderen Rechner.
> - **RemoteBackupBridge**: Schickt die [[Glossar#Sicherungskopie|Sicherungskopie]] über das Netz auf einen anderen Rechner und holt sie von dort zurück.

- Die beiden Wege für die [[Glossar#Sicherungskopie|Sicherungskopie]]: auf diesem Rechner, oder über das Netz. Dazu Zugangsdaten und Optionen.
