[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]] › [[ChildStopSequence.stop]] › [[ChildStopSequence.stop.Z21.Teil1.Z47]]

# ChildStopSequence.stop.Z21.Teil1.Z47

```mermaid
flowchart TD
  n1["if Z.47 (!process.isAlive())"]
  n2["if Z.49 (exitCode == 0)"]
  n3["return Z.51 return Outcome.CLEAN;"]
  n4["return Z.54 return Outcome.UNCLEAN;"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildStopSequence.stop.Z21.Teil1`, Quellreihenfolge.
