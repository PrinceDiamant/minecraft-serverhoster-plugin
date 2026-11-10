[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Aufraeumen]] › [[FabricLauncherPlugin.legacyDataToPreserve]] › [[FabricLauncherPlugin.legacyDataToPreserve.Z433]]

# FabricLauncherPlugin.legacyDataToPreserve.Z433

```mermaid
flowchart TD
  n1["if Z.433 (configuredBackup == null // configuredBackup.isB…"]
  n2["FabricLauncherPlugin.addLegacyDataToPreserve"]:::internal-link
  n3["if Z.437 (!backupDirectory.isAbsolute())"]
  n4["FabricLauncherPlugin.addLegacyDataToPreserve"]:::internal-link
  n3 --> n4
  n3 --> n4
  n1 -->|"ja"| n2
  n1 -->|"nein"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.legacyDataToPreserve`, Quellreihenfolge.
