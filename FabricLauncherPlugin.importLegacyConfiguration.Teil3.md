[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.importLegacyConfiguration]] › [[FabricLauncherPlugin.importLegacyConfiguration.Teil3]]

# FabricLauncherPlugin.importLegacyConfiguration.Teil3

```mermaid
flowchart TD
  n1["if Z.704 (Files.isSymbolicLink(legacyBackups))"]
  n2["throw Z.705 throw new SecurityException('The legacy backup di…"]
  n3["if Z.707 ((configuredBackup == null // configuredBackup.is…"]
  n4["Schritt Z.709 getConfig().set('backup.directory', legacyBackups…"]
  n5["FabricLauncherPlugin.migrateLegacySecrets"]:::internal-link
  n6["FabricLauncherPlugin.migrateLegacyHttpsMaterial"]:::internal-link
  n7["FabricLauncherPlugin.migrateMemoryRecoveryState"]:::internal-link
  n1 -->|"ja"| n2
  n3 -->|"ja"| n4
  n2 --> n3
  n1 --> n3
  n4 --> n5
  n3 --> n5
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.importLegacyConfiguration`, Quellreihenfolge.
