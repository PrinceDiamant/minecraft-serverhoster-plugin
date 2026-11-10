[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]] › [[ChildStopSequence.stop]] › [[ChildStopSequence.stop.Z21]]

# ChildStopSequence.stop.Z21

```mermaid
flowchart TD
  n1["try Z.21"]
  n2["ChildStopSequence.stop.Z21.Teil1"]:::internal-link
  n3["ChildStopSequence.stop.Z21.Teil2"]:::internal-link
  n4["catch Z.67 (InterruptedException e)"]
  n5["return Z.71 return Outcome.INTERRUPTED;"]
  n2 -->|"weiter"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildStopSequence.stop`, Quellreihenfolge.
