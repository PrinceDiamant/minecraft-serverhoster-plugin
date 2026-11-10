[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.migrateLegacyHttpsMaterial]] › [[FabricLauncherPlugin.migrateLegacyHttpsMaterial.Z744.Z747]]

# FabricLauncherPlugin.migrateLegacyHttpsMaterial.Z744.Z747

```mermaid
flowchart TD
  n1["if Z.747 ('pem'.equalsIgnoreCase(mode))"]
  n2["FabricLauncherPlugin.migrateHttpsFile"]:::internal-link
  n3["FabricLauncherPlugin.migrateHttpsFile"]:::internal-link
  n4["FabricLauncherPlugin.migrateHttpsFile"]:::internal-link
  n5["throw Z.752 throw new IOException('Unsupported legacy dashboa…"]
  n2 --> n3
  n3 --> n4
  n1 -->|"ja"| n2
  n1 -->|"nein"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.migrateLegacyHttpsMaterial.Z744`, Quellreihenfolge.
