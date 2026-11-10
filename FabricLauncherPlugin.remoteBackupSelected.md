[[00 Start]] › [[Backup]] › [[Backup-Lauf]] › [[FabricLauncherPlugin.remoteBackupSelected]]

# FabricLauncherPlugin.remoteBackupSelected

`FabricLauncherPlugin.remoteBackupSelected()` [src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java:1464–1472](https://github.com/Sciddie/minecraft-serverhoster-plugin/blob/95b02b953b0b4c23673e900e021a7c3c844aa37d/src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java#L1464-L1472)

```mermaid
flowchart TD
  n1["Schritt Z.1465 String storage = getConfig().getString('backup.st…"]
  n2["if Z.1466 (storage == null)"]
  n3["return Z.1467 return switch (storage.trim().toLowerCase(Locale.…"]
  n1 --> n2
  n2 --> n3
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- `remoteBackupSelected` in `src/main/java/de/aichele/childlauncher/FabricLauncherPlugin.java`
