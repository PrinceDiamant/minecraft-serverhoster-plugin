[[00 Start]] › [[Host-Betrieb]] › [[Speicher-Messung]] › [[RuntimeLimits]] › [[RuntimeLimits.memory]]

# RuntimeLimits.memory

`RuntimeLimits.memory(double warning, double critical, double recovery, boolean requestedAutoStop)` [src/main/java/de/aichele/childlauncher/RuntimeLimits.java:31–43](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/RuntimeLimits.java#L31-L43)

```mermaid
flowchart TD
  n1["RuntimeLimits.percent"]:::internal-link
  n2["RuntimeLimits.percent"]:::internal-link
  n3["if Z.33 (!valid)"]
  n4["return Z.34 return new MemoryPolicy(100, 100, 100, false, Lis…"]
  n5["if Z.38 (recovery ) critical)"]
  n6["if Z.40 (warning ) critical)"]
  n7["return Z.42 return new MemoryPolicy(warning, critical, recove…"]
  n1 -->|"Z.32"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n4 --> n5
  n3 --> n5
  n5 --> n6
  n5 --> n6
  n6 --> n7
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `memory` in `src/main/java/de/aichele/childlauncher/RuntimeLimits.java`
