[[00 Start]] › [[Server-Anlage]] › [[Startplan]]

# Startplan

```mermaid
flowchart TD
  n1["SpigotBuilder"]:::internal-link
  n2["PathGuard"]:::internal-link
  n3["PropertiesFile"]:::internal-link
  n4["JarProbe"]:::internal-link
  n5["LaunchPlan"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
SpigotBuilder
  Besorgt die [[Glossar#Programmdatei|Programmdatei]] für einen Spigot-Server, indem es sie lädt oder baut.
PathGuard
  Prüft, dass ein Ordner wirklich unter dem erlaubten Anfangsordner liegt, und nicht daneben.
PropertiesFile
  Liest und schreibt eine Eigenschaftsdatei, [[Glossar#Zeile|Zeile]] für Zeile.
JarProbe
  Sieht in die [[Glossar#Programmdatei|Programmdatei]] und liest ab, was für ein Server darin steckt.
LaunchPlan
  Baut die Argumente, mit denen das Programm des [[Glossar#Spielserver|Spielservers]] gestartet wird.
```

> [!knoten] Was die Blöcke tun
> - **SpigotBuilder**: Besorgt die [[Glossar#Programmdatei|Programmdatei]] für einen Spigot-Server, indem es sie lädt oder baut.
> - **PathGuard**: Prüft, dass ein Ordner wirklich unter dem erlaubten Anfangsordner liegt, und nicht daneben.
> - **PropertiesFile**: Liest und schreibt eine Eigenschaftsdatei, [[Glossar#Zeile|Zeile]] für Zeile.
> - **JarProbe**: Sieht in die [[Glossar#Programmdatei|Programmdatei]] und liest ab, was für ein Server darin steckt.
> - **LaunchPlan**: Baut die Argumente, mit denen das Programm des [[Glossar#Spielserver|Spielservers]] gestartet wird.

- Was zum Starten gebraucht wird: Eigenschaften, ein geprüfter Ordner, die Argumente, die [[Glossar#Programmdatei|Programmdatei]].
