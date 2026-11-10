[[00 Start]] › [[Backup]] › [[Backup-Lauf]] › [[FabricLauncherPlugin.runScheduledBackup]] › [[FabricLauncherPlugin.runScheduledBackup.Z1632.Z1643.Z1649]]

# FabricLauncherPlugin.runScheduledBackup.Z1632.Z1643.Z1649

```mermaid
flowchart TD
  n1["try Z.1649"]
  n2["FabricLauncherPlugin.runScheduledBackup.Z1632.Z1643.Z1649.Z1650"]:::internal-link
  n3["FabricLauncherPlugin.runBackup"]:::internal-link
  n4["finally Z.1649"]
  n5["if Z.1662 (!target.running())"]
  n6["ChildSlot.running"]:::internal-link
  n7["if Z.1663 (restartAfter && !shuttingDown)"]
  n8["FabricLauncherPlugin.startAsync"]:::internal-link
  n2 --> n3
  n1 --> n2
  n3 --> n4
  n5 -->|"Z.1662"| n6
  n7 -->|"ja"| n8
  n6 --> n7
  n6 --> n7
  n4 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.runScheduledBackup.Z1632.Z1643`, Quellreihenfolge.
