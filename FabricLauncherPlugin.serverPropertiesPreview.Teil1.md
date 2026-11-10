[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.serverPropertiesPreview]] › [[FabricLauncherPlugin.serverPropertiesPreview.Teil1]]

# FabricLauncherPlugin.serverPropertiesPreview.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.profile"]:::internal-link
  n2["ServerProfile.directory"]:::internal-link
  n3["if Z.2653 (Files.exists(directory))"]
  n4["if Z.2654 (!Files.isDirectory(directory))"]
  n5["throw Z.2654 throw new IOException('Child working path is not …"]
  n6["PathGuard.open"]:::internal-link
  n7["PathGuard.resolve"]:::internal-link
  n1 --> n2
  n4 -->|"ja"| n5
  n6 -->|"Z.2655"| n7
  n5 --> n6
  n4 --> n6
  n3 -->|"ja"| n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.profile
  Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `profile` in `FabricLauncherPlugin.java`.
ServerProfile.directory
  Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `ServerProfile.java`.
if Z.2653 (Files.exists(directory))
  Zeile 2653: prüft `(Files.exists(directory))`.
if Z.2654 (!Files.isDirectory(directory))
  Zeile 2654: prüft `(!Files.isDirectory(directory))`.
throw Z.2654 throw new IOException('Child working path is not …
  Zeile 2654: Abbruch `throw new IOException('Child working path is not …`.
PathGuard.open
  Dieser Teil öffnet das. Öffnet `open`. Ruft `PathGuard`.
PathGuard.resolve
  Dieser Teil bestimmt das. Löst auf `resolve`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.profile**: Das [[Glossar#Plugin|Plugin]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `profile` in `FabricLauncherPlugin.java`.
> - **ServerProfile.directory**: Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `ServerProfile.java`.
> - **if Z.2653 (Files.exists(directory))**: Zeile 2653: prüft `(Files.exists(directory))`.
> - **if Z.2654 (!Files.isDirectory(directory))**: Zeile 2654: prüft `(!Files.isDirectory(directory))`.
> - **throw Z.2654 throw new IOException('Child working path is not …**: Zeile 2654: Abbruch `throw new IOException('Child working path is not …`.
> - **PathGuard.open**: Dieser Teil öffnet das. Öffnet `open`. Ruft `PathGuard`.
> - **PathGuard.resolve**: Dieser Teil bestimmt das. Löst auf `resolve`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.serverPropertiesPreview`.
