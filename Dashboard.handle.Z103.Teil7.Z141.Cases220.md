[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Cases220]]

# Dashboard.handle.Z103.Teil7.Z141.Cases220

```mermaid
flowchart TD
  n1["case Z.220 'POST /api/fs/mkdir'"]
  n2["Dashboard.fsMkdir"]:::internal-link
  n3["case Z.221 'POST /api/fs/delete'"]
  n4["Dashboard.fsDelete"]:::internal-link
  n5["case Z.222 'GET /api/diag'"]
  n6["Dashboard.handle.Z103.Teil7.Z141.Case222"]:::internal-link
  n7["case Z.223 'POST /api/diag/threaddump'"]
  n8["Dashboard.handle.Z103.Teil7.Z141.Case223"]:::internal-link
  n9["case Z.224 'POST /api/diag/heap'"]
  n10["Dashboard.handle.Z103.Teil7.Z141.Case224"]:::internal-link
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n7 --> n8
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141`, Quellreihenfolge.
