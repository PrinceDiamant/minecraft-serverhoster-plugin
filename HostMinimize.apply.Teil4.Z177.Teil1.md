[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.apply]] › [[HostMinimize.apply.Teil4.Z177.Teil1]]

# HostMinimize.apply.Teil4.Z177.Teil1

```mermaid
flowchart TD
  n1["PropertiesFile.update"]:::internal-link
  n2["HostMinimize.outerProperties"]:::internal-link
  n3["if Z.179 (files.stream().anyMatch(file -) file.getFileName…"]
  n4["HostMinimize.updateYaml"]:::internal-link
  n5["HostMinimize.bukkitChanges"]:::internal-link
  n6["if Z.181 (files.stream().anyMatch(file -) file.getFileName…"]
  n7["HostMinimize.updateYaml"]:::internal-link
  n8["HostMinimize.spigotChanges"]:::internal-link
  n1 -->|"Z.178"| n2
  n4 -->|"Z.180"| n5
  n3 -->|"ja"| n4
  n2 --> n3
  n7 -->|"Z.182"| n8
  n6 -->|"ja"| n7
  n5 --> n6
  n3 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
PropertiesFile.update
  Dieser Teil ändert das. Aktualisiert `update`.
HostMinimize.outerProperties
  Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um die Eigenschaften. `outerProperties` in `HostMinimize.java`.
if Z.179 (files.stream().anyMatch(file -) file.getFileName…
  Zeile 179: prüft `(files.stream().anyMatch(file -) file.getFileName…`.
HostMinimize.updateYaml
  Das Verkleinern des [[Glossar#Host|Host]] ändert hier einen Schritt. Eine Ebene tiefer steht er genauer. Aktualisiert `updateYaml`. Ruft `assertNotSymlink`.
HostMinimize.bukkitChanges
  Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `bukkitChanges` in `HostMinimize.java`.
if Z.181 (files.stream().anyMatch(file -) file.getFileName…
  Zeile 181: prüft `(files.stream().anyMatch(file -) file.getFileName…`.
HostMinimize.spigotChanges
  Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `spigotChanges` in `HostMinimize.java`.
```

> [!knoten]- Was die Blöcke tun
> - **PropertiesFile.update**: Dieser Teil ändert das. Aktualisiert `update`.
> - **HostMinimize.outerProperties**: Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um die Eigenschaften. `outerProperties` in `HostMinimize.java`.
> - **if Z.179 (files.stream().anyMatch(file -) file.getFileName…**: Zeile 179: prüft `(files.stream().anyMatch(file -) file.getFileName…`.
> - **HostMinimize.updateYaml**: Das Verkleinern des [[Glossar#Host|Host]] ändert hier einen Schritt. Eine Ebene tiefer steht er genauer. Aktualisiert `updateYaml`. Ruft `assertNotSymlink`.
> - **HostMinimize.bukkitChanges**: Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `bukkitChanges` in `HostMinimize.java`.
> - **if Z.181 (files.stream().anyMatch(file -) file.getFileName…**: Zeile 181: prüft `(files.stream().anyMatch(file -) file.getFileName…`.
> - **HostMinimize.spigotChanges**: Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `spigotChanges` in `HostMinimize.java`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostMinimize.apply.Teil4.Z177`.
