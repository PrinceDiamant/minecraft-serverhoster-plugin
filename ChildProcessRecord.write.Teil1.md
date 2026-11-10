[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.write]] › [[ChildProcessRecord.write.Teil1]]

# ChildProcessRecord.write.Teil1

```mermaid
flowchart TD
  n1["if Z.91 (identity == null // identity.pid() (= 0)"]
  n2["throw Z.91 throw new IOException('child process identity is …"]
  n3["if Z.93 (parent == null)"]
  n4["throw Z.93 throw new IOException('child process record has n…"]
  n5["if Z.94 (Files.isSymbolicLink(parent))"]
  n6["throw Z.94 throw new IOException('child process record direc…"]
  n7["Schritt Z.95 Files.createDirectories(parent);"]
  n8["if Z.97 (Files.isSymbolicLink(file) // Files.isSymbolicLi…"]
  n9["throw Z.98 throw new IOException('child process record must …"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n6 --> n7
  n5 --> n7
  n8 -->|"ja"| n9
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildProcessRecord.write`, Quellreihenfolge.
