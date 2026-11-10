[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]] › [[ChildStopSequence.stop]] › [[ChildStopSequence.stop.Z21.Teil1]]

# ChildStopSequence.stop.Z21.Teil1

```mermaid
flowchart TD
  n1["Schritt Z.22 long startupDeadline = System.nanoTime() + TimeUn…"]
  n2["while Z.23 (process.isAlive() && !ready.getAsBoole…"]
  n3["Schritt Z.24 process.waitFor(Math.max(1, pollMillis), TimeUnit…"]
  n4["if Z.25 (!ready.getAsBoolean() && process.isAlive())"]
  n5["Schritt Z.28 long deadline = System.nanoTime() + TimeUnit.SECO…"]
  n6["ChildStopSequence.stop.Z21.Teil1.Z31"]:::internal-link
  n7["ChildStopSequence.stop.Z21.Teil1.Z47"]:::internal-link
  n2 -->|"wiederholen"| n3
  n1 --> n2
  n3 --> n4
  n4 --> n5
  n4 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildStopSequence.stop.Z21`, Quellreihenfolge.
