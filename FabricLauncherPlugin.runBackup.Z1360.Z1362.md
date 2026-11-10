[[00 Start]] › [[Backup]] › [[Backup-Lauf]] › [[FabricLauncherPlugin.runBackup]] › [[FabricLauncherPlugin.runBackup.Z1360.Z1362]]

# FabricLauncherPlugin.runBackup.Z1360.Z1362

```mermaid
flowchart TD
  n1["try Z.1362"]
  n2["if Z.1363 (s.running())"]
  n3["ChildSlot.running"]:::internal-link
  n4["FabricLauncherPlugin.send"]:::internal-link
  n5["Schritt Z.1365 Thread.sleep(Math.max(0, getConfig().getInt('back…"]
  n6["FabricLauncherPlugin.backupSpec"]:::internal-link
  n7["FabricLauncherPlugin.runBackup.Z1360.Z1362.Z1368"]:::internal-link
  n8["ConsoleBuffer.add"]:::internal-link
  n9["return Z.1385 return lastBackup;"]
  n10["catch Z.1386 (Exception e)"]
  n11["FabricLauncherPlugin.notifyNtfy"]:::internal-link
  n12["throw Z.1388 throw e;"]
  n2 -->|"Z.1363"| n3
  n4 --> n5
  n3 -->|"ja"| n4
  n5 --> n6
  n3 --> n6
  n6 --> n7
  n7 --> n8
  n8 --> n9
  n1 --> n2
  n1 -->|"Fehler"| n10
  n11 --> n12
  n10 --> n11
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `FabricLauncherPlugin.runBackup.Z1360`, Quellreihenfolge.
