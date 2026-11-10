[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.migrateHttpsFile]] › [[FabricLauncherPlugin.migrateHttpsFile.Teil1]]

# FabricLauncherPlugin.migrateHttpsFile.Teil1

```mermaid
flowchart TD
  n1["if Z.759 (path.isAbsolute())"]
  n2["if Z.760 (required && !Files.isRegularFile(path, LinkOptio…"]
  n3["throw Z.761 throw new IOException('Required legacy dashboard …"]
  n4["return Z.762 return;"]
  n5["if Z.766 (!source.startsWith(oldData) // !target.startsWit…"]
  n6["throw Z.767 throw new SecurityException('Legacy dashboard HTT…"]
  n2 -->|"ja"| n3
  n3 --> n4
  n2 --> n4
  n1 -->|"ja"| n2
  n5 -->|"ja"| n6
  n4 --> n5
  n1 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.migrateHttpsFile`, Quellreihenfolge.
