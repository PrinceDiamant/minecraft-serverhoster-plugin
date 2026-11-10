[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil5]]

# Dashboard.handle.Z103.Teil5

```mermaid
flowchart TD
  n1["if Z.121 (!authed(ex))"]
  n2["Dashboard.authed"]:::internal-link
  n3["Dashboard.json"]:::internal-link
  n4["return Z.121 return;"]
  n5["if Z.122 (pl.setupRequired() && !path.equals('/api/status'…"]
  n6["FabricLauncherPlugin.setupRequired"]:::internal-link
  n7["Dashboard.json"]:::internal-link
  n8["return Z.129 return;"]
  n1 -->|"Z.121"| n2
  n3 --> n4
  n2 -->|"ja"| n3
  n5 -->|"Z.122"| n6
  n7 --> n8
  n6 -->|"ja"| n7
  n4 --> n5
  n2 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.121 (!authed(ex))
  Zeile 121: prüft `(!authed(ex))`.
Dashboard.authed
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `authed` in `Dashboard.java`. Ruft `token`.
Dashboard.json
  Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
return Z.121 return;
  Zeile 121: Rückgabe `return;`.
if Z.122 (pl.setupRequired() && !path.equals('/api/status'…
  Zeile 122: prüft `(pl.setupRequired() && !path.equals('/api/status'…`.
FabricLauncherPlugin.setupRequired
  Das [[Glossar#Plugin|Plugin]] kümmert sich um einen Pflichtwert. `setupRequired` in `FabricLauncherPlugin.java`.
return Z.129 return;
  Zeile 129: Rückgabe `return;`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.121 (!authed(ex))**: Zeile 121: prüft `(!authed(ex))`.
> - **Dashboard.authed**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `authed` in `Dashboard.java`. Ruft `token`.
> - **Dashboard.json**: Die [[Glossar#Web-Schnittstelle|Web-Schnittstelle]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit JSON `json`. Ruft `sendBytes`.
> - **return Z.121 return;**: Zeile 121: Rückgabe `return;`.
> - **if Z.122 (pl.setupRequired() && !path.equals('/api/status'…**: Zeile 122: prüft `(pl.setupRequired() && !path.equals('/api/status'…`.
> - **FabricLauncherPlugin.setupRequired**: Das [[Glossar#Plugin|Plugin]] kümmert sich um einen Pflichtwert. `setupRequired` in `FabricLauncherPlugin.java`.
> - **return Z.129 return;**: Zeile 129: Rückgabe `return;`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `Dashboard.handle.Z103`.
