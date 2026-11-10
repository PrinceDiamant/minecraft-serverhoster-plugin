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
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  n5 -->|"Kapitel im Text"| n6
  n6 -->|"Kapitel im Text"| n7
  n7 -->|"Kapitel im Text"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `identityRequiresStartInstantAndCommandNotJustPid`.
LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord`.
LifecycleRobustnessTest.reapKillsOnlyAfterGracefulStopFails
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `reapKillsOnlyAfterGracefulStopFails`.
LifecycleRobustnessTest.liveUnrelatedProcessIsNotKilledWhenTheRecordNamesIt
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `liveUnrelatedProcessIsNotKilledWhenTheRecordNamesIt`.
LifecycleRobustnessTest.symlinkRecordIsRejected
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `symlinkRecordIsRejected`.
LifecycleRobustnessTest.failedStartDrainsProcessThatIgnoresTerm
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `failedStartDrainsProcessThatIgnoresTerm`.
LifecycleRobustnessTest.stopWaitsUntilReadyBeforeSendingStop
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `stopWaitsUntilReadyBeforeSendingStop`.
LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `stopSendsStopWhenStartupNeverBecomesReadyAndThenKills`.
```

> [!knoten]- Was die Blöcke tun
> - **LifecycleRobustnessTest.identityRequiresStartInstantAndCommandNotJustPid**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `identityRequiresStartInstantAndCommandNotJustPid`.
> - **LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord`.
> - **LifecycleRobustnessTest.reapKillsOnlyAfterGracefulStopFails**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `reapKillsOnlyAfterGracefulStopFails`.
> - **LifecycleRobustnessTest.liveUnrelatedProcessIsNotKilledWhenTheRecordNamesIt**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `liveUnrelatedProcessIsNotKilledWhenTheRecordNamesIt`.
> - **LifecycleRobustnessTest.symlinkRecordIsRejected**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `symlinkRecordIsRejected`.
> - **LifecycleRobustnessTest.failedStartDrainsProcessThatIgnoresTerm**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `failedStartDrainsProcessThatIgnoresTerm`.
> - **LifecycleRobustnessTest.stopWaitsUntilReadyBeforeSendingStop**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `stopWaitsUntilReadyBeforeSendingStop`.
> - **LifecycleRobustnessTest.stopSendsStopWhenStartupNeverBecomesReadyAndThenKills**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. Im [[Glossar#Quelltext|Quelltext]] heißt das `stopSendsStopWhenStartupNeverBecomesReadyAndThenKills`.

- Ein weiterer Abschnitt derselben Übersicht.
