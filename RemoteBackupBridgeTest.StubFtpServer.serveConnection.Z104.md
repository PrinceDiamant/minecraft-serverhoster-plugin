[[00 Start]] › [[Tests]] › [[RemoteBackupBridgeTest]] › [[RemoteBackupBridgeTest.StubFtpServer.serveConnection]] › [[RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104]]

# RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104

```mermaid
flowchart TD
  n1["try Z.104"]
  n2["RemoteBackupBridgeTest.StubFtpServer.ftpWriter"]:::internal-link
  n3["RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113"]:::internal-link
  n4["if Z.208 (data != null)"]
  n1 -->|"Z.106"| n2
  n3 --> n4
  n2 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.104
  Zeile 104: Versuch. Der Fehlerpfad geht in catch.
RemoteBackupBridgeTest.StubFtpServer.ftpWriter
  Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `ftpWriter` in `RemoteBackupBridgeTest.java`. Ruft `println`. Nur Test.
RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113
  Der Ablauf geht in [[Glossar#Zeile|Zeile]] 113 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 113.
if Z.208 (data != null)
  Zeile 208: prüft `(data != null)`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.104**: Zeile 104: Versuch. Der Fehlerpfad geht in catch.
> - **RemoteBackupBridgeTest.StubFtpServer.ftpWriter**: Ein Schritt in einem [[Glossar#Probelauf|Probelauf]]. Er gehört nicht zum laufenden Server. `ftpWriter` in `RemoteBackupBridgeTest.java`. Ruft `println`. Nur Test.
> - **RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113**: Der Ablauf geht in [[Glossar#Zeile|Zeile]] 113 weiter. Eine Ebene tiefer steht er genauer. Fortsetzung des Ablaufs ab Zeile 113.
> - **if Z.208 (data != null)**: Zeile 208: prüft `(data != null)`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 104 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `RemoteBackupBridgeTest.StubFtpServer.serveConnection`.
