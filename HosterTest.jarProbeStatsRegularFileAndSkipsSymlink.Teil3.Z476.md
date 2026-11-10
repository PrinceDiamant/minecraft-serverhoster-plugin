[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.jarProbeStatsRegularFileAndSkipsSymlink]] › [[HosterTest.jarProbeStatsRegularFileAndSkipsSymlink.Teil3.Z476]]

# HosterTest.jarProbeStatsRegularFileAndSkipsSymlink.Teil3.Z476

```mermaid
flowchart TD
  n1["if Z.476 (tryCreateSymbolicLink(dir.resolve('spigot-26.3.j…"]
  n2["HosterTest.tryCreateSymbolicLink"]:::internal-link
  n3["JarProbe.inspect"]:::internal-link
  n4["HosterTest.profile"]:::internal-link
  n5["JarProbe.text"]:::internal-link
  n1 -->|"Z.476"| n2
  n3 -->|"Z.477"| n4
  n4 --> n5
  n2 -->|"ja"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.476 (tryCreateSymbolicLink(dir.resolve('spigot-26.3.j…
  Zeile 476: prüft `(tryCreateSymbolicLink(dir.resolve('spigot-26.3.j…`.
HosterTest.tryCreateSymbolicLink
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `tryCreateSymbolicLink` in `HosterTest.java`. Nur Test.
JarProbe.inspect
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `inspect` in `JarProbe.java`. Ruft `jarPath`, `jarName`.
HosterTest.profile
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `profile` in `HosterTest.java`. Ruft `ServerProfile`. Nur Test.
JarProbe.text
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit Text `text`.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.476 (tryCreateSymbolicLink(dir.resolve('spigot-26.3.j…**: Zeile 476: prüft `(tryCreateSymbolicLink(dir.resolve('spigot-26.3.j…`.
> - **HosterTest.tryCreateSymbolicLink**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `tryCreateSymbolicLink` in `HosterTest.java`. Nur Test.
> - **JarProbe.inspect**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `inspect` in `JarProbe.java`. Ruft `jarPath`, `jarName`.
> - **HosterTest.profile**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `profile` in `HosterTest.java`. Ruft `ServerProfile`. Nur Test.
> - **JarProbe.text**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet mit Text `text`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 476 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `HosterTest.jarProbeStatsRegularFileAndSkipsSymlink.Teil3`.
