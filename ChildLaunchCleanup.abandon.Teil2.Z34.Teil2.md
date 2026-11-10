[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildLaunchCleanup]] › [[ChildLaunchCleanup.abandon]] › [[ChildLaunchCleanup.abandon.Teil2.Z34.Teil2]]

# ChildLaunchCleanup.abandon.Teil2.Z34.Teil2

```mermaid
flowchart TD
  n1["try Z.47"]
  n2["catch Z.49 (IllegalThreadStateException …"]
  n3["return Z.52 return new Result(!process.isAlive(), code, detai…"]
  n1 -->|"Fehler"| n2
  n1 --> n3
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildLaunchCleanup.abandon.Teil2.Z34`, Quellreihenfolge.
