[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case175]]

# Dashboard.handle.Z103.Teil7.Z141.Case175

```mermaid
flowchart TD
  n1["BackupSecrets.readExisting"]:::internal-link
  n2["Dashboard.json"]:::internal-link
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupSecrets.readExisting
  Dieser Teil liest hier einen Schritt. Eine Ebene tiefer steht er genauer. Liest `readExisting`. Ruft `load`.
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
```

> [!knoten]- Was die Blöcke tun
> - **BackupSecrets.readExisting**: Dieser Teil liest hier einen Schritt. Eine Ebene tiefer steht er genauer. Liest `readExisting`. Ruft `load`.
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 175.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
