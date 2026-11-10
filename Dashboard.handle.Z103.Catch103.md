[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Catch103]]

# Dashboard.handle.Z103.Catch103

```mermaid
flowchart TD
  n1["catch Z.269 (SecurityException e)"]
  n2["Dashboard.json"]:::internal-link
  n3["catch Z.271 (IllegalStateException e)"]
  n4["Dashboard.json"]:::internal-link
  n5["catch Z.273 (IllegalArgumentException e)"]
  n6["Dashboard.json"]:::internal-link
  n7["catch Z.275 (Exception e)"]
  n8["try Z.277"]
  n9["Dashboard.json"]:::internal-link
  n10["catch Z.277 (Exception ignored)"]
  n1 --> n2
  n3 --> n4
  n5 --> n6
  n8 --> n9
  n8 -->|"Fehler"| n10
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.handle.Z103`, Quellreihenfolge.
