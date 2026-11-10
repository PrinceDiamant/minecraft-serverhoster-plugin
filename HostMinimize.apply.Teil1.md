[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[HostMinimize]] › [[HostMinimize.Teil2]] › [[HostMinimize.apply]] › [[HostMinimize.apply.Teil1]]

# HostMinimize.apply.Teil1

```mermaid
flowchart TD
  n1["HostMinimize.assertRoot"]:::internal-link
  n2["HostMinimize.assertEditable"]:::internal-link
  n3["if Z.155 (!Files.isRegularFile(properties, LinkOption.NOFO…"]
  n4["throw Z.156 throw new IOException('Outer server.properties mu…"]
  n5["if Z.159 (Files.exists(root.resolve('bukkit.yml'), LinkOpt…"]
  n1 --> n2
  n3 -->|"ja"| n4
  n2 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HostMinimize.assertRoot
  Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um den Anfang. Prüft `assertRoot`.
HostMinimize.assertEditable
  Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft `assertEditable`.
if Z.155 (!Files.isRegularFile(properties, LinkOption.NOFO…
  Zeile 155: prüft `(!Files.isRegularFile(properties, LinkOption.NOFO…`.
throw Z.156 throw new IOException('Outer server.properties mu…
  Zeile 156: Abbruch `throw new IOException('Outer server.properties mu…`.
if Z.159 (Files.exists(root.resolve('bukkit.yml'), LinkOpt…
  Zeile 159: prüft `(Files.exists(root.resolve('bukkit.yml'), LinkOpt…`.
```

> [!knoten]- Was die Blöcke tun
> - **HostMinimize.assertRoot**: Das Verkleinern des [[Glossar#Host|Host]] kümmert sich um den Anfang. Prüft `assertRoot`.
> - **HostMinimize.assertEditable**: Das Verkleinern des [[Glossar#Host|Host]] macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft `assertEditable`.
> - **if Z.155 (!Files.isRegularFile(properties, LinkOption.NOFO…**: Zeile 155: prüft `(!Files.isRegularFile(properties, LinkOption.NOFO…`.
> - **throw Z.156 throw new IOException('Outer server.properties mu…**: Zeile 156: Abbruch `throw new IOException('Outer server.properties mu…`.
> - **if Z.159 (Files.exists(root.resolve('bukkit.yml'), LinkOpt…**: Zeile 159: prüft `(Files.exists(root.resolve('bukkit.yml'), LinkOpt…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `HostMinimize.apply`.
