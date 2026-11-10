[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case174]]

# Dashboard.handle.Z103.Teil7.Z141.Case174

```mermaid
flowchart TD
  n1["Dashboard.json"]:::internal-link
  n2["Dashboard.saveSettings"]:::internal-link
  n1 -->|"Z.174"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
Dashboard.saveSettings
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] speichert die [[Glossar#Einstellungen|Einstellungen]]. Speichert `saveSettings`. Ruft `parseJsonObject`, `readBodyText`, `ServerHosterSettings`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **Dashboard.saveSettings**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] speichert die [[Glossar#Einstellungen|Einstellungen]]. Speichert `saveSettings`. Ruft `parseJsonObject`, `readBodyText`, `ServerHosterSettings`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 174.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
