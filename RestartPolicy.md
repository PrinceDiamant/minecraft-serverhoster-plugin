[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[RestartPolicy]]

# RestartPolicy

```mermaid
flowchart TD
  n1["RestartPolicy.RestartPolicy"]:::internal-link
  n2["RestartPolicy.maxAttempts"]:::internal-link
  n3["RestartPolicy.mayRetry"]:::internal-link
  n4["RestartPolicy.migrateLegacyUnlimited"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RestartPolicy.RestartPolicy
  Dieser Teil kümmert sich um die Regel. Im [[Glossar#Quelltext|Quelltext]] heißt das `RestartPolicy`.
RestartPolicy.maxAttempts
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `maxAttempts`.
RestartPolicy.mayRetry
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `mayRetry`.
RestartPolicy.migrateLegacyUnlimited
  Dieser Teil übernimmt den alten Wert von den alten Weg. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrateLegacyUnlimited`.
```

> [!knoten]- Was die Blöcke tun
> - **RestartPolicy.RestartPolicy**: Dieser Teil kümmert sich um die Regel. Im [[Glossar#Quelltext|Quelltext]] heißt das `RestartPolicy`.
> - **RestartPolicy.maxAttempts**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `maxAttempts`.
> - **RestartPolicy.mayRetry**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `mayRetry`.
> - **RestartPolicy.migrateLegacyUnlimited**: Dieser Teil übernimmt den alten Wert von den alten Weg. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrateLegacyUnlimited`.

- Die Regel, ob und wie oft der [[Glossar#Spielserver|Spielserver]] von allein neu starten darf.
