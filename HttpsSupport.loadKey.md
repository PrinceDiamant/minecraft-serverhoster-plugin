[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil2]] › [[HttpsSupport.loadKey]]

# HttpsSupport.loadKey

`HttpsSupport.loadKey(String pem)` [src/main/java/de/aichele/childlauncher/HttpsSupport.java:156–163](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HttpsSupport.java#L156-L163)

```mermaid
flowchart TD
  n1["HttpsSupport.pemBlock"]:::internal-link
  n2["HttpsSupport.pemBlock"]:::internal-link
  n3["if Z.159 (rsa == null && pkcs8 == null)"]
  n4["throw Z.159 throw new IllegalArgumentException('Expected PKCS…"]
  n5["if Z.161 (rsa != null)"]
  n6["HttpsSupport.wrapPkcs1"]:::internal-link
  n7["return Z.162 return KeyFactory.getInstance('RSA').generatePriv…"]
  n1 --> n2
  n3 -->|"ja"| n4
  n2 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `loadKey` in `src/main/java/de/aichele/childlauncher/HttpsSupport.java`
