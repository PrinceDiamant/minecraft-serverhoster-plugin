[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil2]]

# BackupBridge.Teil2

```mermaid
flowchart TD
  n1["BackupBridge.named"]:::internal-link
  n2["BackupBridge.archive"]:::internal-link
  n3["BackupBridge.test"]:::internal-link
  n4["BackupBridge.write"]:::internal-link
  n5["BackupBridge.pRealInside"]:::internal-link
  n6["BackupBridge.retain"]:::internal-link
  n7["BackupBridge.insert"]:::internal-link
  n8["BackupBridge.ensureTable"]:::internal-link
  n2 -->|"Z.147"| n4
  n2 -->|"Z.150"| n5
  n2 -->|"Z.159"| n6
  n2 -->|"Z.162"| n7
  n3 -->|"Z.170"| n8
  n7 -->|"Z.198"| n8
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
```

```knoten
BackupBridge.named
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `named` in `BackupBridge.java`.
BackupBridge.archive
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Packt `archive`. Ruft `open`, `safeId`, `resolve`.
BackupBridge.test
  Die Sicherung auf diesem Rechner prüft das. Prüft `test`. Ruft `connect`, `ensureTable`, `table`.
BackupBridge.write
  Die Sicherung auf diesem Rechner schreibt das. Schreibt `write`.
BackupBridge.pRealInside
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `pRealInside` in `BackupBridge.java`. Ruft `root`.
BackupBridge.retain
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Behält die letzten Stücke `retain`.
BackupBridge.insert
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Fügt ein `insert`. Ruft `connect`, `table`, `ensureTable`.
BackupBridge.ensureTable
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Stellt sicher `ensureTable`.
```

> [!knoten]- Was die Blöcke tun
> - **BackupBridge.named**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `named` in `BackupBridge.java`.
> - **BackupBridge.archive**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Packt `archive`. Ruft `open`, `safeId`, `resolve`.
> - **BackupBridge.test**: Die Sicherung auf diesem Rechner prüft das. Prüft `test`. Ruft `connect`, `ensureTable`, `table`.
> - **BackupBridge.write**: Die Sicherung auf diesem Rechner schreibt das. Schreibt `write`.
> - **BackupBridge.pRealInside**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `pRealInside` in `BackupBridge.java`. Ruft `root`.
> - **BackupBridge.retain**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Behält die letzten Stücke `retain`.
> - **BackupBridge.insert**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Fügt ein `insert`. Ruft `connect`, `table`, `ensureTable`.
> - **BackupBridge.ensureTable**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Stellt sicher `ensureTable`.

- Ein weiterer Abschnitt derselben Übersicht.
