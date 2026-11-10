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
  Dieser Teil kümmert sich um das [[Glossar#Plugin|Plugin]] die [[Glossar#Version|Version]]. `legacyPluginVersion` in `SetupDiscovery.java`.
SetupDiscovery.isAtLeast
  Dieser Teil prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `isAtLeast`.
SetupDiscovery.loadLegacyConfig
  Dieser Teil lädt den alten Weg die [[Glossar#Einstellungen|Einstellungen]]. Lädt `loadLegacyConfig`.
```

> [!knoten]- Was die Blöcke tun
> - **SetupDiscovery.legacyPluginVersion**: Dieser Teil kümmert sich um das [[Glossar#Plugin|Plugin]] die [[Glossar#Version|Version]]. `legacyPluginVersion` in `SetupDiscovery.java`.
> - **SetupDiscovery.isAtLeast**: Dieser Teil prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `isAtLeast`.
> - **SetupDiscovery.loadLegacyConfig**: Dieser Teil lädt den alten Weg die [[Glossar#Einstellungen|Einstellungen]]. Lädt `loadLegacyConfig`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `SetupDiscovery.scan`.
