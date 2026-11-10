[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[ScheduleDef]] › [[ScheduleDef.Teil1]] › [[ScheduleDef.load]] › [[ScheduleDef.load.Z118.Teil1]]

# ScheduleDef.load.Z118.Teil1

```mermaid
flowchart TD
  n1["ScheduleDef.asMap"]:::internal-link
  n2["if Z.120 (map == null)"]
  n3["throw Z.120 throw new IllegalArgumentException('Ungültiger Ze…"]
  n4["if Z.122 (!(rawActions instanceof List(?) actionList))"]
  n5["throw Z.122 throw new IllegalArgumentException('Aktionen fehl…"]
  n6["if Z.123 (actionList.size() ) MAX_ACTIONS)"]
  n7["throw Z.123 throw new IllegalArgumentException('Zu viele Akti…"]
  n8["ScheduleDef.load.Z118.Teil1.Z125"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n4
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  n7 --> n8
  n6 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ScheduleDef.load.Z118`, Quellreihenfolge.
