[[00 Start]] › [[Zeitplaene]] › [[Plan-Klassen]] › [[TaskDef]] › [[TaskDef.load]]

# TaskDef.load

`TaskDef.load(Object raw)` [src/main/java/de/aichele/childlauncher/TaskDef.java:27–39](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/TaskDef.java#L27-L39)

```mermaid
flowchart TD
  n1["if Z.28 (!(raw instanceof List(?) list))"]
  n2["return Z.28 return List.of();"]
  n3["TaskDef.load.Z31"]:::internal-link
  n4["return Z.38 return out;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.28 (!(raw instanceof List(?) list))
  Zeile 28: prüft `(!(raw instanceof List(?) list))`.
return Z.28 return List.of();
  Zeile 28: Rückgabe `return List.of();`.
TaskDef.load.Z31
  Fortsetzung des Ablaufs ab Zeile 31.
return Z.38 return out;
  Zeile 38: Rückgabe `return out;`.
```

- `load` in `src/main/java/de/aichele/childlauncher/TaskDef.java`
