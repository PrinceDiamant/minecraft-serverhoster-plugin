[[00 Start]] › [[Plugin-Kern]] › [[Lebenszyklus]]

# Lebenszyklus

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.onLoad"]:::internal-link
  n2["FabricLauncherPlugin.onEnable"]:::internal-link
  n3["FabricLauncherPlugin.migrateRestartPolicy"]:::internal-link
  n4["FabricLauncherPlugin.migrateLegacyRestartPolicy"]:::internal-link
  n5["FabricLauncherPlugin.onDisable"]:::internal-link
  n6["FabricLauncherPlugin.makeWritable"]:::internal-link
  n7["FabricLauncherPlugin.saveConfigWritable"]:::internal-link
  n8["FabricLauncherPlugin.warnOnce"]:::internal-link
  n2 -->|"Z.115"| n3
  n2 -->|"Z.122"| n6
  n3 -->|"Z.185"| n4
  n3 -->|"Z.188"| n7
  n7 -->|"Z.248"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
  style n6 fill:#f88,stroke:#900
```

- Spigot ruft `onLoad`, `onEnable`, `onDisable`.
- Threads: `ServerhosterPlugin`, `-Save`, `-Memory`, `-Supervisor`, `-ShutdownHook`.
