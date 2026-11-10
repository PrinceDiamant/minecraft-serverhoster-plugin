[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case228.Teil1]]

# Dashboard.handle.Z103.Teil7.Z141.Case228.Teil1

```mermaid
flowchart TD
  n1["for Z.231 (TaskDef t : pl.tasks())"]
  n2["FabricLauncherPlugin.tasks"]:::internal-link
  n3["if Z.231 (t.id.equals(id))"]
  n4["if Z.232 (found == null)"]
  n5["Dashboard.json"]:::internal-link
  n6["return Z.232 return;"]
  n7["FabricLauncherPlugin.runTask"]:::internal-link
  n1 -->|"Z.231"| n2
  n2 -->|"wiederholen"| n3
  n5 --> n6
  n4 -->|"ja"| n5
  n3 --> n4
  n3 --> n4
  n6 --> n7
  n4 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141.Case228`, Quellreihenfolge.
