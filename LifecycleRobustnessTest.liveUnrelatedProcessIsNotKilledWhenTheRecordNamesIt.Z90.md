[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil1]] › [[LifecycleRobustnessTest.liveUnrelatedProcessIsNotKilledWhenTheRecordNamesIt]] › [[LifecycleRobustnessTest.liveUnrelatedProcessIsNotKilledWhenTheRecordNamesIt.Z90]]

# LifecycleRobustnessTest.liveUnrelatedProcessIsNotKilledWhenTheRecordNamesIt.Z90

```mermaid
flowchart TD
  n1["try Z.90"]
  n2["ChildProcessRecord.write"]:::internal-link
  n3["LifecycleRobustnessTest.identity"]:::internal-link
  n4["ChildProcessRecord.reap"]:::internal-link
  n5["ChildProcessRecord.liveInspector"]:::internal-link
  n6["Schritt Z.98 assertTrue(Files.exists(file));"]
  n7["finally Z.90"]
  n2 -->|"Z.93"| n3
  n4 -->|"Z.95"| n5
  n3 --> n4
  n5 --> n6
  n1 --> n2
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n5 fill:#f88,stroke:#900
```

- Fortsetzung von `LifecycleRobustnessTest.liveUnrelatedProcessIsNotKilledWhenTheRecordNamesIt`, Quellreihenfolge.
