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

```knoten
ScheduleDef.load
  Lädt `load`. Ruft `asMap`, `Action`, `string`.
for Z.716 (ScheduleDef schedule : existingSchedul…
  Zeile 716: Schleife `(ScheduleDef schedule : existingSchedul…`.
ScheduleDef.toConfig
  `toConfig` in `ScheduleDef.java`. Ruft `toConfig`.
LegacyTaskMigration.migrate
  Übernimmt den alten Wert von `migrate`. Ruft `load`, `convert`, `toConfig`.
Schritt Z.722 getConfig().set('schedules', migratedSchedules);
  Zeile 722: liest die Config. `getConfig().set('schedules', migratedSchedules);`
```

- Fortsetzung von `FabricLauncherPlugin.importLegacyConfiguration`, Quellreihenfolge.
