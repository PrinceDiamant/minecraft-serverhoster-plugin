[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.hostMinimizeApply]] › [[FabricLauncherPlugin.hostMinimizeApply.Teil2.Z2302]]

# FabricLauncherPlugin.hostMinimizeApply.Teil2.Z2302

```mermaid
flowchart TD
  n1["try Z.2302"]
  n2["FabricLauncherPlugin.writeHostMinimizeState"]:::internal-link
  n3["FabricLauncherPlugin.heapPrevious"]:::internal-link
  n4["catch Z.2304 (IOException e)"]
  n5["try Z.2305"]
  n6["HostMinimize.restore"]:::internal-link
  n7["FabricLauncherPlugin.getWorldRoot"]:::internal-link
  n8["catch Z.2307 (IOException restoreError)"]
  n9["throw Z.2310 throw e;"]
  n2 -->|"Z.2303"| n3
  n1 --> n2
  n1 -->|"Fehler"| n4
  n6 -->|"Z.2306"| n7
  n5 --> n6
  n5 -->|"Fehler"| n8
  n7 --> n9
  n8 --> n9
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.hostMinimizeApply.Teil2`, Quellreihenfolge.
