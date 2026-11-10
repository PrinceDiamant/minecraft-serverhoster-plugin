[[00 Start]] › [[Dashboard-UI]] › [[UI-Client]] › [[hostApi.dashboardRequest]] › [[hostApi.dashboardRequest.Teil2]]

# hostApi.dashboardRequest.Teil2

```mermaid
flowchart TD
  n1["if Z.53 !response.ok"]
  n2["throw Z.58 throw new Error(message);"]
  n3["if Z.60 !isJson"]
  n4["throw Z.61 throw new Error('Der Server hat keine JSON-Antwor…"]
  n5["return Z.64 return result as T;"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `hostApi.dashboardRequest`, Quellreihenfolge.
