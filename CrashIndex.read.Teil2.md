[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[CrashIndex]] › [[CrashIndex.read]] › [[CrashIndex.read.Teil2]]

# CrashIndex.read.Teil2

```mermaid
flowchart TD
  n1["if Z.45 (!Files.isRegularFile(p, LinkOption.NOFOLLOW_LINK…"]
  n2["throw Z.45 throw new IOException(file);"]
  n3["LogQuery.query"]:::internal-link
  n4["return Z.47 return String.join('/n', result.lines());"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.45 (!Files.isRegularFile(p, LinkOption.NOFOLLOW_LINK…
  Zeile 45: prüft `(!Files.isRegularFile(p, LinkOption.NOFOLLOW_LINK…`.
throw Z.45 throw new IOException(file);
  Zeile 45: Abbruch `throw new IOException(file);`.
LogQuery.query
  Fragt ab `query`. Ruft `levelOk`.
return Z.47 return String.join('/n', result.lines());
  Zeile 47: Rückgabe `return String.join('/n', result.lines());`.
```

- Fortsetzung von `CrashIndex.read`, Quellreihenfolge.
