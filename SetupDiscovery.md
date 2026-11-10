[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]]

# SetupDiscovery

```mermaid
flowchart TD
  n1["Candidate"]:::internal-link
  n2["SetupDiscovery.SetupDiscovery"]:::internal-link
  n3["SetupDiscovery.scan"]:::internal-link
  n4["SetupDiscovery.loadLegacyConfig"]:::internal-link
  n5["SetupDiscovery.resolveNewDirectory"]:::internal-link
  n6["SetupDiscovery.legacyPluginVersion"]:::internal-link
  n7["SetupDiscovery.isAtLeast"]:::internal-link
  n8["SetupDiscovery.isSafeArchiveTarget"]:::internal-link
  n9["SetupDiscovery.isServerDirectory"]:::internal-link
  n10["SetupDiscovery.isAllowedConfiguredDirectory"]:::internal-link
  n11["SetupDiscovery.hasServerFiles"]:::internal-link
  n12["SetupDiscovery.topLevelEntries"]:::internal-link
  n3 -->|"Z.40"| n6
  n3 -->|"Z.41"| n7
  n3 -->|"Z.43"| n4
  n3 -->|"Z.57"| n10
  n3 -->|"Z.57"| n9
  n3 -->|"Z.85"| n11
  n3 -->|"Z.86"| n12
  n9 -->|"Z.169"| n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```


