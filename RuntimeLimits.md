[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[RuntimeLimits]]

# RuntimeLimits

```mermaid
flowchart TD
  n1["RuntimeLimits.RuntimeLimits"]:::internal-link
  n2["RuntimeLimits.boundedSeconds"]:::internal-link
  n3["RuntimeLimits.memory"]:::internal-link
  n4["RuntimeLimits.percent"]:::internal-link
  n3 -->|"Z.32"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RuntimeLimits.RuntimeLimits
  Dieser Teil kümmert sich um die Grenzen. Im [[Glossar#Quelltext|Quelltext]] heißt das `RuntimeLimits`.
RuntimeLimits.boundedSeconds
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `boundedSeconds`.
RuntimeLimits.memory
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `memory`.
RuntimeLimits.percent
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `percent`.
```

> [!knoten]- Was die Blöcke tun
> - **RuntimeLimits.RuntimeLimits**: Dieser Teil kümmert sich um die Grenzen. Im [[Glossar#Quelltext|Quelltext]] heißt das `RuntimeLimits`.
> - **RuntimeLimits.boundedSeconds**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `boundedSeconds`.
> - **RuntimeLimits.memory**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `memory`.
> - **RuntimeLimits.percent**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `percent`.

- Hält Zahlen in einem erlaubten Bereich, damit eine Einstellung nicht unsinnig groß oder klein wird. Die Frist beim Ausschalten des [[Glossar#Host|Host]] ist so begrenzt, Ersatzwert 25 Sekunden.
