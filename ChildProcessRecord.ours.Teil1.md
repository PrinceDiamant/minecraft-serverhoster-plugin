[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.ours]] › [[ChildProcessRecord.ours.Teil1]]

# ChildProcessRecord.ours.Teil1

```mermaid
flowchart TD
  n1["if Z.77 (recorded == null // live == null // !live.alive(…"]
  n2["return Z.77 return false;"]
  n3["if Z.78 (recorded.pid() (= 0 // recorded.pid() != live.pi…"]
  n4["return Z.78 return false;"]
  n5["if Z.79 (recorded.startedAt() == null // live.startedAt()…"]
  n6["return Z.80 return false;"]
  n7["if Z.82 (command.stream().anyMatch(token -) token.equals(…"]
  n8["return Z.83 return true;"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildProcessRecord.ours`, Quellreihenfolge.
