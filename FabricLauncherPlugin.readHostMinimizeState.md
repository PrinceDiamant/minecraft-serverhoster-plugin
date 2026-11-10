[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.readHostMinimizeState]]

# FabricLauncherPlugin.readHostMinimizeState

`FabricLauncherPlugin.readHostMinimizeState()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:2183–2187](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L2183-L2187)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.hostMinimizeStateFile"]:::internal-link
  n2["if Z.2185 (!Files.isRegularFile(file, LinkOption.NOFOLLOW_L…"]
  n3["return Z.2185 return Map.of();"]
  n4["HostMinimize.readState"]:::internal-link
  n5["return Z.2186 return HostMinimize.readState(Files.rea…"]
  n2 -->|"ja"| n3
  n1 --> n2
  n4 --> n5
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `readHostMinimizeState` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
