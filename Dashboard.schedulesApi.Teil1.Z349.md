[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.schedulesApi]] › [[Dashboard.schedulesApi.Teil1.Z349]]

# Dashboard.schedulesApi.Teil1.Z349

```mermaid
flowchart TD
  n1["if Z.349 (path.equals('/api/schedules'))"]
  n2["if Z.350 (method.equals('GET'))"]
  n3["Dashboard.json"]:::internal-link
  n4["FabricLauncherPlugin.schedules"]:::internal-link
  n5["Dashboard.scheduleJson"]:::internal-link
  n6["return Z.352 return;"]
  n7["Dashboard.schedulesApi.Teil1.Z349.Z354"]:::internal-link
  n8["Dashboard.json"]:::internal-link
  n9["return Z.369 return;"]
  n3 -->|"Z.351"| n4
  n4 -->|"Z.351"| n5
  n5 --> n6
  n2 -->|"ja"| n3
  n6 --> n7
  n2 --> n7
  n7 --> n8
  n8 --> n9
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.schedulesApi.Teil1`, Quellreihenfolge.
