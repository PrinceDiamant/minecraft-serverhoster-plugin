[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildLaunchCleanup]] › [[ChildLaunchCleanup.abandon]] › [[ChildLaunchCleanup.abandon.Teil2.Z34]]

# ChildLaunchCleanup.abandon.Teil2.Z34

```mermaid
flowchart TD
  n1["try Z.34"]
  n2["ChildLaunchCleanup.abandon.Teil2.Z34.Teil1"]:::internal-link
  n3["ChildLaunchCleanup.abandon.Teil2.Z34.Teil2"]:::internal-link
  n4["catch Z.53 (InterruptedException e)"]
  n5["return Z.56 return new Result(false, -1, 'interrupted during …"]
  n2 -->|"weiter"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildLaunchCleanup.abandon.Teil2`, Quellreihenfolge.
