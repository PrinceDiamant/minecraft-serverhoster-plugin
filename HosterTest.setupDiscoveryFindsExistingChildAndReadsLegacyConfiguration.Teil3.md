[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil4]] › [[HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration]] › [[HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration.Teil3]]

# HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration.Teil3

```mermaid
flowchart TD
  n1["SetupDiscovery.scan"]:::internal-link
  n2["SetupDiscovery.resolveNewDirectory"]:::internal-link
  n3["SetupDiscovery.resolveNewDirectory"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SetupDiscovery.scan
  Durchsucht `scan`. Ruft `legacyPluginVersion`, `isAtLeast`, `loadLegacyConfig`.
SetupDiscovery.resolveNewDirectory
  Löst auf `resolveNewDirectory`.
```

- Fortsetzung von `HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration`, Quellreihenfolge.
