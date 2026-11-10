[[00 Start]] › [[Plugin-Kern]] › [[Bind-Adresse]] › [[FabricLauncherPlugin.effectiveBindAddress]]

# FabricLauncherPlugin.effectiveBindAddress

`FabricLauncherPlugin.effectiveBindAddress(String override, String hostAddress)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:280–283](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L280-L283)

```mermaid
flowchart TD
  n1["if Z.281 (override != null && !override.isBlank())"]
  n2["return Z.281 return override.trim();"]
  n3["return Z.282 return hostAddress == null ? '' : hostAddress.tri…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `effectiveBindAddress` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
