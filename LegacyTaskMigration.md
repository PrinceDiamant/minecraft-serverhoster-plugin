[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[LegacyTaskMigration]]

# LegacyTaskMigration

```mermaid
flowchart TD
  n1["LegacyTaskMigration.LegacyTaskMigration"]:::internal-link
  n2["LegacyTaskMigration.migrate"]:::internal-link
  n3["LegacyTaskMigration.convert"]:::internal-link
  n4["LegacyTaskMigration.number"]:::internal-link
  n2 -->|"Z.26"| n3
  n3 -->|"Z.42"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LegacyTaskMigration.LegacyTaskMigration
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `LegacyTaskMigration`.
LegacyTaskMigration.migrate
  Dieser Teil übernimmt den alten Wert von das. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrate`.
LegacyTaskMigration.convert
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `convert`.
LegacyTaskMigration.number
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `number`.
```

> [!knoten]- Was die Blöcke tun
> - **LegacyTaskMigration.LegacyTaskMigration**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `LegacyTaskMigration`.
> - **LegacyTaskMigration.migrate**: Dieser Teil übernimmt den alten Wert von das. Im [[Glossar#Quelltext|Quelltext]] heißt das `migrate`.
> - **LegacyTaskMigration.convert**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `convert`.
> - **LegacyTaskMigration.number**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Im [[Glossar#Quelltext|Quelltext]] heißt das `number`.

- Übernimmt Einträge aus der älteren Aufgabenliste in die Zeitpläne.
