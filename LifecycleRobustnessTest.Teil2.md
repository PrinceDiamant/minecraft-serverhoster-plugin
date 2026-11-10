[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil2]]

# LifecycleRobustnessTest.Teil2

```mermaid
flowchart TD
  n1["LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart"]:::internal-link
  n2["LifecycleRobustnessTest.dashboardDistinguishesLifecycleAndRestartCancellation"]:::internal-link
  n3["LifecycleRobustnessTest.invalidMemoryThresholdDisablesAutoStopWithoutRewritingHeap"]:::internal-link
  n4["LifecycleRobustnessTest.retryExhaustionKeepsTheStartFailureInsteadOfPreparing"]:::internal-link
  n5["LifecycleRobustnessTest.telemetryKeepsHeapRssHostAndCgroupDistinctAndRotates"]:::internal-link
  n6["LifecycleRobustnessTest.state"]:::internal-link
  n7["LifecycleRobustnessTest.identity"]:::internal-link
  n8["LifecycleRobustnessTest.testProcess"]:::internal-link
  n1 -->|"Z.178"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart
  `supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart` in `LifecycleRobustnessTest.java`. Ruft `assess`, `state`. Nur Test.
LifecycleRobustnessTest.dashboardDistinguishesLifecycleAndRestartCancellation
  `dashboardDistinguishesLifecycleAndRestartCancellation` in `LifecycleRobustnessTest.java`. Ruft `dashboardState`. Nur Test.
LifecycleRobustnessTest.invalidMemoryThresholdDisablesAutoStopWithoutRewritingHeap
  `invalidMemoryThresholdDisablesAutoStopWithoutRewritingHeap` in `LifecycleRobustnessTest.java`. Ruft `memory`, `boundedSeconds`. Nur Test.
LifecycleRobustnessTest.retryExhaustionKeepsTheStartFailureInsteadOfPreparing
  `retryExhaustionKeepsTheStartFailureInsteadOfPreparing` in `LifecycleRobustnessTest.java`. Ruft `text`. Nur Test.
LifecycleRobustnessTest.telemetryKeepsHeapRssHostAndCgroupDistinctAndRotates
  `telemetryKeepsHeapRssHostAndCgroupDistinctAndRotates` in `LifecycleRobustnessTest.java`. Ruft `line`, `snapshot`, `appendRotated`. Nur Test.
LifecycleRobustnessTest.state
  Liefert den Zustand `state`. Nur Test.
LifecycleRobustnessTest.identity
  `identity` in `LifecycleRobustnessTest.java`. Nur Test.
LifecycleRobustnessTest.testProcess
  Prüft `testProcess`. Nur Test.
```


