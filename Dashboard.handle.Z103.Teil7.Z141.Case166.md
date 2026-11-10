[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case166]]

# Dashboard.handle.Z103.Teil7.Z141.Case166

```mermaid
flowchart TD
  n1["Dashboard.text"]:::internal-link
  n2["Dashboard.readOr"]:::internal-link
  n3["FabricLauncherPlugin.workDir(String)"]:::internal-link
  n1 -->|"Z.166"| n2
  n2 -->|"Z.166"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.text
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit Text `text`. Ruft `sendBytes`.
Dashboard.readOr
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest oder den Ersatz. Liest `readOr`.
FabricLauncherPlugin.workDir(String)
  Liefert den Ordner, in dem der [[Glossar#Spielserver|Spielserver]] arbeitet. `workDir` in `FabricLauncherPlugin.java`. Ruft `profile`, `directory`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.text**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit Text `text`. Ruft `sendBytes`.
> - **Dashboard.readOr**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] liest oder den Ersatz. Liest `readOr`.
> - **FabricLauncherPlugin.workDir(String)**: Liefert den Ordner, in dem der [[Glossar#Spielserver|Spielserver]] arbeitet. `workDir` in `FabricLauncherPlugin.java`. Ruft `profile`, `directory`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 166.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
