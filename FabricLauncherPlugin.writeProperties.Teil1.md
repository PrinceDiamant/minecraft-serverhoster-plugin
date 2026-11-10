[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.writeProperties]] › [[FabricLauncherPlugin.writeProperties.Teil1]]

# FabricLauncherPlugin.writeProperties.Teil1

```mermaid
flowchart TD
  n1["if Z.2630 (c.serverProperties != null)"]
  n2["FabricLauncherPlugin.forcedProperties"]:::internal-link
  n3["FabricLauncherPlugin.hostBindAddress"]:::internal-link
  n2 -->|"Z.2631"| n3
  n1 --> n2
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.2630 (c.serverProperties != null)
  Zeile 2630: prüft `(c.serverProperties != null)`.
FabricLauncherPlugin.forcedProperties
  Erzwingt `forcedProperties`. Ruft `effectiveBindAddress`.
FabricLauncherPlugin.hostBindAddress
  Betrifft den Host `hostBindAddress`.
```

- Fortsetzung von `FabricLauncherPlugin.writeProperties`, Quellreihenfolge.
