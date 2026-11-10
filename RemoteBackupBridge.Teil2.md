[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil2]]

# RemoteBackupBridge.Teil2

```mermaid
flowchart TD
  n1["RemoteBackupBridge.connect"]:::internal-link
  n2["RemoteBackupBridge.openFtps"]:::internal-link
  n3["RemoteBackupBridge.openFtp"]:::internal-link
  n4["RemoteBackupBridge.connectControl"]:::internal-link
  n5["RemoteBackupBridge.login"]:::internal-link
  n6["RemoteBackupBridge.configure"]:::internal-link
  n7["RemoteBackupBridge.enterDirectory"]:::internal-link
  n8["RemoteBackupBridge.enterBaseDirectory"]:::internal-link
  n1 -->|"Z.182"| n2
  n1 -->|"Z.183"| n3
  n1 -->|"Z.187"| n6
  n1 -->|"Z.189"| n4
  n1 -->|"Z.199"| n5
  n2 -->|"Z.210"| n6
  n2 -->|"Z.212"| n4
  n2 -->|"Z.213"| n5
  n3 -->|"Z.227"| n6
  n3 -->|"Z.229"| n4
  n3 -->|"Z.231"| n5
  n7 -->|"Z.258"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.connect
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connect`. Ruft `validateCredentials`, `openFtps`, `openFtp`.
RemoteBackupBridge.openFtps
  Die Sicherung über das Netz öffnet hier einen Schritt. Eine Ebene tiefer steht er genauer. Öffnet `openFtps`. Ruft `configure`, `connectControl`, `login`.
RemoteBackupBridge.openFtp
  Die Sicherung über das Netz öffnet die Übertragung. Öffnet `openFtp`. Ruft `configure`, `connectControl`, `warnPlainFtp`.
RemoteBackupBridge.connectControl
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connectControl`. Ruft `replyError`.
RemoteBackupBridge.login
  Die Sicherung über das Netz meldet an bei das. Meldet an `login`. Ruft `replyError`.
RemoteBackupBridge.configure
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `configure` in `RemoteBackupBridge.java`.
RemoteBackupBridge.enterDirectory
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Wechselt hinein `enterDirectory`. Ruft `enterBaseDirectory`, `replyError`.
RemoteBackupBridge.enterBaseDirectory
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Wechselt hinein `enterBaseDirectory`. Ruft `hasControlCharacter`, `replyError`.
```

> [!knoten]- Was die Blöcke tun
> - **RemoteBackupBridge.connect**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connect`. Ruft `validateCredentials`, `openFtps`, `openFtp`.
> - **RemoteBackupBridge.openFtps**: Die Sicherung über das Netz öffnet hier einen Schritt. Eine Ebene tiefer steht er genauer. Öffnet `openFtps`. Ruft `configure`, `connectControl`, `login`.
> - **RemoteBackupBridge.openFtp**: Die Sicherung über das Netz öffnet die Übertragung. Öffnet `openFtp`. Ruft `configure`, `connectControl`, `warnPlainFtp`.
> - **RemoteBackupBridge.connectControl**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connectControl`. Ruft `replyError`.
> - **RemoteBackupBridge.login**: Die Sicherung über das Netz meldet an bei das. Meldet an `login`. Ruft `replyError`.
> - **RemoteBackupBridge.configure**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `configure` in `RemoteBackupBridge.java`.
> - **RemoteBackupBridge.enterDirectory**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Wechselt hinein `enterDirectory`. Ruft `enterBaseDirectory`, `replyError`.
> - **RemoteBackupBridge.enterBaseDirectory**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Wechselt hinein `enterBaseDirectory`. Ruft `hasControlCharacter`, `replyError`.

- Ein weiterer Abschnitt derselben Übersicht.
