[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]] › [[FabricLauncherPlugin.onEnable]] › [[FabricLauncherPlugin.onEnable.Teil3.Z128]]

# FabricLauncherPlugin.onEnable.Teil3.Z128

```mermaid
flowchart TD
  n1["if Z.128 (getConfig().getBoolean('dashboard.enabled', true…"]
  n2["try Z.129"]
  n3["Dashboard.Dashboard"]:::internal-link
  n4["Dashboard.start"]:::internal-link
  n5["catch Z.130 (Exception e)"]
  n3 --> n4
  n2 --> n3
  n2 -->|"Fehler"| n5
  n1 -->|"ja"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.onEnable.Teil3`, Quellreihenfolge.
