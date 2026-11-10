[[00 Start]] › [[Tests]] › [[RemoteBackupBridgeTest]] › [[RemoteBackupBridgeTest.StubFtpServer.serveConnection]] › [[RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Case154.Z156]]

# RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Case154.Z156

```mermaid
flowchart TD
  n1["try Z.156"]
  n2["RemoteBackupBridgeTest.StubFtpServer.ftpWriter"]:::internal-link
  n3["RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Case154.Z156.Z159"]:::internal-link
  n4["finally Z.156"]
  n1 -->|"Z.157"| n2
  n2 --> n3
  n3 --> n4
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.156
  Zeile 156: Versuch. Der Fehlerpfad geht in catch.
RemoteBackupBridgeTest.StubFtpServer.ftpWriter
  `ftpWriter` in `RemoteBackupBridgeTest.java`. Ruft `println`. Nur Test.
RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Case154.Z156.Z159
  Fortsetzung des Ablaufs ab Zeile 159.
finally Z.156
  Läuft danach immer, auch nach einem Fehler.
```

- Fortsetzung von `RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Case154`, Quellreihenfolge.
