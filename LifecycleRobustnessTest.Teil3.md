[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil3]]

# LifecycleRobustnessTest.Teil3

```mermaid
flowchart TD
  n1["LifecycleRobustnessTest.FakeProcesses.FakeProcesses"]:::internal-link
  n2["LifecycleRobustnessTest.FakeProcesses.find"]:::internal-link
  n3["LifecycleRobustnessTest.FakeProcesses.destroy"]:::internal-link
  n4["LifecycleRobustnessTest.FakeProcesses.destroyForcibly"]:::internal-link
  n5["LifecycleRobustnessTest.FakeProcesses.alive"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
LifecycleRobustnessTest.FakeProcesses.FakeProcesses
  `FakeProcesses` in `LifecycleRobustnessTest.java`. Nur Test.
LifecycleRobustnessTest.FakeProcesses.find
  Sucht `find`. Nur Test.
LifecycleRobustnessTest.FakeProcesses.destroy
  Zerstört `destroy`. Nur Test.
LifecycleRobustnessTest.FakeProcesses.destroyForcibly
  Zerstört `destroyForcibly`. Nur Test.
LifecycleRobustnessTest.FakeProcesses.alive
  Sagt, ob der Prozess lebt `alive`. Nur Test.
```


