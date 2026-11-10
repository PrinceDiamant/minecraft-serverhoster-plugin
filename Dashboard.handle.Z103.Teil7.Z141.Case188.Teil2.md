[[00 Start]] › [[Dashboard-HTTP]] › [[HTTP-Routing]] › [[Dashboard.handle]] › [[Dashboard.handle.Z103.Teil7.Z141.Case188.Teil2]]

# Dashboard.handle.Z103.Teil7.Z141.Case188.Teil2

```mermaid
flowchart TD
  n1["BackupOptions.BackupOptions"]:::internal-link
  n2["Dashboard.requiredInt"]:::internal-link
  n3["sync Z.198"]
  n4["Schritt Z.200 pl.getConfig().set('backup.paths', options.paths(…"]
  n5["Schritt Z.201 pl.getConfig().set('backup.keep', options.keep());"]
  n6["FabricLauncherPlugin.saveConfigWritable"]:::internal-link
  n7["Dashboard.json"]:::internal-link
  n1 -->|"Z.198"| n2
  n4 --> n5
  n5 --> n6
  n3 --> n4
  n2 --> n3
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `Dashboard.handle.Z103.Teil7.Z141.Case188`, Quellreihenfolge.
