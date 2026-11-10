[[00 Start]] › [[Backup]] › [[Backup-Dateien]]

# Backup-Dateien

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.backupFiles"]:::internal-link
  n2["FabricLauncherPlugin.backupFile"]:::internal-link
  n3["FabricLauncherPlugin.downloadBackup"]:::internal-link
  n4["FabricLauncherPlugin.deleteBackup"]:::internal-link
  n5["FabricLauncherPlugin.restoreBackup"]:::internal-link
  n1 -->|"Quelltext"| n2
  n2 -->|"Quelltext"| n3
  n3 -->|"Quelltext"| n4
  n4 -->|"Quelltext"| n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n2 fill:#f88,stroke:#900
```


