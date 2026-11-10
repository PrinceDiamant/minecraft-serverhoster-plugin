[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]] › [[RemoteBackupBridge.connect]] › [[RemoteBackupBridge.connect.Teil3.Z188.Teil1]]

# RemoteBackupBridge.connect.Teil3.Z188.Teil1

```mermaid
flowchart TD
  n1["RemoteBackupBridge.connectControl"]:::internal-link
  n2["if Z.191 (reply == 234)"]
  n3["RemoteBackupBridge.disconnect"]:::internal-link
  n4["RemoteBackupBridge.openFtps"]:::internal-link
  n5["return Z.193 return openFtps(settings, username, pas…"]
  n6["if Z.195 (!unsupportedAuthTls(reply))"]
  n7["RemoteBackupBridge.unsupportedAuthTls"]:::internal-link
  n8["RemoteBackupBridge.replyError"]:::internal-link
  n9["throw Z.196 throw replyError(probe, 'negotiate FTPS…"]
  n4 --> n5
  n3 --> n4
  n2 -->|"ja"| n3
  n1 --> n2
  n6 -->|"Z.195"| n7
  n8 --> n9
  n7 -->|"ja"| n8
  n5 --> n6
  n2 --> n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.connectControl
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connectControl`. Ruft `replyError`.
if Z.191 (reply == 234)
  Zeile 191: prüft `(reply == 234)`.
RemoteBackupBridge.disconnect
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Trennt `disconnect`.
RemoteBackupBridge.openFtps
  Die Sicherung über das Netz öffnet hier einen Schritt. Eine Ebene tiefer steht er genauer. Öffnet `openFtps`. Ruft `configure`, `connectControl`, `login`.
return Z.193 return openFtps(settings, username, pas…
  Zeile 193: Rückgabe `return openFtps(settings, username, pas…`.
if Z.195 (!unsupportedAuthTls(reply))
  Zeile 195: prüft `(!unsupportedAuthTls(reply))`.
RemoteBackupBridge.unsupportedAuthTls
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `unsupportedAuthTls` in `RemoteBackupBridge.java`.
RemoteBackupBridge.replyError
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet `replyError`.
throw Z.196 throw replyError(probe, 'negotiate FTPS…
  Zeile 196: Abbruch `throw replyError(probe, 'negotiate FTPS…`.
```

> [!knoten]- Was die Blöcke tun
> - **RemoteBackupBridge.connectControl**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connectControl`. Ruft `replyError`.
> - **if Z.191 (reply == 234)**: Zeile 191: prüft `(reply == 234)`.
> - **RemoteBackupBridge.disconnect**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Trennt `disconnect`.
> - **RemoteBackupBridge.openFtps**: Die Sicherung über das Netz öffnet hier einen Schritt. Eine Ebene tiefer steht er genauer. Öffnet `openFtps`. Ruft `configure`, `connectControl`, `login`.
> - **return Z.193 return openFtps(settings, username, pas…**: Zeile 193: Rückgabe `return openFtps(settings, username, pas…`.
> - **if Z.195 (!unsupportedAuthTls(reply))**: Zeile 195: prüft `(!unsupportedAuthTls(reply))`.
> - **RemoteBackupBridge.unsupportedAuthTls**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `unsupportedAuthTls` in `RemoteBackupBridge.java`.
> - **RemoteBackupBridge.replyError**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet `replyError`.
> - **throw Z.196 throw replyError(probe, 'negotiate FTPS…**: Zeile 196: Abbruch `throw replyError(probe, 'negotiate FTPS…`.

- Ein weiterer Abschnitt derselben Übersicht.
- Fortsetzung von `RemoteBackupBridge.connect.Teil3.Z188`.
