[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildLaunchCleanup]] › [[ChildLaunchCleanup.abandon]] › [[ChildLaunchCleanup.abandon.Teil1]]

# ChildLaunchCleanup.abandon.Teil1

```mermaid
flowchart TD
  n1["if Z.15 (process == null)"]
  n2["return Z.15 return new Result(true, 0, 'no process');"]
  n3["try Z.18"]
  n4["catch Z.20 (IOException e)"]
  n1 -->|"ja"| n2
  n3 -->|"Fehler"| n4
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildLaunchCleanup.abandon`, Quellreihenfolge.
