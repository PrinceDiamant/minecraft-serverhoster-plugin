[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Aufraeumen]] › [[FabricLauncherPlugin.cleanupLegacyDirectory]]

# FabricLauncherPlugin.cleanupLegacyDirectory

`FabricLauncherPlugin.cleanupLegacyDirectory(Path oldData, Set<Path> preserved)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:450–485](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L450-L485)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.cleanupLegacyDirectory.preVisitDirectory"]:::internal-link
  n2["FabricLauncherPlugin.cleanupLegacyDirectory.visitFile"]:::internal-link
  n3["FabricLauncherPlugin.cleanupLegacyDirectory.postVisitDirectory"]:::internal-link
  n4["FabricLauncherPlugin.cleanupLegacyDirectory.preVisitDirectory"]:::internal-link
  n5["FabricLauncherPlugin.cleanupLegacyDirectory.visitFile"]:::internal-link
  n6["FabricLauncherPlugin.cleanupLegacyDirectory.postVisitDirectory"]:::internal-link
  n1 -->|"Z.464"| n2
  n2 -->|"Z.473"| n3
  n3 -->|"innere Methode"| n4
  n4 -->|"innere Methode"| n5
  n5 -->|"innere Methode"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `cleanupLegacyDirectory` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
