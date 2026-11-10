[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Klassen]] › [[CrashIndex]]

# CrashIndex

```mermaid
flowchart TD
  n1["CrashIndex.CrashIndex"]:::internal-link
  n2["CrashIndex.list"]:::internal-link
  n3["CrashIndex.read"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
CrashIndex.CrashIndex
  Betrifft Crash-Reports `CrashIndex`.
CrashIndex.list
  Listet `list`. Ruft `open`, `resolve`.
CrashIndex.read
  Liest `read`. Ruft `open`, `resolve`, `query`.
```


