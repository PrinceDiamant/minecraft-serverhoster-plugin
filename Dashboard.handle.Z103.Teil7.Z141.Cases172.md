[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Cases172]]

# Dashboard.handle.Z103.Teil7.Z141.Cases172

```mermaid
flowchart TD
  n1["case Z.172 'POST /api/config'"]
  n2["Dashboard.saveConfig"]:::internal-link
  n3["case Z.173 'GET /api/settings'"]
  n4["Dashboard.handle.Z103.Teil7.Z141.Case173"]:::internal-link
  n5["case Z.174 'POST /api/settings'"]
  n6["Dashboard.handle.Z103.Teil7.Z141.Case174"]:::internal-link
  n7["case Z.175 'GET /api/backup/credentials'"]
  n8["Dashboard.handle.Z103.Teil7.Z141.Case175"]:::internal-link
  n9["case Z.180 'POST /api/backup/credentials'"]
  n10["Dashboard.handle.Z103.Teil7.Z141.Case180"]:::internal-link
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n7 --> n8
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
