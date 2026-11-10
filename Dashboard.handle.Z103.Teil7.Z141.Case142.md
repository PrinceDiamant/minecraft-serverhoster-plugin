[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case142]]

# Dashboard.handle.Z103.Teil7.Z141.Case142

```mermaid
flowchart TD
  n1["Dashboard.token"]:::internal-link
  n2["Dashboard.cookie"]:::internal-link
  n3["Dashboard.json"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.token
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `token` in `Dashboard.java`.
Dashboard.cookie
  Liest oder setzt die [[Glossar#Anmeldung|Anmeldung]], die der Browser mitschickt. `cookie` in `Dashboard.java`.
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.token**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `token` in `Dashboard.java`.
> - **Dashboard.cookie**: Liest oder setzt die [[Glossar#Anmeldung|Anmeldung]], die der Browser mitschickt. `cookie` in `Dashboard.java`.
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 142.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
