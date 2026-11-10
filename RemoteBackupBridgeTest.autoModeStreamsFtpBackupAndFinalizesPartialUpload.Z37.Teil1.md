[[00 Start]] › [[Tests]] › [[RemoteBackupBridgeTest]] › [[RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload]] › [[RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37.Teil1]]

# RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37.Teil1

```mermaid
flowchart TD
  n1["RemoteBackupBridgeTest.StubFtpServer.port"]:::internal-link
  n2["RemoteBackupBridge.archive"]:::internal-link
  n3["RemoteBackupBridge.list"]:::internal-link
  n1 --> n2
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridgeTest.StubFtpServer.port
  Prüft oder liefert den Port `port`. Nur Test.
RemoteBackupBridge.archive
  Packt `archive`. Ruft `open`, `safeId`, `connect`.
RemoteBackupBridge.list
  Listet `list`. Ruft `safeId`, `connect`, `enterDirectory`.
```

- Fortsetzung von `RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload.Z37`, Quellreihenfolge.
