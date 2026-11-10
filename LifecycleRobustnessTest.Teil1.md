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

```knoten
LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid
  `identityRequiresStartInstantAndCommandNotJustPid` in `LifecycleRobustnessTest.java`. Ruft `identity`, `ours`. Nur Test.
LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord
  Räumt übrige Prozesse ab `reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord`. Ruft `identity`, `write`, `read`. Nur Test.
LifecycleRobustnessTest.reapKillsOnlyAfterGracefulStopFails
  Räumt übrige Prozesse ab `reapKillsOnlyAfterGracefulStopFails`. Ruft `write`, `identity`, `FakeProcesses`. Nur Test.
LifecycleRobustnessTest.liveUnrelatedProcessIsNotKilledWhenTheRecordNamesIt
  `liveUnrelatedProcessIsNotKilledWhenTheRecordNamesIt` in `LifecycleRobustnessTest.java`. Ruft `testProcess`, `write`, `identity`. Nur Test.
LifecycleRobustnessTest.symlinkRecordIsRejected
  `symlinkRecordIsRejected` in `LifecycleRobustnessTest.java`. Ruft `read`, `reap`, `FakeProcesses`. Nur Test.
LifecycleRobustnessTest.failedStartDrainsProcessThatIgnoresTerm
  `failedStartDrainsProcessThatIgnoresTerm` in `LifecycleRobustnessTest.java`. Ruft `testProcess`, `abandon`. Nur Test.
LifecycleRobustnessTest.stopWaitsUntilReadyBeforeSendingStop
  Stoppt `stopWaitsUntilReadyBeforeSendingStop`. Ruft `testProcess`, `stop`. Nur Test.
LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills
  Stoppt `stopSendsStopWhenStartupNeverBecomesReadyAndThenKills`. Ruft `testProcess`, `stop`. Nur Test.
```


