[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List)]] › [[HostFirstSetup.apply(Path,Path,Path,Path,List).Teil3]]

# HostFirstSetup.apply(Path,Path,Path,Path,List).Teil3

```mermaid
flowchart TD
  n1["HostFirstSetup.decodeWorldNames"]:::internal-link
  n2["HostFirstSetup.readLevelNames"]:::internal-link
  n3["if Z.91 (!'preparing'.equals(previousStatus))"]
  n4["HostMinimize.newLobbyName(Path)"]:::internal-link
  n5["if Z.92 (!HostMinimize.lobbyNameSafe(worldName))"]
  n6["HostMinimize.lobbyNameSafe"]:::internal-link
  n7["throw Z.92 throw new IOException('Invalid prepared lobby nam…"]
  n8["HostFirstSetup.worldDirectories"]:::internal-link
  n1 -->|"Z.89"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n5 -->|"Z.92"| n6
  n6 -->|"ja"| n7
  n4 --> n5
  n3 --> n5
  n7 --> n8
  n6 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostFirstSetup.decodeWorldNames
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] kümmert sich um die [[Glossar#Spielwelt|Spielwelt]] die Namen. Dekodiert `decodeWorldNames`. Ruft `safeWorldName`.
HostFirstSetup.readLevelNames
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest die Namen. Liest `readLevelNames`. Ruft `safeWorldName`.
if Z.91 (!'preparing'.equals(previousStatus))
  Zeile 91: prüft `(!'preparing'.equals(previousStatus))`.
HostMinimize.newLobbyName(Path)
  Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um die Wartewelt den Namen. `newLobbyName` in `HostMinimize.java`. Ruft `newLobbyName`.
if Z.92 (!HostMinimize.lobbyNameSafe(worldName))
  Zeile 92: prüft `(!HostMinimize.lobbyNameSafe(worldName))`.
HostMinimize.lobbyNameSafe
  Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um den Namen die erlaubte Grenze. `lobbyNameSafe` in `HostMinimize.java`.
throw Z.92 throw new IOException('Invalid prepared lobby nam…
  Zeile 92: Abbruch `throw new IOException('Invalid prepared lobby nam…`.
HostFirstSetup.worldDirectories
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Betrifft die Welt `worldDirectories`. Ruft `safeWorldName`, `addIfDirectory`.
```

> [!knoten]- Was die Blöcke tun
> - **HostFirstSetup.decodeWorldNames**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] kümmert sich um die [[Glossar#Spielwelt|Spielwelt]] die Namen. Dekodiert `decodeWorldNames`. Ruft `safeWorldName`.
> - **HostFirstSetup.readLevelNames**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] liest die Namen. Liest `readLevelNames`. Ruft `safeWorldName`.
> - **if Z.91 (!'preparing'.equals(previousStatus))**: Zeile 91: prüft `(!'preparing'.equals(previousStatus))`.
> - **HostMinimize.newLobbyName(Path)**: Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um die Wartewelt den Namen. `newLobbyName` in `HostMinimize.java`. Ruft `newLobbyName`.
> - **if Z.92 (!HostMinimize.lobbyNameSafe(worldName))**: Zeile 92: prüft `(!HostMinimize.lobbyNameSafe(worldName))`.
> - **HostMinimize.lobbyNameSafe**: Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um den Namen die erlaubte Grenze. `lobbyNameSafe` in `HostMinimize.java`.
> - **throw Z.92 throw new IOException('Invalid prepared lobby nam…**: Zeile 92: Abbruch `throw new IOException('Invalid prepared lobby nam…`.
> - **HostFirstSetup.worldDirectories**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Betrifft die Welt `worldDirectories`. Ruft `safeWorldName`, `addIfDirectory`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostFirstSetup.apply(Path,Path,Path,Path,List)`.
