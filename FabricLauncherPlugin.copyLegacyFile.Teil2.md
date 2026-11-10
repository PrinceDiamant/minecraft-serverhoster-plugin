[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Aufraeumen]] › [[FabricLauncherPlugin.copyLegacyFile]] › [[FabricLauncherPlugin.copyLegacyFile.Teil2]]

# FabricLauncherPlugin.copyLegacyFile.Teil2

```mermaid
flowchart TD
  n1["if Z.806 (Files.size(normalizedSource) ) maxBytes)"]
  n2["throw Z.807 throw new IOException('Legacy migration file exce…"]
  n3["Schritt Z.808 Files.createDirectories(normalizedTarget.getParen…"]
  n4["if Z.809 (Files.exists(normalizedTarget, LinkOption.NOFOLL…"]
  n5["if Z.810 (Files.isSymbolicLink(normalizedTarget) // !Files…"]
  n6["throw Z.812 throw new IOException('Migration destination alre…"]
  n7["Schritt Z.814 Files.copy(normalizedSource, normalizedTarget);"]
  n8["if Z.816 (secret && Files.getFileStore(normalizedTarget).s…"]
  n9["Schritt Z.817 Files.setPosixFilePermissions(normalizedTarget, S…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n5 -->|"ja"| n6
  n4 -->|"ja"| n5
  n4 -->|"nein"| n7
  n3 --> n4
  n8 -->|"ja"| n9
  n6 --> n8
  n5 --> n8
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.copyLegacyFile`, Quellreihenfolge.
