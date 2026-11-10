[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.saveProps]] › [[Dashboard.saveProps.Teil1]]

# Dashboard.saveProps.Teil1

```mermaid
flowchart TD
  n1["Dashboard.readBodyText"]:::internal-link
  n2["FabricLauncherPlugin.workDir(String)"]:::internal-link
  n3["Schritt Z.754 Files.createDirectories(f.getParent());"]
  n4["Schritt Z.755 Files.writeString(f, txt, StandardCharsets.UTF_8);"]
  n5["FabricLauncherPlugin.syncPropertiesEdit"]:::internal-link
  n6["FabricLauncherPlugin.info(String,String)"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.saveProps`, Quellreihenfolge.
