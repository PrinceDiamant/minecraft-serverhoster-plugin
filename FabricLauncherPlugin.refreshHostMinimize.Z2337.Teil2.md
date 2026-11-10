[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil2]] › [[FabricLauncherPlugin.refreshHostMinimize]] › [[FabricLauncherPlugin.refreshHostMinimize.Z2337.Teil2]]

# FabricLauncherPlugin.refreshHostMinimize.Z2337.Teil2

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n2["if Z.2346 (Files.isRegularFile(properties, LinkOption.NOFOL…"]
  n3["for Z.2347 (String line : Files.readAllLines(prope…"]
  n4["if Z.2348 (line.startsWith('level-name='))"]
  n5["HostFirstSetup.readState"]:::internal-link
  n6["FabricLauncherPlugin.hostFirstSetupMarker"]:::internal-link
  n3 -->|"wiederholen"| n4
  n2 -->|"ja"| n3
  n1 --> n2
  n5 -->|"Z.2351"| n6
  n4 --> n5
  n4 --> n5
  n2 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.refreshHostMinimize.Z2337`, Quellreihenfolge.
