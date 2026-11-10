[[00 Start]] › [[Child-Prozess]] › [[Startablauf]] › [[FabricLauncherPlugin.consolePrefix]]

# FabricLauncherPlugin.consolePrefix

`FabricLauncherPlugin.consolePrefix(ServerProfile profile)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:2096–2100](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L2096-L2100)

```mermaid
flowchart TD
  n1["Schritt Z.2097 String base = getConfig().getString('logPrefix', …"]
  n2["if Z.2098 (profile == null)"]
  n3["return Z.2098 return base;"]
  n4["return Z.2099 return !'default'.equals(profile.id) && profiles.…"]
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `consolePrefix` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
