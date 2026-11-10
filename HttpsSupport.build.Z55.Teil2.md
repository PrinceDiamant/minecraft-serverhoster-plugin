[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]] › [[HttpsSupport.build]] › [[HttpsSupport.build.Z55.Teil2]]

# HttpsSupport.build.Z55.Teil2

```mermaid
flowchart TD
  n1["HttpsSupport.fromPem"]:::internal-link
  n2["HttpsSupport.resolve"]:::internal-link
  n3["HttpsSupport.resolve"]:::internal-link
  n4["HttpsSupport.password"]:::internal-link
  n1 -->|"Z.58"| n2
  n2 -->|"Z.58"| n3
  n3 -->|"Z.58"| n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
HttpsSupport.fromPem
  `fromPem` in `HttpsSupport.java`. Ruft `loadKey`.
HttpsSupport.resolve
  Löst auf `resolve`.
HttpsSupport.password
  `password` in `HttpsSupport.java`. Ruft `readOrCreatePass`.
```

- Fortsetzung von `HttpsSupport.build.Z55`, Quellreihenfolge.
