[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.launch]] › [[FabricLauncherPlugin.launch.Z1728.Z1728.Teil1]]

# FabricLauncherPlugin.launch.Z1728.Z1728.Teil1

```mermaid
flowchart TD
  n1["if Z.1730 (slot.running())"]
  n2["ChildSlot.running"]:::internal-link
  n3["throw Z.1730 throw new IllegalStateException('already running'…"]
  n4["ServerProfile.directory"]:::internal-link
  n5["Schritt Z.1735 Files.createDirectories(wd);"]
  n6["FabricLauncherPlugin.copyPlayerFiles"]:::internal-link
  n1 -->|"Z.1730"| n2
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.1730 (slot.running())
  Zeile 1730: prüft `(slot.running())`.
ChildSlot.running
  Dieser Teil prüft, ob läuft, das. Sagt, ob der [[Glossar#Prozess|Prozess]] läuft `running`.
throw Z.1730 throw new IllegalStateException('already running'…
  Zeile 1730: Abbruch `throw new IllegalStateException('already running'…`.
ServerProfile.directory
  Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `ServerProfile.java`.
Schritt Z.1735 Files.createDirectories(wd);
  Zeile 1735: Dateioperation. `Files.createDirectories(wd);`
FabricLauncherPlugin.copyPlayerFiles
  Das [[Glossar#Plugin|Plugin]] kopiert den [[Glossar#Spieler|Spieler]] die Dateien. Kopiert `copyPlayerFiles`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.1730 (slot.running())**: Zeile 1730: prüft `(slot.running())`.
> - **ChildSlot.running**: Dieser Teil prüft, ob läuft, das. Sagt, ob der [[Glossar#Prozess|Prozess]] läuft `running`.
> - **throw Z.1730 throw new IllegalStateException('already running'…**: Zeile 1730: Abbruch `throw new IllegalStateException('already running'…`.
> - **ServerProfile.directory**: Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `ServerProfile.java`.
> - **Schritt Z.1735 Files.createDirectories(wd);**: Zeile 1735: Dateioperation. `Files.createDirectories(wd);`
> - **FabricLauncherPlugin.copyPlayerFiles**: Das [[Glossar#Plugin|Plugin]] kopiert den [[Glossar#Spieler|Spieler]] die Dateien. Kopiert `copyPlayerFiles`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.launch.Z1728.Z1728`.
