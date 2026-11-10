[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil1]] › [[ChildProcessRecord.liveInspector]]

# ChildProcessRecord.liveInspector

`ChildProcessRecord.liveInspector()` [src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:44–59](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ChildProcessRecord.java#L44-L59)

```mermaid
flowchart TD
  n1["return Z.45 return new Inspector() ( @Override public Observe…"]
  n2["ChildProcessRecord.liveInspector.find"]:::internal-link
  n3["ChildProcessRecord.liveInspector.destroy"]:::internal-link
  n4["ChildProcessRecord.liveInspector.destroyForcibly"]:::internal-link
  n5["ChildProcessRecord.liveInspector.alive"]:::internal-link
  n6["ChildProcessRecord.liveInspector.find"]:::internal-link
  n7["ChildProcessRecord.liveInspector.destroy"]:::internal-link
  n8["ChildProcessRecord.liveInspector.destroyForcibly"]:::internal-link
  n9["ChildProcessRecord.liveInspector.alive"]:::internal-link
  n2 -->|"Z.49"| n3
  n3 -->|"Z.52"| n4
  n4 -->|"Z.55"| n5
  n1 --> n2
  n5 -->|"innere Methode"| n6
  n6 -->|"innere Methode"| n7
  n7 -->|"innere Methode"| n8
  n8 -->|"innere Methode"| n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
  style n3 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
  style n5 fill:#f88,stroke:#900
  style n6 fill:#f88,stroke:#900
  style n7 fill:#f88,stroke:#900
  style n8 fill:#f88,stroke:#900
  style n9 fill:#f88,stroke:#900
```

- `liveInspector` in `src/main/java/de/aichele/childlauncher/ChildProcessRecord.java`
- Befund: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:44–59 nur von Tests erreicht
