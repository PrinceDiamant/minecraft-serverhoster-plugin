[[00 Start]] › [[Server-Anlage]] › [[Setup-Suche]] › [[SetupDiscovery]] › [[SetupDiscovery.isSafeArchiveTarget]]

# SetupDiscovery.isSafeArchiveTarget

`SetupDiscovery.isSafeArchiveTarget(Path serverRoot, Path target)` [src/main/java/de/aichele/childlauncher/SetupDiscovery.java:159–165](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/SetupDiscovery.java#L159-L165)

```mermaid
flowchart TD
  n1["if Z.161 (Files.isSymbolicLink(target) // !Files.isDirecto…"]
  n2["return Z.161 return false;"]
  n3["if Z.163 (!real.startsWith(root) // real.equals(root))"]
  n4["return Z.163 return false;"]
  n5["return Z.164 return !SKIP.contains(real.getFileName().toString…"]
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `isSafeArchiveTarget` in `src/main/java/de/aichele/childlauncher/SetupDiscovery.java`
