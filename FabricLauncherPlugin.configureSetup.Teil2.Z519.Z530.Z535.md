[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535]]

# FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535

```mermaid
flowchart TD
  n1["if Z.535 (action.equals('attach'))"]
  n2["FabricLauncherPlugin.findSetupCandidate"]:::internal-link
  n3["FabricLauncherPlugin.applySetupProfile"]:::internal-link
  n4["FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535.Z538"]:::internal-link
  n2 --> n3
  n1 -->|"ja"| n2
  n1 -->|"nein"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.535 (action.equals('attach'))
  Zeile 535: prüft `(action.equals('attach'))`.
FabricLauncherPlugin.findSetupCandidate
  Sucht `findSetupCandidate`. Ruft `scan`.
FabricLauncherPlugin.applySetupProfile
  Wendet an `applySetupProfile`.
FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535.Z538
  Fortsetzung des Ablaufs ab Zeile 538.
```

- Fortsetzung von `FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530`, Quellreihenfolge.
