[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildStopSequence]] › [[ChildStopSequence.signal]]

# ChildStopSequence.signal

`ChildStopSequence.signal(Process process, boolean force, Consumer<String> log)` [src/main/java/de/aichele/childlauncher/ChildStopSequence.java:75–81](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ChildStopSequence.java#L75-L81)

```mermaid
flowchart TD
  n1["try Z.76"]
  n2["Schritt Z.77 process.descendants().forEach(force ? ProcessHand…"]
  n3["catch Z.78 (RuntimeException e)"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `signal` in `src/main/java/de/aichele/childlauncher/ChildStopSequence.java`
