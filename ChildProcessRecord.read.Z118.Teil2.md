[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.read]] › [[ChildProcessRecord.read.Z118.Teil2]]

# ChildProcessRecord.read.Z118.Teil2

```mermaid
flowchart TD
  n1["for Z.126 (int i = 1; i ( lines.size(); i++)"]
  n2["if Z.129 (eq (= 0)"]
  n3["return Z.129 return new Loaded(null, 'process record line is m…"]
  n4["ChildProcessRecord.required"]:::internal-link
  n5["ChildProcessRecord.required"]:::internal-link
  n6["ChildProcessRecord.required"]:::internal-link
  n2 -->|"ja"| n3
  n1 -->|"wiederholen"| n2
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildProcessRecord.read.Z118`, Quellreihenfolge.
