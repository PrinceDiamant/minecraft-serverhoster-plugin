[[00 Start]] › [[Server-Anlage]] › [[Profile]] › [[ProfileMerge]]

# ProfileMerge

```mermaid
flowchart TD
  n1["ProfileMerge.ProfileMerge"]:::internal-link
  n2["ProfileMerge.inherit"]:::internal-link
  n3["ProfileMerge.mergeProps"]:::internal-link
  n4["ProfileMerge.nvl"]:::internal-link
  n5["ProfileMerge.safeId"]:::internal-link
  n2 -->|"Z.169"| n4
  n2 -->|"Z.176"| n5
  n2 -->|"Z.182"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ProfileMerge.ProfileMerge
  Dieser Teil mischt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `ProfileMerge`.
ProfileMerge.inherit
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `inherit`.
ProfileMerge.mergeProps
  Dieser Teil mischt die Eigenschaften. Im [[Glossar#Quelltext|Quelltext]] heißt das `mergeProps`.
ProfileMerge.nvl
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `nvl`.
ProfileMerge.safeId
  Dieser Teil kümmert sich um die Kennung. Im [[Glossar#Quelltext|Quelltext]] heißt das `safeId`.
```

> [!knoten]- Was die Blöcke tun
> - **ProfileMerge.ProfileMerge**: Dieser Teil mischt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `ProfileMerge`.
> - **ProfileMerge.inherit**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `inherit`.
> - **ProfileMerge.mergeProps**: Dieser Teil mischt die Eigenschaften. Im [[Glossar#Quelltext|Quelltext]] heißt das `mergeProps`.
> - **ProfileMerge.nvl**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `nvl`.
> - **ProfileMerge.safeId**: Dieser Teil kümmert sich um die Kennung. Im [[Glossar#Quelltext|Quelltext]] heißt das `safeId`.

- Mischt Werte aus den [[Glossar#Einstellungen|Einstellungen]] und aus einer Datei zu einer Beschreibung zusammen.
