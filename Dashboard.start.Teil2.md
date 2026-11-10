[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Start]] › [[Dashboard.start]] › [[Dashboard.start.Teil2]]

# Dashboard.start.Teil2

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.effectiveBindAddress"]:::internal-link
  n2["FabricLauncherPlugin.childBindAddress"]:::internal-link
  n3["FabricLauncherPlugin.profile"]:::internal-link
  n4["if Z.55 (bind == null // bind.isBlank())"]
  n5["Schritt Z.56 int port = pl.getConfig().getInt('dashboard.port'…"]
  n6["Dashboard.start.Teil2.Z58"]:::internal-link
  n1 -->|"Z.54"| n2
  n2 -->|"Z.54"| n3
  n3 --> n4
  n4 --> n5
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.effectiveBindAddress
  Liefert den wirksamen Wert `effectiveBindAddress`.
FabricLauncherPlugin.childBindAddress
  Betrifft den Child `childBindAddress`. Ruft `effectiveBindAddress`, `hostBindAddress`.
FabricLauncherPlugin.profile
  `profile` in `FabricLauncherPlugin.java`.
if Z.55 (bind == null // bind.isBlank())
  Zeile 55: prüft `(bind == null // bind.isBlank())`.
Schritt Z.56 int port = pl.getConfig().getInt('dashboard.port'…
  Zeile 56: liest die Config. `int port = pl.getConfig().getInt('dashboard.port'…`
Dashboard.start.Teil2.Z58
  Fortsetzung des Ablaufs ab Zeile 58.
```

- Fortsetzung von `Dashboard.start`, Quellreihenfolge.
