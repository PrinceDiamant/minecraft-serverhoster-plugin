[[00 Start]] › [[Tests]] › [[RemoteBackupBridgeTest]] › [[RemoteBackupBridgeTest.StubFtpServer.serve]] › [[RemoteBackupBridgeTest.StubFtpServer.serve.Z90.Z91]]

# RemoteBackupBridgeTest.StubFtpServer.serve.Z90.Z91

```mermaid
flowchart TD
  n1["try Z.91"]
  n2["RemoteBackupBridgeTest.StubFtpServer.serveConnection"]:::internal-link
  n3["catch Z.93 (SocketException e)"]
  n4["if Z.94 (!control.isClosed())"]
  n5["return Z.95 return;"]
  n6["catch Z.96 (IOException e)"]
  n7["if Z.97 (!control.isClosed())"]
  n8["return Z.98 return;"]
  n1 --> n2
  n1 -->|"Fehler"| n3
  n4 --> n5
  n4 --> n5
  n3 --> n4
  n1 -->|"Fehler"| n6
  n7 --> n8
  n7 --> n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

- Fortsetzung von `RemoteBackupBridgeTest.StubFtpServer.serve.Z90`, Quellreihenfolge.
