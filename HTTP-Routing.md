[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]]

# HTTP-Routing

```mermaid
flowchart TD
  n1["Dashboard.handle"]:::internal-link
  n2["Dashboard.isDashboardPage"]:::internal-link
  n3["Dashboard.serveIndex"]:::internal-link
  n4["Dashboard.serveWebAsset"]:::internal-link
  n5["Dashboard.serveThirdPartyNotices"]:::internal-link
  n1 -->|"Z.110"| n2
  n1 -->|"Z.110"| n3
  n1 -->|"Z.111"| n4
  n1 -->|"Z.112"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```


