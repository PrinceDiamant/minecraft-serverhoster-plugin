[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.serverPropertiesPreview]] › [[FabricLauncherPlugin.serverPropertiesPreview.Teil2]]

# FabricLauncherPlugin.serverPropertiesPreview.Teil2

```mermaid
flowchart TD
  n1["if Z.2658 (profile.serverProperties != null)"]
  n2["FabricLauncherPlugin.forcedProperties"]:::internal-link
  n3["FabricLauncherPlugin.hostBindAddress"]:::internal-link
  n2 -->|"Z.2659"| n3
  n1 --> n2
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.2658 (profile.serverProperties != null)
  Zeile 2658: prüft `(profile.serverProperties != null)`.
FabricLauncherPlugin.forcedProperties
  Erzwingt `forcedProperties`. Ruft `effectiveBindAddress`.
FabricLauncherPlugin.hostBindAddress
  Betrifft den Host `hostBindAddress`.
```

- Fortsetzung von `FabricLauncherPlugin.serverPropertiesPreview`, Quellreihenfolge.
