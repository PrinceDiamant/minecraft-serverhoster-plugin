[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[LegacyTaskMigration]] › [[LegacyTaskMigration.migrate]] › [[LegacyTaskMigration.migrate.Z19.Teil1]]

# LegacyTaskMigration.migrate.Z19.Teil1

```mermaid
flowchart TD
  n1["TaskDef.load"]:::internal-link
  n2["if Z.21 (parsed.isEmpty())"]
  n3["LegacyTaskMigration.convert"]:::internal-link
  n1 --> n2
  n2 --> n3
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
TaskDef.load
  Lädt `load`. Ruft `str`, `TaskDef`.
if Z.21 (parsed.isEmpty())
  Zeile 21: prüft `(parsed.isEmpty())`.
LegacyTaskMigration.convert
  Wandelt um `convert`. Ruft `number`, `ScheduleDef`.
```

- Fortsetzung von `LegacyTaskMigration.migrate.Z19`, Quellreihenfolge.
