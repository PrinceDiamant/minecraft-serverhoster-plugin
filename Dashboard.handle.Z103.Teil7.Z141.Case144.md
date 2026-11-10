[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case144]]

# Dashboard.handle.Z103.Teil7.Z141.Case144

```mermaid
flowchart TD
  n1["Dashboard.json"]:::internal-link
  n2["FabricLauncherPlugin.console(String)"]:::internal-link
  n3["ConsoleBuffer.snapshot"]:::internal-link
  n1 -->|"Z.144"| n2
  n2 -->|"Z.144"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
FabricLauncherPlugin.console(String)
  Liefert die letzten [[Glossar#Zeile|Zeilen]] der [[Glossar#Konsole|Konsole]]. Liefert die Konsole `console`. Ruft `slot`.
ConsoleBuffer.snapshot
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `snapshot` in `ConsoleBuffer.java`.
```

> [!knoten]- Was die Blöcke tun
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **FabricLauncherPlugin.console(String)**: Liefert die letzten [[Glossar#Zeile|Zeilen]] der [[Glossar#Konsole|Konsole]]. Liefert die Konsole `console`. Ruft `slot`.
> - **ConsoleBuffer.snapshot**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `snapshot` in `ConsoleBuffer.java`.

- Das Innere eines Wegs, ab [[Glossar#Zeile|Zeile]] 144.
- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`.
