[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil5]]

# FabricLauncherPlugin.onEnable.Teil5

```mermaid
flowchart TD
  n1["Schritt Z.154 memorySched.scheduleAtFixedRate(() -) ( try ( sam…"]
  n2["try Z.155"]
  n3["FabricLauncherPlugin.sampleHostMemory"]:::internal-link
  n4["catch Z.156 (Throwable t)"]
  n5["Schritt Z.158 healthSched.scheduleAtFixedRate(() -) ( try ( rec…"]
  n6["try Z.159"]
  n7["FabricLauncherPlugin.recoverChildSupervision"]:::internal-link
  n8["catch Z.160 (Throwable t)"]
  n9["FabricLauncherPlugin.onEnable.Teil5.Z162"]:::internal-link
  n2 --> n3
  n2 -->|"Fehler"| n4
  n1 --> n2
  n6 --> n7
  n6 -->|"Fehler"| n8
  n5 --> n6
  n3 --> n5
  n4 --> n5
  n7 --> n9
  n8 --> n9
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
```

- Fortsetzung von `FabricLauncherPlugin.onEnable`, Quellreihenfolge.
