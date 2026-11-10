[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Aufraeumen]] › [[FabricLauncherPlugin.legacyJarNames]] › [[FabricLauncherPlugin.legacyJarNames.Z490]]

# FabricLauncherPlugin.legacyJarNames.Z490

```mermaid
flowchart TD
  n1["try Z.490"]
  n2["for Z.491 (Path entry : entries)"]
  n3["if Z.492 (Files.isSymbolicLink(entry) // !Files.isRegularF…"]
  n4["throw Z.493 throw new SecurityException('Unsichere alte Plugi…"]
  n5["if Z.494 (jars.size() )= 16)"]
  n6["throw Z.494 throw new IOException('Zu viele alte Plugin-JARs …"]
  n3 -->|"ja"| n4
  n5 -->|"ja"| n6
  n4 --> n5
  n3 --> n5
  n2 -->|"wiederholen"| n3
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.legacyJarNames`, Quellreihenfolge.
