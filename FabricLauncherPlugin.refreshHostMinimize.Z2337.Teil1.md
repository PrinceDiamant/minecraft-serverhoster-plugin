[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil2]] › [[FabricLauncherPlugin.refreshHostMinimize]] › [[FabricLauncherPlugin.refreshHostMinimize.Z2337.Teil1]]

# FabricLauncherPlugin.refreshHostMinimize.Z2337.Teil1

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.readHostMinimizeState"]:::internal-link
  n2["if Z.2339 (!'staged'.equals(state.get('status')) && !'activ…"]
  n3["return Z.2339 return;"]
  n4["if Z.2341 (!HostMinimize.worldNameSafe(worldName))"]
  n5["HostMinimize.worldNameSafe"]:::internal-link
  n6["return Z.2341 return;"]
  n7["for Z.2342 (HostHeapTune.Result result : HostHeapT…"]
  n8["HostHeapTune.apply"]:::internal-link
  n9["HostHeapTune.hotspot"]:::internal-link
  n2 -->|"ja"| n3
  n1 --> n2
  n4 -->|"Z.2341"| n5
  n5 -->|"ja"| n6
  n3 --> n4
  n2 --> n4
  n7 -->|"Z.2342"| n8
  n8 -->|"Z.2342"| n9
  n6 --> n7
  n5 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.refreshHostMinimize.Z2337`, Quellreihenfolge.
