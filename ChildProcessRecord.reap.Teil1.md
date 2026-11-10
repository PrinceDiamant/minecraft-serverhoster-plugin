[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.reap]] › [[ChildProcessRecord.reap.Teil1]]

# ChildProcessRecord.reap.Teil1

```mermaid
flowchart TD
  n1["if Z.155 (file == null // !Files.exists(file))"]
  n2["return Z.155 return new ReapResult(Kind.NO_RECORD, 'no record'…"]
  n3["ChildProcessRecord.read"]:::internal-link
  n4["if Z.157 (loaded.identity() == null)"]
  n5["return Z.157 return new ReapResult(Kind.INVALID_RECORD, loaded…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildProcessRecord.reap`, Quellreihenfolge.
