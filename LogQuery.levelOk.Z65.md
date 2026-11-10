[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[LogQuery]] › [[LogQuery.levelOk]] › [[LogQuery.levelOk.Z65]]

# LogQuery.levelOk.Z65

```mermaid
flowchart TD
  n1["return Z.65 return switch (level) ( case 'error' -) isError(l…"]
  n2["LogQuery.isError"]:::internal-link
  n3["LogQuery.isWarn"]:::internal-link
  n4["LogQuery.isError"]:::internal-link
  n5["LogQuery.isWarn"]:::internal-link
  n6["LogQuery.isError"]:::internal-link
  n3 -->|"Z.67"| n4
  n2 --> n3
  n5 -->|"Z.68"| n6
  n4 --> n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
return Z.65 return switch (level) ( case 'error' -) isError(l…
  Zeile 65: Rückgabe `return switch (level) ( case 'error' -) isError(l…`.
LogQuery.isError
  Dieser Teil prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `isError`.
LogQuery.isWarn
  Dieser Teil prüft die Warnung. Prüft `isWarn`.
```

> [!knoten]- Was die Blöcke tun
> - **return Z.65 return switch (level) ( case 'error' -) isError(l…**: Zeile 65: Rückgabe `return switch (level) ( case 'error' -) isError(l…`.
> - **LogQuery.isError**: Dieser Teil prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `isError`.
> - **LogQuery.isWarn**: Dieser Teil prüft die Warnung. Prüft `isWarn`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 65 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `LogQuery.levelOk`.
