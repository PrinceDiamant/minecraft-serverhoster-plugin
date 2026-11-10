[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.jarProbeStatsRegularFileAndSkipsSymlink]] › [[HosterTest.jarProbeStatsRegularFileAndSkipsSymlink.Teil1]]

# HosterTest.jarProbeStatsRegularFileAndSkipsSymlink.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.457 Path dir = Files.createDirectories(tmp.resolve('j…"]
  n2["Schritt Z.459 Files.writeString(jar, 'not-a-real-server');"]
  n3["HosterTest.profile"]:::internal-link
  n4["JarProbe.inspect"]:::internal-link
  n5["Schritt Z.466 assertEquals(Files.size(jar), info.bytes());"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.457 Path dir = Files.createDirectories(tmp.resolve('j…
  Zeile 457: Dateioperation. `Path dir = Files.createDirectories(tmp.resolve('j…`
Schritt Z.459 Files.writeString(jar, 'not-a-real-server');
  Zeile 459: schreibt Text in eine Datei. `Files.writeString(jar, 'not-a-real-server');`
HosterTest.profile
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `profile` in `HosterTest.java`. Ruft `ServerProfile`. Nur Test.
JarProbe.inspect
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `inspect` in `JarProbe.java`. Ruft `jarPath`, `jarName`.
Schritt Z.466 assertEquals(Files.size(jar), info.bytes());
  Zeile 466: Dateioperation. `assertEquals(Files.size(jar), info.bytes());`
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.457 Path dir = Files.createDirectories(tmp.resolve('j…**: Zeile 457: Dateioperation. `Path dir = Files.createDirectories(tmp.resolve('j…`
> - **Schritt Z.459 Files.writeString(jar, 'not-a-real-server');**: Zeile 459: schreibt Text in eine Datei. `Files.writeString(jar, 'not-a-real-server');`
> - **HosterTest.profile**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `profile` in `HosterTest.java`. Ruft `ServerProfile`. Nur Test.
> - **JarProbe.inspect**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `inspect` in `JarProbe.java`. Ruft `jarPath`, `jarName`.
> - **Schritt Z.466 assertEquals(Files.size(jar), info.bytes());**: Zeile 466: Dateioperation. `assertEquals(Files.size(jar), info.bytes());`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HosterTest.jarProbeStatsRegularFileAndSkipsSymlink`.
