[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[HttpsSupport]] › [[HttpsSupport.Teil2]] › [[HttpsSupport.wrapPkcs1]]

# HttpsSupport.wrapPkcs1

`HttpsSupport.wrapPkcs1(byte[] pkcs1)` [src/main/java/de/aichele/childlauncher/HttpsSupport.java:176–182](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/HttpsSupport.java#L176-L182)

```mermaid
flowchart TD
  n1["HttpsSupport.concat"]:::internal-link
  n2["HttpsSupport.derLen"]:::internal-link
  n3["HttpsSupport.concat"]:::internal-link
  n4["HttpsSupport.concat"]:::internal-link
  n5["HttpsSupport.derLen"]:::internal-link
  n6["return Z.181 return concat(new byte() ( 0x30 ), derL…"]
  n1 -->|"Z.179"| n2
  n2 --> n3
  n4 -->|"Z.181"| n5
  n5 --> n6
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `wrapPkcs1` in `src/main/java/de/aichele/childlauncher/HttpsSupport.java`
