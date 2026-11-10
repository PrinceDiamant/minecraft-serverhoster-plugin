[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]] › [[LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord]] › [[LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord.Teil1]]

# LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord.Teil1

```mermaid
flowchart TD
  n1["LifecycleRobustnessTest.identity"]:::internal-link
  n2["ChildProcessRecord.write"]:::internal-link
  n3["ChildProcessRecord.read"]:::internal-link
  n4["LifecycleRobustnessTest.FakeProcesses.FakeProcesses"]:::internal-link
  n5["ChildProcessRecord.reap"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LifecycleRobustnessTest.identity
  `identity` in `LifecycleRobustnessTest.java`. Nur Test.
ChildProcessRecord.write
  Schreibt `write`. Ruft `safe`.
ChildProcessRecord.read
  Liest `read`. Ruft `required`.
LifecycleRobustnessTest.FakeProcesses.FakeProcesses
  `FakeProcesses` in `LifecycleRobustnessTest.java`. Nur Test.
ChildProcessRecord.reap
  Räumt übrige Prozesse ab `reap`. Ruft `read`, `ours`, `waitUntilDead`.
```

- Fortsetzung von `LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord`, Quellreihenfolge.
