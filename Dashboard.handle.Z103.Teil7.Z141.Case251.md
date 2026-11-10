[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case251]]

# Dashboard.handle.Z103.Teil7.Z141.Case251

```mermaid
flowchart TD
  n1["Dashboard.json"]:::internal-link
  n2["FabricLauncherPlugin.versions"]:::internal-link
  n1 -->|"Z.253"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
FabricLauncherPlugin.versions
  Liefert die bekannten [[Glossar#Version|Versionen]]. `versions` in `FabricLauncherPlugin.java`. Ruft `fetch`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **FabricLauncherPlugin.versions**: Liefert die bekannten [[Glossar#Version|Versionen]]. `versions` in `FabricLauncherPlugin.java`. Ruft `fetch`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 251.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
