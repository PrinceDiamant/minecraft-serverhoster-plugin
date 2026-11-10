[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil3]]

# RemoteBackupBridge.Teil3

```mermaid
flowchart TD
  n1["RemoteBackupBridge.retain"]:::internal-link
  n2["RemoteBackupBridge.remotePath"]:::internal-link
  n3["RemoteBackupBridge.validateCredentials"]:::internal-link
  n4["RemoteBackupBridge.hasControlCharacter"]:::internal-link
  n5["RemoteBackupBridge.replyError"]:::internal-link
  n6["RemoteBackupBridge.disconnect"]:::internal-link
  n7["RemoteBackupBridge.disconnectAfterFailure"]:::internal-link
  n1 -->|"Z.287"| n5
  n3 -->|"Z.299"| n4
  n7 -->|"Z.324"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.retain
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Behält die letzten Stücke `retain`. Ruft `named`, `replyError`.
RemoteBackupBridge.remotePath
  Die Sicherung über das Netz kümmert sich um den Pfad. `remotePath` in `RemoteBackupBridge.java`.
RemoteBackupBridge.validateCredentials
  Die Sicherung über das Netz prüft die Zugangsdaten. Prüft `validateCredentials`. Ruft `hasControlCharacter`.
RemoteBackupBridge.hasControlCharacter
  Die Sicherung über das Netz prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `hasControlCharacter`.
RemoteBackupBridge.replyError
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet `replyError`.
RemoteBackupBridge.disconnect
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Trennt `disconnect`.
RemoteBackupBridge.disconnectAfterFailure
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Trennt `disconnectAfterFailure`. Ruft `disconnect`.
```

> [!knoten]- Was die Blöcke tun
> - **RemoteBackupBridge.retain**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Behält die letzten Stücke `retain`. Ruft `named`, `replyError`.
> - **RemoteBackupBridge.remotePath**: Die Sicherung über das Netz kümmert sich um den Pfad. `remotePath` in `RemoteBackupBridge.java`.
> - **RemoteBackupBridge.validateCredentials**: Die Sicherung über das Netz prüft die Zugangsdaten. Prüft `validateCredentials`. Ruft `hasControlCharacter`.
> - **RemoteBackupBridge.hasControlCharacter**: Die Sicherung über das Netz prüft hier einen Schritt. Eine Ebene tiefer steht er genauer. Prüft `hasControlCharacter`.
> - **RemoteBackupBridge.replyError**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Antwortet `replyError`.
> - **RemoteBackupBridge.disconnect**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Trennt `disconnect`.
> - **RemoteBackupBridge.disconnectAfterFailure**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Trennt `disconnectAfterFailure`. Ruft `disconnect`.

- Ein weiterer Abschnitt derselben Übersicht.
