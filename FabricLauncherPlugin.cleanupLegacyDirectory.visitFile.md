[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Aufraeumen]] › [[FabricLauncherPlugin.cleanupLegacyDirectory]] › [[FabricLauncherPlugin.cleanupLegacyDirectory.visitFile]]

# FabricLauncherPlugin.cleanupLegacyDirectory.visitFile

`FabricLauncherPlugin.visitFile(Path file, java.nio.file.attribute.BasicFileAttributes attrs)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:464–471](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L464-L471)

```mermaid
flowchart TD
  n1["if Z.467 (normalizedPreserved.stream().noneMatch(path -) p…"]
  n2["Schritt Z.469 Files.delete(file);"]
  n3["return Z.470 return java.nio.file.FileVisitResult.CONTINUE;"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `visitFile` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
