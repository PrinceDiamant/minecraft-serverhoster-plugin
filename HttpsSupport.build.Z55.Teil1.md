[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]] › [[HttpsSupport.build]] › [[HttpsSupport.build.Z55.Teil1]]

# HttpsSupport.build.Z55.Teil1

```mermaid
flowchart TD
  n1["HttpsSupport.fromKeystore"]:::internal-link
  n2["HttpsSupport.ensureSelfSigned"]:::internal-link
  n3["HttpsSupport.password"]:::internal-link
  n4["HttpsSupport.fromKeystore"]:::internal-link
  n5["HttpsSupport.resolve"]:::internal-link
  n6["HttpsSupport.password"]:::internal-link
  n1 -->|"Z.56"| n2
  n2 -->|"Z.56"| n3
  n4 -->|"Z.57"| n5
  n5 -->|"Z.57"| n6
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HttpsSupport.fromKeystore
  `fromKeystore` in `HttpsSupport.java`.
HttpsSupport.ensureSelfSigned
  Stellt sicher `ensureSelfSigned`. Ruft `resolve`, `password`, `normalizeSans`.
HttpsSupport.password
  `password` in `HttpsSupport.java`. Ruft `readOrCreatePass`.
HttpsSupport.resolve
  Löst auf `resolve`.
```

- Fortsetzung von `HttpsSupport.build.Z55`, Quellreihenfolge.
