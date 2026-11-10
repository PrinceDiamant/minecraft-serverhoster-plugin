[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case173]]

# Dashboard.handle.Z103.Teil7.Z141.Case173

```mermaid
flowchart TD
  n1["Dashboard.json"]:::internal-link
  n2["FabricLauncherPlugin.settingsView"]:::internal-link
  n1 -->|"Z.173"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
FabricLauncherPlugin.settingsView
  Stellt die [[Glossar#Einstellungen|Einstellungen]] so zusammen, wie die [[Glossar#Bedienseite|Bedienseite]] sie anzeigt. `settingsView` in `FabricLauncherPlugin.java`. Ruft `from`, `view`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **FabricLauncherPlugin.settingsView**: Stellt die [[Glossar#Einstellungen|Einstellungen]] so zusammen, wie die [[Glossar#Bedienseite|Bedienseite]] sie anzeigt. `settingsView` in `FabricLauncherPlugin.java`. Ruft `from`, `view`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 173.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
