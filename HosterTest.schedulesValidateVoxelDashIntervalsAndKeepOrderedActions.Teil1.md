[[00 Start]] › [[Tests]] › [[HosterTest]] › [[HosterTest.Teil2]] › [[HosterTest.schedulesValidateVoxelDashIntervalsAndKeepOrderedActions]] › [[HosterTest.schedulesValidateVoxelDashIntervalsAndKeepOrderedActions.Teil1]]

# HosterTest.schedulesValidateVoxelDashIntervalsAndKeepOrderedActions.Teil1

```mermaid
flowchart TD
  n1["ScheduleDef.ScheduleDef"]:::internal-link
  n2["ScheduleDef.cron"]:::internal-link
  n3["ScheduleDef.load"]:::internal-link
  n4["ScheduleDef.toConfig"]:::internal-link
  n5["ScheduleDef.load"]:::internal-link
  n6["ScheduleDef.toConfig"]:::internal-link
  n7["ScheduleDef.withLastRun"]:::internal-link
  n1 --> n2
  n3 -->|"Z.248"| n4
  n2 --> n3
  n5 -->|"Z.249"| n6
  n4 --> n5
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HosterTest.schedulesValidateVoxelDashIntervalsAndKeepOrderedActions`, Quellreihenfolge.
