[[00 Start]] › [[Host-Betrieb]] › [[Host-Minimieren]] › [[Host-Minimieren.Teil1]] › [[FabricLauncherPlugin.hostMinimizeRollback]] › [[FabricLauncherPlugin.hostMinimizeRollback.Teil1]]

# FabricLauncherPlugin.hostMinimizeRollback.Teil1

```mermaid
flowchart TD
  n1["if Z.2320 (!HostMinimize.ROLLBACK_CONFIRM.equals(confirm))"]
  n2["throw Z.2321 throw new IllegalArgumentException('Die Bestätigu…"]
  n3["FabricLauncherPlugin.readHostMinimizeState"]:::internal-link
  n4["if Z.2324 (relative.isBlank())"]
  n5["throw Z.2324 throw new IllegalStateException('Es gibt keine Ho…"]
  n6["if Z.2326 (!backup.startsWith(getDataFolder().toPath().toAb…"]
  n7["throw Z.2327 throw new SecurityException('Die Sicherung liegt …"]
  n1 -->|"ja"| n2
  n2 --> n3
  n1 --> n3
  n4 -->|"ja"| n5
  n3 --> n4
  n6 -->|"ja"| n7
  n5 --> n6
  n4 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.hostMinimizeRollback`, Quellreihenfolge.
