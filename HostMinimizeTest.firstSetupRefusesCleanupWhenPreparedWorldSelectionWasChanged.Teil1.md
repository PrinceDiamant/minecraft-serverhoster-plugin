[[00 Start]] › [[Tests]] › [[HostMinimizeTest]] › [[HostMinimizeTest.Teil1]] › [[HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged]] › [[HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged.Teil1]]

# HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.253 Files.createDirectories(data);"]
  n2["Schritt Z.254 Files.createDirectories(root.resolve('world'));"]
  n3["Schritt Z.255 Files.writeString(root.resolve('world/level.dat')…"]
  n4["Schritt Z.256 Files.writeString(root.resolve('plugins/ServerHos…"]
  n5["Schritt Z.257 Files.writeString(root.resolve('server.properties…"]
  n6["HostFirstSetup.shouldRun"]:::internal-link
  n7["HostFirstSetup.apply(Path,Path,Path,Path)"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n6 fill:#f88,stroke:#900
  style n7 fill:#f88,stroke:#900
```

```knoten
Schritt Z.253 Files.createDirectories(data);
  Zeile 253: Dateioperation. `Files.createDirectories(data);`
Schritt Z.254 Files.createDirectories(root.resolve('world'));
  Zeile 254: Dateioperation. `Files.createDirectories(root.resolve('world'));`
Schritt Z.255 Files.writeString(root.resolve('world/level.dat')…
  Zeile 255: schreibt Text in eine Datei. `Files.writeString(root.resolve('world/level.dat')…`
Schritt Z.256 Files.writeString(root.resolve('plugins/ServerHos…
  Zeile 256: schreibt Text in eine Datei. `Files.writeString(root.resolve('plugins/ServerHos…`
Schritt Z.257 Files.writeString(root.resolve('server.properties…
  Zeile 257: schreibt Text in eine Datei. `Files.writeString(root.resolve('server.properties…`
HostFirstSetup.shouldRun
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] führt aus das. Entscheidet, ob `shouldRun`. Ruft `readState`, `writeMarker`. [[Glossar#Befund|Befund]]: [[Glossar#Altlast|Altlast]], wahrscheinlich. HostFirstSetup.java:35 akzeptiert pending; Schreibstelle nur HostMinimizeTest.java:216
HostFirstSetup.apply(Path,Path,Path,Path)
  Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] wendet an das. Wendet an `apply`. Ruft `apply`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/HostFirstSetup.java:58–60 nur von Tests erreicht
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.253 Files.createDirectories(data);**: Zeile 253: Dateioperation. `Files.createDirectories(data);`
> - **Schritt Z.254 Files.createDirectories(root.resolve('world'));**: Zeile 254: Dateioperation. `Files.createDirectories(root.resolve('world'));`
> - **Schritt Z.255 Files.writeString(root.resolve('world/level.dat')…**: Zeile 255: schreibt Text in eine Datei. `Files.writeString(root.resolve('world/level.dat')…`
> - **Schritt Z.256 Files.writeString(root.resolve('plugins/ServerHos…**: Zeile 256: schreibt Text in eine Datei. `Files.writeString(root.resolve('plugins/ServerHos…`
> - **Schritt Z.257 Files.writeString(root.resolve('server.properties…**: Zeile 257: schreibt Text in eine Datei. `Files.writeString(root.resolve('server.properties…`
> - **HostFirstSetup.shouldRun**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] führt aus das. Entscheidet, ob `shouldRun`. Ruft `readState`, `writeMarker`. [[Glossar#Befund|Befund]]: [[Glossar#Altlast|Altlast]], wahrscheinlich. HostFirstSetup.java:35 akzeptiert pending; Schreibstelle nur HostMinimizeTest.java:216
> - **HostFirstSetup.apply(Path,Path,Path,Path)**: Die [[Glossar#Ersteinrichtung|Ersteinrichtung]] wendet an das. Wendet an `apply`. Ruft `apply`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/HostFirstSetup.java:58–60 nur von Tests erreicht

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostMinimizeTest.firstSetupRefusesCleanupWhenPreparedWorldSelectionWasChanged`.
