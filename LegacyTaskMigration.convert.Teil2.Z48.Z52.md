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

- Fortsetzung von `LegacyTaskMigration.convert.Teil2.Z48`, Quellreihenfolge.
