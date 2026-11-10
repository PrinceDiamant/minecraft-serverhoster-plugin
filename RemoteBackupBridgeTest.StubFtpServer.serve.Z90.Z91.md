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

```knoten
try Z.91
  Zeile 91: Versuch. Der Fehlerpfad geht in catch.
RemoteBackupBridgeTest.StubFtpServer.serveConnection
  Liefert `serveConnection`. Ruft `ftpWriter`. Nur Test.
catch Z.93 (SocketException e)
  Zeile 93: fängt (SocketException e).
if Z.94 (!control.isClosed())
  Zeile 94: prüft `(!control.isClosed())`.
return Z.95 return;
  Zeile 95: Rückgabe `return;`.
catch Z.96 (IOException e)
  Zeile 96: fängt (IOException e).
if Z.97 (!control.isClosed())
  Zeile 97: prüft `(!control.isClosed())`.
return Z.98 return;
  Zeile 98: Rückgabe `return;`.
```

- Fortsetzung von `RemoteBackupBridgeTest.StubFtpServer.serve.Z90`, Quellreihenfolge.
