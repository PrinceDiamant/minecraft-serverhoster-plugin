[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case223]]

# Dashboard.handle.Z103.Teil7.Z141.Case223

```mermaid
flowchart TD
  n1["Dashboard.json"]:::internal-link
  n2["FabricLauncherPlugin.jcmd(String,String)"]:::internal-link
  n1 -->|"Z.223"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
FabricLauncherPlugin.jcmd(String,String)
  Fragt ein Hilfswerkzeug von Java, wie es dem laufenden Programm geht. `jcmd` in `FabricLauncherPlugin.java`. Ruft `jcmd`, `slot`, `pid`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **FabricLauncherPlugin.jcmd(String,String)**: Fragt ein Hilfswerkzeug von Java, wie es dem laufenden Programm geht. `jcmd` in `FabricLauncherPlugin.java`. Ruft `jcmd`, `slot`, `pid`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 223.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
