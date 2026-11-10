[[00 Start]] › [[Dashboard-UI]] › [[UI-Workflows]] › [[VersionSelect]]

# VersionSelect

```mermaid
flowchart TD
  n1["VersionSelect.useVersionCatalog"]:::internal-link
  n2["VersionSelect.versionIsValid"]:::internal-link
  n3["VersionSelect.VersionSelect"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
VersionSelect.useVersionCatalog
  Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die [[Glossar#Version|Version]] die Versionsliste. Im [[Glossar#Quelltext|Quelltext]] heißt das `useVersionCatalog`.
VersionSelect.versionIsValid
  Die [[Glossar#Bedienseite|Bedienseite]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `versionIsValid`.
VersionSelect.VersionSelect
  Die [[Glossar#Bedienseite|Bedienseite]] wählt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `VersionSelect`.
```

> [!knoten]- Was die Blöcke tun
> - **VersionSelect.useVersionCatalog**: Die [[Glossar#Bedienseite|Bedienseite]] kümmert sich um die [[Glossar#Version|Version]] die Versionsliste. Im [[Glossar#Quelltext|Quelltext]] heißt das `useVersionCatalog`.
> - **VersionSelect.versionIsValid**: Die [[Glossar#Bedienseite|Bedienseite]] prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `versionIsValid`.
> - **VersionSelect.VersionSelect**: Die [[Glossar#Bedienseite|Bedienseite]] wählt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `VersionSelect`.

- Die Auswahl der [[Glossar#Version|Version]] in der [[Glossar#Bedienseite|Bedienseite]].
