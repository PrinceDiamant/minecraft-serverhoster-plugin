[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case241]]

# Dashboard.handle.Z103.Teil7.Z141.Case241

```mermaid
flowchart TD
  n1["Dashboard.json"]:::internal-link
  n2["Dashboard.setup"]:::internal-link
  n1 -->|"Z.241"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
Dashboard.setup
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `setup` in `Dashboard.java`. Ruft `parseJsonObject`, `readBodyText`, `requiredString`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **Dashboard.setup**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `setup` in `Dashboard.java`. Ruft `parseJsonObject`, `readBodyText`, `requiredString`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 241.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
