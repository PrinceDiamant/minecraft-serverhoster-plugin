[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case152.Teil1]]

# Dashboard.handle.Z103.Teil7.Z141.Case152.Teil1

```mermaid
flowchart TD
  n1["if Z.154 ((a.equals('start') // a.equals('restart')) && !p…"]
  n2["FabricLauncherPlugin.dashboardStartBlockReason"]:::internal-link
  n3["Dashboard.json"]:::internal-link
  n4["FabricLauncherPlugin.dashboardStartBlockReason"]:::internal-link
  n5["return Z.155 return;"]
  n6["Dashboard.handle.Z103.Teil7.Z141.Case152.Teil1.Z157"]:::internal-link
  n7["FabricLauncherPlugin.info(String,String)"]:::internal-link
  n8["Dashboard.ip"]:::internal-link
  n1 -->|"Z.154"| n2
  n3 -->|"Z.155"| n4
  n4 --> n5
  n2 -->|"ja"| n3
  n5 --> n6
  n2 --> n6
  n7 -->|"Z.163"| n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141.Case152`, Quellreihenfolge.
