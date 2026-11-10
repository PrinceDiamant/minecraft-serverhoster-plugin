[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[Session]] › [[RemoteBackupBridge.Session.close]] › [[RemoteBackupBridge.Session.close.Teil1]]

# RemoteBackupBridge.Session.close.Teil1

```mermaid
flowchart TD
  n1["if Z.35 (!client.isConnected())"]
  n2["return Z.35 return;"]
  n3["try Z.37"]
  n4["if Z.39 (!FTPReply.isPositiveCompletion(client.getReplyCo…"]
  n5["RemoteBackupBridge.replyError"]:::internal-link
  n6["catch Z.40 (IOException e)"]
  n1 -->|"ja"| n2
  n4 -->|"ja"| n5
  n3 --> n4
  n3 -->|"Fehler"| n6
  n2 --> n3
  n1 --> n3
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
if Z.35 (!client.isConnected())
  Zeile 35: prüft `(!client.isConnected())`.
return Z.35 return;
  Zeile 35: Rückgabe `return;`.
try Z.37
  Zeile 37: Versuch. Der Fehlerpfad geht in catch.
if Z.39 (!FTPReply.isPositiveCompletion(client.getReplyCo…
  Zeile 39: prüft `(!FTPReply.isPositiveCompletion(client.getReplyCo…`.
RemoteBackupBridge.replyError
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet `replyError`.
catch Z.40 (IOException e)
  Zeile 40: fängt (IOException e).
```

> [!knoten]- Was die Blöcke tun
> - **if Z.35 (!client.isConnected())**: Zeile 35: prüft `(!client.isConnected())`.
> - **return Z.35 return;**: Zeile 35: Rückgabe `return;`.
> - **try Z.37**: Zeile 37: Versuch. Der Fehlerpfad geht in catch.
> - **if Z.39 (!FTPReply.isPositiveCompletion(client.getReplyCo…**: Zeile 39: prüft `(!FTPReply.isPositiveCompletion(client.getReplyCo…`.
> - **RemoteBackupBridge.replyError**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet `replyError`.
> - **catch Z.40 (IOException e)**: Zeile 40: fängt (IOException e).

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `RemoteBackupBridge.Session.close`.
