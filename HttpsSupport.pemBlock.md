[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil2]] › [[HttpsSupport.pemBlock]]

# HttpsSupport.pemBlock

`HttpsSupport.pemBlock(String pem, String marker)` [src/main/java/de/aichele/childlauncher/HttpsSupport.java:165–173](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HttpsSupport.java#L165-L173)

```mermaid
flowchart TD
  n1["if Z.167 (s ( 0)"]
  n2["return Z.167 return null;"]
  n3["if Z.170 (line ( 0 // e ( 0)"]
  n4["return Z.170 return null;"]
  n5["return Z.172 return body.isEmpty() ? null : body;"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `pemBlock` in `src/main/java/de/aichele/childlauncher/HttpsSupport.java`
