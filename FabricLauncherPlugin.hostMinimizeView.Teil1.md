[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.hostMinimizeView]] › [[FabricLauncherPlugin.hostMinimizeView.Teil1]]

# FabricLauncherPlugin.hostMinimizeView.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.readHostMinimizeState"]:::internal-link
  n2["FabricLauncherPlugin.configuredHostWorld"]:::internal-link
  n3["HostMinimize.preview"]:::internal-link
  n4["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n5["FabricLauncherPlugin.hostProtectedPaths"]:::internal-link
  n1 --> n2
  n3 -->|"Z.2232"| n4
  n4 -->|"Z.2232"| n5
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.hostMinimizeView`, Quellreihenfolge.
