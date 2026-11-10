[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[ChildProcessRecord]] › [[ChildProcessRecord.Teil2]] › [[ChildProcessRecord.required]]

# ChildProcessRecord.required

`ChildProcessRecord.required(Map<String, String> values, String key)` [src/main/java/de/aichele/childlauncher/ChildProcessRecord.java:218–222](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/ChildProcessRecord.java#L218-L222)

```mermaid
flowchart TD
  n1["if Z.220 (value == null)"]
  n2["throw Z.220 throw new NumberFormatException('missing ' + key);"]
  n3["return Z.221 return value;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.220 (value == null)
  Zeile 220: prüft `(value == null)`.
throw Z.220 throw new NumberFormatException('missing ' + key);
  Zeile 220: Abbruch `throw new NumberFormatException('missing ' + key);`.
return Z.221 return value;
  Zeile 221: Rückgabe `return value;`.
```

- `required` in `src/main/java/de/aichele/childlauncher/ChildProcessRecord.java`
