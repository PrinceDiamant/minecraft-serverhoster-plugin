[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.serveWebAsset]] › [[Dashboard.serveWebAsset.Z955]]

# Dashboard.serveWebAsset.Z955

```mermaid
flowchart TD
  n1["try Z.955"]
  n2["if Z.956 (in == null)"]
  n3["Dashboard.send"]:::internal-link
  n4["return Z.958 return;"]
  n5["Dashboard.sendBytes"]:::internal-link
  n3 --> n4
  n2 -->|"ja"| n3
  n4 --> n5
  n2 --> n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.serveWebAsset`, Quellreihenfolge.
