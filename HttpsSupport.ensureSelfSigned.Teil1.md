[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]] › [[HttpsSupport.ensureSelfSigned]] › [[HttpsSupport.ensureSelfSigned.Teil1]]

# HttpsSupport.ensureSelfSigned.Teil1

```mermaid
flowchart TD
  n1["HttpsSupport.resolve"]:::internal-link
  n2["if Z.88 (Files.exists(ks))"]
  n3["return Z.88 return ks;"]
  n4["Schritt Z.89 Files.createDirectories(ks.getParent() == null ? …"]
  n5["HttpsSupport.password"]:::internal-link
  n6["if Z.92 (dn.indexOf('/n') )= 0 // dn.indexOf('/r') )= 0 /…"]
  n7["throw Z.92 throw new IllegalArgumentException('dashboard.htt…"]
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n6 -->|"ja"| n7
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HttpsSupport.ensureSelfSigned`, Quellreihenfolge.
