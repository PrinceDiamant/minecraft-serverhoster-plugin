[[00 Start]] › [[Plugin-Kern]] › [[Host-Pfade]] › [[FabricLauncherPlugin.hostProtectedPaths]] › [[FabricLauncherPlugin.hostProtectedPaths.Teil2]]

# FabricLauncherPlugin.hostProtectedPaths.Teil2

```mermaid
flowchart TD
  n1["Schritt Z.2174 String backup = getConfig().getString('backup.dir…"]
  n2["if Z.2175 (backup != null && !backup.isBlank())"]
  n3["if Z.2177 (!backupPath.isAbsolute())"]
  n4["return Z.2180 return paths;"]
  n2 -->|"ja"| n3
  n1 --> n2
  n3 --> n4
  n3 --> n4
  n2 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.hostProtectedPaths`, Quellreihenfolge.
