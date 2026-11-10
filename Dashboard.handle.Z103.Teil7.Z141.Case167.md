[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case167]]

# Dashboard.handle.Z103.Teil7.Z141.Case167

```mermaid
flowchart TD
  n1["Dashboard.json"]:::internal-link
  n2["FabricLauncherPlugin.serverPropertiesPreview"]:::internal-link
  n1 -->|"Z.167"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
FabricLauncherPlugin.serverPropertiesPreview
  Zeigt, wie die Eigenschaftsdatei aussehen wird, bevor sie geschrieben wird. `serverPropertiesPreview` in `FabricLauncherPlugin.java`. Ruft `profile`, `directory`, `open`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **FabricLauncherPlugin.serverPropertiesPreview**: Zeigt, wie die Eigenschaftsdatei aussehen wird, bevor sie geschrieben wird. `serverPropertiesPreview` in `FabricLauncherPlugin.java`. Ruft `profile`, `directory`, `open`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 167.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
