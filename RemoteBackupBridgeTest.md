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
  n1 -->|"Zeile 37"| n2
  n1 -->|"Zeile 40"| n3
  n2 -->|"Zeile 82"| n4
  n4 -->|"Zeile 92"| n5
  n5 -->|"Zeile 106"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
RemoteBackupBridgeTest.StubFtpServer.StubFtpServer
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
RemoteBackupBridgeTest.StubFtpServer.port
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
RemoteBackupBridgeTest.StubFtpServer.serve
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
RemoteBackupBridgeTest.StubFtpServer.serveConnection
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
RemoteBackupBridgeTest.StubFtpServer.ftpWriter
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
RemoteBackupBridgeTest.StubFtpServer.close
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
```

> [!knoten] Was die Blöcke tun
> - **RemoteBackupBridgeTest.autoModeStreamsFtpBackupAndFinalizesPartialUpload**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
> - **RemoteBackupBridgeTest.StubFtpServer.StubFtpServer**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
> - **RemoteBackupBridgeTest.StubFtpServer.port**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
> - **RemoteBackupBridgeTest.StubFtpServer.serve**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
> - **RemoteBackupBridgeTest.StubFtpServer.serveConnection**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
> - **RemoteBackupBridgeTest.StubFtpServer.ftpWriter**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.
> - **RemoteBackupBridgeTest.StubFtpServer.close**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server.

- [[Glossar#Probelauf|Probelauf]] für die [[Glossar#Sicherungskopie|Sicherungskopie]] über das Netz.
