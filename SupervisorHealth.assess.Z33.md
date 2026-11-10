[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[SupervisorHealth]] › [[SupervisorHealth.assess]] › [[SupervisorHealth.assess.Z33]]

# SupervisorHealth.assess.Z33

```mermaid
flowchart TD
  n1["if Z.33 (state.processAlive())"]
  n2["if Z.36 (state.stopRequested() && state.phase() == Phase.…"]
  n3["return Z.37 return pipe ? Action.REATTACH_PIPE : Action.NONE;"]
  n4["if Z.38 (watch && pipe)"]
  n5["return Z.38 return Action.REATTACH_BOTH;"]
  n6["if Z.39 (watch)"]
  n7["return Z.39 return Action.REATTACH_WATCH;"]
  n8["if Z.40 (pipe)"]
  n9["return Z.40 return Action.REATTACH_PIPE;"]
  n10["return Z.41 return Action.NONE;"]
  n2 -->|"ja"| n3
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n4
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  n8 -->|"ja"| n9
  n7 --> n8
  n6 --> n8
  n9 --> n10
  n8 --> n10
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `SupervisorHealth.assess`, Quellreihenfolge.
