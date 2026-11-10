[[00 Start]] › [[Server-Anlage]] › [[Startplan]] › [[JarProbe]]

# JarProbe

```mermaid
flowchart TD
  n1["JarProbe.JarProbe"]:::internal-link
  n2["JarProbe.inspect"]:::internal-link
  n3["JarProbe.view"]:::internal-link
  n4["JarProbe.text"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
JarProbe.JarProbe
  Dieser Teil kümmert sich um die Messung. Im [[Glossar#Quelltext|Quelltext]] heißt das `JarProbe`.
JarProbe.inspect
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `inspect`.
JarProbe.view
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `view`.
JarProbe.text
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `text`.
```

> [!knoten]- Was die Blöcke tun
> - **JarProbe.JarProbe**: Dieser Teil kümmert sich um die Messung. Im [[Glossar#Quelltext|Quelltext]] heißt das `JarProbe`.
> - **JarProbe.inspect**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `inspect`.
> - **JarProbe.view**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `view`.
> - **JarProbe.text**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `text`.

- Sieht in die [[Glossar#Programmdatei|Programmdatei]] und liest ab, was für ein Server darin steckt.
