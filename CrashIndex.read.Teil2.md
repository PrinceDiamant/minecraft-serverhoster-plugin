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

- Fortsetzung von `CrashIndex.read`, Quellreihenfolge.
