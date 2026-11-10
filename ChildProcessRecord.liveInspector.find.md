[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.liveInspector]] › [[ChildProcessRecord.liveInspector.find]]

# ChildProcessRecord.liveInspector.find

`ChildProcessRecord.find(long pid)` [src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:46–48](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ChildProcessRecord.java#L46-L48)

```mermaid
flowchart TD
  n1["ChildProcessRecord.observe"]:::internal-link
  n2["return Z.47 return ProcessHandle.of(pid).map(ChildP…"]
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n1 fill:#f88,stroke:#900
```

- `find` in `src/main/java/de/aichele/childlauncher/ChildProcessRecord.java`
- Befund: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:46–48 nur von Tests erreicht
