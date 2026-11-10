[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil2.Z519]]

# FabricLauncherPlugin.configureSetup.Teil2.Z519

```mermaid
flowchart TD
  n1["if Z.519 (action.equals('import'))"]
  n2["SetupDiscovery.scan"]:::internal-link
  n3["if Z.524 (!candidate.legacyConfigured() // candidate.profi…"]
  n4["throw Z.525 throw new IllegalArgumentException('Für diesen Or…"]
  n5["if Z.526 (candidate.legacyVersion() == null && !'IMPORT 1.…"]
  n6["throw Z.527 throw new IllegalArgumentException('Die alte Plug…"]
  n7["FabricLauncherPlugin.importLegacyConfiguration"]:::internal-link
  n8["FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530"]:::internal-link
  n3 -->|"ja"| n4
  n2 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  n1 -->|"ja"| n2
  n1 -->|"nein"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.519 (action.equals('import'))
  Zeile 519: prüft `(action.equals('import'))`.
SetupDiscovery.scan
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Durchsucht `scan`. Ruft `legacyPluginVersion`, `isAtLeast`, `loadLegacyConfig`.
if Z.524 (!candidate.legacyConfigured() // candidate.profi…
  Zeile 524: prüft `(!candidate.legacyConfigured() // candidate.profi…`.
throw Z.525 throw new IllegalArgumentException('Für diesen Or…
  Zeile 525: Abbruch `throw new IllegalArgumentException('Für diesen Or…`.
if Z.526 (candidate.legacyVersion() == null && !'IMPORT 1.…
  Zeile 526: prüft `(candidate.legacyVersion() == null && !'IMPORT 1.…`.
throw Z.527 throw new IllegalArgumentException('Die alte Plug…
  Zeile 527: Abbruch `throw new IllegalArgumentException('Die alte Plug…`.
FabricLauncherPlugin.importLegacyConfiguration
  Das [[Glossar#Plugin|Plugin]] übernimmt den alten Weg. Importiert `importLegacyConfiguration`. Ruft `loadLegacyConfig`, `directory`, `migrateLegacySecrets`.
FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 530 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 530.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.519 (action.equals('import'))**: Zeile 519: prüft `(action.equals('import'))`.
> - **SetupDiscovery.scan**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Durchsucht `scan`. Ruft `legacyPluginVersion`, `isAtLeast`, `loadLegacyConfig`.
> - **if Z.524 (!candidate.legacyConfigured() // candidate.profi…**: Zeile 524: prüft `(!candidate.legacyConfigured() // candidate.profi…`.
> - **throw Z.525 throw new IllegalArgumentException('Für diesen Or…**: Zeile 525: Abbruch `throw new IllegalArgumentException('Für diesen Or…`.
> - **if Z.526 (candidate.legacyVersion() == null && !'IMPORT 1.…**: Zeile 526: prüft `(candidate.legacyVersion() == null && !'IMPORT 1.…`.
> - **throw Z.527 throw new IllegalArgumentException('Die alte Plug…**: Zeile 527: Abbruch `throw new IllegalArgumentException('Die alte Plug…`.
> - **FabricLauncherPlugin.importLegacyConfiguration**: Das [[Glossar#Plugin|Plugin]] übernimmt den alten Weg. Importiert `importLegacyConfiguration`. Ruft `loadLegacyConfig`, `directory`, `migrateLegacySecrets`.
> - **FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 530 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 530.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 519 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.configureSetup.Teil2`.
