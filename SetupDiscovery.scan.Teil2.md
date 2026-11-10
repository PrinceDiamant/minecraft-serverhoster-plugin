[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.scan]] › [[SetupDiscovery.scan.Teil2]]

# SetupDiscovery.scan.Teil2

```mermaid
flowchart TD
  n1["if Z.47 (Files.isRegularFile(propertiesPath, LinkOption.N…"]
  n2["try Z.48"]
  n3["SetupDiscovery.scan.Teil2.Z54"]:::internal-link
  n4["SetupDiscovery.scan.Teil2.Z62"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SetupDiscovery.scan`, Quellreihenfolge.
