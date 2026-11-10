[[00 Start]] › [[Plugin-Kern]] › [[Host-Pfade]] › [[FabricLauncherPlugin.hostProtectedPaths]] › [[FabricLauncherPlugin.hostProtectedPaths.Teil1]]

# FabricLauncherPlugin.hostProtectedPaths.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n2["Schritt Z.2169 String configured = getConfig().getString('workin…"]
  n3["if Z.2171 (!child.isAbsolute())"]
  n4["for Z.2173 (ServerProfile profile : profiles)"]
  n5["ServerProfile.directory"]:::internal-link
  n1 --> n2
  n2 --> n3
  n4 -->|"wiederholen"| n5
  n3 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
FabricLauncherPlugin.getWorldRoot
  Das [[Glossar#Plugin|Plugin]] liefert die [[Glossar#Spielwelt|Spielwelt]] den Anfang. Liefert `getWorldRoot`.
Schritt Z.2169 String configured = getConfig().getString('workin…
  Zeile 2169: liest die Config. `String configured = getConfig().getString('workin…`
if Z.2171 (!child.isAbsolute())
  Zeile 2171: prüft `(!child.isAbsolute())`.
for Z.2173 (ServerProfile profile : profiles)
  Zeile 2173: Schleife `(ServerProfile profile : profiles)`.
ServerProfile.directory
  Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `ServerProfile.java`.
```

> [!knoten]- Was die Blöcke tun
> - **FabricLauncherPlugin.getWorldRoot**: Das [[Glossar#Plugin|Plugin]] liefert die [[Glossar#Spielwelt|Spielwelt]] den Anfang. Liefert `getWorldRoot`.
> - **Schritt Z.2169 String configured = getConfig().getString('workin…**: Zeile 2169: liest die Config. `String configured = getConfig().getString('workin…`
> - **if Z.2171 (!child.isAbsolute())**: Zeile 2171: prüft `(!child.isAbsolute())`.
> - **for Z.2173 (ServerProfile profile : profiles)**: Zeile 2173: Schleife `(ServerProfile profile : profiles)`.
> - **ServerProfile.directory**: Die Serverbeschreibung macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `ServerProfile.java`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `FabricLauncherPlugin.hostProtectedPaths`.
