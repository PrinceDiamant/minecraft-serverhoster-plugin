[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[Upstream]] › [[Upstream.checkHash]]

# Upstream.checkHash

`Upstream.checkHash(Path file, String algo, String expectedHex)` [src/main/java/de/aichele/childlauncher/Upstream.java:55–59](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Upstream.java#L55-L59)

```mermaid
flowchart TD
  n1["if Z.56 (algo == null // expectedHex == null // expectedH…"]
  n2["return Z.56 return;"]
  n3["Upstream.digest"]:::internal-link
  n4["if Z.58 (!expectedHex.equalsIgnoreCase(got))"]
  n5["throw Z.58 throw new IOException('checksum mismatch (' + alg…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.56 (algo == null // expectedHex == null // expectedH…
  Zeile 56: prüft `(algo == null // expectedHex == null // expectedH…`.
return Z.56 return;
  Zeile 56: Rückgabe `return;`.
Upstream.digest
  `digest` in `Upstream.java`.
if Z.58 (!expectedHex.equalsIgnoreCase(got))
  Zeile 58: prüft `(!expectedHex.equalsIgnoreCase(got))`.
throw Z.58 throw new IOException('checksum mismatch (' + alg…
  Zeile 58: Abbruch `throw new IOException('checksum mismatch (' + alg…`.
```

- `checkHash` in `src/main/java/de/aichele/childlauncher/Upstream.java`
