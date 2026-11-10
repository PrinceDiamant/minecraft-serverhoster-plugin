[[00 Start]] › [[Tests]] › [[CoreAdminTest]] › [[CoreAdminTest.Teil3]] › [[CoreAdminTest.checksumMismatch]]

# CoreAdminTest.checksumMismatch

`CoreAdminTest.checksumMismatch()` [src/test/java/de/aichele/childlauncher/CoreAdminTest.java:269–276](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/test/java/de/aichele/childlauncher/CoreAdminTest.java#L269-L276)

```mermaid
flowchart TD
  n1["Schritt Z.271 Files.writeString(f, 'abc');"]
  n2["Upstream.digest"]:::internal-link
  n3["Upstream.checkHash"]:::internal-link
  n4["Upstream.checkHash"]:::internal-link
  n5["Upstream.checkHash"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `checksumMismatch` in `src/test/java/de/aichele/childlauncher/CoreAdminTest.java`
- Auslöser: Test
