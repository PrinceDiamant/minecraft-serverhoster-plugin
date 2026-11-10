[[00 Start]] › [[Tests]] › [[RemoteBackupBridgeTest]] › [[RemoteBackupBridgeTest.StubFtpServer.serveConnection]] › [[RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Cases171]]

# RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Cases171

```mermaid
flowchart TD
  n1["case Z.171 'RETR'"]
  n2["RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Case171"]:::internal-link
  n3["case Z.187 'DELE'"]
  n4["case Z.189 'RNFR'"]
  n5["case Z.193 'RNTO'"]
  n6["RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Case193"]:::internal-link
  n7["case Z.201 'QUIT'"]
  n8["return Z.203 return;"]
  n1 --> n2
  n5 --> n6
  n7 --> n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117`, Quellreihenfolge.
