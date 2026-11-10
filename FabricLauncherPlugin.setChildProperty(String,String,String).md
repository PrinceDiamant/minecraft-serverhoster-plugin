[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.setChildProperty(String,String,String)]]

# FabricLauncherPlugin.setChildProperty(String,String,String)

`FabricLauncherPlugin.setChildProperty(String id, String key, String value)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:2614–2621](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L2614-L2621)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.profile"]:::internal-link
  n2["ServerProfile.directory"]:::internal-link
  n3["Schritt Z.2616 Files.createDirectories(wd);"]
  n4["FabricLauncherPlugin.updateProperties"]:::internal-link
  n5["FabricLauncherPlugin.syncPropertiesEdit"]:::internal-link
  n1 -->|"Z.2615"| n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `setChildProperty` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
