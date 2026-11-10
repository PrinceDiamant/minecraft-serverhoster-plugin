[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530]]

# FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530

```mermaid
flowchart TD
  n1["if Z.530 (action.equals('new'))"]
  n2["SetupDiscovery.resolveNewDirectory"]:::internal-link
  n3["if Z.532 (Files.exists(childDirectory) && Files.isSymbolic…"]
  n4["throw Z.533 throw new IllegalArgumentException('Serverordner …"]
  n5["FabricLauncherPlugin.applySetupProfile"]:::internal-link
  n6["FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535"]:::internal-link
  n3 -->|"ja"| n4
  n2 --> n3
  n4 --> n5
  n3 --> n5
  n1 -->|"ja"| n2
  n1 -->|"nein"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.530 (action.equals('new'))
  Zeile 530: prüft `(action.equals('new'))`.
SetupDiscovery.resolveNewDirectory
  Dieser Teil bestimmt hier einen Schritt. Eine Ebene tiefer steht er genauer. Löst auf `resolveNewDirectory`.
if Z.532 (Files.exists(childDirectory) && Files.isSymbolic…
  Zeile 532: prüft `(Files.exists(childDirectory) && Files.isSymbolic…`.
throw Z.533 throw new IllegalArgumentException('Serverordner …
  Zeile 533: Abbruch `throw new IllegalArgumentException('Serverordner …`.
FabricLauncherPlugin.applySetupProfile
  Das [[Glossar#Plugin|Plugin]] wendet an die [[Glossar#Einrichtung|Einrichtung]] die Beschreibung. Wendet an `applySetupProfile`.
FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 535 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 535.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.530 (action.equals('new'))**: Zeile 530: prüft `(action.equals('new'))`.
> - **SetupDiscovery.resolveNewDirectory**: Dieser Teil bestimmt hier einen Schritt. Eine Ebene tiefer steht er genauer. Löst auf `resolveNewDirectory`.
> - **if Z.532 (Files.exists(childDirectory) && Files.isSymbolic…**: Zeile 532: prüft `(Files.exists(childDirectory) && Files.isSymbolic…`.
> - **throw Z.533 throw new IllegalArgumentException('Serverordner …**: Zeile 533: Abbruch `throw new IllegalArgumentException('Serverordner …`.
> - **FabricLauncherPlugin.applySetupProfile**: Das [[Glossar#Plugin|Plugin]] wendet an die [[Glossar#Einrichtung|Einrichtung]] die Beschreibung. Wendet an `applySetupProfile`.
> - **FabricLauncherPlugin.configureSetup.Teil2.Z519.Z530.Z535**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 535 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 535.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 530 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `FabricLauncherPlugin.configureSetup.Teil2.Z519`.
