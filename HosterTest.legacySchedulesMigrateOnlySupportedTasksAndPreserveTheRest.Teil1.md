[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil3]] › [[HosterTest.legacySchedulesMigrateOnlySupportedTasksAndPreserveTheRest]] › [[HosterTest.legacySchedulesMigrateOnlySupportedTasksAndPreserveTheRest.Teil1]]

# HosterTest.legacySchedulesMigrateOnlySupportedTasksAndPreserveTheRest.Teil1

```mermaid
flowchart TD
  n1["LegacyTaskMigration.migrate"]:::internal-link
  n2["ScheduleDef.load"]:::internal-link
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LegacyTaskMigration.migrate
  Übernimmt den alten Wert von `migrate`. Ruft `load`, `convert`, `toConfig`.
ScheduleDef.load
  Lädt `load`. Ruft `asMap`, `Action`, `string`.
```

- Fortsetzung von `HosterTest.legacySchedulesMigrateOnlySupportedTasksAndPreserveTheRest`, Quellreihenfolge.
