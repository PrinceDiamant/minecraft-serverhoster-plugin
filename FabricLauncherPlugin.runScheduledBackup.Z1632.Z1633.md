[[00 Start]] › [[Backup]] › [[Backup-Lauf]] › [[FabricLauncherPlugin.runScheduledBackup]] › [[FabricLauncherPlugin.runScheduledBackup.Z1632.Z1633]]

# FabricLauncherPlugin.runScheduledBackup.Z1632.Z1633

```mermaid
flowchart TD
  n1["while Z.1633 (target.running() && !target.onlinePlay…"]
  n2["ChildSlot.running"]:::internal-link
  n3["if Z.1634 (shuttingDown)"]
  n4["throw Z.1634 throw new InterruptedException('plugin is shuttin…"]
  n5["FabricLauncherPlugin.runScheduledBackup.Z1632.Z1633.Z1635"]:::internal-link
  n6["Schritt Z.1642 Thread.sleep(TimeUnit.SECONDS.toMillis(30));"]
  n1 -->|"Z.1633"| n2
  n3 -->|"ja"| n4
  n4 --> n5
  n3 --> n5
  n5 --> n6
  n2 -->|"wiederholen"| n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.runScheduledBackup.Z1632`, Quellreihenfolge.
