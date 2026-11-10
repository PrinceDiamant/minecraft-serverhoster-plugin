[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]] › [[LifecycleRobustnessTest.stopWaitsUntilReadyBeforeSendingStop]] › [[LifecycleRobustnessTest.stopWaitsUntilReadyBeforeSendingStop.Teil1]]

# LifecycleRobustnessTest.stopWaitsUntilReadyBeforeSendingStop.Teil1

```mermaid
flowchart TD
  n1["LifecycleRobustnessTest.testProcess"]:::internal-link
  n2["try Z.136"]
  n3["while Z.138 ((line = input.readLine()) != null)"]
  n4["if Z.138 (line.contains('Done ('))"]
  n5["catch Z.139 (Exception ignored)"]
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `LifecycleRobustnessTest.stopWaitsUntilReadyBeforeSendingStop`, Quellreihenfolge.
