[[00 Start]] › [[Tests]] › [[RemoteBackupBridgeTest]] › [[RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload]] › [[RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37.Teil3]]

# RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37.Teil3

```mermaid
flowchart TD
  n1["Schritt Z.63 Files.createDirectories(restore);"]
  n2["BackupBridge.restoreZip"]:::internal-link
  n3["Schritt Z.65 assertEquals('world-data', Files.readString(resto…"]
  n4["RemoteBackupBridge.delete"]:::internal-link
  n5["RemoteBackupBridge.list"]:::internal-link
  n6["Schritt Z.68 assertFalse(Files.exists(work.resolve('backups'))…"]
  n1 --> n2
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n5 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37`, Quellreihenfolge.
