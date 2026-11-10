[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil2]] › [[HttpsSupport.fromPem]] › [[HttpsSupport.fromPem.Teil1]]

# HttpsSupport.fromPem.Teil1

```mermaid
flowchart TD
  n1["if Z.140 (!Files.isRegularFile(certFile) // !Files.isRegul…"]
  n2["throw Z.140 throw new IOException('PEM cert or key missing');"]
  n3["try Z.143"]
  n4["if Z.144 (certs.isEmpty())"]
  n5["throw Z.144 throw new IOException('No certificate in ' + cert…"]
  n6["HttpsSupport.loadKey"]:::internal-link
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  n5 --> n6
  n4 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HttpsSupport.fromPem`, Quellreihenfolge.
