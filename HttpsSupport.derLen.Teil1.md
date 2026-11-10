[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil2]] › [[HttpsSupport.derLen]] › [[HttpsSupport.derLen.Teil1]]

# HttpsSupport.derLen.Teil1

```mermaid
flowchart TD
  n1["if Z.185 (len ( 128)"]
  n2["return Z.185 return new byte() ( (byte) len );"]
  n3["while Z.189 (v ) 0)"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HttpsSupport.derLen`, Quellreihenfolge.
