[[00 Start]] › [[Tests]] › [[LifecycleRobustnessTest]] › [[LifecycleRobustnessTest.Teil2]] › [[LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart]] › [[LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart.Teil2]]

# LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart.Teil2

```mermaid
flowchart TD
  n1["SupervisorHealth.assess"]:::internal-link
  n2["LifecycleRobustnessTest.state"]:::internal-link
  n3["SupervisorHealth.assess"]:::internal-link
  n4["LifecycleRobustnessTest.state"]:::internal-link
  n1 -->|"Z.186"| n2
  n3 -->|"Z.188"| n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `LifecycleRobustnessTest.supervisorDoesNotRestartDuringLaunchStopOrQueuedRestart`, Quellreihenfolge.
