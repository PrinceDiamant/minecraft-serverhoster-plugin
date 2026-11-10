[[00 Start]] › [[Server-Anlage]] › [[Versionen]] › [[FabricLauncherPlugin.versions]]

# FabricLauncherPlugin.versions

`FabricLauncherPlugin.versions(String type)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1269–1276](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1269-L1276)

```mermaid
flowchart TD
  n1["if Z.1272 (at != null && now - at ( 600_000 && versionCache…"]
  n2["return Z.1272 return versionCache.get(type);"]
  n3["VersionCatalog.fetch"]:::internal-link
  n4["return Z.1275 return list;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `versions` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
