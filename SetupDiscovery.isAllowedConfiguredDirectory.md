[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.isAllowedConfiguredDirectory]]

# SetupDiscovery.isAllowedConfiguredDirectory

`SetupDiscovery.isAllowedConfiguredDirectory(Path root, Path path)` [src/main/java/de/aichele/childlauncher/SetupDiscovery.java:172–178](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/SetupDiscovery.java#L172-L178)

```mermaid
flowchart TD
  n1["if Z.173 (path.equals(root))"]
  n2["return Z.173 return false;"]
  n3["if Z.174 (!path.startsWith(root))"]
  n4["return Z.174 return true;"]
  n5["return Z.176 return relative.getNameCount() ) 0 && !SKIP.conta…"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `isAllowedConfiguredDirectory` in `src/main/java/de/aichele/childlauncher/SetupDiscovery.java`
