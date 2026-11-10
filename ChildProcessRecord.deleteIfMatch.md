[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.deleteIfMatch]]

# ChildProcessRecord.deleteIfMatch

`ChildProcessRecord.deleteIfMatch(Path file, long pid, Instant startedAt)` [src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:143–151](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ChildProcessRecord.java#L143-L151)

```mermaid
flowchart TD
  n1["if Z.144 (Files.isSymbolicLink(file))"]
  n2["throw Z.144 throw new IOException('child process record must …"]
  n3["ChildProcessRecord.read"]:::internal-link
  n4["if Z.146 (loaded.identity() == null)"]
  n5["return Z.146 return false;"]
  n6["if Z.147 (loaded.identity().pid() != pid // startedAt == n…"]
  n7["return Z.148 return false;"]
  n8["Schritt Z.149 Files.deleteIfExists(file);"]
  n9["return Z.150 return true;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  n7 --> n8
  n6 --> n8
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `deleteIfMatch` in `src/main/java/de/aichele/childlauncher/ChildProcessRecord.java`
