[[00 Start]] › [[Plugin-Kern]] › [[Konfiguration]] › [[ServerHosterSettings]] › [[ServerHosterSettings.ServerHosterSettings]] › [[ServerHosterSettings.ServerHosterSettings.Teil1]]

# ServerHosterSettings.ServerHosterSettings.Teil1

```mermaid
flowchart TD
  n1["RestartPolicy.maxAttempts"]:::internal-link
  n2["if Z.22 (initialRestartDelaySeconds ( 1 // initialRestart…"]
  n3["throw Z.23 throw new IllegalArgumentException('Initial resta…"]
  n4["if Z.24 (maximumRestartDelaySeconds ( initialRestartDelay…"]
  n5["throw Z.25 throw new IllegalArgumentException('Maximum resta…"]
  n6["if Z.26 (restartResetAfterSeconds ( 60 // restartResetAft…"]
  n7["throw Z.27 throw new IllegalArgumentException('Restart count…"]
  n8["ServerHosterSettings.enumValue"]:::internal-link
  n9["ServerHosterSettings.enumValue"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n4 -->|"ja"| n5
  n3 --> n4
  n2 --> n4
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  n7 --> n8
  n6 --> n8
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ServerHosterSettings.ServerHosterSettings`, Quellreihenfolge.
