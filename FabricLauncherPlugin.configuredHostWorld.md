[[00 Start]] › [[Plugin-Kern]] › [[Host-Pfade]] › [[FabricLauncherPlugin.configuredHostWorld]]

# FabricLauncherPlugin.configuredHostWorld

`FabricLauncherPlugin.configuredHostWorld()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:2259–2268](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L2259-L2268)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n2["if Z.2261 (!Files.isRegularFile(properties, LinkOption.NOFO…"]
  n3["return Z.2262 return '';"]
  n4["for Z.2264 (String line : Files.readAllLines(prope…"]
  n5["if Z.2265 (line.startsWith('level-name='))"]
  n6["HostMinimize.worldNameSafe"]:::internal-link
  n7["return Z.2267 return HostMinimize.worldNameSafe(level…"]
  n2 -->|"ja"| n3
  n1 --> n2
  n4 -->|"wiederholen"| n5
  n3 --> n4
  n2 --> n4
  n6 --> n7
  n5 --> n6
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `configuredHostWorld` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
