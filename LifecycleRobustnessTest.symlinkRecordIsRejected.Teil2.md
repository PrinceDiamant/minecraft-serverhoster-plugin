[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]] › [[LifecycleRobustnessTest.symlinkRecordIsRejected]] › [[LifecycleRobustnessTest.symlinkRecordIsRejected.Teil2]]

# LifecycleRobustnessTest.symlinkRecordIsRejected.Teil2

```mermaid
flowchart TD
  n1["ChildProcessRecord.reap"]:::internal-link
  n2["LifecycleRobustnessTest.FakeProcesses.FakeProcesses"]:::internal-link
  n3["Schritt Z.119 assertTrue(Files.isSymbolicLink(link));"]
  n1 -->|"Z.117"| n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
ChildProcessRecord.reap
  Räumt übrige Prozesse ab `reap`. Ruft `read`, `ours`, `waitUntilDead`.
LifecycleRobustnessTest.FakeProcesses.FakeProcesses
  `FakeProcesses` in `LifecycleRobustnessTest.java`. Nur Test.
Schritt Z.119 assertTrue(Files.isSymbolicLink(link));
  Zeile 119: Dateioperation. `assertTrue(Files.isSymbolicLink(link));`
```

- Fortsetzung von `LifecycleRobustnessTest.symlinkRecordIsRejected`, Quellreihenfolge.
