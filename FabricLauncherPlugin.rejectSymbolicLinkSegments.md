[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Aufraeumen]] › [[FabricLauncherPlugin.rejectSymbolicLinkSegments]]

# FabricLauncherPlugin.rejectSymbolicLinkSegments

`FabricLauncherPlugin.rejectSymbolicLinkSegments(Path root, Path path)` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:822–830](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L822-L830)

```mermaid
flowchart TD
  n1["if Z.824 (Files.isSymbolicLink(current))"]
  n2["throw Z.824 throw new SecurityException('Migration data root …"]
  n3["for Z.825 (Path segment : root.relativize(path))"]
  n4["if Z.827 (Files.isSymbolicLink(current))"]
  n5["throw Z.828 throw new SecurityException('Migration path conta…"]
  n1 -->|"ja"| n2
  n4 -->|"ja"| n5
  n3 -->|"wiederholen"| n4
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `rejectSymbolicLinkSegments` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
