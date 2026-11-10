[[00 Start]] › [[Dashboard-HTTP]] › [[API-Setup]] › [[Dashboard.saveConfig]] › [[Dashboard.saveConfig.Teil1.Z765]]

# Dashboard.saveConfig.Teil1.Z765

```mermaid
flowchart TD
  n1["sync Z.765"]
  n2["Schritt Z.767 Files.writeString(f, txt, StandardCharsets.UTF_8);"]
  n3["FabricLauncherPlugin.makeWritable"]:::internal-link
  n4["FabricLauncherPlugin.reloadProfiles"]:::internal-link
  n2 --> n3
  n3 --> n4
  n1 --> n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
  style n4 fill:#f88,stroke:#900
```

- Fortsetzung von `Dashboard.saveConfig.Teil1`, Quellreihenfolge.
