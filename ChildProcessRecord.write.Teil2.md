[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.write]] › [[ChildProcessRecord.write.Teil2]]

# ChildProcessRecord.write.Teil2

```mermaid
flowchart TD
  n1["ChildProcessRecord.safe"]:::internal-link
  n2["ChildProcessRecord.safe"]:::internal-link
  n3["ChildProcessRecord.safe"]:::internal-link
  n4["ChildProcessRecord.safe"]:::internal-link
  n5["Schritt Z.109 Files.writeString(temporary, text, StandardCharse…"]
  n6["try Z.110"]
  n7["Schritt Z.111 Files.move(temporary, file, StandardCopyOption.AT…"]
  n8["catch Z.112 (AtomicMoveNotSupportedExcept…"]
  n9["Schritt Z.113 Files.move(temporary, file, StandardCopyOption.RE…"]
  n1 -->|"Z.106"| n2
  n2 -->|"Z.107"| n3
  n3 -->|"Z.108"| n4
  n4 --> n5
  n6 --> n7
  n6 -->|"Fehler"| n8
  n8 --> n9
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `ChildProcessRecord.write`, Quellreihenfolge.
