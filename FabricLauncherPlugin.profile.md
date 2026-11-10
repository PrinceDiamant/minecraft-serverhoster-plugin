[[00 Start]] › [[Plugin-Kern]] › [[Fokus]] › [[FabricLauncherPlugin.profile]]

# FabricLauncherPlugin.profile

`FabricLauncherPlugin.profile(String id)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:291–295](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L291-L295)

```mermaid
flowchart TD
  n1["for Z.293 (ServerProfile p : profiles)"]
  n2["if Z.293 (p.id.equals(key))"]
  n3["return Z.293 return p;"]
  n4["throw Z.294 throw new IllegalArgumentException('unknown serve…"]
  n2 -->|"ja"| n3
  n1 -->|"wiederholen"| n2
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `profile` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
