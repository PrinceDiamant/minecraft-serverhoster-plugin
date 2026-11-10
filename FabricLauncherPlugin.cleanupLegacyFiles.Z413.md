[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Aufraeumen]] › [[FabricLauncherPlugin.cleanupLegacyFiles]] › [[FabricLauncherPlugin.cleanupLegacyFiles.Z413]]

# FabricLauncherPlugin.cleanupLegacyFiles.Z413

```mermaid
flowchart TD
  n1["if Z.413 (Files.exists(oldData, LinkOption.NOFOLLOW_LINKS))"]
  n2["if Z.414 (Files.isSymbolicLink(oldData) // !Files.isDirect…"]
  n3["throw Z.415 throw new SecurityException('Der alte Plugin-Date…"]
  n4["FabricLauncherPlugin.legacyDataToPreserve"]:::internal-link
  n5["FabricLauncherPlugin.cleanupLegacyDirectory"]:::internal-link
  n6["for Z.418 (Path path : preserved)"]
  n7["if Z.419 (Files.exists(path, LinkOption.NOFOLLOW_LINKS))"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n4 --> n5
  n6 -->|"wiederholen"| n7
  n5 --> n6
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.cleanupLegacyFiles`, Quellreihenfolge.
