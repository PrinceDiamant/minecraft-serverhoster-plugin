[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil2]] › [[LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart]] › [[LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart.Teil1]]

# LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart.Teil1

```mermaid
flowchart TD
  n1["SupervisorHealth.assess"]:::internal-link
  n2["LifecycleRobustnessTest.state"]:::internal-link
  n3["SupervisorHealth.assess"]:::internal-link
  n4["LifecycleRobustnessTest.state"]:::internal-link
  n5["SupervisorHealth.assess"]:::internal-link
  n6["LifecycleRobustnessTest.state"]:::internal-link
  n7["SupervisorHealth.assess"]:::internal-link
  n8["LifecycleRobustnessTest.state"]:::internal-link
  n1 -->|"Z.178"| n2
  n3 -->|"Z.180"| n4
  n2 --> n3
  n5 -->|"Z.182"| n6
  n4 --> n5
  n7 -->|"Z.184"| n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart`, Quellreihenfolge.
