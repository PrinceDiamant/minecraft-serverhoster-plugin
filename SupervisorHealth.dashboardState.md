[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[SupervisorHealth]] › [[SupervisorHealth.dashboardState]]

# SupervisorHealth.dashboardState

`SupervisorHealth.dashboardState(Phase phase, boolean alive, boolean ready, boolean wantRunning, boolean stopRequested, boolean launchInProgress, boolean restartQueued, boolean autoRestartEnabled)` [src/main/java/de/aichele/childlauncher/SupervisorHealth.java:17–27](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/SupervisorHealth.java#L17-L27)

```mermaid
flowchart TD
  n1["if Z.20 (phase == Phase.STOPPING // (alive && (stopReques…"]
  n2["return Z.21 return DashboardState.STOPPING;"]
  n3["if Z.22 (alive)"]
  n4["return Z.22 return ready ? DashboardState.RUNNING : Dashboard…"]
  n5["if Z.23 (phase == Phase.PREPARING // launchInProgress)"]
  n6["return Z.24 return stopRequested // !wantRunning ? DashboardS…"]
  n7["if Z.25 (restartQueued && wantRunning && autoRestartEnabl…"]
  n8["return Z.25 return DashboardState.RESTART_WAIT;"]
  n9["return Z.26 return DashboardState.STOPPED;"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n7 -->|"ja"| n8
  n6 --> n7
  n5 --> n7
  n8 --> n9
  n7 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `dashboardState` in `src/main/java/de/aichele/childlauncher/SupervisorHealth.java`
