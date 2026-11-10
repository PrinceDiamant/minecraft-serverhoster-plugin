[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil2]] › [[HosterTest.schedulesValidateVoxelDashIntervalsAndKeepOrderedActions]] › [[HosterTest.schedulesValidateVoxelDashIntervalsAndKeepOrderedActions.Teil2]]

# HosterTest.schedulesValidateVoxelDashIntervalsAndKeepOrderedActions.Teil2

```mermaid
flowchart TD
  n1["ScheduleDef.load"]:::internal-link
  n2["ScheduleDef.withLastRun"]:::internal-link
  n3["ScheduleDef.toConfig"]:::internal-link
  n4["ScheduleDef.ScheduleDef"]:::internal-link
  n5["ScheduleDef.ScheduleDef"]:::internal-link
  n1 -->|"Z.252"| n2
  n2 -->|"Z.252"| n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ScheduleDef.load
  Lädt `load`. Ruft `asMap`, `Action`, `string`.
ScheduleDef.withLastRun
  Liefert eine Kopie mit `withLastRun`. Ruft `ScheduleDef`.
ScheduleDef.toConfig
  `toConfig` in `ScheduleDef.java`. Ruft `toConfig`.
ScheduleDef.ScheduleDef
  Plant `ScheduleDef`. Ruft `validateInterval`.
```

- Fortsetzung von `HosterTest.schedulesValidateVoxelDashIntervalsAndKeepOrderedActions`, Quellreihenfolge.
