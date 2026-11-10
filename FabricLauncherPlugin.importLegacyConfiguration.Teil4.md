[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.importLegacyConfiguration]] › [[FabricLauncherPlugin.importLegacyConfiguration.Teil4]]

# FabricLauncherPlugin.importLegacyConfiguration.Teil4

```mermaid
flowchart TD
  n1["ScheduleDef.load"]:::internal-link
  n2["for Z.716 (ScheduleDef schedule : existingSchedul…"]
  n3["ScheduleDef.toConfig"]:::internal-link
  n4["LegacyTaskMigration.migrate"]:::internal-link
  n5["Schritt Z.722 getConfig().set('schedules', migratedSchedules);"]
  n2 -->|"wiederholen"| n3
  n1 --> n2
  n3 --> n4
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.importLegacyConfiguration`, Quellreihenfolge.
