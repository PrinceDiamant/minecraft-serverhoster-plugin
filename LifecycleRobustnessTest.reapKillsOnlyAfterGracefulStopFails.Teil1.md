[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]] › [[LifecycleRobustnessTest.reapKillsOnlyAfterGracefulStopFails]] › [[LifecycleRobustnessTest.reapKillsOnlyAfterGracefulStopFails.Teil1]]

# LifecycleRobustnessTest.reapKillsOnlyAfterGracefulStopFails.Teil1

```mermaid
flowchart TD
  n1["ChildProcessRecord.write"]:::internal-link
  n2["LifecycleRobustnessTest.identity"]:::internal-link
  n3["LifecycleRobustnessTest.FakeProcesses.FakeProcesses"]:::internal-link
  n4["ChildProcessRecord.reap"]:::internal-link
  n1 -->|"Z.77"| n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildProcessRecord.write
  Schreibt `write`. Ruft `safe`.
LifecycleRobustnessTest.identity
  `identity` in `LifecycleRobustnessTest.java`. Nur Test.
LifecycleRobustnessTest.FakeProcesses.FakeProcesses
  `FakeProcesses` in `LifecycleRobustnessTest.java`. Nur Test.
ChildProcessRecord.reap
  Räumt übrige Prozesse ab `reap`. Ruft `read`, `ours`, `waitUntilDead`.
```

- Fortsetzung von `LifecycleRobustnessTest.reapKillsOnlyAfterGracefulStopFails`, Quellreihenfolge.
