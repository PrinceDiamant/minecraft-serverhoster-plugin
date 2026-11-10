[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[LogQuery]]

# LogQuery

```mermaid
flowchart TD
  n1["LogQuery.LogQuery"]:::internal-link
  n2["LogQuery.query"]:::internal-link
  n3["LogQuery.levelOk"]:::internal-link
  n4["LogQuery.isError"]:::internal-link
  n5["LogQuery.isWarn"]:::internal-link
  n2 -->|"Z.57"| n3
  n3 -->|"Z.66"| n4
  n3 -->|"Z.67"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LogQuery.LogQuery
  Dieser Teil fragt ab das. Im [[Glossar#Quelltext|Quelltext]] heißt das `LogQuery`.
LogQuery.query
  Dieser Teil fragt ab das. Im [[Glossar#Quelltext|Quelltext]] heißt das `query`.
LogQuery.levelOk
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `levelOk`.
LogQuery.isError
  Dieser Teil prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `isError`.
LogQuery.isWarn
  Dieser Teil prüft die Warnung. Im [[Glossar#Quelltext|Quelltext]] heißt das `isWarn`.
```

> [!knoten]- Was die Blöcke tun
> - **LogQuery.LogQuery**: Dieser Teil fragt ab das. Im [[Glossar#Quelltext|Quelltext]] heißt das `LogQuery`.
> - **LogQuery.query**: Dieser Teil fragt ab das. Im [[Glossar#Quelltext|Quelltext]] heißt das `query`.
> - **LogQuery.levelOk**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `levelOk`.
> - **LogQuery.isError**: Dieser Teil prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `isError`.
> - **LogQuery.isWarn**: Dieser Teil prüft die Warnung. Im [[Glossar#Quelltext|Quelltext]] heißt das `isWarn`.

- Sucht [[Glossar#Zeile|Zeilen]] im Protokoll, die zu einer Frage passen.
