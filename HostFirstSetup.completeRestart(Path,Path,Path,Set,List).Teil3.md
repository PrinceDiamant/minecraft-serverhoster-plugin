[[00 Start]] › [[Host-Betrieb]] › [[Host-Ersteinrichtung]] › [[HostFirstSetup]] › [[HostFirstSetup.Teil1]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List)]] › [[HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil3]]

# HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil3

```mermaid
flowchart TD
  n1["if Z.141 (data == null // Files.isSymbolicLink(data) // !F…"]
  n2["throw Z.144 throw new SecurityException('host setup marker mu…"]
  n3["Schritt Z.146 Path realChild = Files.exists(child) ? child.toRe…"]
  n4["HostFirstSetup.worldDirectories"]:::internal-link
  n5["HostFirstSetup.decodeWorldNames"]:::internal-link
  n6["HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil3.Z149"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"Z.147"| n5
  n3 --> n4
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.141 (data == null // Files.isSymbolicLink(data) // !F…
  Zeile 141: prüft `(data == null // Files.isSymbolicLink(data) // !F…`.
throw Z.144 throw new SecurityException('host setup marker mu…
  Zeile 144: Abbruch `throw new SecurityException('host setup marker mu…`.
Schritt Z.146 Path realChild = Files.exists(child) ? child.toRe…
  Zeile 146: Dateioperation. `Path realChild = Files.exists(child) ? child.toRe…`
HostFirstSetup.worldDirectories
  Betrifft die Welt `worldDirectories`. Ruft `safeWorldName`, `addIfDirectory`.
HostFirstSetup.decodeWorldNames
  Dekodiert `decodeWorldNames`. Ruft `safeWorldName`.
HostFirstSetup.completeRestart(Path,Path,Path,Set,List).Teil3.Z149
  Fortsetzung des Ablaufs ab Zeile 149.
```

- Fortsetzung von `HostFirstSetup.completeRestart(Path,Path,Path,Set,List)`, Quellreihenfolge.
