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

```knoten
FabricLauncherPlugin.onLoad
  Spigot `onLoad`: Marker `HostFirstSetup`, bevor Welten laden.
FabricLauncherPlugin.onEnable
  Spigot `onEnable`: Profile, Sampler, Dashboard, fünf Scheduler. Befund: Logikrisiko (sicher).
FabricLauncherPlugin.migrateRestartPolicy
  Übernimmt den alten Wert von `migrateRestartPolicy`. Ruft `migrateLegacyUnlimited`, `migrateLegacyRestartPolicy`, `saveConfigWritable`.
FabricLauncherPlugin.migrateLegacyRestartPolicy
  Übernimmt den alten Wert von `migrateLegacyRestartPolicy`. Ruft `migrateLegacyUnlimited`.
FabricLauncherPlugin.onDisable
  Spigot `onDisable`: Child stoppen, Dashboard stoppen, Pool `shutdownNow`.
FabricLauncherPlugin.makeWritable
  Setzt POSIX `rwxrwxrwx` für Ordner und `rw-rw-rw-` für Dateien. Befund: Logikrisiko (sicher).
FabricLauncherPlugin.saveConfigWritable
  Speichert `saveConfigWritable`. Ruft `makeWritable`.
FabricLauncherPlugin.warnOnce
  Warnt `warnOnce`.
```

- Spigot ruft `onLoad`, `onEnable`, `onDisable`.
- Threads: `ServerhosterPlugin`, `-Save`, `-Memory`, `-Supervisor`, `-ShutdownHook`.
