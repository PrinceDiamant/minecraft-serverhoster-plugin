[[00 Start]] › [[Plugin-Kern]] › [[Setup]] › [[Setup-Dialog]] › [[FabricLauncherPlugin.configureSetup]] › [[FabricLauncherPlugin.configureSetup.Teil2]]

# FabricLauncherPlugin.configureSetup.Teil2

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.configureSetup.Teil2.Z519"]:::internal-link
  n2["Schritt Z.570 getConfig().set('notifications.ntfy.enabled', ntf…"]
  n3["Schritt Z.571 getConfig().set('notifications.ntfy.server', ntfy…"]
  n4["Schritt Z.572 getConfig().set('notifications.ntfy.topic', ntfyS…"]
  n5["Schritt Z.574 getConfig().set('workingDir', root.relativize(chi…"]
  n6["Schritt Z.575 getConfig().set('setup.completed', true);"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.configureSetup`, Quellreihenfolge.
