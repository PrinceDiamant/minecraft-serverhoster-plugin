[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case266]]

# Dashboard.handle.Z103.Teil7.Z141.Case266

```mermaid
flowchart TD
  n1["Dashboard.json"]:::internal-link
  n2["FabricLauncherPlugin.testBackup"]:::internal-link
  n1 -->|"Z.266"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
FabricLauncherPlugin.testBackup
  Das [[Glossar#Plugin|Plugin]] prüft die [[Glossar#Sicherungskopie|Sicherungskopie]]. Prüft `testBackup`. Ruft `backupSpec`, `remoteBackupSelected`, `backupCredentials`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **FabricLauncherPlugin.testBackup**: Das [[Glossar#Plugin|Plugin]] prüft die [[Glossar#Sicherungskopie|Sicherungskopie]]. Prüft `testBackup`. Ruft `backupSpec`, `remoteBackupSelected`, `backupCredentials`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 266.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
