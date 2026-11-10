[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.guard]]

# Dashboard.guard

`Dashboard.guard(String sid)` [src/main/java/de/aichele/childlauncher/Dashboard.java:813–813](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/Dashboard.java#L813-L813)

```mermaid
flowchart TD
  n1["PathGuard.open"]:::internal-link
  n2["FabricLauncherPlugin.workDir(String)"]:::internal-link
  n3["return Z.813 return PathGuard.open(pl.workDir(sid));"]
  n1 -->|"Z.813"| n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `guard` in `src/main/java/de/aichele/childlauncher/Dashboard.java`
