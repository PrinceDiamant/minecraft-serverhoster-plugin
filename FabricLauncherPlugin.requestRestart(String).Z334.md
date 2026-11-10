[[00 Start]] › [[Plugin-Kern]] › [[Slot-Aktionen]] › [[FabricLauncherPlugin.requestRestart(String)]] › [[FabricLauncherPlugin.requestRestart(String).Z334]]

# FabricLauncherPlugin.requestRestart(String).Z334

```mermaid
flowchart TD
  n1["Schritt Z.334 exec.submit(() -) ( ChildSlot s = slot(id); s.wan…"]
  n2["FabricLauncherPlugin.slot"]:::internal-link
  n3["FabricLauncherPlugin.stopBlocking"]:::internal-link
  n4["FabricLauncherPlugin.reloadProfiles"]:::internal-link
  n5["FabricLauncherPlugin.startAsync"]:::internal-link
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n4 fill:#f88,stroke:#900
```

- Fortsetzung von `FabricLauncherPlugin.requestRestart(String)`, Quellreihenfolge.
