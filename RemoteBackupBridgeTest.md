[[00 Start]] › [[Tests]] › [[RemoteBackupBridgeTest]]

# RemoteBackupBridgeTest

```mermaid
flowchart TD
  n1["RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload"]:::internal-link
  n2["RemoteBackupBridgeTest.StubFtpServer.StubFtpServer"]:::internal-link
  n3["RemoteBackupBridgeTest.StubFtpServer.port"]:::internal-link
  n4["RemoteBackupBridgeTest.StubFtpServer.serve"]:::internal-link
  n5["RemoteBackupBridgeTest.StubFtpServer.serveConnection"]:::internal-link
  n6["RemoteBackupBridgeTest.StubFtpServer.ftpWriter"]:::internal-link
  n7["RemoteBackupBridgeTest.StubFtpServer.close"]:::internal-link
  n1 -->|"Z.37"| n2
  n1 -->|"Z.40"| n3
  n2 -->|"Z.82"| n4
  n4 -->|"Z.92"| n5
  n5 -->|"Z.106"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload
  `autoModeStreamsFtpBackupAndFinalizesPartialUpload` in `RemoteBackupBridgeTest.java`. Ruft `StubFtpServer`, `port`, `archive`. Nur Test.
RemoteBackupBridgeTest.StubFtpServer.StubFtpServer
  `StubFtpServer` in `RemoteBackupBridgeTest.java`. Ruft `serve`. Nur Test.
RemoteBackupBridgeTest.StubFtpServer.port
  Prüft oder liefert den Port `port`. Nur Test.
RemoteBackupBridgeTest.StubFtpServer.serve
  Liefert `serve`. Ruft `serveConnection`. Nur Test.
RemoteBackupBridgeTest.StubFtpServer.serveConnection
  Liefert `serveConnection`. Ruft `ftpWriter`. Nur Test.
RemoteBackupBridgeTest.StubFtpServer.ftpWriter
  `ftpWriter` in `RemoteBackupBridgeTest.java`. Ruft `println`. Nur Test.
RemoteBackupBridgeTest.StubFtpServer.close
  Schließt `close`. Nur Test.
```


