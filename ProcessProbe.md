[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[ProcessProbe]]

# ProcessProbe

```mermaid
flowchart TD
  n1["ProcessProbe.ProcessProbe"]:::internal-link
  n2["ProcessProbe.snapshot"]:::internal-link
  n3["ProcessProbe.disk"]:::internal-link
  n4["ProcessProbe.jcmd(long,String)"]:::internal-link
  n5["ProcessProbe.jcmd(long,String,long)"]:::internal-link
  n6["ProcessProbe.kb"]:::internal-link
  n7["ProcessProbe.abbreviate"]:::internal-link
  n2 -->|"Z.31"| n6
  n4 -->|"Z.71"| n5
  n5 -->|"Z.98"| n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ProcessProbe.ProcessProbe
  Dieser Teil kümmert sich um die Messung. Im [[Glossar#Quelltext|Quelltext]] heißt das `ProcessProbe`.
ProcessProbe.snapshot
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `snapshot`.
ProcessProbe.disk
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `disk`.
ProcessProbe.jcmd(long,String)
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `jcmd(long,String)`.
ProcessProbe.jcmd(long,String,long)
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `jcmd(long,String,long)`.
ProcessProbe.kb
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `kb`.
ProcessProbe.abbreviate
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `abbreviate`.
```

> [!knoten]- Was die Blöcke tun
> - **ProcessProbe.ProcessProbe**: Dieser Teil kümmert sich um die Messung. Im [[Glossar#Quelltext|Quelltext]] heißt das `ProcessProbe`.
> - **ProcessProbe.snapshot**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `snapshot`.
> - **ProcessProbe.disk**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `disk`.
> - **ProcessProbe.jcmd(long,String)**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `jcmd(long,String)`.
> - **ProcessProbe.jcmd(long,String,long)**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `jcmd(long,String,long)`.
> - **ProcessProbe.kb**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `kb`.
> - **ProcessProbe.abbreviate**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `abbreviate`.

- Fragt das laufende Programm über ein Hilfswerkzeug des Java nach seinem Zustand. Die Frage wartet höchstens zwanzig Sekunden.
