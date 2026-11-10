[[00 Start]] › [[Backup]] › [[Backup-Lauf]] › [[FabricLauncherPlugin.testBackup]]

# FabricLauncherPlugin.testBackup

`FabricLauncherPlugin.testBackup()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1393–1412](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1393-L1412)

```mermaid
flowchart TD
  n1["FabricLauncherPlugin.backupSpec"]:::internal-link
  n2["FabricLauncherPlugin.testBackup.Z1396"]:::internal-link
  n3["if Z.1407 (spec.dbEnabled())"]
  n4["BackupBridge.test"]:::internal-link
  n5["return Z.1411 return transport;"]
  n1 --> n2
  n3 -->|"ja"| n4
  n2 --> n3
  n4 --> n5
  n3 --> n5
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `testBackup` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
