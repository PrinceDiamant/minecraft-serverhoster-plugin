[[00 Start]] › [[Backup]] › [[Backup-Bruecken]] › [[BackupBridge]] › [[BackupBridge.Teil3]]

# BackupBridge.Teil3

```mermaid
flowchart TD
  n1["BackupBridge.table"]:::internal-link
  n2["BackupBridge.connect"]:::internal-link
  n3["BackupBridge.count"]:::internal-link
  n3 -->|"Z.242"| n2
  n3 -->|"Z.242"| n1
  classDef internal-link fill:#ddeeff,stroke:#4488cc
  classDef befund fill:#f88
  style n3 fill:#f88,stroke:#900
```

```knoten
BackupBridge.table
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `table` in `BackupBridge.java`.
BackupBridge.connect
  Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connect`.
BackupBridge.count
  Die Sicherung auf diesem Rechner zählt das. Zählt `count`. Ruft `connect`, `table`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/BackupBridge.java:241–246 nur von Tests erreicht
```

> [!knoten]- Was die Blöcke tun
> - **BackupBridge.table**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. `table` in `BackupBridge.java`.
> - **BackupBridge.connect**: Die Sicherung auf diesem Rechner macht hier einen einzelnen Schritt. Eine Ebene tiefer steht er genauer. Verbindet `connect`.
> - **BackupBridge.count**: Die Sicherung auf diesem Rechner zählt das. Zählt `count`. Ruft `connect`, `table`. [[Glossar#Befund|Befund]]: toter Code, wahrscheinlich. src/main/java/de/aichele/childlauncher/BackupBridge.java:241–246 nur von Tests erreicht

- Ein weiterer Abschnitt derselben Übersicht.
