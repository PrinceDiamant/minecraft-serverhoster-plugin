[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]] › [[ChildStopSequence.stop]] › [[ChildStopSequence.stop.Z21.Teil1.Z31]]

# ChildStopSequence.stop.Z21.Teil1.Z31

```mermaid
flowchart TD
  n1["while Z.31 (process.isAlive() && (firstSend // Sys…"]
  n2["if Z.33 (firstSend // now )= nextSendAt)"]
  n3["try Z.35"]
  n4["catch Z.37 (IOException e)"]
  n5["Schritt Z.40 nextSendAt = now + TimeUnit.MILLISECONDS.toNanos(…"]
  n6["if Z.43 (remaining (= 0)"]
  n7["Schritt Z.44 process.waitFor(Math.max(1, Math.min(TimeUnit.NAN…"]
  n3 -->|"Fehler"| n4
  n3 --> n5
  n4 --> n5
  n2 -->|"ja"| n3
  n5 --> n6
  n2 --> n6
  n6 --> n7
  n6 --> n7
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildStopSequence.stop.Z21.Teil1`, Quellreihenfolge.
