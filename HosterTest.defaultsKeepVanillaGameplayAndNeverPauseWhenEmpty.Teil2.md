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

```knoten
Schritt Z.125 Files.writeString(properties, 'view-distance=12/n…
  Zeile 125: schreibt Text in eine Datei. `Files.writeString(properties, 'view-distance=12/n…`
FabricLauncherPlugin.updateProperties
  Aktualisiert `updateProperties`. Ruft `update`.
FabricLauncherPlugin.forcedProperties
  Erzwingt `forcedProperties`. Ruft `effectiveBindAddress`.
Schritt Z.127 String saved = Files.readString(properties);
  Zeile 127: liest Text aus einer Datei. `String saved = Files.readString(properties);`
```

- Fortsetzung von `HosterTest.defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty`, Quellreihenfolge.
