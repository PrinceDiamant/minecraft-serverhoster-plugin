[[00 Start]] › [[Tests]] › [[RemoteBackupBridgeTest]] › [[RemoteBackupBridgeTest.StubFtpServer.serveConnection]] › [[RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Case154.Z156.Z159]]

# RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Case154.Z156.Z159

```mermaid
flowchart TD
  n1["for Z.159 (Map.Entry(String, byte()) entry : file…"]
  n2["if Z.160 (!entry.getKey().startsWith(prefix))"]
  n3["if Z.162 (name.contains('/'))"]
  n2 --> n3
  n2 --> n3
  n1 -->|"wiederholen"| n2
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
for Z.159 (Map.Entry(String, byte()) entry : file…
  Zeile 159: Schleife `(Map.Entry(String, byte()) entry : file…`.
if Z.160 (!entry.getKey().startsWith(prefix))
  Zeile 160: prüft `(!entry.getKey().startsWith(prefix))`.
if Z.162 (name.contains('/'))
  Zeile 162: prüft `(name.contains('/'))`.
```

> [!knoten]- Was die Blöcke tun
> - **for Z.159 (Map.Entry(String, byte()) entry : file…**: Zeile 159: Schleife `(Map.Entry(String, byte()) entry : file…`.
> - **if Z.160 (!entry.getKey().startsWith(prefix))**: Zeile 160: prüft `(!entry.getKey().startsWith(prefix))`.
> - **if Z.162 (name.contains('/'))**: Zeile 162: prüft `(name.contains('/'))`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 159 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `RemoteBackupBridgeTest.StubFtpServer.serveConnection.Z104.Z113.Z117.Case154.Z156`.
