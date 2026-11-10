[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.importLegacyConfiguration]] › [[FabricLauncherPlugin.importLegacyConfiguration.Teil2]]

# FabricLauncherPlugin.importLegacyConfiguration.Teil2

```mermaid
flowchart TD
  n1["ServerProfile.directory"]:::internal-link
  n2["Schritt Z.692 getConfig().set('memory.xms', profile.xms);"]
  n3["Schritt Z.693 getConfig().set('memory.xmx', profile.xmx);"]
  n4["Schritt Z.694 getConfig().set('jvmFlags', profile.jvmFlags);"]
  n5["Schritt Z.695 getConfig().set('serverArgs', profile.serverArgs);"]
  n6["Schritt Z.696 getConfig().set('autoStart', profile.autoStart);"]
  n7["Schritt Z.697 getConfig().set('serverProperties', profile.serve…"]
  n8["for Z.698 (String key : List.of('autoRestart', 's…"]
  n9["if Z.701 (old.contains(key))"]
  n10["Schritt Z.701 getConfig().set(key, old.get(key));"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n9 -->|"ja"| n10
  n8 -->|"wiederholen"| n9
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.importLegacyConfiguration`, Quellreihenfolge.
