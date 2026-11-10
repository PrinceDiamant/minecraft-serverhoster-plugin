[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil2]]

# Dashboard.handle.Z103.Teil2

```mermaid
flowchart TD
  n1["if Z.111 (path.startsWith('/assets/') && method.equals('GE…"]
  n2["Dashboard.serveWebAsset"]:::internal-link
  n3["return Z.111 return;"]
  n4["if Z.112 (path.equals('/third-party-notices') && method.eq…"]
  n5["Dashboard.serveThirdPartyNotices"]:::internal-link
  n6["return Z.112 return;"]
  n2 --> n3
  n1 -->|"ja"| n2
  n5 --> n6
  n4 -->|"ja"| n5
  n3 --> n4
  n1 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.handle.Z103`, Quellreihenfolge.
