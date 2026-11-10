[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil1]] › [[HttpsSupport.password]]

# HttpsSupport.password

`HttpsSupport.password(Path dataDir, Spec spec)` [src/main/java/de/aichele/childlauncher/HttpsSupport.java:63–69](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HttpsSupport.java#L63-L69)

```mermaid
flowchart TD
  n1["if Z.66 (store.isBlank())"]
  n2["HttpsSupport.readOrCreatePass"]:::internal-link
  n3["if Z.67 (key.isBlank())"]
  n4["return Z.68 return new char()() ( store.toCharArray(), key.to…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `password` in `src/main/java/de/aichele/childlauncher/HttpsSupport.java`
