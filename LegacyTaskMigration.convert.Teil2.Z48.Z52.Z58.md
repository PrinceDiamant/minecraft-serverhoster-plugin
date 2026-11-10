[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[LegacyTaskMigration]] › [[LegacyTaskMigration.convert]] › [[LegacyTaskMigration.convert.Teil2.Z48.Z52.Z58]]

# LegacyTaskMigration.convert.Teil2.Z48.Z52.Z58

```mermaid
flowchart TD
  n1["if Z.58 (fields(1).matches('//d(1,2)') && fields(4).match…"]
  n2["LegacyTaskMigration.number"]:::internal-link
  n3["LegacyTaskMigration.number"]:::internal-link
  n4["if Z.61 (hour ( 0 // day ( 0)"]
  n5["return Z.61 return null;"]
  n6["return Z.66 return null;"]
  n2 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  n1 -->|"ja"| n2
  n1 -->|"nein"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.58 (fields(1).matches('//d(1,2)') && fields(4).match…
  Zeile 58: prüft `(fields(1).matches('//d(1,2)') && fields(4).match…`.
LegacyTaskMigration.number
  `number` in `LegacyTaskMigration.java`.
if Z.61 (hour ( 0 // day ( 0)
  Zeile 61: prüft `(hour ( 0 // day ( 0)`.
return Z.61 return null;
  Zeile 61: Rückgabe `return null;`.
return Z.66 return null;
  Zeile 66: Rückgabe `return null;`.
```

- Fortsetzung von `LegacyTaskMigration.convert.Teil2.Z48.Z52`, Quellreihenfolge.
