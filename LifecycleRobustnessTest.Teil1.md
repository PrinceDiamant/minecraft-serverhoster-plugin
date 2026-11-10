[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]]

# LifecycleRobustnessTest.Teil1

```mermaid
flowchart TD
  n1["LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid"]:::internal-link
  n2["LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord"]:::internal-link
  n3["LifecycleRobustnessTest.reapKillsOnlyAfterGracefulStopFails"]:::internal-link
  n4["LifecycleRobustnessTest.liveUnrelatedProcessIsNotKilledWhenTheRecordNamesIt"]:::internal-link
  n5["LifecycleRobustnessTest.symlinkRecordIsRejected"]:::internal-link
  n6["LifecycleRobustnessTest.failedStartDrainsProcessThatIgnoresTerm"]:::internal-link
  n7["LifecycleRobustnessTest.stopWaitsUntilReadyBeforeSendingStop"]:::internal-link
  n8["LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  n5 -->|"Quelltext"| n6
  n6 -->|"Quelltext"| n7
  n7 -->|"Quelltext"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```


