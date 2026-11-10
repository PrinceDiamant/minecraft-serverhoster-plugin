[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ConsoleBuffer]]

# ConsoleBuffer

```mermaid
flowchart TD
  n1["ConsoleBuffer.ConsoleBuffer"]:::internal-link
  n2["ConsoleBuffer.add"]:::internal-link
  n3["ConsoleBuffer.snapshot"]:::internal-link
  n4["ConsoleBuffer.subscribe"]:::internal-link
  n5["ConsoleBuffer.unsubscribe"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ConsoleBuffer.ConsoleBuffer
  Dieser Teil kümmert sich um den Zwischenspeicher. Im [[Glossar#Quelltext|Quelltext]] heißt das `ConsoleBuffer`.
ConsoleBuffer.add
  Dieser Teil fügt hinzu das. Im [[Glossar#Quelltext|Quelltext]] heißt das `add`.
ConsoleBuffer.snapshot
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `snapshot`.
ConsoleBuffer.subscribe
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `subscribe`.
ConsoleBuffer.unsubscribe
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `unsubscribe`.
```

> [!knoten]- Was die Blöcke tun
> - **ConsoleBuffer.ConsoleBuffer**: Dieser Teil kümmert sich um den Zwischenspeicher. Im [[Glossar#Quelltext|Quelltext]] heißt das `ConsoleBuffer`.
> - **ConsoleBuffer.add**: Dieser Teil fügt hinzu das. Im [[Glossar#Quelltext|Quelltext]] heißt das `add`.
> - **ConsoleBuffer.snapshot**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `snapshot`.
> - **ConsoleBuffer.subscribe**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `subscribe`.
> - **ConsoleBuffer.unsubscribe**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `unsubscribe`.

- Ein kurzer Speicher für die letzten [[Glossar#Zeile|Zeilen]] der [[Glossar#Konsole|Konsole]], damit die [[Glossar#Bedienseite|Bedienseite]] sie zeigen kann.
