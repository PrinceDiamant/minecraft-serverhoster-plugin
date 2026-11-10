[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil1]] › [[HosterTest.defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty]] › [[HosterTest.defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty.Teil1]]

# HosterTest.defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty.Teil1

```mermaid
flowchart TD
  n1["Profiles.load"]:::internal-link
  n2["FabricLauncherPlugin.forcedProperties"]:::internal-link
  n3["Schritt Z.113 String config = Files.readString(Path.of('src/mai…"]
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n1 fill:#f88,stroke:#900
```

```knoten
Profiles.load
  Lädt `load`. Ruft `one`, `str`, `copyId`. Befund: angemeldet aber nicht umgesetzt (sicher).
FabricLauncherPlugin.forcedProperties
  Erzwingt `forcedProperties`. Ruft `effectiveBindAddress`.
Schritt Z.113 String config = Files.readString(Path.of('src/mai…
  Zeile 113: liest Text aus einer Datei. `String config = Files.readString(Path.of('src/mai…`
```

- Fortsetzung von `HosterTest.defaultsKeepVanillaGameplayAndNeverPauseWhenEmpty`, Quellreihenfolge.
