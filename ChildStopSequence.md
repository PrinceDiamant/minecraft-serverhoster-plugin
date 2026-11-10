[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]]

# ChildStopSequence

```mermaid
flowchart TD
  n1["ChildStopSequence.ChildStopSequence"]:::internal-link
  n2["ChildStopSequence.stop"]:::internal-link
  n3["ChildStopSequence.signal"]:::internal-link
  n2 -->|"Z.58"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildStopSequence.ChildStopSequence
  Dieser Teil stoppt die Reihenfolge. Im [[Glossar#Quelltext|Quelltext]] heißt das `ChildStopSequence`.
ChildStopSequence.stop
  Dieser Teil stoppt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `stop`.
ChildStopSequence.signal
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `signal`.
```

> [!knoten]- Was die Blöcke tun
> - **ChildStopSequence.ChildStopSequence**: Dieser Teil stoppt die Reihenfolge. Im [[Glossar#Quelltext|Quelltext]] heißt das `ChildStopSequence`.
> - **ChildStopSequence.stop**: Dieser Teil stoppt das. Im [[Glossar#Quelltext|Quelltext]] heißt das `stop`.
> - **ChildStopSequence.signal**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `signal`.

```mermaid
stateDiagram-v2
  [*] --> CLEAN: sauber Z.51
  [*] --> UNCLEAN: Z.54
  [*] --> KILLED: Z.66
  [*] --> INTERRUPTED: Z.71
```

- Die Schritte des [[Glossar#Stopp|Stopps]]: nachfragen, die Bitte wiederholen, dann hart beenden.
