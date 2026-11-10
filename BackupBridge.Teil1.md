[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil1]]

# BackupBridge.Teil1

```mermaid
flowchart TD
  n1["BackupBridge.BackupBridge"]:::internal-link
  n2["BackupBridge.list"]:::internal-link
  n3["BackupBridge.file"]:::internal-link
  n4["BackupBridge.delete"]:::internal-link
  n5["BackupBridge.restore"]:::internal-link
  n6["BackupBridge.restoreZip"]:::internal-link
  n7["BackupBridge.directory"]:::internal-link
  n8["BackupBridge.safeId"]:::internal-link
  n2 -->|"Z.44"| n7
  n2 -->|"Z.46"| n8
  n3 -->|"Z.60"| n8
  n3 -->|"Z.62"| n7
  n4 -->|"Z.70"| n3
  n5 -->|"Z.75"| n3
  n5 -->|"Z.76"| n6
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupBridge.BackupBridge
  Die Sicherung auf diesem Rechner sichert hier einen Schritt. Eine Ebene tiefer steht er genauer. Sichert `BackupBridge`.
BackupBridge.list
  Die Sicherung auf diesem Rechner zeigt das. Listet `list`. Ruft `directory`, `safeId`, `named`.
BackupBridge.file
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die Datei `file`. Ruft `safeId`, `named`, `directory`.
BackupBridge.delete
  Die Sicherung auf diesem Rechner löscht das. Löscht `delete`. Ruft `file`.
BackupBridge.restore
  Die Sicherung auf diesem Rechner stellt wieder her das. Stellt wieder her `restore`. Ruft `file`, `restoreZip`.
BackupBridge.restoreZip
  Die Sicherung auf diesem Rechner stellt wieder her hier einen Schritt. Eine Ebene tiefer steht er genauer. Stellt wieder her `restoreZip`. Ruft `open`, `resolve`.
BackupBridge.directory
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `BackupBridge.java`.
BackupBridge.safeId
  Die Sicherung auf diesem Rechner kümmert sich um die Kennung. Prüft die Pfadgrenze `safeId`.
```

> [!knoten]- Was die Blöcke tun
> - **BackupBridge.BackupBridge**: Die Sicherung auf diesem Rechner sichert hier einen Schritt. Eine Ebene tiefer steht er genauer. Sichert `BackupBridge`.
> - **BackupBridge.list**: Die Sicherung auf diesem Rechner zeigt das. Listet `list`. Ruft `directory`, `safeId`, `named`.
> - **BackupBridge.file**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Liefert die Datei `file`. Ruft `safeId`, `named`, `directory`.
> - **BackupBridge.delete**: Die Sicherung auf diesem Rechner löscht das. Löscht `delete`. Ruft `file`.
> - **BackupBridge.restore**: Die Sicherung auf diesem Rechner stellt wieder her das. Stellt wieder her `restore`. Ruft `file`, `restoreZip`.
> - **BackupBridge.restoreZip**: Die Sicherung auf diesem Rechner stellt wieder her hier einen Schritt. Eine Ebene tiefer steht er genauer. Stellt wieder her `restoreZip`. Ruft `open`, `resolve`.
> - **BackupBridge.directory**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `directory` in `BackupBridge.java`.
> - **BackupBridge.safeId**: Die Sicherung auf diesem Rechner kümmert sich um die Kennung. Prüft die Pfadgrenze `safeId`.

- Ein weiterer Abschnitt derselben Übersicht.
