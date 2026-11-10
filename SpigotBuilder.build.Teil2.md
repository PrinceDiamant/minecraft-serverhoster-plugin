[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[SpigotBuilder]] › [[SpigotBuilder.build]] › [[SpigotBuilder.build.Teil2]]

# SpigotBuilder.build.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.36 Files.createDirectories(work);"]
  n2["if Z.37 (!commandExists('git'))"]
  n3["SpigotBuilder.commandExists"]:::internal-link
  n4["throw Z.37 throw new IOException('git missing; BuildTools ne…"]
  n5["SpigotBuilder.command"]:::internal-link
  n6["Schritt Z.40 Process p = new ProcessBuilder(cmd).directory(wor…"]
  n2 -->|"Z.37"| n3
  n3 -->|"ja"| n4
  n1 --> n2
  n4 --> n5
  n3 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.36 Files.createDirectories(work);
  Zeile 36: Dateioperation. `Files.createDirectories(work);`
if Z.37 (!commandExists('git'))
  Zeile 37: prüft `(!commandExists('git'))`.
SpigotBuilder.commandExists
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `commandExists` in `SpigotBuilder.java`.
throw Z.37 throw new IOException('git missing; BuildTools ne…
  Zeile 37: Abbruch `throw new IOException('git missing; BuildTools ne…`.
SpigotBuilder.command
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `command` in `SpigotBuilder.java`. Ruft `assertRev`.
Schritt Z.40 Process p = new ProcessBuilder(cmd).directory(wor…
  Zeile 40: baut einen Prozess. `Process p = new ProcessBuilder(cmd).directory(wor…`
```

> [!knoten]- Was die Blöcke tun
> - **Schritt Z.36 Files.createDirectories(work);**: Zeile 36: Dateioperation. `Files.createDirectories(work);`
> - **if Z.37 (!commandExists('git'))**: Zeile 37: prüft `(!commandExists('git'))`.
> - **SpigotBuilder.commandExists**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `commandExists` in `SpigotBuilder.java`.
> - **throw Z.37 throw new IOException('git missing; BuildTools ne…**: Zeile 37: Abbruch `throw new IOException('git missing; BuildTools ne…`.
> - **SpigotBuilder.command**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `command` in `SpigotBuilder.java`. Ruft `assertRev`.
> - **Schritt Z.40 Process p = new ProcessBuilder(cmd).directory(wor…**: Zeile 40: baut einen Prozess. `Process p = new ProcessBuilder(cmd).directory(wor…`

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `SpigotBuilder.build`.
