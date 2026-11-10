[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535.Z538.Z554]]

# FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535.Z538.Z554

```mermaid
flowchart TD
  n1["if Z.554 (action.equals('delete'))"]
  n2["FabricLauncherPlugin.findSetupCandidate"]:::internal-link
  n3["if Z.557 (!expected.equals(confirm))"]
  n4["throw Z.557 throw new IllegalArgumentException('Die Löschbest…"]
  n5["if Z.558 (!SetupDiscovery.isSafeArchiveTarget(root, candid…"]
  n6["SetupDiscovery.isSafeArchiveTarget"]:::internal-link
  n7["throw Z.559 throw new IllegalArgumentException('Dieser Ordner…"]
  n8["Schritt Z.562 Files.move(candidate.path(), pendingDelete);"]
  n9["SetupDiscovery.resolveNewDirectory"]:::internal-link
  n10["FabricLauncherPlugin.applySetupProfile"]:::internal-link
  n11["throw Z.568 throw new IllegalArgumentException('Unbekannte Ei…"]
  n3 -->|"ja"| n4
  n2 --> n3
  n5 -->|"Z.558"| n6
  n6 -->|"ja"| n7
  n4 --> n5
  n3 --> n5
  n7 --> n8
  n6 --> n8
  n8 --> n9
  n9 --> n10
  n1 -->|"ja"| n2
  n1 -->|"nein"| n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535.Z538`, Quellreihenfolge.
