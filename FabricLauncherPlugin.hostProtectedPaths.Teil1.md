[[00 Start]] › [[Plugin-Kern]] › [[Host-Pfade]] › [[FabricLauncherPlugin.hostProtectedPaths]] › [[FabricLauncherPlugin.hostProtectedPaths.Teil1]]

# FabricLauncherPlugin.hostProtectedPaths.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n2["Schritt Z.2169 String configured = getConfig().getString('workin…"]
  n3["if Z.2171 (!child.isAbsolute())"]
  n4["for Z.2173 (ServerProfile profile : profiles)"]
  n5["ServerProfile.directory"]:::internal-link
  n1 --> n2
  n2 --> n3
  n4 -->|"wiederholen"| n5
  n3 --> n4
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.hostProtectedPaths`, Quellreihenfolge.
