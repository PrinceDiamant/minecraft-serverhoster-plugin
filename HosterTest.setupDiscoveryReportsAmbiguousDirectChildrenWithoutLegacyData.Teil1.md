[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil4]] › [[HosterTest.setupDiscoveryReportsAmbiguousDirectChildrenWithoutLegacyData]] › [[HosterTest.setupDiscoveryReportsAmbiguousDirectChildrenWithoutLegacyData.Teil1]]

# HosterTest.setupDiscoveryReportsAmbiguousDirectChildrenWithoutLegacyData.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.531 Path root = Files.createTempDirectory('serverhost…"]
  n2["Schritt Z.532 Path first = Files.createDirectory(root.resolve('…"]
  n3["Schritt Z.533 Path second = Files.createDirectory(root.resolve(…"]
  n4["Schritt Z.534 Files.writeString(first.resolve('server.propertie…"]
  n5["Schritt Z.535 Files.writeString(second.resolve('eula.txt'), 'eu…"]
  n6["Schritt Z.536 Path nested = Files.createDirectories(root.resolv…"]
  n7["Schritt Z.537 Files.writeString(nested.resolve('server.properti…"]
  n8["Schritt Z.538 Path pending = Files.createDirectory(root.resolve…"]
  n9["Schritt Z.539 Files.writeString(pending.resolve('server.propert…"]
  n10["SetupDiscovery.scan"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n7 --> n8
  n8 --> n9
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HosterTest.setupDiscoveryReportsAmbiguousDirectChildrenWithoutLegacyData`, Quellreihenfolge.
