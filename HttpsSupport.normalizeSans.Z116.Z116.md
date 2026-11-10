[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]] › [[HttpsSupport.normalizeSans]] › [[HttpsSupport.normalizeSans.Z116.Z116]]

# HttpsSupport.normalizeSans.Z116.Z116

```mermaid
flowchart TD
  n1["for Z.116 (String s : sans)"]
  n2["if Z.117 (s == null // s.isBlank())"]
  n3["if Z.119 (v.startsWith('dns:') // v.startsWith('ip:') // v…"]
  n4["if Z.120 (v.chars().allMatch(c -) Character.isDigit(c) // …"]
  n3 -->|"nein"| n4
  n2 --> n3
  n2 --> n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HttpsSupport.normalizeSans.Z116`, Quellreihenfolge.
