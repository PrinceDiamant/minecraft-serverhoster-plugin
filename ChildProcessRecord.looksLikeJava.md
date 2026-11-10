[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil2]] › [[ChildProcessRecord.looksLikeJava]]

# ChildProcessRecord.looksLikeJava

`ChildProcessRecord.looksLikeJava(List<String> command, String javaBin)` [src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:194–200](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ChildProcessRecord.java#L194-L200)

```mermaid
flowchart TD
  n1["if Z.195 (command.isEmpty())"]
  n2["return Z.195 return false;"]
  n3["if Z.197 (executable.equals(javaBin))"]
  n4["return Z.197 return true;"]
  n5["ChildProcessRecord.fileName"]:::internal-link
  n6["return Z.199 return name.equals('java') // name.equals('java.e…"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `looksLikeJava` in `src/main/java/de/aichele/childlauncher/ChildProcessRecord.java`
