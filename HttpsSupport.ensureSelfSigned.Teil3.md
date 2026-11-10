[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]] › [[HttpsSupport.ensureSelfSigned]] › [[HttpsSupport.ensureSelfSigned.Teil3]]

# HttpsSupport.ensureSelfSigned.Teil3

```mermaid
flowchart TD
  n1["if Z.106 (p.exitValue() != 0 // !Files.exists(ks))"]
  n2["Schritt Z.107 Files.deleteIfExists(ks);"]
  n3["throw Z.108 throw new IOException('keytool exit ' + p.exitVal…"]
  n4["try Z.110"]
  n5["Schritt Z.110 Files.setPosixFilePermissions(ks, java.nio.file.a…"]
  n6["catch Z.110 (Exception ignored)"]
  n7["return Z.111 return ks;"]
  n2 --> n3
  n1 -->|"ja"| n2
  n4 --> n5
  n4 -->|"Fehler"| n6
  n3 --> n4
  n1 --> n4
  n5 --> n7
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `HttpsSupport.ensureSelfSigned`, Quellreihenfolge.
