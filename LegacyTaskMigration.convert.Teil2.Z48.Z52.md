[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[LegacyTaskMigration]] › [[LegacyTaskMigration.convert]] › [[LegacyTaskMigration.convert.Teil2.Z48.Z52]]

# LegacyTaskMigration.convert.Teil2.Z48.Z52

```mermaid
flowchart TD
  n1["if Z.52 (fields(1).matches('//d(1,2)') && fields(4).equal…"]
  n2["LegacyTaskMigration.number"]:::internal-link
  n3["if Z.54 (hour ( 0)"]
  n4["return Z.54 return null;"]
  n5["LegacyTaskMigration.convert.Teil2.Z48.Z52.Z58"]:::internal-link
  n3 -->|"ja"| n4
  n2 --> n3
  n1 -->|"ja"| n2
  n1 -->|"nein"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.52 (fields(1).matches('//d(1,2)') && fields(4).equal…
  Zeile 52: prüft `(fields(1).matches('//d(1,2)') && fields(4).equal…`.
LegacyTaskMigration.number
  Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `number` in `LegacyTaskMigration.java`.
if Z.54 (hour ( 0)
  Zeile 54: prüft `(hour ( 0)`.
return Z.54 return null;
  Zeile 54: Rückgabe `return null;`.
LegacyTaskMigration.convert.Teil2.Z48.Z52.Z58
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 58 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 58.
```

> [!knoten]- Was die Blöcke tun
> - **if Z.52 (fields(1).matches('//d(1,2)') && fields(4).equal…**: Zeile 52: prüft `(fields(1).matches('//d(1,2)') && fields(4).equal…`.
> - **LegacyTaskMigration.number**: Dieser Teil macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `number` in `LegacyTaskMigration.java`.
> - **if Z.54 (hour ( 0)**: Zeile 54: prüft `(hour ( 0)`.
> - **return Z.54 return null;**: Zeile 54: Rückgabe `return null;`.
> - **LegacyTaskMigration.convert.Teil2.Z48.Z52.Z58**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 58 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 58.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 52 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `LegacyTaskMigration.convert.Teil2.Z48`.
