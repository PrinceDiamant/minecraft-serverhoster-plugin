[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[CronExpr]]

# CronExpr

```mermaid
flowchart TD
  n1["CronExpr.CronExpr"]:::internal-link
  n2["CronExpr.next"]:::internal-link
  n3["CronExpr.matches"]:::internal-link
  n4["CronExpr.dow"]:::internal-link
  n5["CronExpr.field"]:::internal-link
  n6["CronExpr.normZone"]:::internal-link
  n7["CronExpr.normAction"]:::internal-link
  n2 -->|"Z.18"| n3
  n2 -->|"Z.19"| n5
  n3 -->|"Z.33"| n5
  n3 -->|"Z.33"| n4
  n4 -->|"Z.43"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
CronExpr.CronExpr
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `CronExpr`.
CronExpr.next
  Dieser Teil geht weiter bei das. Im [[Glossar#Quelltext|Quelltext]] heißt das `next`.
CronExpr.matches
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `matches`.
CronExpr.dow
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `dow`.
CronExpr.field
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `field`.
CronExpr.normZone
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `normZone`.
CronExpr.normAction
  Dieser Teil kümmert sich um die Tätigkeit. Im [[Glossar#Quelltext|Quelltext]] heißt das `normAction`.
```

> [!knoten]- Was die Blöcke tun
> - **CronExpr.CronExpr**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `CronExpr`.
> - **CronExpr.next**: Dieser Teil geht weiter bei das. Im [[Glossar#Quelltext|Quelltext]] heißt das `next`.
> - **CronExpr.matches**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `matches`.
> - **CronExpr.dow**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `dow`.
> - **CronExpr.field**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `field`.
> - **CronExpr.normZone**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `normZone`.
> - **CronExpr.normAction**: Dieser Teil kümmert sich um die Tätigkeit. Im [[Glossar#Quelltext|Quelltext]] heißt das `normAction`.

- Liest die Uhrzeitregel und sagt, ob der Zeitpunkt jetzt gekommen ist.
