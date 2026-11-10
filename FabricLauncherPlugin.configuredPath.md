[[00 Start]] › [[Plugin-Kern]] › [[Host-Pfade]] › [[FabricLauncherPlugin.configuredPath]]

# FabricLauncherPlugin.configuredPath

`FabricLauncherPlugin.configuredPath(String configured)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:2222–2226](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L2222-L2226)

```mermaid
flowchart TD
  n1["if Z.2224 (!path.isAbsolute())"]
  n2["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n3["return Z.2225 return path.toAbsolutePath().normalize();"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `configuredPath` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
