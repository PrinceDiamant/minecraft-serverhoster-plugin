[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil3]]

# FabricLauncherPlugin.configureSetup.Teil3

```mermaid
flowchart TD
  n1["Schritt Z.576 getConfig().set('servers', null);"]
  n2["Schritt Z.577 getConfig().set('metadata.schemaVersion', 2);"]
  n3["Schritt Z.578 getConfig().set('metadata.pluginVersion', getDesc…"]
  n4["Schritt Z.579 getConfig().set('metadata.migrationState', 'compl…"]
  n5["FabricLauncherPlugin.configureSetup.Teil3.Z580"]:::internal-link
  n6["FabricLauncherPlugin.reloadProfiles"]:::internal-link
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n6 fill:#f88,stroke:#900
```

- Fortsetzung von `FabricLauncherPlugin.configureSetup`, Quellreihenfolge.
