[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[PropertiesFile]]

# PropertiesFile

```mermaid
flowchart TD
  n1["PropertiesFile.PropertiesFile"]:::internal-link
  n2["PropertiesFile.update"]:::internal-link
  n3["PropertiesFile.preview"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
PropertiesFile.PropertiesFile
  Dieser Teil kümmert sich um die Datei. Im [[Glossar#Quelltext|Quelltext]] heißt das `PropertiesFile`.
PropertiesFile.update
  Dieser Teil ändert das. Im [[Glossar#Quelltext|Quelltext]] heißt das `update`.
PropertiesFile.preview
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `preview`.
```

> [!knoten]- Was die Blöcke tun
> - **PropertiesFile.PropertiesFile**: Dieser Teil kümmert sich um die Datei. Im [[Glossar#Quelltext|Quelltext]] heißt das `PropertiesFile`.
> - **PropertiesFile.update**: Dieser Teil ändert das. Im [[Glossar#Quelltext|Quelltext]] heißt das `update`.
> - **PropertiesFile.preview**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `preview`.

- Liest und schreibt eine Eigenschaftsdatei, [[Glossar#Zeile|Zeile]] für Zeile.
