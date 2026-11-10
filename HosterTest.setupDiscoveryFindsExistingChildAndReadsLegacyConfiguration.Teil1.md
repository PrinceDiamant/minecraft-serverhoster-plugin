[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil4]] › [[HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration]] › [[HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration.Teil1]]

# HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.501 Path root = Files.createTempDirectory('serverhost…"]
  n2["Schritt Z.502 Path child = Files.createDirectory(root.resolve('…"]
  n3["Schritt Z.503 Files.writeString(child.resolve('server.propertie…"]
  n4["Schritt Z.504 Path pendingDelete = Files.createDirectory(root.r…"]
  n5["Schritt Z.505 Files.writeString(pendingDelete.resolve('server.p…"]
  n6["Schritt Z.506 Path pendingReset = Files.createDirectory(root.re…"]
  n7["Schritt Z.507 Files.writeString(pendingReset.resolve('server.pr…"]
  n8["Schritt Z.508 Path plugins = Files.createDirectory(root.resolve…"]
  n9["Schritt Z.509 Path legacyDirectory = Files.createDirectory(plug…"]
  n10["Schritt Z.511 Files.writeString(legacyConfig, 'type: paper/nmcV…"]
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

- Fortsetzung von `HosterTest.setupDiscoveryFindsExistingChildAndReadsLegacyConfiguration`, Quellreihenfolge.
