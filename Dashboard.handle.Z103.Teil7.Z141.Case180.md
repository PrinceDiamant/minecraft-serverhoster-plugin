[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case180]]

# Dashboard.handle.Z103.Teil7.Z141.Case180

```mermaid
flowchart TD
  n1["Dashboard.parseJsonObject"]:::internal-link
  n2["Dashboard.readBodyText"]:::internal-link
  n3["Dashboard.requiredString"]:::internal-link
  n4["BackupSecrets.saveFtp"]:::internal-link
  n5["Dashboard.requiredString"]:::internal-link
  n6["Dashboard.json"]:::internal-link
  n1 -->|"Z.181"| n2
  n2 --> n3
  n4 -->|"Z.183"| n5
  n3 --> n4
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.parseJsonObject
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest die Antwort den Inhalt. Wertet aus `parseJsonObject`.
Dashboard.readBodyText
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text. Liest `readBodyText`.
Dashboard.requiredString
  Liest einen Text, der in der Anfrage dabei sein muss. Liest verpflichtend `requiredString`.
BackupSecrets.saveFtp
  Dieser Teil speichert die Übertragung. Speichert `saveFtp`. Ruft `load`, `restrict`.
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.parseJsonObject**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest die Antwort den Inhalt. Wertet aus `parseJsonObject`.
> - **Dashboard.readBodyText**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest den Text den Text. Liest `readBodyText`.
> - **Dashboard.requiredString**: Liest einen Text, der in der Anfrage dabei sein muss. Liest verpflichtend `requiredString`.
> - **BackupSecrets.saveFtp**: Dieser Teil speichert die Übertragung. Speichert `saveFtp`. Ruft `load`, `restrict`.
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 180.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
