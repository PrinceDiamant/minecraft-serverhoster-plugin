[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]] › [[ChildStopSequence.stop]] › [[ChildStopSequence.stop.Z21.Teil2]]

# ChildStopSequence.stop.Z21.Teil2

```mermaid
flowchart TD
  n1["ChildStopSequence.signal"]:::internal-link
  n2["if Z.60 (!process.waitFor(Math.max(0, termGraceSeconds), …"]
  n3["ChildStopSequence.signal"]:::internal-link
  n4["Schritt Z.63 process.waitFor(Math.max(0, termGraceSeconds), Ti…"]
  n5["return Z.66 return Outcome.KILLED;"]
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n4 --> n5
  n2 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildStopSequence.stop.Z21`, Quellreihenfolge.
