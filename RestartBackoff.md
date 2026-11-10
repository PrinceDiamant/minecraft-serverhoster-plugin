[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[RestartBackoff]]

# RestartBackoff

```mermaid
flowchart TD
  n1["RestartBackoff.RestartBackoff"]:::internal-link
  n2["RestartBackoff.delaySeconds"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RestartBackoff.RestartBackoff
  Dieser Teil kümmert sich um die [[Glossar#Pause|Pause]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `RestartBackoff`.
RestartBackoff.delaySeconds
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `delaySeconds`.
```

> [!knoten]- Was die Blöcke tun
> - **RestartBackoff.RestartBackoff**: Dieser Teil kümmert sich um die [[Glossar#Pause|Pause]]. Im [[Glossar#Quelltext|Quelltext]] heißt das `RestartBackoff`.
> - **RestartBackoff.delaySeconds**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `delaySeconds`.

- Rechnet die [[Glossar#Pause|Pause]] vor dem nächsten [[Glossar#Neustart|Neustart]] aus.
