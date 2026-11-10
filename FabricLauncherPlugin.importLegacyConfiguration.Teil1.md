[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Import]] › [[FabricLauncherPlugin.importLegacyConfiguration]] › [[FabricLauncherPlugin.importLegacyConfiguration.Teil1]]

# FabricLauncherPlugin.importLegacyConfiguration.Teil1

```mermaid
flowchart TD
  n1["if Z.681 (Files.isSymbolicLink(oldData))"]
  n2["throw Z.682 throw new SecurityException('The legacy plugin da…"]
  n3["SetupDiscovery.loadLegacyConfig"]:::internal-link
  n4["Schritt Z.684 getConfig().set('type', profile.type);"]
  n5["Schritt Z.685 getConfig().set('mcVersion', profile.mcVersion);"]
  n6["Schritt Z.686 getConfig().set('port', profile.port);"]
  n7["Schritt Z.687 getConfig().set('serverIp', profile.serverIp);"]
  n8["Schritt Z.688 getConfig().set('customJar', profile.customJar);"]
  n9["Schritt Z.689 getConfig().set('fabricLoaderVersion', profile.fa…"]
  n10["Schritt Z.690 getConfig().set('fabricInstallerVersion', profile…"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  n6 --> n7
  n7 --> n8
  n8 --> n9
  n9 --> n10
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.importLegacyConfiguration`, Quellreihenfolge.
