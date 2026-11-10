[[00 Start]] › [[Dashboard-HTTP]] › [[API-Zeit]] › [[Dashboard.schedulesApi]] › [[Dashboard.schedulesApi.Teil2]]

# Dashboard.schedulesApi.Teil2

```mermaid
flowchart TD
  n1["Dashboard.schedulesApi.Teil2.Z384"]:::internal-link
  n2["if Z.402 (parts.length != 1)"]
  n3["Dashboard.json"]:::internal-link
  n4["return Z.404 return;"]
  n5["Dashboard.schedulesApi.Teil2.Z406"]:::internal-link
  n6["Dashboard.schedulesApi.Teil2.Z419"]:::internal-link
  n7["Dashboard.json"]:::internal-link
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n4 --> n5
  n2 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.schedulesApi`, Quellreihenfolge.
