[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.read]] › [[ChildProcessRecord.read.Z118]]

# ChildProcessRecord.read.Z118

```mermaid
flowchart TD
  n1["try Z.118"]
  n2["ChildProcessRecord.read.Z118.Teil1"]:::internal-link
  n3["ChildProcessRecord.read.Z118.Teil2"]:::internal-link
  n4["ChildProcessRecord.read.Z118.Teil3"]:::internal-link
  n5["catch Z.138 (IOException / NumberFormatEx…"]
  n6["return Z.139 return new Loaded(null, e.getMessage() == null ? …"]
  n2 -->|"weiter"| n3
  n3 -->|"weiter"| n4
  n1 --> n2
  n1 -->|"Fehler"| n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildProcessRecord.read`, Quellreihenfolge.
