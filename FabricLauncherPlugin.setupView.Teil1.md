[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.setupView]] › [[FabricLauncherPlugin.setupView.Teil1]]

# FabricLauncherPlugin.setupView.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n2["SetupDiscovery.scan"]:::internal-link
  n3["SetupDiscovery.Candidate.view"]:::internal-link
  n4["FabricLauncherPlugin.legacyJarNames"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.getWorldRoot
  Liefert `getWorldRoot`.
SetupDiscovery.scan
  Durchsucht `scan`. Ruft `legacyPluginVersion`, `isAtLeast`, `loadLegacyConfig`.
SetupDiscovery.Candidate.view
  Liefert die Sicht `view`.
FabricLauncherPlugin.legacyJarNames
  `legacyJarNames` in `FabricLauncherPlugin.java`.
```

- Fortsetzung von `FabricLauncherPlugin.setupView`, Quellreihenfolge.
