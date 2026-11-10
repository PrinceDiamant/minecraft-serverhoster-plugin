[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Aufraeumen]] › [[FabricLauncherPlugin.copyLegacyFile]] › [[FabricLauncherPlugin.copyLegacyFile.Teil1]]

# FabricLauncherPlugin.copyLegacyFile.Teil1

```mermaid
flowchart TD
  n1["if Z.800 (!normalizedSource.startsWith(root) // !normalize…"]
  n2["throw Z.801 throw new SecurityException('Legacy file migratio…"]
  n3["FabricLauncherPlugin.rejectSymbolicLinkSegments"]:::internal-link
  n4["FabricLauncherPlugin.rejectSymbolicLinkSegments"]:::internal-link
  n5["if Z.804 (!Files.isRegularFile(normalizedSource, LinkOptio…"]
  n6["throw Z.805 throw new IOException('Legacy migration source is…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n5 -->|"ja"| n6
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.copyLegacyFile`, Quellreihenfolge.
