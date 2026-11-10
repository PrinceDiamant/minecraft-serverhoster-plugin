[[00 Start]] › [[Child-Prozess]] › [[Prozess-Bausteine]] › [[RestartPolicy]] › [[RestartPolicy.maxAttempts]]

# RestartPolicy.maxAttempts

`RestartPolicy.maxAttempts(Object raw)` [src/main/java/de/aichele/childlauncher/RestartPolicy.java:11–23](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/RestartPolicy.java#L11-L23)

```mermaid
flowchart TD
  n1["if Z.12 (!(raw instanceof Number number))"]
  n2["throw Z.13 throw new IllegalArgumentException('autoRestart.m…"]
  n3["try Z.14"]
  n4["if Z.16 (value ( 1 // value ) MAX_ATTEMPTS_LIMIT)"]
  n5["throw Z.17 throw new IllegalArgumentException('autoRestart.m…"]
  n6["return Z.19 return value;"]
  n7["catch Z.20 (NumberFormatException / Arit…"]
  n8["throw Z.21 throw new IllegalArgumentException('autoRestart.m…"]
  n1 -->|"ja"| n2
  n4 -->|"ja"| n5
  n5 --> n6
  n4 --> n6
  n3 --> n4
  n3 -->|"Fehler"| n7
  n7 --> n8
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `maxAttempts` in `src/main/java/de/aichele/childlauncher/RestartPolicy.java`
