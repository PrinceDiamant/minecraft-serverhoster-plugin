[[00 Start]] › [[Plugin-Kern]] › [[Properties]] › [[FabricLauncherPlugin.syncPropertiesEdit]] › [[FabricLauncherPlugin.syncPropertiesEdit.Teil3]]

# FabricLauncherPlugin.syncPropertiesEdit.Teil3

```mermaid
flowchart TD
  n1["if Z.362 (changed)"]
  n2["FabricLauncherPlugin.saveConfigWritable"]:::internal-link
  n3["FabricLauncherPlugin.reloadProfiles"]:::internal-link
  n4["return Z.363 return changed;"]
  n2 --> n3
  n1 -->|"ja"| n2
  n3 --> n4
  n1 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
```

- Fortsetzung von `FabricLauncherPlugin.syncPropertiesEdit`, Quellreihenfolge.
