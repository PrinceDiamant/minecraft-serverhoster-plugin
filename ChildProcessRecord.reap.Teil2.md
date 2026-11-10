[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.reap]] › [[ChildProcessRecord.reap.Teil2]]

# ChildProcessRecord.reap.Teil2

```mermaid
flowchart TD
  n1["if Z.160 (live == null // !live.alive())"]
  n2["try Z.161"]
  n3["if Z.162 (!Files.isSymbolicLink(file))"]
  n4["Schritt Z.162 Files.deleteIfExists(file);"]
  n5["catch Z.163 (IOException e)"]
  n6["return Z.164 return new ReapResult(Kind.INVALID_RECORD, 'stale…"]
  n7["return Z.166 return new ReapResult(Kind.CLEARED, 'pid ' + iden…"]
  n8["if Z.168 (!ours(identity, live, selfPid))"]
  n9["ChildProcessRecord.ours"]:::internal-link
  n10["return Z.169 return new ReapResult(Kind.REFUSED, 'pid ' + iden…"]
  n3 -->|"ja"| n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n5 --> n6
  n4 --> n7
  n3 --> n7
  n6 --> n7
  n1 -->|"ja"| n2
  n8 -->|"Z.168"| n9
  n9 -->|"ja"| n10
  n7 --> n8
  n1 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildProcessRecord.reap`, Quellreihenfolge.
