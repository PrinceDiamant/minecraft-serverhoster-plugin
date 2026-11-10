[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[LegacyTaskMigration]] › [[LegacyTaskMigration.convert]] › [[LegacyTaskMigration.convert.Teil1]]

# LegacyTaskMigration.convert.Teil1

```mermaid
flowchart TD
  n1["if Z.38 (!task.server.isEmpty() && !task.server.equals(se…"]
  n2["return Z.38 return null;"]
  n3["if Z.39 (!task.action.equals('backup') && !task.action.eq…"]
  n4["return Z.39 return null;"]
  n5["if Z.41 (fields.length != 5 // !fields(2).equals('*') // …"]
  n6["return Z.41 return null;"]
  n7["LegacyTaskMigration.number"]:::internal-link
  n8["if Z.43 (minute ( 0)"]
  n9["return Z.43 return null;"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  n8 -->|"ja"| n9
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `LegacyTaskMigration.convert`, Quellreihenfolge.
