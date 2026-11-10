[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case240]]

# Dashboard.handle.Z103.Teil7.Z141.Case240

```mermaid
flowchart TD
  n1["Dashboard.json"]:::internal-link
  n2["FabricLauncherPlugin.setupView"]:::internal-link
  n1 -->|"Z.240"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
FabricLauncherPlugin.setupView
  Das [[Glossar#Plugin|Plugin]] kümmert sich um die Ansicht. `setupView` in `FabricLauncherPlugin.java`. Ruft `getWorldRoot`, `scan`, `view`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **FabricLauncherPlugin.setupView**: Das [[Glossar#Plugin|Plugin]] kümmert sich um die Ansicht. `setupView` in `FabricLauncherPlugin.java`. Ruft `getWorldRoot`, `scan`, `view`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 240.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
