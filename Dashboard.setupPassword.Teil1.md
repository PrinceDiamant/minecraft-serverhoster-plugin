[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Auth]] › [[Dashboard.setupPassword]] › [[Dashboard.setupPassword.Teil1]]

# Dashboard.setupPassword.Teil1

```mermaid
flowchart TD
  n1["if Z.295 (csrfRejected('POST', ex.getRequestHeaders().getF…"]
  n2["Dashboard.csrfRejected"]:::internal-link
  n3["Dashboard.json"]:::internal-link
  n4["return Z.296 return;"]
  n5["Dashboard.ip"]:::internal-link
  n1 -->|"Z.295"| n2
  n3 --> n4
  n2 -->|"ja"| n3
  n4 --> n5
  n2 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.setupPassword`, Quellreihenfolge.
