[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case249]]

# Dashboard.handle.Z103.Teil7.Z141.Case249

```mermaid
flowchart TD
  n1["Dashboard.json"]:::internal-link
  n2["FabricLauncherPlugin.crashFiles"]:::internal-link
  n1 -->|"Z.249"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
FabricLauncherPlugin.crashFiles
  Listet die [[Glossar#Absturzbericht|Absturzberichte]]. Betrifft Crash-Reports `crashFiles`. Ruft `list`, `profile`, `directory`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **FabricLauncherPlugin.crashFiles**: Listet die [[Glossar#Absturzbericht|Absturzberichte]]. Betrifft Crash-Reports `crashFiles`. Ruft `list`, `profile`, `directory`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 249.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
