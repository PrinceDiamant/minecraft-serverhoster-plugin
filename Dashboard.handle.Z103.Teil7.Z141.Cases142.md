[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Cases142]]

# Dashboard.handle.Z103.Teil7.Z141.Cases142

```mermaid
flowchart TD
  n1["case Z.142 'POST /api/logout'"]
  n2["Dashboard.handle.Z103.Teil7.Z141.Case142"]:::internal-link
  n3["case Z.143 'GET /api/status'"]
  n4["Dashboard.handle.Z103.Teil7.Z141.Case143"]:::internal-link
  n5["case Z.144 'GET /api/console'"]
  n6["Dashboard.handle.Z103.Teil7.Z141.Case144"]:::internal-link
  n7["case Z.145 'GET /api/console/stream'"]
  n8["Dashboard.sse"]:::internal-link
  n9["case Z.146 'POST /api/cmd'"]
  n10["Dashboard.handle.Z103.Teil7.Z141.Case146"]:::internal-link
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n7 --> n8
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
