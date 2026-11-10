[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.openFtp]] › [[RemoteBackupBridge.openFtp.Z228]]

# RemoteBackupBridge.openFtp.Z228

```mermaid
flowchart TD
  n1["try Z.228"]
  n2["RemoteBackupBridge.connectControl"]:::internal-link
  n3["RemoteBackupBridge.warnPlainFtp"]:::internal-link
  n4["RemoteBackupBridge.login"]:::internal-link
  n5["return Z.232 return new Session(client, false);"]
  n6["catch Z.233 (IOException / RuntimeExcepti…"]
  n7["RemoteBackupBridge.disconnectAfterFailure"]:::internal-link
  n8["throw Z.235 throw e;"]
  n2 --> n3
  n3 --> n4
  n4 --> n5
  n1 --> n2
  n1 -->|"Fehler"| n6
  n7 --> n8
  n6 --> n7
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
try Z.228
  Zeile 228: Versuch. Der Fehlerpfad geht in catch.
RemoteBackupBridge.connectControl
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connectControl`. Ruft `replyError`.
RemoteBackupBridge.warnPlainFtp
  Die Sicherung über das Netz warnt vor die Übertragung. Warnt `warnPlainFtp`.
RemoteBackupBridge.login
  Die Sicherung über das Netz meldet an bei das. Meldet an `login`. Ruft `replyError`.
return Z.232 return new Session(client, false);
  Zeile 232: Rückgabe `return new Session(client, false);`.
catch Z.233 (IOException / RuntimeExcepti…
  Zeile 233: fängt (IOException / RuntimeExcepti….
RemoteBackupBridge.disconnectAfterFailure
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Trennt `disconnectAfterFailure`. Ruft `disconnect`.
throw Z.235 throw e;
  Zeile 235: Abbruch `throw e;`.
```

> [!knoten]- Was die Blöcke tun
> - **try Z.228**: Zeile 228: Versuch. Der Fehlerpfad geht in catch.
> - **RemoteBackupBridge.connectControl**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connectControl`. Ruft `replyError`.
> - **RemoteBackupBridge.warnPlainFtp**: Die Sicherung über das Netz warnt vor die Übertragung. Warnt `warnPlainFtp`.
> - **RemoteBackupBridge.login**: Die Sicherung über das Netz meldet an bei das. Meldet an `login`. Ruft `replyError`.
> - **return Z.232 return new Session(client, false);**: Zeile 232: Rückgabe `return new Session(client, false);`.
> - **catch Z.233 (IOException / RuntimeExcepti…**: Zeile 233: fängt (IOException / RuntimeExcepti….
> - **RemoteBackupBridge.disconnectAfterFailure**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Trennt `disconnectAfterFailure`. Ruft `disconnect`.
> - **throw Z.235 throw e;**: Zeile 235: Abbruch `throw e;`.

- Der Ablauf geht in [[Glossar#Zeile|Zeile]] 228 weiter. Eine Ebene tiefer steht er genauer.
- Fortsetzung von `RemoteBackupBridge.openFtp`.
