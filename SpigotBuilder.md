[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[SpigotBuilder]]

# SpigotBuilder

```mermaid
flowchart TD
  n1["SpigotBuilder.SpigotBuilder"]:::internal-link
  n2["SpigotBuilder.assertRev"]:::internal-link
  n3["SpigotBuilder.command"]:::internal-link
  n4["SpigotBuilder.build"]:::internal-link
  n5["SpigotBuilder.commandExists"]:::internal-link
  n3 -->|"Z.22"| n2
  n4 -->|"Z.27"| n2
  n4 -->|"Z.37"| n5
  n4 -->|"Z.38"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SpigotBuilder.SpigotBuilder
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `SpigotBuilder`.
SpigotBuilder.assertRev
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `assertRev`.
SpigotBuilder.command
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `command`.
SpigotBuilder.build
  Dieser Teil baut das. Im [[Glossar#Quelltext|Quelltext]] heißt das `build`.
SpigotBuilder.commandExists
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `commandExists`.
```

> [!knoten]- Was die Blöcke tun
> - **SpigotBuilder.SpigotBuilder**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `SpigotBuilder`.
> - **SpigotBuilder.assertRev**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `assertRev`.
> - **SpigotBuilder.command**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `command`.
> - **SpigotBuilder.build**: Dieser Teil baut das. Im [[Glossar#Quelltext|Quelltext]] heißt das `build`.
> - **SpigotBuilder.commandExists**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `commandExists`.

- Besorgt die [[Glossar#Programmdatei|Programmdatei]] für einen Spigot-Server, indem es sie lädt oder baut.
