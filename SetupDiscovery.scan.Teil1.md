[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.scan]] › [[SetupDiscovery.scan.Teil1]]

# SetupDiscovery.scan.Teil1

```mermaid
flowchart TD
  n1["SetupDiscovery.legacyPluginVersion"]:::internal-link
  n2["SetupDiscovery.isAtLeast"]:::internal-link
  n3["SetupDiscovery.loadLegacyConfig"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SetupDiscovery.legacyPluginVersion
  `legacyPluginVersion` in `SetupDiscovery.java`.
SetupDiscovery.isAtLeast
  Prüft `isAtLeast`.
SetupDiscovery.loadLegacyConfig
  Lädt `loadLegacyConfig`.
```

- Fortsetzung von `SetupDiscovery.scan`, Quellreihenfolge.
