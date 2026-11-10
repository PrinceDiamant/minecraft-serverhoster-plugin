[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil2]] › [[ChildProcessRecord.samePath]]

# ChildProcessRecord.samePath

`ChildProcessRecord.samePath(String left, String right)` [src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:202–209](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ChildProcessRecord.java#L202-L209)

```mermaid
flowchart TD
  n1["if Z.203 (left == null // right == null // left.isBlank() …"]
  n2["return Z.203 return false;"]
  n3["try Z.204"]
  n4["return Z.205 return Path.of(left).toAbsolutePath().normalize()…"]
  n5["catch Z.206 (RuntimeException e)"]
  n6["return Z.207 return left.equals(right);"]
  n1 -->|"ja"| n2
  n3 --> n4
  n3 -->|"Fehler"| n5
  n5 --> n6
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `samePath` in `src/main/java/de/aichele/childlauncher/ChildProcessRecord.java`
