[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.spigotCommandIsArgv]]

# HosterTest.spigotCommandIsArgv

`HosterTest.spigotCommandIsArgv()` [src/test/java/de/aichele/childlauncher/HosterTest.java:379–385](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/test/java/de/aichele/childlauncher/HosterTest.java#L379-L385)

```mermaid
flowchart TD
  n1["SpigotBuilder.command"]:::internal-link
  n2["SpigotBuilder.assertRev"]:::internal-link
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SpigotBuilder.command
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `command` in `SpigotBuilder.java`. Ruft `assertRev`.
SpigotBuilder.assertRev
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft `assertRev`.
```

> [!knoten]- Was die Blöcke tun
> - **SpigotBuilder.command**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `command` in `SpigotBuilder.java`. Ruft `assertRev`.
> - **SpigotBuilder.assertRev**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Prüft `assertRev`.

- Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
- `spigotCommandIsArgv` in `src/test/java/de/aichele/childlauncher/HosterTest.java`
- Das ist ein Probelauf, kein Teil des laufenden Servers.
