[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.saveConfig]] › [[Dashboard.saveConfig.Teil1]]

# Dashboard.saveConfig.Teil1

```mermaid
flowchart TD
  n1["Dashboard.readBodyText"]:::internal-link
  n2["try Z.764"]
  n3["catch Z.764 (Exception e)"]
  n4["Dashboard.json"]:::internal-link
  n5["return Z.764 return;"]
  n6["Dashboard.saveConfig.Teil1.Z765"]:::internal-link
  n7["FabricLauncherPlugin.info(String)"]:::internal-link
  n2 -->|"Fehler"| n3
  n4 --> n5
  n3 --> n4
  n1 --> n2
  n2 --> n6
  n5 --> n6
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.saveConfig`, Quellreihenfolge.
