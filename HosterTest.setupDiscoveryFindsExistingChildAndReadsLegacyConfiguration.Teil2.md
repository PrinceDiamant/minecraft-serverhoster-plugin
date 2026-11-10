[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil4]] › [[HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration]] › [[HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration.Teil2]]

# HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration.Teil2

```mermaid
flowchart TD
  n1["HosterTest.writeLegacyPluginJar"]:::internal-link
  n2["SetupDiscovery.scan"]:::internal-link
  n3["HosterTest.writeLegacyPluginJar"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HosterTest.writeLegacyPluginJar
  Schreibt `writeLegacyPluginJar`. Nur Test.
SetupDiscovery.scan
  Durchsucht `scan`. Ruft `legacyPluginVersion`, `isAtLeast`, `loadLegacyConfig`.
```

- Fortsetzung von `HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration`, Quellreihenfolge.
