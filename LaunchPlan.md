[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[LaunchPlan]]

# LaunchPlan

```mermaid
flowchart TD
  n1["LaunchPlan.LaunchPlan"]:::internal-link
  n2["LaunchPlan.jarName"]:::internal-link
  n3["LaunchPlan.jarPath"]:::internal-link
  n4["LaunchPlan.argv(String,ServerProfile)"]:::internal-link
  n5["LaunchPlan.argv(String,ServerProfile,Path)"]:::internal-link
  n6["LaunchPlan.text"]:::internal-link
  n7["LaunchPlan.fileName"]:::internal-link
  n2 -->|"Z.20"| n7
  n3 -->|"Z.27"| n2
  n4 -->|"Z.31"| n5
  n4 -->|"Z.31"| n3
  n6 -->|"Z.53"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LaunchPlan.LaunchPlan
  Dieser Teil startet den [[Glossar#Startplan|Startplan]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `LaunchPlan`.
LaunchPlan.jarName
  Dieser Teil kümmert sich um den Namen. Im [[Glossar#Quelltext|Quelltext]] heißt das `jarName`.
LaunchPlan.jarPath
  Dieser Teil kümmert sich um den Pfad. Im [[Glossar#Quelltext|Quelltext]] heißt das `jarPath`.
LaunchPlan.argv(String,ServerProfile)
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `argv(String,ServerProfile)`.
LaunchPlan.argv(String,ServerProfile,Path)
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `argv(String,ServerProfile,Path)`.
LaunchPlan.text
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `text`.
LaunchPlan.fileName
  Dieser Teil kümmert sich um den Namen. Im [[Glossar#Quelltext|Quelltext]] heißt das `fileName`.
```

> [!knoten]- Was die Blöcke tun
> - **LaunchPlan.LaunchPlan**: Dieser Teil startet den [[Glossar#Startplan|Startplan]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `LaunchPlan`.
> - **LaunchPlan.jarName**: Dieser Teil kümmert sich um den Namen. Im [[Glossar#Quelltext|Quelltext]] heißt das `jarName`.
> - **LaunchPlan.jarPath**: Dieser Teil kümmert sich um den Pfad. Im [[Glossar#Quelltext|Quelltext]] heißt das `jarPath`.
> - **LaunchPlan.argv(String,ServerProfile)**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `argv(String,ServerProfile)`.
> - **LaunchPlan.argv(String,ServerProfile,Path)**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `argv(String,ServerProfile,Path)`.
> - **LaunchPlan.text**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `text`.
> - **LaunchPlan.fileName**: Dieser Teil kümmert sich um den Namen. Im [[Glossar#Quelltext|Quelltext]] heißt das `fileName`.

- Baut die Argumente, mit denen das Programm des [[Glossar#Spielserver|Spielservers]] gestartet wird.
