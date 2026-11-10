[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]] › [[LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord]] › [[LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord.Teil2]]

# LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.66 assertTrue(Files.exists(file));"]
  n2["LifecycleRobustnessTest.FakeProcesses.FakeProcesses"]:::internal-link
  n3["ChildProcessRecord.reap"]:::internal-link
  n4["Schritt Z.71 assertFalse(Files.exists(file));"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
Schritt Z.66 assertTrue(Files.exists(file));
  Zeile 66: Dateioperation. `assertTrue(Files.exists(file));`
LifecycleRobustnessTest.FakeProcesses.FakeProcesses
  `FakeProcesses` in `LifecycleRobustnessTest.java`. Nur Test.
ChildProcessRecord.reap
  Räumt übrige Prozesse ab `reap`. Ruft `read`, `ours`, `waitUntilDead`.
Schritt Z.71 assertFalse(Files.exists(file));
  Zeile 71: Dateioperation. `assertFalse(Files.exists(file));`
```

- Fortsetzung von `LifecycleRobustnessTest.reapRefusesUnmatchedProcessAndClearsOnlyADeadRecord`, Quellreihenfolge.
