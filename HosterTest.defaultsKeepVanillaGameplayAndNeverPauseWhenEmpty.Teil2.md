[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil1]] › [[HosterTest.defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty]] › [[HosterTest.defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty.Teil2]]

# HosterTest.defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.125 Files.writeString(properties, 'view-distance=12/n…"]
  n2["FabricLauncherPlugin.updateProperties"]:::internal-link
  n3["FabricLauncherPlugin.forcedProperties"]:::internal-link
  n4["Schritt Z.127 String saved = Files.readString(properties);"]
  n2 -->|"Z.126"| n3
  n1 --> n2
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HosterTest.defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty`, Quellreihenfolge.
