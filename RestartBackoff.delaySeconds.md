[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[RestartBackoff]] › [[RestartBackoff.delaySeconds]]

# RestartBackoff.delaySeconds

`RestartBackoff.delaySeconds(long base, long cap, int attempts)` [src/main/java/de/aichele/childlauncher/RestartBackoff.java:7–14](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/RestartBackoff.java#L7-L14)

```mermaid
flowchart TD
  n1["if Z.8 (base ( 0)"]
  n2["if Z.9 (cap ( 0)"]
  n3["if Z.11 (shift )= 1 && base ) (Long.MAX_VALUE )) shift))"]
  n4["return Z.11 return cap;"]
  n5["return Z.13 return Math.min(cap, raw);"]
  n1 --> n2
  n1 --> n2
  n3 -->|"ja"| n4
  n2 --> n3
  n2 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `delaySeconds` in `src/main/java/de/aichele/childlauncher/RestartBackoff.java`
