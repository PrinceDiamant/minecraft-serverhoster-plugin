[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[RemoteBackupBridge]] › [[RemoteBackupBridge.Teil1]]

# RemoteBackupBridge.Teil1

```mermaid
flowchart TD
  n1["RemoteBackupBridge.warnPlainFtp"]:::internal-link
  n2["RemoteBackupBridge.RemoteBackupBridge"]:::internal-link
  n3["RemoteBackupBridge.test"]:::internal-link
  n4["RemoteBackupBridge.list"]:::internal-link
  n5["RemoteBackupBridge.archive"]:::internal-link
  n6["RemoteBackupBridge.download"]:::internal-link
  n7["RemoteBackupBridge.delete"]:::internal-link
  n8["RemoteBackupBridge.unsupportedAuthTls"]:::internal-link
  n1 -->|"Kapitel im Text"| n2
  n2 -->|"Kapitel im Text"| n3
  n3 -->|"Kapitel im Text"| n4
  n4 -->|"Kapitel im Text"| n5
  n5 -->|"Kapitel im Text"| n6
  n6 -->|"Kapitel im Text"| n7
  n7 -->|"Kapitel im Text"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
RemoteBackupBridge.warnPlainFtp
  Die Sicherung über das Netz warnt vor die Übertragung. Warnt `warnPlainFtp`.
RemoteBackupBridge.RemoteBackupBridge
  Die Sicherung über das Netz sichert hier einen Schritt. Eine Ebene tiefer steht er genauer. `RemoteBackupBridge` in `RemoteBackupBridge.java`.
RemoteBackupBridge.test
  Die Sicherung über das Netz prüft das. Prüft `test`. Ruft `connect`, `enterBaseDirectory`.
RemoteBackupBridge.list
  Die Sicherung über das Netz zeigt das. Listet `list`. Ruft `safeId`, `connect`, `enterDirectory`.
RemoteBackupBridge.archive
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Packt `archive`. Ruft `open`, `safeId`, `connect`.
RemoteBackupBridge.download
  Die Sicherung über das Netz holt das. Liefert zum Herunterladen `download`. Ruft `safeId`, `named`, `connect`.
RemoteBackupBridge.delete
  Die Sicherung über das Netz löscht das. Löscht `delete`. Ruft `safeId`, `named`, `connect`.
RemoteBackupBridge.unsupportedAuthTls
  Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `unsupportedAuthTls` in `RemoteBackupBridge.java`.
```

> [!knoten]- Was die Blöcke tun
> - **RemoteBackupBridge.warnPlainFtp**: Die Sicherung über das Netz warnt vor die Übertragung. Warnt `warnPlainFtp`.
> - **RemoteBackupBridge.RemoteBackupBridge**: Die Sicherung über das Netz sichert hier einen Schritt. Eine Ebene tiefer steht er genauer. `RemoteBackupBridge` in `RemoteBackupBridge.java`.
> - **RemoteBackupBridge.test**: Die Sicherung über das Netz prüft das. Prüft `test`. Ruft `connect`, `enterBaseDirectory`.
> - **RemoteBackupBridge.list**: Die Sicherung über das Netz zeigt das. Listet `list`. Ruft `safeId`, `connect`, `enterDirectory`.
> - **RemoteBackupBridge.archive**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Packt `archive`. Ruft `open`, `safeId`, `connect`.
> - **RemoteBackupBridge.download**: Die Sicherung über das Netz holt das. Liefert zum Herunterladen `download`. Ruft `safeId`, `named`, `connect`.
> - **RemoteBackupBridge.delete**: Die Sicherung über das Netz löscht das. Löscht `delete`. Ruft `safeId`, `named`, `connect`.
> - **RemoteBackupBridge.unsupportedAuthTls**: Die Sicherung über das Netz macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `unsupportedAuthTls` in `RemoteBackupBridge.java`.

- Ein weiterer Abschnitt derselben Übersicht.
